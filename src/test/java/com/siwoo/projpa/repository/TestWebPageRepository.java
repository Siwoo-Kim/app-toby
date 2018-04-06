package com.siwoo.projpa.repository;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.Name;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestWebPageRepository {

    private static User dummyAuthor;
    @Autowired
    WebPageRepository webPageRepository;
    @Autowired
    UserRepository userRepository;
    List<WebPage> webPages;

    @Before
    public void setup() {
        User user = FixtureFactory.users().get(0);
        user.setEmail("sm123tt@gmail.com");
        user.setName(new Name("Siwoo", "Kim", null));
        userRepository.save(user);
        dummyAuthor = user;

        webPages = FixtureFactory.webPages();
        for (WebPage webPage : webPages) {
            webPage.setAuthor(user);
        }
        webPageRepository.saveAll(webPages);
    }

    @Test
    public void findByName() {
        String targetName = webPages.get(0).getName();
        WebPage found = webPageRepository.findByName(targetName);
        assertTrue(found.equals(webPages.get(0)));
    }

    @Test
    public void findAuthor() {
        String targetName = webPages.get(0).getName();
        User user = webPageRepository.findAuthor(targetName);
        assertTrue(dummyAuthor.equals(user));
        Name foundName = webPageRepository.findAuthorName(targetName);
        assertTrue(user.getName().equals(foundName));
    }

    @Test
    public void findByNames() {
        String targetName[] = {webPages.get(0).getName(), webPages.get(1).getName()};
        List<WebPage> webPages = webPageRepository.findByNames(targetName);
        assertTrue(webPages.size() == 2);
        assertTrue(webPages.contains(webPages.get(0)));
        assertTrue(webPages.contains(webPages.get(1)));
    }

    @Test
    public void findByUrls() {
        URL targetUrls[] = {webPages.get(0).getUrl(), webPages.get(1).getUrl()};
        List<WebPage> webPages = webPageRepository.findByUrls(targetUrls);
        assertTrue(webPages.size() == 2);
        assertTrue(webPages.contains(webPages.get(0)));
        assertTrue(webPages.contains(webPages.get(1)));
    }

    @Test
    public void findImgNamesByName() {
        String targetName = webPages.get(1).getName();
        List<String> names = webPages.get(1).getImgNames();
        List<String> found = webPageRepository.findImgNamesByName(targetName);
        assertEquals(names.size(), found.size());
        assertTrue(found.containsAll(names));
    }

    @Test
    public void countPublicWebPage() {
        long count = webPages.stream()
                .filter(WebPage::isPublic)
                .count();
        long target = webPageRepository.countByIsPublic(true);
        assertEquals(count, target);
        count = webPages.stream()
                .filter(webPage -> !webPage.isPublic())
                .count();
        target = webPageRepository.countByIsPublic(false);
        assertEquals(count, target);

    }

    @Test
    public void countWebPage() {
        long count = webPages.size();
        long targetCount = webPageRepository.countWebPage();
        assertEquals(count, targetCount, 0);
    }

    @Test
    public void findByCriteriaMatchAny() {
        WebPageCriteria criteria = new WebPageCriteria(webPages.get(0).getName(),
                null, null, true);
        log.warn(criteria + "");
        List<WebPage> found = webPageRepository.findByCriteriaMatchAny(criteria);
        assertTrue(found.contains(webPages.get(0)));
        assertTrue(found.containsAll(webPages.stream().filter(WebPage::isPublic).collect(Collectors.toList())));

        criteria = new WebPageCriteria(webPages.get(0).getName().toLowerCase(),
                null, null, true);
        log.warn(criteria + "");
        found = webPageRepository.findByCriteriaMatchAny(criteria);
        assertTrue(found.contains(webPages.get(0)));
        assertTrue(found.containsAll(webPages.stream().filter(WebPage::isPublic).collect(Collectors.toList())));

        String description = webPages.get(2).getDescription().substring(5, 10);
        criteria = new WebPageCriteria(webPages.get(0).getName().toLowerCase(),
                description, null, null);
        found = webPageRepository.findByCriteriaMatchAny(criteria);
        assertTrue(found.contains(webPages.get(2)));
    }

    @Test
    public void updateAuthorBulk() {
        List<WebPage> webPages = FixtureFactory.webPages();
        User user = new User();
        user.setEmail("dummay@email.com");
        userRepository.save(user);
        webPageRepository.updateAuthorBulk(webPages, user);
        List<WebPage> found = webPageRepository.findByAuthor(user);
        assertEquals(found.size(),webPages.size());
    }
}

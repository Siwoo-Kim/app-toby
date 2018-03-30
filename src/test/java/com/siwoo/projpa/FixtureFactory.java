package com.siwoo.projpa;

import com.siwoo.projpa.domain.BasicTime;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class FixtureFactory {

    public static String getName(Object object) {
        return object.getClass().getSimpleName();
    }

    public static List<Project> projects() {
        List<Project> projects = null;

        try {
            projects = new ArrayList<>();
            Project project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Java");
            project.setDescription("Java SE(Java Platform, Standard Edition)는 자바의 표준안이다. 자바라는 언어가 어떠한 문법적인 구성을 가졌는지와 같은 것들을 정의하고 있다. 이것은 구체적인 소프트웨어가 아니고 그 소프트웨어의 설계도라고 할 수 있다. 소프트웨어에서는 설계도라는 표현 대신에 명세서(spec, specification)이라는 말을 사용한다. 이 명세서에 따라서 Java가 만들어지게 된다. Java SE 7은 버전 7에 대한 명세서이다. 자바는 계속 진화하고 있는 기술이다. 이 명세서는 JCP(Java Community Process, http://jcp.org)라는 조직을 통해서 만들어진다.");
            project.setIcon("fa-java");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/java"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Javascript");
            project.setDescription("JavaScript는 웹페이지를 동적으로, 프로그래밍적으로 제어하기 위해서 고안된 언어다. 그렇기 때문에 오늘날 가장 중요한 플랫폼이라고 할 수 있는 웹브라우저에서 유일하게 사용할 수 있는 프로그래밍 언어이다. 최근에는 HTML5의 적용이 가속화되면서 지금까지 모바일 환경에서 네이티브 앱(안드로이드, IOS)으로 구현해왔던 기능이 웹에서도 대부분 구현할 수 있게 되고 있다. 웹이 크로스플랫폼이라는 점, 검색 가능하다는 점, 네이티브 디바이스를 제어할 수 있는 하드브리드 시스템(phonegap 등)이 존재한다는 점에서 웹의 중요함은 더욱 확대될 전망이다. 자연스럽게 웹에서 구동되는 유일한 언어인 JavaScript의 중요함도 점점 커질 것으로 예상된다.");
            project.setIcon("fa-js");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/javscript"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Regular Expression");
            project.setDescription("정규표현식(正規表現式, Regular Expression)은 문자열을 처리하는 방법 중의 하나로 특정한 조건의 문자를 '검색'하거나 '치환'하는 과정을 매우 간편하게 처리 할 수 있도록 하는 수단이다.");
            project.setIcon("fa-re");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/re"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("HTML");
            project.setDescription("HTML is the standard markup language for creating Web pages. HTML stands for Hyper Text Markup Language. HTML describes the structure of Web pages using markup. HTML elements are the building blocks of HTML pages. HTML elements are represented by tags.");
            project.setIcon("fa-html");
            project.setType(Project.Type.FRONTEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/html"));
            projects.add(project);

        } catch (MalformedURLException e) {
            log.error("Error creating Projects fixtures");
            throw new RuntimeException();
        }

        return projects;
    }

    public static List<User> users() {
        List<User> fixtures = new ArrayList<>();
        User user = new User();
        user.setEmail("user1@email.com");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(1);
        user.setRecommend(0);
        user.setName("user1");
        user.setPassword("passuser1");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user2@email.com");
        user.setName("user2");
        user.setPassword("passuser2");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(3);
        user.setRecommend(6);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user3@email.com");
        user.setName("user3");
        user.setPassword("passuser3");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(5);
        user.setRecommend(5);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user4@email.com");
        user.setName("user4");
        user.setPassword("passuser4");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(29);
        user.setRecommend(20);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user5@email.com");
        user.setName("user5");
        user.setPassword("passuser5");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(30);
        user.setRecommend(20);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user6@email.com");
        user.setName("user6");
        user.setPassword("passuser6");
        user.setLevel(User.Level.SILVER);
        user.setLogin(50);
        user.setRecommend(30);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user7@email.com");
        user.setName("user7");
        user.setPassword("passuser7");
        user.setLevel(User.Level.GOLD);
        user.setLogin(100);
        user.setRecommend(100);
        user.setPoint(10);
        return fixtures;
    }
}

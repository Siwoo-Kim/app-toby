package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.*;
import com.siwoo.projpa.domain.criteria.SectionCriteria;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static com.siwoo.projpa.domain.criteria.SectionCriteria.Search;
import static com.siwoo.projpa.repository.SectionRepository.*;
import static com.siwoo.projpa.repository.support.RepositorySupport.surround;
import static com.siwoo.projpa.service.support.SimpleValidator.throwIfNotTrue;
import static com.siwoo.projpa.service.support.SimpleValidator.throwIfNull;

@Slf4j
@Repository
public class SectionRepositoryImpl implements CustomSectionRepository {

    private static final Class<Section> domainClass = Section.class;
    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Section> findCriteriaMatchALL(SectionCriteria sectionCriteria) {
        throwIfNull(sectionCriteria);
        throwIfNotTrue((searchSet) -> searchSet.size() > 0, sectionCriteria.getSearches());
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Section> query = cb.createQuery(domainClass);
        Root<Section> sectionRoot = query.from(domainClass);

        Predicate criteria = cb.conjunction();

        for (Search search : sectionCriteria.getSearches()) {
            switch (search) {
                case NAME: {
                    criteria = cb.or(criteria,
                            cb.like(cb.upper(sectionRoot.get(COLUMN_NAME)),
                            surround(sectionCriteria.getName().toUpperCase(), "%")));
                    break;
                }
                case DESCRIPTION: {
                    criteria = cb.or(criteria,
                            cb.like(cb.upper(sectionRoot.get(COLUMN_DESCRIPTION)) ,
                                    surround(sectionCriteria.getDescription(), "%").toUpperCase()));
                    break;
                }
                case DIFFICULTY: {
                    criteria = cb.or(criteria, cb.equal(sectionRoot.get(COLUMN_DIFFICULTY), sectionCriteria.getDifficulty()));
                    break;
                }
                case PROJECT: {
                    Join<Section, Project> projectJoin = sectionRoot.join(COLUMN_PROJECT, JoinType.INNER);
                    criteria = cb.or(criteria, cb.equal(projectJoin.get(ProjectRepository.COLUMN_ID), sectionCriteria.getProject().getId()));
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unknown value : " + search);
            }
        }

        return entityManager.createQuery(query.where(criteria)).getResultList();
    }


//    @Override
//    public List<Section> findSectionByProjects(Project... projects) {
//        List<Project> _projects = Arrays.asList(projects);
//        throwIfNotTrue( _ps -> _ps.size() > 0 , _projects);
//
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Section> query = cb.createQuery(domainClass);
//        Root<Section> sectionRoot = query.from(domainClass);
//        Join<Section, Project> projectJoin = sectionRoot.join(COLUMN_PROJECT);
//
//        CriteriaBuilder.In in =  cb.in(projectJoin.get(ProjectRepository.COLUMN_ID));
//        List<Long> ids = new ArrayList<>();
//        for(Project project: projects) {
//            log.warn(project.getId() + "");
//           in.value(project.getId());
//        }
//
//        return entityManager.createQuery(query.where(in)).getResultList();
//    }

    @Override
    public List<Section> findCriteriaMatchAny(SectionCriteria sectionCriteria) {
        throwIfNull(sectionCriteria);
        throwIfNotTrue((searchSet) -> searchSet.size() > 0, sectionCriteria.getSearches());
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Section> query = cb.createQuery(domainClass);
        Root<Section> sectionRoot = query.from(domainClass);

        Predicate criteria = cb.conjunction();

        for (Search search : sectionCriteria.getSearches()) {
            switch (search) {
                case NAME: {
                    criteria = cb.and(criteria, cb.like(sectionRoot.get(COLUMN_NAME), surround(sectionCriteria.getName(), "%")));
                    break;
                }
                case DESCRIPTION: {
                    criteria = cb.and(criteria, cb.like(sectionRoot.get(COLUMN_DESCRIPTION), surround(sectionCriteria.getDescription(), "%")));
                    break;
                }
                case DIFFICULTY: {
                    criteria = cb.and(criteria, cb.equal(sectionRoot.get(COLUMN_DIFFICULTY), sectionCriteria.getDifficulty()));
                    break;
                }
                case PROJECT: {
                    Join<Section, Project> projectJoin = sectionRoot.join(COLUMN_PROJECT, JoinType.INNER);
                    criteria = cb.and(criteria, cb.equal(projectJoin.get(ProjectRepository.COLUMN_ID), sectionCriteria.getProject().getId()));
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unknown value : " + search);
            }
        }
        return entityManager.createQuery(query.where(criteria)).getResultList();
    }


    @Override
    public List<Section> findByProject(long projectId) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Section> query = cb.createQuery(domainClass);
        Root<Section> sectionRoot = query.from(domainClass);
        Join<Section, Project> projectJoin = sectionRoot.join(COLUMN_PROJECT);

        query.select(sectionRoot).where(
                cb.equal(projectJoin.get(ProjectRepository.COLUMN_ID), projectId));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public SectionSummary findSectionSummary(long id) {
        Section section = entityManager.find(domainClass, id);
        if (section == null) {
            throw new IllegalArgumentException("Section[id:" + id + "] not found");
        }
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<DocumentSummary> query = cb.createQuery(DocumentSummary.class);
        Root<Document> documentRoot = query.from(Document.class);
        Join<Document, Section> sectionRoot = documentRoot.join(DocumentRepository.COLUMN_SECTION, JoinType.INNER);

        query.multiselect(
                documentRoot.get(DocumentRepository.COLUMN_TITLE).alias(DocumentRepository.COLUMN_TITLE),
                documentRoot.get(DocumentRepository.COLUMN_SUBTITLE).alias(DocumentRepository.COLUMN_SUBTITLE),
                documentRoot.get(DocumentRepository.COLUMN_DESCRIPTION).alias(DocumentRepository.COLUMN_DESCRIPTION),
                documentRoot.get(DocumentRepository.COLUMN_BASICTIME).alias(DocumentRepository.COLUMN_BASICTIME))
                .where(cb.equal(sectionRoot.get(SectionRepository.COLUMN_ID), id));


        List<DocumentSummary> documentSummaries = entityManager.createQuery(query).getResultList();
        SectionSummary sectionSummary = new SectionSummary(section, documentSummaries);
        return sectionSummary;
    }
}

package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class UserRepositoryImpl implements CustomUserRepository {

    @PersistenceContext
    EntityManager entityManager;
    private static final Class<User> domainClass = User.class;

    @Override
    public User create(User user) {
        Assert.notNull(user , "user should not null");
        defaultCheck(user);
        entityManager.persist(user);
        return user;
    }

    @Override
    public Optional<User> get(long id) {
        Assert.state(id > 0, "id must be greater than 0");
        User user = entityManager.find(domainClass,id);
        if(user == null) {
            log.info("we cannot find the entity, sorry");
        }
        return Optional.ofNullable(user);
    }

    private static final String JPQL_BY_POINT_GREATER_THAN =
            "select u from User u where u.point > :point ";
    @Override
    public List<User> getByPointGreaterThan(double point) {
        TypedQuery<User> query = entityManager.createQuery(JPQL_BY_POINT_GREATER_THAN,domainClass)
                .setParameter("point", point);
        return query.getResultList();
    }

    @Override
    public boolean remove(User user) {
        Optional<User> found = get(user.getId());
        if(found.isPresent()) {
            entityManager.remove(found.get());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean raisePoint(long id, double raise) {
        Optional<User> found = get(id);
        if(found.isPresent()) {
            User user = found.get();
            return user.raisePoint(raise);
        } else {
            return false;
        }
    }


    private void defaultCheck(User user) {
        if(user.getJoinDate() == null) {
            user.setJoinDate(LocalDate.now());
        }
    }

}

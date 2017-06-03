package com.binara.dao;

import com.binara.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by binara on 4/19/17.
 */
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User u").getResultList();
    }

    @Override
    public User getUser(long id) {
        return entityManager.find(User.class, id);
//        return (User) entityManager.createQuery("FROM User u WHERE u.id=:x").setParameter("x", id).getSingleResult();
    }
}

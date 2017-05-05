package com.binara.service;

import com.binara.dao.UserDAO;
import com.binara.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> findAllUsers() {
        return userDAO.getAllUsers();
    }

    public User findById(long id) {
        return null;
    }

    public User findByName(String name) {
        return null;
    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUserById(long id) {

    }

    public boolean isUserExist(User user) {
        return false;
    }

    public void deleteAllUsers() {

    }


}

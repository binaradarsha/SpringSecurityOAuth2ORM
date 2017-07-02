package com.binara.dao;

import com.binara.model.User;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

/**
 * Created by binara on 4/19/17.
 */
public interface UserDAO {

    List<User> getAllUsers();

    @PreAuthorize("hasAuthority('ADMIN')")
    User getUser(long id);

    User getUser(String username);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

}

package com.engSoft.services;

import com.engSoft.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(User user);
    void removeUser(User user);
    List<User> listUsers();
    Optional<User> getUserById(Long id);
    Optional<User> getUserByEmail(String email);
}

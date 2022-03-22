package com.engSoft.services;

import com.engSoft.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void saveUser(User user);
    public void removeUser(User user);
    public List<User> listUsers();
    public Optional<User> getUserById(Long id);
    public Optional<User> getUserByEmail(String email);
}

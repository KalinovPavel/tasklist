package com.example.tasklist.repository;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);
    Optional<User> findByUserName(Long id);
    void update(User user);
    void create(User user);
    void insertUserRole(Long userId, Role role);
    boolean iTaskOwner(Long userId, Long taskId);
    void delete(Long id);

}

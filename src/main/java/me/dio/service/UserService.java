package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

    List<User> findAll();

    User update(Long id, User userToUpdate);

    List<User> findByName(String name);

    User findByAccountNumber(String accountNumber);
}

package ru.kataacademy.preproject.SpringBootApp.service;

import ru.kataacademy.preproject.SpringBootApp.models.User;

import java.util.List;

public interface UserService {

    List<User> index();

    User show(long id);

    void saveUser(User user);

    void update(long id, User user);

    void delete(long id);

}

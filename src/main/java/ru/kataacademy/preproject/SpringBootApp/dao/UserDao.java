package ru.kataacademy.preproject.SpringBootApp.dao;


import ru.kataacademy.preproject.SpringBootApp.models.User;
import java.util.List;

public interface UserDao {

    List<User> index();

    User show(long id);

    void saveUser(User user);

    void update(long id, User user);

    void delete(long id);

}

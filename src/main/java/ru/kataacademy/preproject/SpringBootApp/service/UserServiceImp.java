package ru.kataacademy.preproject.SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kataacademy.preproject.SpringBootApp.dao.UserDao;
import ru.kataacademy.preproject.SpringBootApp.models.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private UserDao userDao;

    @Autowired
    public void setDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Transactional(readOnly = true)
    @Override
    public User show(long id) {
        return userDao.show(id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }

    @Transactional
    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}

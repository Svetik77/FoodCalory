package ru.javawebinar.FoodCalory.service;


import ru.javawebinar.FoodCalory.model.User;
import ru.javawebinar.FoodCalory.util.exception.NotFoundException;

import java.util.List;

public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user);
}
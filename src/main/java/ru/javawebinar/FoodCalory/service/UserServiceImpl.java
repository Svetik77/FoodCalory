package ru.javawebinar.FoodCalory.service;

import ru.javawebinar.FoodCalory.repository.UserRepository;
import ru.javawebinar.FoodCalory.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javawebinar.FoodCalory.util.exception.NotFoundException;

import java.util.List;

import static ru.javawebinar.FoodCalory.util.ValidationUtil.checkNotFound;
import static ru.javawebinar.FoodCalory.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(int id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

    @Override
    public User get(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return checkNotFound(repository.getByEmail(email), "email=" + email);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }
}
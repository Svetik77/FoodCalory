package ru.javawebinar.FoodCalory.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javawebinar.FoodCalory.model.User;
import ru.javawebinar.FoodCalory.service.UserService;
import ru.javawebinar.FoodCalory.util.ValidationUtil;

import java.util.List;

public abstract class AbstractUserController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService service;

    public List<User> getAll() {
        LOG.info("getAll");
        return service.getAll();
    }

    public User get(int id) {
        LOG.info("get " + id);
        return service.get(id);
    }

    public User create(User user) {
        LOG.info("create " + user);
        ValidationUtil.checkNew(user);
        return service.save(user);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        service.delete(id);
    }

    public void update(User user, int id) {
        LOG.info("update " + user);
        ValidationUtil.checkIdConsistent(user, id);
        service.update(user);
    }

    public User getByMail(String email) {
        LOG.info("getByEmail " + email);
        return service.getByEmail(email);
    }
}
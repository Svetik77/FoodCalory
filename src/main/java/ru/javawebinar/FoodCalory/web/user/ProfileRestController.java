package ru.javawebinar.FoodCalory.web.user;

import org.springframework.stereotype.Controller;
import ru.javawebinar.FoodCalory.model.User;
import ru.javawebinar.FoodCalory.AuthorizedUser;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(AuthorizedUser.id());
    }

    public void delete() {
        super.delete(AuthorizedUser.id());
    }

    public void update(User user) {
        super.update(user, AuthorizedUser.id());
    }
}
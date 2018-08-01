package ru.javawebinar.FoodCalory;

import ru.javawebinar.FoodCalory.util.MealsUtil;

public class AuthorizedUser {

    public static int id() {
        return 1;
    }

    public static int getCaloriesPerDay() {
        return MealsUtil.DEFAULT_CALORIES_PER_DAY;
    }
}
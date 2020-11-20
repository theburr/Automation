package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface Login extends Navigation {
     String WRONG_USERNAME_USER = getUIMappingByKey("user.WrongUsername");
     String WRONG_PASSWORD_USER = getUIMappingByKey("user.WrongPassword");

    String USERNAME_FIELD = "username.Field";
    String PASSWORD_FIELD = "password.Field";

    String FIRST_NAME_FIELD = "user.FirstNameField";
    String LAST_NAME_FIELD = "user.LastNameField";
    String FIRST_NAME = getUIMappingByKey("user.FirstName");
    String LAST_NAME = getUIMappingByKey("user.LastName");
    String ERROR_PAGE = "error.Page";
    String PASSWORD_CONFIRM_FIELD = "field.PasswordConfirm";
    String WRONG_MESSAGE = "negative.WrongMessage";
}

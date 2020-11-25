package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface LoginElements extends NavigationElements {
     String WRONG_USERNAME_USER = getUIMappingByKey("user.WrongUsername");
     String WRONG_PASSWORD_USER = getUIMappingByKey("user.WrongPassword");
     String LOW_USER_USERNAME = getUIMappingByKey("user.Username");
     String LOW_USER_PASSWORD = getUIMappingByKey("user.Password");

    String USERNAME_FIELD = "username.Field";
    String PASSWORD_FIELD = "password.Field";

    String FIRST_NAME_FIELD = "user.FirstNameField";
    String LAST_NAME_FIELD = "user.LastNameField";
    String FIRST_NAME = getUIMappingByKey("user.FirstName");
    String LAST_NAME = getUIMappingByKey("user.LastName");
    String ERROR_PAGE = "error.Page";
    String PASSWORD_CONFIRM_FIELD = "field.PasswordConfirm";
    String WRONG_MESSAGE = "negative.WrongMessage";

    String NEW_IMG = "user.RegisterWrongImage";
}

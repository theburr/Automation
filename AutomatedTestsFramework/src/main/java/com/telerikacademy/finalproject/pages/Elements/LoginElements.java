package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface LoginElements extends NavigationElements {

    /**To Edit The Properties Of These Elements Refer To The ui.map.properties Found In
     AutomatedTestsFramework/src/test/resources/mappings/ui_map.properties**/


     String WRONG_USERNAME_USER = getUIMappingByKey("user.WrongUsername");
     String WRONG_PASSWORD_USER = getUIMappingByKey("user.WrongPassword");
     String USER_USERNAME = getUIMappingByKey("user.Username");
     String USER_PASSWORD = getUIMappingByKey("user.Password");
     String ADMIN_USERNAME = getUIMappingByKey("admin.Username");
     String ADMIN_PASSWORD = getUIMappingByKey("admin.Password");

    String USERNAME_FIELD = "username.Field";
    String PASSWORD_FIELD = "password.Field";

    String FIRST_NAME_FIELD = "user.FirstNameField";
    String LAST_NAME_FIELD = "user.LastNameField";
    String FIRST_NAME = getUIMappingByKey("user.FirstName");
    String LAST_NAME = getUIMappingByKey("user.LastName");
    String ERROR_PAGE = "error.Page";
    String PASSWORD_CONFIRM_FIELD = "field.PasswordConfirm";
    String WRONG_MESSAGE = "negative.WrongMessage";
    String ERROR_LOGIN_MSG = "error.LoginMsg";
    String HOME_BUTTON_LOG_PAGE = "logInHomeButton";

    String NEW_IMG = "user.RegisterWrongImage";
}

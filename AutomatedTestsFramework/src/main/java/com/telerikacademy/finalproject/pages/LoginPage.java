package com.telerikacademy.finalproject.pages;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public class LoginPage extends NavigationPage{

    public final String usernameUser = getUIMappingByKey("user.Username");
    public final String passwordUser = getUIMappingByKey("user.Password");
    public final String adminUsername = getUIMappingByKey("admin.Username");
    public final String adminPassword = getUIMappingByKey("admin.Password");


    public void adminLogIn() {
        actions.isElementPresentUntilTimeout(SIGN_IN_BUTTON, 5);
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 5);
        actions.typeValueInField(adminUsername, USERNAME_FIELD);
        actions.typeValueInField(adminPassword, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
    }

    public void navigate_To_Login_Page_And_Log_In_HFSN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 10);
        actions.typeValueInField(usernameUser, USERNAME_FIELD);
        actions.typeValueInField(passwordUser, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 10);
    }

    public void assert_Log_In_HFSN(){
        actions.assertElementPresent(LOG_OUT_BUTTON);
    }
}

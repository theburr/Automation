package com.telerikacademy.finalproject.pages;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public class LoginPage extends NavigationPage{

    public final String usernameUser = getUIMappingByKey("username.User");
    public final String passwordUser = getUIMappingByKey("password.User");
    public final String adminUsername = getUIMappingByKey("admin.Username");
    public final String adminPassword = getUIMappingByKey("admin.Password");


    public void adminLogIn() {
        actions.isElementPresentUntilTimeout(signInButton, 4);
        actions.clickElement(signInButton);
        actions.isElementPresentUntilTimeout("signInPage.Username", 4);
        actions.typeValueInField(adminUsername, "signInPage.Username");
        actions.typeValueInField(adminPassword, "signInPage.Password");
        actions.clickElement("signInPage.LogInBtn");
    }

    public void NavigateToLoginPageAndLogInHFSN() {
        actions.clickElement("signIn.Button");
        actions.isElementPresentUntilTimeout("username.Field", 10);
        actions.typeValueInField(usernameUser, "username.Field");
        actions.typeValueInField(passwordUser, "password.Field");
        actions.clickElement("login.Button");

    }
    public void AssertLogInHFSN(){
        actions.assertElementPresent("logOut.Button");
    }
}

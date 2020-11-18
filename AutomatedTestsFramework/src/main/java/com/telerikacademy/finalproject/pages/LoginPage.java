package com.telerikacademy.finalproject.pages;

public class LoginPage extends BasePage{

    public LoginPage() {
        super("base.url");
    }
    public final String usernameUser = "username.User";
    public final String passwordUser = "password.User";

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

package com.telerikacademy.finalproject.pages;

public class LoginPage extends BasePage{

    public LoginPage() {
        super("base.url");
    }
    public final String username = "user.Username";

    public void NavigateToLoginPageAndLogInHFSN(String username, String password) {
        actions.clickElement("signIn.Button");
        actions.isElementPresentUntilTimeout("username.Field", 10);
        actions.typeValueInField(username, "username.Field");
        actions.typeValueInField(password, "password.Field");
        actions.clickElement("login.Button");

    }
    public void AssertLogInHFSN(){
        actions.assertElementPresent("logOut.Button");
    }
}

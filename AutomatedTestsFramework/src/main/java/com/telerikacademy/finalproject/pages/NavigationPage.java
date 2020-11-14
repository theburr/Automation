package com.telerikacademy.finalproject.pages;

public class NavigationPage extends BasePage {
    public NavigationPage() {
        super("base.url");
    }
    public final String homeButton = "navigation.Home";
    public final String signInButton = "navigation.SignIn";
    public final String logOutButton = "navigation.LogOut";
    public final String categoriesButton = "adminCategoriesBtn";

    public void admin_LogIn() {
        actions.isElementPresentUntilTimeout(signInButton, 4);
        actions.clickElement(signInButton);
        actions.isElementPresentUntilTimeout("signInPage.Username", 4);
        actions.typeValueInField("adminUsername", "signInPage.Username");
        actions.typeValueInField("adminPassword","signInPage.Password");
        actions.clickElement("signInPage.LogInBtn");
    }
}
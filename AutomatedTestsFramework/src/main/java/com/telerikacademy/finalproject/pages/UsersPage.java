package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.Users;

public class UsersPage extends NavigationPage implements Users {

    public void send_Connection_Request() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, 5);
        actions.clickElement(USERS_BUTTON);
        actions.isElementPresentUntilTimeout(SECOND_USER_PROFILE, 5);
        actions.clickElement(SECOND_USER_PROFILE);
        actions.isElementPresentUntilTimeout(SEND_CONNECTION, 5);
        actions.clickElement(SEND_CONNECTION);
        actions.isElementPresentUntilTimeout(CONNECTION_IS_SENT, 5);
    }

    public void assert_Connection_Is_Sent(){
        actions.assertElementPresent(CONNECTION_IS_SENT);
        System.out.println("Category is present thus successfully created!");
    }

    public void confirm_Connection_Request() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, 5);
        actions.clickHiddenElement(CONNECTIONS_REQUESTS_BUTTON);
        actions.isElementPresentUntilTimeout(FIRST_USER_PROFILE, 5);
        actions.clickElement(FIRST_USER_PROFILE);
        actions.isElementPresentUntilTimeout(CONFIRM_CONNECTION, 5);
        actions.clickElement(CONFIRM_CONNECTION);
        actions.isElementPresentUntilTimeout(DISCONNECT_CONNECTION, 5);
    }
    public void assert_Connection_Is_Confirmed(){
        actions.assertElementPresent(DISCONNECT_CONNECTION);
        System.out.println("Category is present thus successfully created!");
    }

    public void reject_Connection_Request() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, 5);
        actions.clickHiddenElement(CONNECTIONS_REQUESTS_BUTTON);
        actions.isElementPresentUntilTimeout(FIRST_USER_PROFILE, 5);
        actions.clickElement(FIRST_USER_PROFILE);
        actions.isElementPresentUntilTimeout(REJECT_CONNECTION, 5);
        actions.clickElement(REJECT_CONNECTION);
        actions.isElementPresentUntilTimeout(SEND_CONNECTION, 5);
    }
    public void assert_Connection_Is_Rejected(){
        actions.assertElementPresent(SEND_CONNECTION);
        System.out.println("Category is present thus successfully created!");
    }
    public void disconnect_Connection_Request() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, 5);
        actions.clickHiddenElement(CONNECTIONS_BUTTON);
        actions.isElementPresentUntilTimeout(FIRST_USER_PROFILE, 5);
        actions.clickElement(FIRST_USER_PROFILE);
        actions.isElementPresentUntilTimeout(DISCONNECT_CONNECTION, 5);
        actions.clickElement(DISCONNECT_CONNECTION);
        actions.isElementPresentUntilTimeout(SEND_CONNECTION, 5);
    }
    public void assert_Users_Are_Disconnected(){
        actions.assertElementPresent(SEND_CONNECTION);
        System.out.println("Category is present thus successfully created!");
    }
}

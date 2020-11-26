package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.UsersElements;

public class UsersPage extends NavigationPage implements UsersElements {

    public void send_ConnectionRequest() {
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, WAIT_TIME);
        actions.clickElement(USERS_BUTTON);
        actions.isElementPresentUntilTimeout(SECOND_USER_PROFILE, WAIT_TIME);
        actions.clickElement(SECOND_USER_PROFILE);
        actions.isElementPresentUntilTimeout(SEND_CONNECTION, WAIT_TIME);
        actions.clickElement(SEND_CONNECTION);
        actions.isElementPresentUntilTimeout(CONNECTION_IS_SENT, WAIT_TIME);
    }

    public void assert_ConnectionIsSent(){
        actions.assertElementPresent(CONNECTION_IS_SENT);
    }

    public void confirm_ConnectionRequest() {
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(CONNECTIONS_REQUESTS_BUTTON);
        actions.isElementPresentUntilTimeout(FIRST_USER_PROFILE, WAIT_TIME);
        actions.clickElement(FIRST_USER_PROFILE);
        actions.isElementPresentUntilTimeout(CONFIRM_CONNECTION, WAIT_TIME);
        actions.clickElement(CONFIRM_CONNECTION);
        actions.isElementPresentUntilTimeout(DISCONNECT_CONNECTION, WAIT_TIME);
    }
    public void assert_ConnectionIsConfirmed(){
        actions.assertElementPresent(DISCONNECT_CONNECTION);
    }

    public void reject_ConnectionRequest() {
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(CONNECTIONS_REQUESTS_BUTTON);
        actions.isElementPresentUntilTimeout(FIRST_USER_PROFILE, WAIT_TIME);
        actions.clickElement(FIRST_USER_PROFILE);
        actions.isElementPresentUntilTimeout(REJECT_CONNECTION, WAIT_TIME);
        actions.clickElement(REJECT_CONNECTION);
        actions.isElementPresentUntilTimeout(SEND_CONNECTION, WAIT_TIME);
    }
    public void assert_ConnectionIsRejected(){
        actions.assertElementPresent(SEND_CONNECTION);
    }

    public void disconnect_FromUser() {
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(USERS_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(CONNECTIONS_BUTTON);
        actions.isElementPresentUntilTimeout(FIRST_USER_PROFILE, WAIT_TIME);
        actions.clickElement(FIRST_USER_PROFILE);
        actions.isElementPresentUntilTimeout(DISCONNECT_CONNECTION, WAIT_TIME);
        actions.clickElement(DISCONNECT_CONNECTION);
        actions.isElementPresentUntilTimeout(SEND_CONNECTION, WAIT_TIME);
    }
    public void assert_UsersAreDisconnected(){
        actions.assertElementPresent(SEND_CONNECTION);
    }
}

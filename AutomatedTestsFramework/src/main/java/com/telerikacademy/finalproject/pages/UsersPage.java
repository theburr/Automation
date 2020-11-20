package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.utils.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;


public class UsersPage extends PostsPage implements Elements {
    public final String usernameUser = getUIMappingByKey("user.Username");
    public final String passwordUser = getUIMappingByKey("user.Password");

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
    public void register_User_with_already_registered_email(){
        actions.isElementPresentUntilTimeout(SIGN_UP_BUTTON, 5);
        actions.clickElement(SIGN_UP_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 5);
        actions.typeValueInField(usernameUser, USERNAME_FIELD);;
        actions.typeValueInField(passwordUser, PASSWORD_FIELD);
        actions.typeValueInField(passwordUser, PASSWORD_CONFIRM_FIELD);
        actions.typeValueInField(FIRST_NAME, FIRST_NAME_FIELD);
        actions.typeValueInField(LAST_NAME, LAST_NAME_FIELD);
        actions.clickElement(MENU_VISIBILITY);
        actions.clickElement(MENU_TYPE_VISIBILITY);
        actions.uploadPic(UPLOAD_IMAGE);
        actions.clickElement(CONFIRM_BUTTON);
    }
    public void assert_The_User_Cant_register_with_already_registered_credentials() {
        actions.assertElementPresent(ERROR_PAGE);
    }
    public void user_Log_Out() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.clickElement(LOG_OUT_BUTTON);
    }
    public void assert_The_User_is_logged_out_from_the_system(){
        actions.assertElementPresent(USERNAME_FIELD);
    }
}

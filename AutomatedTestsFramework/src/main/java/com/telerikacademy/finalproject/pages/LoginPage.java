package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.Login;

public class LoginPage extends NavigationPage implements Login {

    public void navigate_To_Login_Page_And_Log_In_HFSN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 10);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);
        actions.typeValueInField(USER_PASSWORD, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 10);
    }

    public void assert_Log_In_HFSN(){
        actions.assertElementPresent(LOG_OUT_BUTTON);
    }

    public void user_is_trying_to_logIn_with_invalid_credentials() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 10);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);
        actions.typeValueInField(WRONG_PASSWORD_USER, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 10);
    }
    public void unregistered_user_trying_to_log_in_Healthy_food_SN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 10);
        actions.typeValueInField(WRONG_USERNAME_USER, USERNAME_FIELD);
        actions.typeValueInField(WRONG_PASSWORD_USER, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 10);
    }
    public void register_User_with_already_registered_email(){
        actions.isElementPresentUntilTimeout(SIGN_UP_BUTTON, 5);
        actions.clickElement(SIGN_UP_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 5);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);;
        actions.typeValueInField(USER_PASSWORD, PASSWORD_FIELD);
        actions.typeValueInField(USER_PASSWORD, PASSWORD_CONFIRM_FIELD);
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

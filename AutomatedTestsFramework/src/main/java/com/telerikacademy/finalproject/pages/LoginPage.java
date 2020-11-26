package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.LoginElements;

public class LoginPage extends NavigationPage implements LoginElements {


    public void admin_LogInHFSN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(ADMIN_USERNAME, USERNAME_FIELD);
        actions.typeValueInField(ADMIN_PASSWORD, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LOG_OUT_BUTTON, WAIT_TIME);
    }

    public void navigate_ToLoginPageAndLogInHFSN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);
        actions.typeValueInField(USER_PASSWORD, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LOG_OUT_BUTTON, WAIT_TIME);
    }

    public void assert_LogInHFSN(){
        actions.assertElementPresent(LOG_OUT_BUTTON);
        actions.clickElement(LOG_OUT_BUTTON);
    }

    public void user_isTryingToLogInWithWrongCredentials() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);
        actions.typeValueInField(WRONG_PASSWORD_USER, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(ERROR_LOGIN_MSG, WAIT_TIME);
    }
    public void assert_LogInWithWrongCredentials(){
        actions.assertElementPresent(ERROR_LOGIN_MSG);
    }

    public void unregistered_User_IsTryingToLogInHFSN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(WRONG_USERNAME_USER, USERNAME_FIELD);
        actions.typeValueInField(WRONG_PASSWORD_USER, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(ERROR_LOGIN_MSG, WAIT_TIME);
    }

    public void register_User_WithAlreadyRegisteredEmail(){
        actions.isElementPresentUntilTimeout(SIGN_UP_BUTTON, WAIT_TIME);
        actions.clickElement(SIGN_UP_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);;
        actions.typeValueInField(USER_PASSWORD, PASSWORD_FIELD);
        actions.typeValueInField(USER_PASSWORD, PASSWORD_CONFIRM_FIELD);
        actions.typeValueInField(FIRST_NAME, FIRST_NAME_FIELD);
        actions.typeValueInField(LAST_NAME, LAST_NAME_FIELD);
        actions.clickElement(MENU_VISIBILITY);
        actions.isElementPresentUntilTimeout(MENU_TYPE_VISIBILITY, 2);
        actions.clickElement(MENU_TYPE_VISIBILITY);
        actions.uploadPic(NEW_IMG);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(ERROR_PAGE, WAIT_TIME);
    }

    public void assert_UserCantRegisterWithAlreadyRegisteredCredentials() {
        actions.assertElementPresent(ERROR_PAGE);
        actions.clickElement(BACK_HOME_BUTTON);
    }

    public void user_LogOut() {
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.clickElement(LOG_OUT_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
    }

    public void assert_UserIsLoggedOutFromTheSystem(){
        actions.assertElementPresent(USERNAME_FIELD);
    }
    public void logg_OutAfterTest(){
        actions.clickElement(HOME_BUTTON_LOG_PAGE);
    }
}

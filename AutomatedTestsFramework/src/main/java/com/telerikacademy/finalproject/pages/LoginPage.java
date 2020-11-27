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
        actions.isElementPresentUntilTimeout(CONFIRM_BUTTON,WAIT_TIME);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LOG_OUT_BUTTON, WAIT_TIME);
    }

    public void assert_LogInHFSN(){
        actions.assertElementPresent(LOG_OUT_BUTTON);
    }

    public void user_isTryingToLogInWithWrongCredentials() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);
        actions.isElementPresentUntilTimeout(PASSWORD_FIELD,WAIT_TIME);
        actions.typeValueInField(WRONG_PASSWORD_USER, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(ERROR_LOGIN_MSG, WAIT_TIME);
    }
    public void assert_LogInWithWrongCredentials(){
        actions.assertElementPresent(ERROR_LOGIN_MSG);
    }

    public void unregistered_UserIsTryingToLogInHFSN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(WRONG_USERNAME_USER, USERNAME_FIELD);
        actions.isElementPresentUntilTimeout(PASSWORD_FIELD,WAIT_TIME);
        actions.typeValueInField(WRONG_PASSWORD_USER, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(ERROR_LOGIN_MSG, WAIT_TIME);
    }

    public void register_NewUserWithAlreadyRegisteredEmail(){
        actions.isElementPresentUntilTimeout(SIGN_UP_BUTTON, WAIT_TIME);
        actions.clickElement(SIGN_UP_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, WAIT_TIME);
        actions.typeValueInField(USER_USERNAME, USERNAME_FIELD);;
        actions.isElementPresentUntilTimeout(PASSWORD_FIELD,WAIT_TIME);
        actions.typeValueInField(USER_PASSWORD, PASSWORD_FIELD);
        actions.typeValueInField(USER_PASSWORD, PASSWORD_CONFIRM_FIELD);
        actions.isElementPresentUntilTimeout(LAST_NAME_FIELD,WAIT_TIME);
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
    }

    public void user_LogOut() {
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(LOG_OUT_BUTTON,WAIT_TIME);
        actions.clickElement(LOG_OUT_BUTTON);
        actions.isElementPresentUntilTimeout(HOME_BUTTON_LOG_PAGE, WAIT_TIME);
    }

    public void assert_UserIsLoggedOutFromTheSystem(){
        actions.assertElementPresent(HOME_BUTTON_LOG_PAGE);
    }

    public void back_HomeAfterTest(){
        actions.isElementPresentUntilTimeout(HOME_BUTTON_LOG_PAGE,WAIT_TIME);
        actions.clickElement(HOME_BUTTON_LOG_PAGE);
        actions.isElementPresentUntilTimeout(HOME_BUTTON,WAIT_TIME);
    }

    public void back_HomeAfterErrorMessage(){
        actions.isElementPresentUntilTimeout(BACK_HOME_BUTTON,WAIT_TIME);
        actions.clickElement(BACK_HOME_BUTTON);
        actions.isElementPresentUntilTimeout(HOME_BUTTON,WAIT_TIME);
    }
    public void logout_FromSocialNetwork(){
        actions.isElementPresentUntilTimeout(LOG_OUT_BUTTON,WAIT_TIME);
        actions.clickElement(LOG_OUT_BUTTON);
    }

}

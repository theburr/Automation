package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.utils.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public class NegativePage extends PostsPage implements Elements{
    public final String usernameUser = getUIMappingByKey("user.Username");
    public final String wrongUsernameUser = getUIMappingByKey("user.WrongUsername");
    public final String wrongPasswordUser = getUIMappingByKey("user.WrongPassowrd");


    public void user_is_trying_to_logIn_with_invalid_credentials() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 10);
        actions.typeValueInField(usernameUser, USERNAME_FIELD);
        actions.typeValueInField(wrongPasswordUser, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 10);
    }
    public void unregistered_user_trying_to_log_in_Healthy_food_SN() {
        actions.clickElement(SIGN_IN_BUTTON);
        actions.isElementPresentUntilTimeout(USERNAME_FIELD, 10);
        actions.typeValueInField(wrongUsernameUser, USERNAME_FIELD);
        actions.typeValueInField(wrongPasswordUser, PASSWORD_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 10);
    }
    public void assert_Log_In_HFSN(){
        actions.assertElementNotPresent(WRONG_MESSAGE);
    }
}

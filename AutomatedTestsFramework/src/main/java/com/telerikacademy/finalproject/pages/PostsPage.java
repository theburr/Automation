package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.PostsElements;

public class PostsPage extends NavigationPage implements PostsElements {

    public void admin_Delete_Post_Of_An_User() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, WAIT_TIME);
        actions.clickElement(LATEST_NEW_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETION, WAIT_TIME);
        actions.clickElement(ADMIN_POST_FOR_DELETION);
        actions.clickElement(EDIT_POST_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, WAIT_TIME);
        actions.clickElement(DELETE_BUTTON);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, WAIT_TIME);
        actions.clickElement(LATEST_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETION, WAIT_TIME);
    }

    public void assert_Post_Is_Deleted(){
        actions.assertElementNotPresent(ADMIN_POST_FOR_DELETION);
    }

    public void admin_Delete_Comment_Of_An_User() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(LATEST_NEW_POST_BUTTON, WAIT_TIME);
        actions.clickElement(LATEST_NEW_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETING_COMMENT, WAIT_TIME);
        actions.clickElement(ADMIN_POST_FOR_DELETING_COMMENT);
        actions.clickElement(COMMENT_EDIT_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, WAIT_TIME);
        actions.clickElement(DELETE_BUTTON);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, WAIT_TIME);
        actions.clickElement(LATEST_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETING_COMMENT, WAIT_TIME);
        actions.clickElement(ADMIN_POST_FOR_DELETING_COMMENT);
    }

    public void assert_Comment_Is_Deleted(){
        actions.assertElementNotPresent(COMMENT_EDIT_BUTTON);
    }

    public void registered_User_Write_New_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON,WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(NEW_POST_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(NEW_POST_BUTTON);
        actions.isElementPresentUntilTimeout(FIELD_POST_TITLE, WAIT_TIME);
        actions.typeValueInField(POST_TYPE_TITLE, FIELD_POST_TITLE);
        actions.typeValueInField(POST_TYPE_TEXT, FIELD_POST_DESCRIPTION);
        actions.uploadImage(POST_COPIED_IMG);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TYPE_TITLE, WAIT_TIME);
    }

    public void assert_New_Post_Is_Posted() {
        actions.assertIsTextPresent("The post " + POST_TYPE_TITLE + " is not posted ");
    }

    public void registered_User_Can_Edit_His_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, WAIT_TIME);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(EDIT_POST_BUTTON, WAIT_TIME);
        actions.clickElement(EDIT_POST_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT_FIELD, WAIT_TIME);
        actions.typeValueInField(POST_NEW_TITLE, POST_TITLE_EDIT_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(SIGN_IN_BUTTON,WAIT_TIME);
    }

    public void assert_The_Post_Is_Edited() {
        actions.assertElementPresent( POST_EDIT_COMMENT_SECTION);
    }

    public void registered_User_Can_Delete_His_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, WAIT_TIME);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(EDIT_POST_BUTTON, WAIT_TIME);
        actions.clickElement(EDIT_POST_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, WAIT_TIME);
        actions.clickElement(DELETE_BUTTON);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(SIGN_IN_BUTTON,WAIT_TIME);
    }

    public void assert_The_Post_Is_Deleted() {
        actions.assertElementPresent(POST_DELETE_ASSERTION);
    }

    public void registered_User_Can_Comment_A_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, WAIT_TIME);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(COMMENT_FIELD, WAIT_TIME);
        actions.typeValueInField(COMMENT_TEXT, COMMENT_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(POST_LIKE_BUTTON,WAIT_TIME);
    }

    public void assert_The_Comment_Is_Posted() {
        actions.assertIsTextPresent(COMMENT_TEXT);
    }

    public void registered_User_Can_Delete_His_Comment() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, WAIT_TIME);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(COMMENT_EDIT_BUTTON, WAIT_TIME);
        actions.clickElement(COMMENT_EDIT_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, WAIT_TIME);
        actions.clickElement(DELETE_BUTTON);
        actions.isElementPresentUntilTimeout(COMMENT_CONFIRM_DELETION_BUTTON, WAIT_TIME);
        actions.clickElement(COMMENT_CONFIRM_DELETION_BUTTON);
        actions.isElementPresentUntilTimeout(SIGN_IN_BUTTON,WAIT_TIME);
    }
    public void assert_The_Comment_Is_Deleted() {
        actions.assertElementPresent(COMMENT_EDIT_CONFIRMATION);
    }

}

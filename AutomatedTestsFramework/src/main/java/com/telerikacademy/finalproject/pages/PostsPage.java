package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.Posts;

public class PostsPage extends NavigationPage implements Posts {

    public void admin_Delete_Post_Of_An_User() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 5);
        actions.clickElement(LATEST_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETION, 5);
        actions.assertElementPresent(ADMIN_POST_FOR_DELETION);
        actions.clickElement(ADMIN_POST_FOR_DELETION);
        actions.clickElement(EDIT_POST_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, 5);
        actions.assertElementPresent(DELETE_BUTTON);
        actions.clickElement(DELETE_BUTTON);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 5);
        actions.clickElement(LATEST_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETION,5);
    }

    public void assert_Post_Is_Deleted(){
        actions.assertElementNotPresent(ADMIN_POST_FOR_DELETION);
        System.out.println("Post is missing thus successfully deleted!");
    }

    public void admin_Delete_Comment_Of_An_User() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 5);
        actions.clickElement(LATEST_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETING_COMMENT, 5);
        actions.clickElement(ADMIN_POST_FOR_DELETING_COMMENT);
        actions.clickElement(COMMENT_EDIT_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, 5);
        actions.clickElement(DELETE_BUTTON);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 5);
        actions.clickElement(LATEST_POST_BUTTON);
        actions.isElementPresentUntilTimeout(ADMIN_POST_FOR_DELETING_COMMENT, 5);
        actions.clickElement(ADMIN_POST_FOR_DELETING_COMMENT);
    }

    public void assert_Comment_Is_Deleted(){
        actions.assertElementNotPresent(COMMENT_EDIT_BUTTON);
        System.out.println("Comment is missing thus successfully deleted!");
    }

    public void registered_User_Write_New_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.clickHiddenElement(NEW_POST_BUTTON);
        actions.isElementPresentUntilTimeout(FIELD_POST_TITLE, 10);
        actions.typeValueInField(POST_TYPE_TITLE, FIELD_POST_TITLE);
        actions.typeValueInField(POST_TYPE_TEXT, FIELD_POST_DESCRIPTION);
        actions.uploadImage(UPLOAD_IMAGE);
        actions.isElementPresentUntilTimeout(CONFIRM_BUTTON, 5);
        actions.clickElement(CONFIRM_BUTTON);
    }

    public void assert_New_Post_Is_Posted() {
        actions.assertIsTextPresent("The post " + POST_TYPE_TITLE + " is not posted ");
    }

    public void registered_User_Can_Edit_His_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, 10);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, 10);
        actions.assertElementPresent(POST_TITLE_EDIT);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(EDIT_POST_BUTTON, 5);
        actions.clickElement(EDIT_POST_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT_FIELD, 5);
        actions.typeValueInField(POST_NEW_TITLE, POST_TITLE_EDIT_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
    }

    public void assert_The_Post_Is_Edited() {
        actions.assertElementPresent( POST_EDIT_COMMENT_SECTION);
    }
    public void registered_User_Can_Delete_His_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, 10);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, 10);
        actions.assertElementPresent(POST_TITLE_EDIT);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(EDIT_POST_BUTTON, 5);
        actions.clickElement(EDIT_POST_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, 5);
        actions.clickElement(DELETE_BUTTON);
        actions.clickElement(CONFIRM_BUTTON);
    }

    public void assert_The_Post_Is_Deleted() {
        actions.assertElementPresent(POST_DELETE_ASSERTION);
    }

    public void registered_User_Can_Comment_A_Post() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, 5);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, 10);
        actions.assertElementPresent(POST_TITLE_EDIT);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(COMMENT_FIELD, 5);
        actions.typeValueInField(COMMENT_TEXT, COMMENT_FIELD);
        actions.clickElement(CONFIRM_BUTTON);
    }

    public void assert_The_Comment_Is_Posted() {
        actions.assertIsTextPresent(COMMENT_TEXT);
    }

    public void registered_User_Can_Delete_His_Comment() {
        auto_Login(USER_USERNAME, USER_PASSWORD);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, 5);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, 5);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, 10);
        actions.assertElementPresent(POST_TITLE_EDIT);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(COMMENT_EDIT_BUTTON, 5);
        actions.clickElement(COMMENT_EDIT_BUTTON);
        actions.isElementPresentUntilTimeout(DELETE_BUTTON, 5);
        actions.clickElement(DELETE_BUTTON);
        actions.isElementPresentUntilTimeout(COMMENT_CONFIRM_DELETION_BUTTON, 5);
        actions.clickElement(COMMENT_CONFIRM_DELETION_BUTTON);
    }
    public void assert_The_Comment_Is_Deleted() {
        actions.assertElementPresent(COMMENT_EDIT_CONFIRMATION);
    }

}

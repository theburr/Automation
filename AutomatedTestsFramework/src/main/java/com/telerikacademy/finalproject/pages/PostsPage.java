package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.PostsElements;

import java.io.IOException;

public class PostsPage extends NavigationPage implements PostsElements {

    public void admin_DeletePostOfAnUser() {
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
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

    public void assert_PostIsDeleted(){
        actions.assertElementNotPresent(ADMIN_POST_FOR_DELETION);
    }

    public void admin_DeleteCommentOfAnUser() {
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
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

    public void assert_CommentIsDeleted(){
        actions.assertElementNotPresent(COMMENT_EDIT_BUTTON);
    }

    public void registered_UserWriteNewPost() throws IOException {
        actions.copy_Image(NEW_POST_ORIGINAL_IMG, NEW_POST_COPIED_IMG);
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON,WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(NEW_POST_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(NEW_POST_BUTTON);
        actions.isElementPresentUntilTimeout(FIELD_POST_TITLE, WAIT_TIME);
        actions.typeValueInField(POST_TYPE_TITLE, FIELD_POST_TITLE);
        actions.isElementPresentUntilTimeout(FIELD_POST_DESCRIPTION,WAIT_TIME);
        actions.typeValueInField(POST_TYPE_TEXT, FIELD_POST_DESCRIPTION);
        actions.uploadImage(POST_COPIED_IMG);
        actions.isElementPresentUntilTimeout(CONFIRM_BUTTON, WAIT_TIME);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TYPE_TITLE, WAIT_TIME);
    }

    public void assert_NewPostIsPosted() {
        actions.assertIsTextPresent("The post " + POST_TYPE_TITLE + " is not posted ");
    }

    public void registered_UserCanEditHisPost() {
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(LOG_OUT_BUTTON, WAIT_TIME);
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

    public void assert_ThePostIsEdited() {
        actions.assertElementPresent("The post " + POST_EDIT_COMMENT_SECTION + "is not edited");
    }

    public void registered_UserCanDeleteHisPost() {
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
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
        actions.isElementPresentUntilTimeout(CONFIRM_BUTTON, WAIT_TIME);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(SIGN_IN_BUTTON,WAIT_TIME);
    }

    public void assert_ThePostIsDeleted() {
        actions.assertElementPresent(POST_DELETE_ASSERTION);
    }

    public void registered_UserCanCommentAPost() {
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(HOME_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(PROFILE_BUTTON);
        actions.isElementPresentUntilTimeout(POST_TITLE_EDIT, WAIT_TIME);
        actions.clickElement(POST_TITLE_EDIT);
        actions.isElementPresentUntilTimeout(COMMENT_FIELD, WAIT_TIME);
        actions.typeValueInField(COMMENT_TEXT, COMMENT_FIELD);
        actions.isElementPresentUntilTimeout(CONFIRM_BUTTON, WAIT_TIME);
        actions.clickElement(CONFIRM_BUTTON);
        actions.isElementPresentUntilTimeout(POST_LIKE_BUTTON,WAIT_TIME);
    }

    public void assert_TheCommentIsPosted() {
        actions.assertIsTextPresent(COMMENT_TEXT);
    }

    public void registered_UserCanDeleteHisComment() {
        auto_Login(USER_USERNAME_ENCODED, USER_PASSWORD_ENCODED);
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

    public void assert_TheCommentIsDeleted() {
        actions.assertElementPresent(COMMENT_EDIT_CONFIRMATION);
    }
}

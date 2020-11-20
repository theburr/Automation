package com.telerikacademy.finalproject.pages;


import com.telerikacademy.finalproject.pages.Elements.Navigation;

public class NavigationPage extends BasePage implements Navigation {

    public NavigationPage() {
        super("base.url");
    }


//    public void RegisteredUserWriteNewPost() {
//        actions.isElementPresentUntilTimeout("post.Latest", 5);
//        actions.clickHiddenElement("post.New");
//        actions.isElementPresentUntilTimeout("post.Title", 10);
//        actions.typeValueInField(postTypeTitle, "post.Title");
//        actions.typeValueInField(postTypeText, "post.Description");
//        actions.uploadImage("upload.Image");
//        actions.isElementPresentUntilTimeout("post.ButtonSave", 5);
//        actions.clickElement("post.ButtonSave");
//    }

//    public void AssertNewPostIsPosted() {
//        actions.assertIsTextPresent("The post " + postTypeTitle + " is not posted ");
//    }

//    public void RegisteredUserCanEditHimPost() {
//        actions.isElementPresentUntilTimeout("profile.Button", 20);
//        actions.clickHiddenElement("profile.Button");
//        actions.isElementPresentUntilTimeout("post.TitleForEdit", 10);
//        actions.assertElementPresent("post.TitleForEdit");
//        actions.clickElement("post.TitleForEdit");
//        actions.isElementPresentUntilTimeout("post.EditButton", 5);
//        actions.clickElement("post.EditButton");
//        actions.isElementPresentUntilTimeout("post.TitleEditField", 5);
//        actions.typeValueInField("post.TypeNewTitle", "post.TitleEditField");
//        actions.clickElement("post.EditSaveButton");
//    }

//    public void AssertThePostIsEdited() {
//        actions.assertElementPresent("post.EditCommentSection");
//    }

//    public void RegisteredUserCanDeleteHimPost(String title, String description) {
//        actions.isElementPresentUntilTimeout("post.Latest", 5);
//        actions.clickHiddenElement("profile.Button");
//        actions.isElementPresentUntilTimeout("post.TitleForEdit", 10);
//        actions.assertElementPresent("post.TitleForEdit");
//        actions.clickElement("post.TitleForEdit");
//        actions.isElementPresentUntilTimeout("post.EditButton", 5);
//        actions.clickElement("post.EditButton");
//        actions.isElementPresentUntilTimeout("post.EditDeleteButton", 5);
//        actions.clickElement("post.EditDeleteButton");
//        actions.clickElement("post.DeleteConfirmButton");
//    }
//
//    public void AssertThePostIsDeleted() {
//        actions.assertElementPresent("post.DeleteAssertion");
//    }
//
//    public void RegisteredUserCanCommentAPost(String comment) {
//        // ## Comment the part of actions till "Login.Button" if have to run single test ## //
//
//        actions.isElementPresentUntilTimeout("post.Latest", 5);
//        actions.clickElement("post.DeleteButtonPleaseSignIn");
//        actions.isElementPresentUntilTimeout("login.Button", 5);
//        actions.typeValueInField(USERNAME, "username.Field");
//        actions.typeValueInField(PASSWORD, "password.Field");
//        actions.clickElement("login.Button");
//
//        actions.isElementPresentUntilTimeout("post.Latest", 5);
//        actions.clickHiddenElement("profile.Button");
//        actions.isElementPresentUntilTimeout("post.TitleForEdit", 10);
//        actions.assertElementPresent("post.TitleForEdit");
//        actions.clickElement("post.TitleForEdit");
//        actions.isElementPresentUntilTimeout("comment.Field", 5);
//        actions.typeValueInField(COMMENT, "comment.Field");
//        actions.clickElement("comment.ButtonSend");
//    }
//
//    public void AssertTheCommentIsPosted(String text) {
//        actions.assertIsTextPresent(text);
//    }

//    public void RegisteredUserCanDeleteHimComment() {
//        // ## Comment the part of actions till "Login.Button" if have to run single test ## //
//
////        actions.isElementPresentUntilTimeout("post.Latest", 5);
////        actions.clickElement("post.DeleteButtonPleaseSignIn");
////        actions.isElementPresentUntilTimeout("login.Button", 5);
////        actions.typeValueInField(USERNAME, "username.Field");
////        actions.typeValueInField(PASSWORD, "password.Field");
////        actions.clickElement("login.Button");
//
//        actions.isElementPresentUntilTimeout("navigation.Home", 5);
//        actions.clickHiddenElement("profile.Button");
//        actions.isElementPresentUntilTimeout("post.TitleForEdit", 10);
//        actions.assertElementPresent("post.TitleForEdit");
//        actions.clickElement("post.TitleForEdit");
//        actions.isElementPresentUntilTimeout("comment.ButtonEdit", 5);
//        actions.clickElement("comment.ButtonEdit");
//        actions.isElementPresentUntilTimeout("comment.DeleteCommentButton", 5);
//        actions.clickElement("comment.DeleteCommentButton");
//        actions.isElementPresentUntilTimeout("comment.ConfirmDeletionButton", 5);
//        actions.clickElement("comment.ConfirmDeletionButton");
//    }
//    public void AssertTheCommentIsDeleted() {
//        actions.assertElementPresent("comment.EditConfirmation");
//    }


}



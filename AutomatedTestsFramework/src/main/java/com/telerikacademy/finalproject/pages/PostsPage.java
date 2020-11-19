package com.telerikacademy.finalproject.pages;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public class PostsPage extends LoginPage {
    public final String adminUsername = "admin.Username";
    public final String adminPassword = "admin.Password";
    public final String userUsername = "user.Username";
    public final String userPassword = "user.Password";
    public final String adminPostForDeletion = "adminPostForDeletion";
    public final String latestPostsButton = "PostButton";
    public final String editPostButton = "EditPostButton";
    public final String deletePostButton = "DeletePostButton";
    public final String confirmButton = "ConfirmActionsPostButton";
    public final String postTypeTitle = getUIMappingByKey("post.TypeTitle");
    public final String postTypeText = getUIMappingByKey("post.TypeText");
    public final String postNewTitle = getUIMappingByKey("post.TypeNewTitle");
    public final String newPostButton = "post.New";
    public final String fieldPostTitle = "post.Title";
    public final String fieldPostDescription = "post.Description";
    public final String uploadImage = "upload.Image";
    public final String profileButton = "profile.Button";
    public final String postTitleEdit = "post.TitleForEdit";
    public final String titleEditField = "post.TitleEditField";
    public final String postEditCommentSection = "post.EditCommentSection";
    public final String postDeleteAssertion = "post.DeleteAssertion";
    public final String commentField = "comment.Field";
    public final String commentText = getUIMappingByKey("comment.Text");
    public final String commentEditButton = "comment.ButtonEdit";
    public final String commentConfirmDeleteButton = "comment.ConfirmDeletionButton";
    public final String commentEditConfirmation = "comment.EditConfirmation";


    public void admin_Delete_Post_Of_An_User() {
        auto_Login(adminUsername, adminPassword);
        actions.isElementPresentUntilTimeout(latestPostsButton, 5);
        actions.clickElement(latestPostsButton);
        actions.isElementPresentUntilTimeout(adminPostForDeletion, 5);
        actions.assertElementPresent(adminPostForDeletion);
        actions.clickElement(adminPostForDeletion);
        actions.clickElement(editPostButton);
        actions.isElementPresentUntilTimeout(deletePostButton, 5);
        actions.assertElementPresent(deletePostButton);
        actions.clickElement(deletePostButton);
        actions.clickElement(confirmButton);
        actions.isElementPresentUntilTimeout(latestPostsButton, 5);
        actions.clickElement(latestPostsButton);
        actions.isElementPresentUntilTimeout(adminPostForDeletion,5);
    }

    public void registered_User_Write_New_Post() {
        //auto_Login(userUsername, userPassword);
        actions.isElementPresentUntilTimeout(latestPostsButton, 5);
        actions.clickHiddenElement(newPostButton);
        actions.isElementPresentUntilTimeout(fieldPostTitle, 10);
        actions.typeValueInField(postTypeTitle, fieldPostTitle);
        actions.typeValueInField(postTypeText, fieldPostDescription);
        actions.uploadImage(uploadImage);
        actions.isElementPresentUntilTimeout(confirmButton, 5);
        actions.clickElement(confirmButton);
    }

    public void assert_New_Post_Is_Posted() {
        actions.assertIsTextPresent("The post " + postTypeTitle + " is not posted ");
    }

    public void registered_User_Can_Edit_His_Post() {
        auto_Login(userUsername, userPassword);
        actions.isElementPresentUntilTimeout(profileButton, 20);
        actions.clickHiddenElement(profileButton);
        actions.isElementPresentUntilTimeout(postTitleEdit, 10);
        actions.assertElementPresent(postTypeTitle);
        actions.clickElement(postTitleEdit);
        actions.isElementPresentUntilTimeout(editPostButton, 5);
        actions.clickElement(editPostButton);
        actions.isElementPresentUntilTimeout(titleEditField, 5);
        actions.typeValueInField(postNewTitle, titleEditField);
        actions.clickElement(confirmButton);
    }

    public void assert_The_Post_Is_Edited() {
        actions.assertElementPresent("The post " + postEditCommentSection + "is not edited");
    }
    public void registered_User_Can_Delete_His_Post() {
        auto_Login(userUsername, userPassword);
        actions.isElementPresentUntilTimeout(profileButton, 20);
        actions.clickHiddenElement(profileButton);
        actions.isElementPresentUntilTimeout(postTitleEdit, 10);
        actions.assertElementPresent(postTypeTitle);
        actions.clickElement(postTitleEdit);
        actions.isElementPresentUntilTimeout(editPostButton, 5);
        actions.clickElement(editPostButton);
        actions.isElementPresentUntilTimeout(deletePostButton, 5);
        actions.clickElement(deletePostButton);
        actions.clickElement(confirmButton);
    }

    public void assert_The_Post_Is_Deleted() {
        actions.assertElementPresent(postDeleteAssertion);
    }

    public void registered_User_Can_Comment_A_Post() {
        auto_Login(userUsername, userPassword);
        actions.isElementPresentUntilTimeout(latestPostsButton, 5);
        actions.clickHiddenElement(profileButton);
        actions.isElementPresentUntilTimeout(postTitleEdit, 10);
        actions.assertElementPresent(postTitleEdit);
        actions.clickElement(postTitleEdit);
        actions.isElementPresentUntilTimeout(commentField, 5);
        actions.typeValueInField(commentText, commentField);
        actions.clickElement(confirmButton);
    }

    public void assert_The_Comment_Is_Posted() {
        actions.assertIsTextPresent(commentText);
    }

    public void registered_User_Can_Delete_His_Comment() {
        auto_Login(userUsername, userPassword);
        actions.isElementPresentUntilTimeout(latestPostsButton, 5);
        actions.clickHiddenElement(profileButton);
        actions.isElementPresentUntilTimeout(postTitleEdit, 10);
        actions.assertElementPresent(postTitleEdit);
        actions.clickElement(postTitleEdit);
        actions.isElementPresentUntilTimeout(commentEditButton, 5);
        actions.clickElement(commentEditButton);
        actions.isElementPresentUntilTimeout(deletePostButton, 5);
        actions.clickElement(deletePostButton);
        actions.isElementPresentUntilTimeout(commentConfirmDeleteButton, 5);
        actions.clickElement(commentConfirmDeleteButton);
    }
    public void assert_The_Comment_Is_Deleted() {
        actions.assertElementPresent(commentEditConfirmation);
    }

}

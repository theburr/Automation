package com.telerikacademy.finalproject.pages;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public class PostsPage extends LoginPage {
    public final String homeButton = "navigation.Home";
    public final String latestPostsButton = "PostButton";
    public final String editPostButton = "EditPostButton";
    public final String deletePostButton = "DeletePostButton";
    public final String confirmDeletePostButton = "ConfirmDeletePostButton";
    public final String adminPostForDeletion = "adminPostForDeletion";
    public final String signInButton = "naviogation.SignIn";
    public final String logOutButton = "navigation.LogOut";
    public final String categoriesButton = "adminCategoriesBtn";
    public final String postTypeTitle = getUIMappingByKey("post.TypeTitle");
    public final String postTypeNewTitle = getUIMappingByKey("post.TypeNewTitle");
    public final String postTypeText = getUIMappingByKey("post.TypeText");
    public final String commentType = "comment.Type";

    public void admin_Delete_Post_Of_An_User(){
        adminLogIn();
        actions.isElementPresentUntilTimeout(latestPostsButton,5 );
        actions.clickElement(latestPostsButton);
        actions.isElementPresentUntilTimeout(adminPostForDeletion,5 );
        actions.assertElementPresent(adminPostForDeletion);
        actions.clickElement(adminPostForDeletion);
        actions.clickElement(editPostButton);
        actions.isElementPresentUntilTimeout(deletePostButton,5 );
        actions.assertElementPresent(deletePostButton);
        actions.clickElement(deletePostButton);
        actions.clickElement(confirmDeletePostButton);
        actions.isElementPresentUntilTimeout(latestPostsButton, 5);
        actions.clickElement(latestPostsButton);
    }
    public void RegisteredUserWriteNewPost() {
        actions.isElementPresentUntilTimeout("post.Latest", 5);
        actions.clickHiddenElement("post.New");
        actions.isElementPresentUntilTimeout("post.Title", 10);
        actions.typeValueInField(postTypeTitle, "post.Title");
        actions.typeValueInField(postTypeText, "post.Description");
        actions.uploadImage("upload.Image");
        actions.isElementPresentUntilTimeout("post.ButtonSave", 5);
        actions.clickElement("post.ButtonSave");
    }
    public void AssertNewPostIsPosted() {
        actions.assertIsTextPresent("The post " + postTypeTitle + " is not posted ");
    }

    public void RegisteredUserCanEditHimPost() {
        actions.isElementPresentUntilTimeout("profile.Button", 20);
        actions.clickHiddenElement("profile.Button");
        actions.isElementPresentUntilTimeout("post.NewForEdit", 10);
        actions.assertElementPresent("post.NewForEdit");
        actions.clickElement("post.NewForEdit");
        actions.isElementPresentUntilTimeout("post.EditButton", 5);
        actions.clickElement("post.EditButton");
        actions.isElementPresentUntilTimeout("post.TitleEditField", 5);
        actions.typeValueInField("post.TypeNewTitle", "post.TitleEditField");
        actions.clickElement("post.EditSaveButton");
    }

    public void AssertThePostIsEdited() {
        actions.assertElementPresent("post.EditCommentSection");
    }


}

package com.telerikacademy.finalproject.pages;

public class PostsPage extends LoginPage {
    public final String adminPostsButton = "adminPostsButton";
    public final String adminPostForDeletion = "adminPostForDeletion";
    public final String adminEditPost = "adminEditPost";
    public final String adminDeletePostBtn = "adminDeletePostBtn";
    public final String adminConfirmDeletePostBtn = "adminConfirmDeletePostBtn";

    public void admin_Delete_Post_Of_An_User(){
        adminLogIn();
        actions.isElementPresentUntilTimeout(adminPostsButton,5 );
        actions.clickElement(adminPostsButton);
        actions.isElementPresentUntilTimeout(adminPostForDeletion,5 );
        actions.assertElementPresent(adminPostForDeletion);
        actions.clickElement(adminPostForDeletion);
        actions.clickElement(adminEditPost);
        actions.isElementPresentUntilTimeout(adminDeletePostBtn,5 );
        actions.assertElementPresent(adminDeletePostBtn);
        actions.clickElement(adminDeletePostBtn);
        actions.clickElement(adminConfirmDeletePostBtn);
        actions.isElementPresentUntilTimeout(adminPostsButton, 5);
        actions.clickElement(adminPostsButton);
    }

}

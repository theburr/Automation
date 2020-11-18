package com.telerikacademy.finalproject.pages;


public class CategoriesAdminPage extends NavigationPage{
    public final String newCategoryBtn = "adminNewCategoryBtn";

    public void admin_Delete_Post_Of_An_User(){
        adminLogIn();
        actions.isElementPresentUntilTimeout("adminPostsButton",5 );
        actions.clickElement("adminPostsButton");
        actions.isElementPresentUntilTimeout("adminPostForDeletion",5 );
        actions.assertElementPresent("adminPostForDeletion");
        actions.clickElement("adminPostForDeletion");
        actions.clickElement("adminEditPost");
        actions.isElementPresentUntilTimeout("adminDeletePostBtn",5 );
        actions.assertElementPresent("adminDeletePostBtn");
        actions.clickElement("adminDeletePostBtn");
        actions.clickElement("adminConfirmDeletePostBtn");
        actions.isElementPresentUntilTimeout("adminPostsButton", 5);
        actions.clickElement("adminPostsButton");
    }

    public void create_Category_Admin(){
        NavigationPage navPage = new NavigationPage();
        adminLogIn();
        actions.isElementPresentUntilTimeout("adminProfileBtn",4);
        actions.clickHiddenElement(navPage.categoriesButton);
        actions.isElementPresentUntilTimeout(newCategoryBtn,4);
        actions.clickHiddenElement(newCategoryBtn);
        actions.isElementPresentUntilTimeout("adminCategoryNameField",4);
        actions.uploadImage("adminCategoryUploadImage");
        actions.typeValueInField("Delete Me","adminCategoryNameField");
        actions.clickElement("adminCreateCategoryBtn");

    }
}

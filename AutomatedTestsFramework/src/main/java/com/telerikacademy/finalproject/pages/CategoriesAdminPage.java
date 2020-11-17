package com.telerikacademy.finalproject.pages;


public class CategoriesAdminPage extends NavigationPage{

    public void admin_Delete_Post_Of_An_User(){
        admin_LogIn();
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
        admin_LogIn();
        actions.isElementPresentUntilTimeout("adminProfileBtn",4);
        actions.clickHiddenElement(navPage.categoriesButton);
        actions.isElementPresentUntilTimeout("adminNewCategoryBtn",4);
        actions.clickHiddenElement("adminNewCategoryBtn");
        actions.isElementPresentUntilTimeout("adminCategoryNameField",4);
        actions.uploadImage("adminCategoryUploadImage");
        actions.typeValueInField("Delete Me","adminCategoryNameField");
        actions.clickElement("adminCreateCategoryBtn");

    }
}

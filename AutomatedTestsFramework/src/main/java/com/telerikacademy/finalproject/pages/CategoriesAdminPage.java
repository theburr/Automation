package com.telerikacademy.finalproject.pages;


public class CategoriesAdminPage extends LoginPage{
    public final String newCategoryBtn = "adminNewCategoryBtn";
    public final String adminProfileBtn = "adminProfileBtn";
    public final String adminCategoryNameField ="adminCategoryNameField";
    public final String adminCategoryUploadImage = "adminCategoryUploadImage";

    public void create_Category_Admin(){
        NavigationPage navPage = new NavigationPage();
        adminLogIn();
        actions.isElementPresentUntilTimeout(adminProfileBtn,4);
        actions.clickHiddenElement(navPage.categoriesButton);
        actions.isElementPresentUntilTimeout(newCategoryBtn,4);
        actions.clickHiddenElement(newCategoryBtn);
        actions.isElementPresentUntilTimeout(adminCategoryNameField,4);
        actions.uploadImage(adminCategoryUploadImage);
        actions.typeValueInField("Delete Me",adminCategoryNameField);
        actions.clickElement(navPage.categoriesButton);

    }
}

package com.telerikacademy.finalproject.pages;


import com.telerikacademy.finalproject.pages.Elements.CategoriesAdminElements;

public class CategoriesAdminPage extends NavigationPage implements CategoriesAdminElements {

    public void create_Category_Admin() {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON );
        actions.isElementPresentUntilTimeout(CATEGORIES_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(CATEGORIES_BUTTON);
        actions.isElementPresentUntilTimeout(NEW_CATEGORY_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(NEW_CATEGORY_BUTTON);
        actions.isElementPresentUntilTimeout(CATEGORY_ENTER_NAME_FIELD, WAIT_TIME);
        actions.uploadImage(CATEGORY_UPLOAD_IMAGE);
        actions.typeValueInField(CATEGORY_NAME_TO_ENTER, CATEGORY_ENTER_NAME_FIELD);
        actions.clickElement(CREATE_CATEGORY);
        actions.isElementPresentUntilTimeout(CATEGORIES_BUTTON, WAIT_TIME);
        actions.clickHiddenElement(CATEGORIES_BUTTON);
        actions.isElementPresentUntilTimeout(CREATED_CATEGORY, WAIT_TIME);
    }

    public void assert_Category_Is_Created() {
        actions.assertElementPresent(CREATED_CATEGORY);
    }
}

package com.telerikacademy.finalproject.pages;


import com.telerikacademy.finalproject.pages.Elements.CategoriesAdmin;

import java.awt.*;

public class CategoriesAdminPage extends NavigationPage implements CategoriesAdmin {

    public void create_Category_Admin() throws AWTException {
        auto_Login(ADMIN_USERNAME, ADMIN_PASSWORD);
        actions.isElementPresentUntilTimeout(PROFILE_BUTTON, 4);
        actions.clickElement(HOME_BUTTON );
        actions.isElementPresentUntilTimeout(CATEGORIES_BUTTON, 4);
        actions.clickHiddenElement(CATEGORIES_BUTTON);
        actions.isElementPresentUntilTimeout(NEW_CATEGORY_BUTTON, 4);
        actions.clickHiddenElement(NEW_CATEGORY_BUTTON);
        actions.isElementPresentUntilTimeout(CATEGORY_ENTER_NAME_FIELD, 4);
        actions.uploadImage(CATEGORY_UPLOAD_IMAGE);
        actions.typeValueInField(CATEGORY_NAME_TO_ENTER, CATEGORY_ENTER_NAME_FIELD);
        actions.clickElement(CREATE_CATEGORY);
        actions.isElementPresentUntilTimeout(CATEGORIES_BUTTON, 5);
        actions.clickHiddenElement(CATEGORIES_BUTTON);
    }

    public void assert_Category_Is_Created() {
        actions.assertElementPresent(CREATED_CATEGORY);
    }
}

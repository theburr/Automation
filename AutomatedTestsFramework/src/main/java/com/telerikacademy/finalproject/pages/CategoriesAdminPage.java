package com.telerikacademy.finalproject.pages;


import com.telerikacademy.finalproject.addRequiredFilesToYourPC.ImagesToBeAdded;
import com.telerikacademy.finalproject.pages.Elements.CategoriesAdminElements;

import java.io.IOException;

public class CategoriesAdminPage extends NavigationPage implements CategoriesAdminElements {

    public void create_CategoryAsAdmin() throws IOException {
        actions.copy_Image(CATEGORY_ORIGINAL_IMG, CATEGORY_COPIED_IMG);
        auto_Login(ADMIN_USERNAME_ENCODED, ADMIN_PASSWORD_ENCODED);
        actions.isElementPresentUntilTimeout(LATEST_POST_BUTTON, WAIT_TIME);
        actions.clickElement(HOME_BUTTON );
        actions.isElementPresentUntilTimeout(LATEST_NEW_POST_BUTTON, WAIT_TIME);
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

    public void assert_CategoryIsCreated() {
        actions.assertElementPresent(CREATED_CATEGORY);
    }
}

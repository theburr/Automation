package com.telerikacademy.finalproject.pages.Elements;

import java.io.File;

import static com.telerikacademy.finalproject.utils.Utils.getConfigPropertyByKey;
import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface BaseElements {

    /**To Edit The Properties Of These Elements Refer To The ui.map.properties Found In
     AutomatedTestsFramework/src/test/resources/mappings/ui_map.properties**/

    String ADMIN_USERNAME_ENCODED = getUIMappingByKey("admin.UsernameEncoded");
    String ADMIN_PASSWORD_ENCODED = getUIMappingByKey("admin.PasswordEncoded");
    String USER_USERNAME_ENCODED = getUIMappingByKey("user.UsernameEncoded");
    String USER_PASSWORD_ENCODED = getUIMappingByKey("user.PasswordEncoded");

    String UPLOAD_IMAGE = "upload.Image";
    String CONFIRM_BUTTON = "confirmActionsButton";
    Integer WAIT_TIME = Integer.parseInt(getConfigPropertyByKey("config.defaultTimeoutSeconds"));
    File CATEGORY_ORIGINAL_IMG = new File("Images/drinks.png");
    File CATEGORY_COPIED_IMG = new File("C:/ImageForHFSN/drinks.png");
    File NEW_POST_ORIGINAL_IMG = new File("Images/veganZombie.jpg");
    File NEW_POST_COPIED_IMG = new File("C:/ImageForHFSN/veganZombie.jpg");
    String LOG_OUT_BUTTON = "navigation.LogOut";
    String USERNAME_FIELD = "username.Field";
    String PASSWORD_FIELD = "password.Field";
    String USER_USERNAME = getUIMappingByKey("user.Username");
    String USER_PASSWORD = getUIMappingByKey("user.Password");

}

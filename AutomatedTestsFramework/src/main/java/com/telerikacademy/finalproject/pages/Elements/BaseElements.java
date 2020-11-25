package com.telerikacademy.finalproject.pages.Elements;

import java.io.File;

import static com.telerikacademy.finalproject.utils.Utils.getConfigPropertyByKey;
import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface BaseElements {
    String ADMIN_USERNAME = getUIMappingByKey("admin.UsernameEncoded");
    String ADMIN_PASSWORD = getUIMappingByKey("admin.PasswordEncoded");
    String USER_USERNAME = getUIMappingByKey("user.UsernameEncoded");
    String USER_PASSWORD = getUIMappingByKey("user.PasswordEncoded");
    String UPLOAD_IMAGE = "upload.Image";
    String CONFIRM_BUTTON = "confirmActionsButton";
    Integer WAIT_TIME = Integer.parseInt(getConfigPropertyByKey("config.defaultTimeoutSeconds"));
    File CATEGORY_ORIGINAL_IMG = new File("Images/drinks.png");
    File CATEGORY_COPIED_IMG = new File("C:/ImageForHFSN/drinks.png");
}

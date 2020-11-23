package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface Base {
    String ADMIN_USERNAME = getUIMappingByKey("admin.UsernameEncoded");
    String ADMIN_PASSWORD = getUIMappingByKey("admin.PasswordEncoded");
    String USER_USERNAME = getUIMappingByKey("user.UsernameEncoded");
    String USER_PASSWORD = getUIMappingByKey("user.PasswordEncoded");
    String UPLOAD_IMAGE = "upload.Image";
    String CONFIRM_BUTTON = "confirmActionsButton";

}

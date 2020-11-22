package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface Base {
    String ADMIN_USERNAME = getUIMappingByKey("admin.Username");
    String ADMIN_PASSWORD = getUIMappingByKey("admin.Password");
    String USER_USERNAME = getUIMappingByKey("user.Username");
    String USER_PASSWORD = getUIMappingByKey("user.Password");
    String UPLOAD_IMAGE = "upload.Image";
    String CONFIRM_BUTTON = "confirmActionsButton";

}

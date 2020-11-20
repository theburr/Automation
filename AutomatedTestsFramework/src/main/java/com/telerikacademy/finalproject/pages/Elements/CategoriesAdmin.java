package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface CategoriesAdmin {
    String NEW_CATEGORY_BUTTON = "admin.NewCategoryBtn";
    String CATEGORY_ENTER_NAME_FIELD ="admin.CategoryNameField";
    String CATEGORY_NAME_TO_ENTER = getUIMappingByKey("admin.CategoryNameForField");
    String CATEGORY_UPLOAD_IMAGE = "admin.CategoryUploadImage";
    String CREATE_CATEGORY = "admin.CreateCategoryBtn";
    String CREATED_CATEGORY = "admin.CreatedCategory";
}

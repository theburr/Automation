package com.telerikacademy.finalproject.utils;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface Elements {
    String HOME_BUTTON = "homeButton";
    String ADMIN_USERNAME = "admin.Username";
    String ADMIN_PASSWORD = "admin.Password";
    String USER_USERNAME = "user.Username";
    String USER_PASSWORD = "user.Password";
    String ADMIN_POST_FOR_DELETION = "adminPostForDeletion";
    String LATEST_POST_BUTTON = "latestPostButton";
    String EDIT_POST_BUTTON = "editPostButton";
    String DELETE_POST_BUTTON = "deletePostButton";
    String CONFIRM_BUTTON = "confirmActionsPostButton";
    String POST_TYPE_TITLE = getUIMappingByKey("post.TypeTitle");
    String POST_TYPE_TEXT = getUIMappingByKey("post.TypeText");
    String POST_NEW_TITLE = getUIMappingByKey("post.TypeNewTitle");
    String NEW_POST_BUTTON = "post.New";
    String FIELD_POST_TITLE = "post.Title";
    String FIELD_POST_DESCRIPTION = "post.Description";
    String UPLOAD_IMAGE = "upload.Image";
    String PROFILE_BUTTON = "profile.Button";
    String POST_TITLE_EDIT = "post.TitleForEdit";
    String POST_TITLE_EDIT_FIELD = "post.TitleEditField";
    String POST_EDIT_COMMENT_SECTION = "post.EditCommentSection";
    String POST_DELETE_ASSERTION = "post.DeleteAssertion";
    String COMMENT_FIELD = "comment.Field";
    String COMMENT_TEXT = getUIMappingByKey("comment.Text");
    String COMMENT_EDIT_BUTTON = "comment.ButtonEdit";
    String COMMENT_CONFIRM_DELETION_BUTTON = "comment.ConfirmDeletionButton";
    String COMMENT_EDIT_CONFIRMATION = "comment.EditConfirmation";

    String SIGN_IN_BUTTON = "navigation.SignIn";
    String LOG_OUT_BUTTON = "navigation.LogOut";
    String CATEGORIES_BUTTON = "adminCategoriesBtn";
}

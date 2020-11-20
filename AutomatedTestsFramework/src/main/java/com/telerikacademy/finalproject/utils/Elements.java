package com.telerikacademy.finalproject.utils;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface Elements {
    String HOME_BUTTON = "homeButton";
    String ADMIN_USERNAME = "admin.Username";
    String ADMIN_PASSWORD = "admin.Password";
    String USER_USERNAME = "user.Username";
    String USER_PASSWORD = "user.Password";

    String USERNAME_FIELD = "username.Field";
    String PASSWORD_FIELD = "password.Field";

    String DELETE_BUTTON = "deletePostButton";

    String FIRST_USER_PROFILE = "users.firstUserProfile";
    String SECOND_USER_PROFILE = "users.secondUserProfile";
    String ADMIN_POST_FOR_DELETING_COMMENT = "adminPostForDeletingComment";
    String ADMIN_POST_FOR_DELETION = "adminPostForDeletion";
    String LATEST_POST_BUTTON = "latestPostButton";
    String EDIT_POST_BUTTON = "editPostButton";
    String CONFIRM_BUTTON = "confirmActionsButton";
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

    String SEND_CONNECTION = "send.ConnectionBtn";
    String CONFIRM_CONNECTION= "confirm.ConnectionBtn";
    String REJECT_CONNECTION= "reject.ConnectionBtn";
    String DISCONNECT_CONNECTION= "disconnect.ConnectionBtn";
    String CONNECTION_IS_SENT= "isSent.ConnectionBtn";

    String NEW_CATEGORY_BUTTON = "admin.NewCategoryBtn";
    String CATEGORY_ENTER_NAME_FIELD ="admin.CategoryNameField";
    String CATEGORY_NAME_TO_ENTER = getUIMappingByKey("admin.CategoryNameForField");
    String CATEGORY_UPLOAD_IMAGE = "admin.CategoryUploadImage";
    String CREATE_CATEGORY = "admin.CreateCategoryBtn";
    String CREATED_CATEGORY = "admin.CreatedCategory";

    String CONNECTIONS_BUTTON = "users.Connections";
    String CONNECTIONS_REQUESTS_BUTTON="users.ConnectionsReq";
    String USERS_BUTTON = "navigation.Users";
    String SIGN_IN_BUTTON = "navigation.SignIn";
    String LOG_OUT_BUTTON = "navigation.LogOut";
    String CATEGORIES_BUTTON = "admin.CategoriesBtn";

    String WRONG_MESSAGE = "negative.WrongMessage";
    String SIGN_UP_BUTTON = "signUp.button";
    String PASSWORD_CONFIRM_FIELD = "field.PasswordConfirm";

    String FIRST_NAME_FIELD = "user.FirstNameField";
    String LAST_NAME_FIELD = "user.LastNameField";
    String FIRST_NAME = getUIMappingByKey("user.FirstName");
    String LAST_NAME = getUIMappingByKey("user.LastName");
    String MENU_TYPE_VISIBILITY = "menu.TypeVisibility";
    String MENU_VISIBILITY = "menu.Visibility";
    String ERROR_PAGE = "error.Page";
    String LOGOUT_BUTTON = "logout.Button";

}

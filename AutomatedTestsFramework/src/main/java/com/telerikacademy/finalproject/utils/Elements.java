package com.telerikacademy.finalproject.utils;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface Elements {
    String ADMIN_USERNAME = "admin.Username";
    String ADMIN_PASSWORD = "admin.Password";
    String userUsername = "user.Username";
    String userPassword = "user.Password";
    String adminPostForDeletion = "adminPostForDeletion";
    String latestPostsButton = "latestPostButton";
    String editPostButton = "editPostButton";
    String deletePostButton = "deletePostButton";
    String confirmButton = "confirmActionsPostButton";
    String postTypeTitle = getUIMappingByKey("post.TypeTitle");
    String postTypeText = getUIMappingByKey("post.TypeText");
    String postNewTitle = getUIMappingByKey("post.TypeNewTitle");
    String newPostButton = "post.New";
    String fieldPostTitle = "post.Title";
    String fieldPostDescription = "post.Description";
    String uploadImage = "upload.Image";
    String profileButton = "profile.Button";
    String postTitleEdit = "post.TitleForEdit";
    String titleEditField = "post.TitleEditField";
    String postEditCommentSection = "post.EditCommentSection";
    String postDeleteAssertion = "post.DeleteAssertion";
    String commentField = "comment.Field";
    String commentText = getUIMappingByKey("comment.Text");
    String commentEditButton = "comment.ButtonEdit";
    String commentConfirmDeleteButton = "comment.ConfirmDeletionButton";
    String commentEditConfirmation = "comment.EditConfirmation";
    String homeButton = "homeButton";

}

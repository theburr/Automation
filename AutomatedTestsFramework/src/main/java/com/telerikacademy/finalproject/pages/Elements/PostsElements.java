package com.telerikacademy.finalproject.pages.Elements;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public interface PostsElements extends NavigationElements {
    String ADMIN_POST_FOR_DELETING_COMMENT = "adminPostForDeletingComment";
    String ADMIN_POST_FOR_DELETION = "adminPostForDeletion";
    String EDIT_POST_BUTTON = "editPostButton";
    String POST_TYPE_TITLE = getUIMappingByKey("post.TypeTitle");
    String POST_TYPE_TEXT = getUIMappingByKey("post.TypeText");
    String POST_NEW_TITLE = getUIMappingByKey("post.TypeNewTitle");
    String NEW_POST_BUTTON = "post.New";
    String FIELD_POST_TITLE = "post.Title";
    String FIELD_POST_DESCRIPTION = "post.Description";
    String POST_COPIED_IMG = "post.UploadedNewImage";
    String POST_LIKE_BUTTON = "post.LikeButton";

    String DELETE_BUTTON = "deletePostButton";
    String POST_TITLE_EDIT = "post.TitleForEdit";
    String POST_TITLE_EDIT_FIELD = "post.TitleEditField";
    String POST_EDIT_COMMENT_SECTION = "post.EditCommentSection";
    String POST_DELETE_ASSERTION = "post.DeleteAssertion";

    String COMMENT_FIELD = "comment.Field";
    String COMMENT_TEXT = getUIMappingByKey("comment.Text");
    String COMMENT_EDIT_BUTTON = "comment.ButtonEdit";
    String COMMENT_CONFIRM_DELETION_BUTTON = "comment.ConfirmDeletionButton";
    String COMMENT_EDIT_CONFIRMATION = "comment.EditConfirmation";
}

package testCases;

import categoriesForGroupTesting.CriticalPriority;
import categoriesForGroupTesting.HighPriority;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PostsFunctionalities extends BaseTest {

    @Test
    @Category(CriticalPriority.class)
    public void WriteNewPostAsRegisteredUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_UserWriteNewPost();
        postsPage.assert_NewPostIsPosted();
        postsPage.logOut_FromSocialNetwork();
    }

    @Test
    @Category(CriticalPriority.class)
    public void UserCanCommentPost(){
        PostsPage postPage = new PostsPage();
        postPage.registered_UserCanCommentAPost();
        postPage.assert_TheCommentIsPosted();
        postPage.logOut_FromSocialNetwork();
    }

    @Test
    @Category(HighPriority.class)
    public void DeletePostAsUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_UserCanDeleteHisPost();
        postsPage.assert_ThePostIsDeleted();
        postsPage.logOut_FromSocialNetwork();
    }

    @Test
    @Category(HighPriority.class)
    public void EditPostAsUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_UserCanEditHisPost();
        postsPage.assert_ThePostIsEdited();
        postsPage.logOut_FromSocialNetwork();
    }

    @Test
    @Category(HighPriority.class)
    public void UserCanDeleteHisComment(){
        PostsPage postPage = new PostsPage();
        postPage.registered_UserCanDeleteHisComment();
        postPage.assert_TheCommentIsDeleted();
        postPage.logOut_FromSocialNetwork();
    }
}

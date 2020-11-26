package testCases;

import categoriesForGroupTesting.CriticalPriority;
import categoriesForGroupTesting.HighPriority;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PostsFunctionalities extends BaseTest {

    @Test
    @Category(CriticalPriority.class)
    public void test_003_writeNewPostAsRegisteredUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_UserWriteNewPost();
        postsPage.assert_NewPostIsPosted();
    }

    @Test
    @Category(CriticalPriority.class)
    public void test_004_userCanCommentPost(){
        PostsPage postPage = new PostsPage();
        postPage.registered_UserCanCommentAPost();
        postPage.assert_TheCommentIsPosted();
    }

    @Test
    @Category(HighPriority.class)
    public void test_011_deletePostAsUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_UserCanDeleteHisPost();
        postsPage.assert_ThePostIsDeleted();
    }

    @Test
    @Category(HighPriority.class)
    public void test_012_editPostAsUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_UserCanEditHisPost();
        postsPage.assert_ThePostIsEdited();
    }

    @Test
    @Category(HighPriority.class)
    public void test_013_userCanDeleteHisComment(){
        PostsPage postPage = new PostsPage();
        postPage.registered_UserCanDeleteHisComment();
        postPage.assert_TheCommentIsDeleted();
    }

}

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
        postsPage.registered_User_Write_New_Post();
        postsPage.assert_New_Post_Is_Posted();
    }

    @Test
    @Category(CriticalPriority.class)
    public void test_004_userCanCommentPost(){
        PostsPage postPage = new PostsPage();
        postPage.registered_User_Can_Comment_A_Post();
        postPage.assert_The_Comment_Is_Posted();
    }

    @Test
    @Category(HighPriority.class)
    public void test_011_deletePostAsUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Can_Delete_His_Post();
        postsPage.assert_The_Post_Is_Deleted();
    }

    @Test
    @Category(HighPriority.class)
    public void test_012_editPostAsUser(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Can_Edit_His_Post();
        postsPage.assert_The_Post_Is_Edited();
    }

    @Test
    @Category(HighPriority.class)
    public void test_013_userCanDeleteHisComment(){
        PostsPage postPage = new PostsPage();
        postPage.registered_User_Can_Delete_His_Comment();
        postPage.assert_The_Comment_Is_Deleted();
    }

}

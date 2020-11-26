package testCases;

import categoriesForGroupTesting.AdminTests;
import categoriesForGroupTesting.CriticalPriority;
import com.telerikacademy.finalproject.pages.CategoriesAdminPage;
import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Administrator extends BaseTest {

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void test_008_adminLogInHFSNW(){
        LoginPage logInPage = new LoginPage();
        logInPage.admin_LogInHFSN();
        logInPage.assert_LogInHFSN();
        logInPage.logg_OutAfterTest();
    }

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void test_005_deleteUserPostAsAdmin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_DeletePostOfAnUser();
        postsPage.assert_PostIsDeleted();
    }

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void test_006_deleteCommentOfAnUserAsAdmin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_DeleteCommentOfAnUser();
        postsPage.assert_CommentIsDeleted();
    }

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void test_007_createCategoryAsAdmin(){
        CategoriesAdminPage categoryPage = new CategoriesAdminPage();
        categoryPage.create_CategoryAsAdmin();
        categoryPage.assert_CategoryIsCreated();
    }

}

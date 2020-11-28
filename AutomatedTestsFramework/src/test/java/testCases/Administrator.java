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
    public void AdminLogInHealthyFoodSocialNetwork(){
        LoginPage logInPage = new LoginPage();
        logInPage.admin_LogInHFSN();
        logInPage.assert_LogInHFSN();
    }

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void DeleteUserPostAsAdmin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_DeletePostOfAnUser();
        postsPage.assert_PostIsDeleted();
    }

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void DeleteCommentOfAnUserAsAdmin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_DeleteCommentOfAnUser();
        postsPage.assert_CommentIsDeleted();
    }

    @Test
    @Category({CriticalPriority.class, AdminTests.class})
    public void CreateCategoryAsAdmin(){
        CategoriesAdminPage categoryPage = new CategoriesAdminPage();
        categoryPage.create_CategoryAsAdmin();
        categoryPage.assert_CategoryIsCreated();
    }

}

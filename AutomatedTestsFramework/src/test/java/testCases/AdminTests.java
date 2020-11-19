package testCases;

import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;
import com.telerikacademy.finalproject.pages.CategoriesAdminPage;


public class AdminTests extends BaseTest {

    @Test
    public void login_As_Admin() {
        LoginPage loginPage = new LoginPage();
        loginPage.adminLogIn();
        actions.assertElementPresent(LOG_OUT_BUTTON);
    }

    @Test
    public void delete_User_Post_As_Admin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_Delete_Post_Of_An_User();
        actions.assertElementNotPresent(ADMIN_POST_FOR_DELETION);
    }

    @Test
    public void create_Category() {
        CategoriesAdminPage catePage = new CategoriesAdminPage();
        catePage.create_Category_Admin();
        actions.assertElementPresent(CREATED_CATEGORY);
    }

    @Test
    public void delete_Comment_Of_An_User() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_Delete_Comment_Of_An_User();
        postsPage.assert_Comment_Is_Deleted();
    }
}


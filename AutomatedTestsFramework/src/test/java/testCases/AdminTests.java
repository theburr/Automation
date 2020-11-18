package testCases;

import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;
import com.telerikacademy.finalproject.pages.CategoriesAdminPage;


public class AdminTests extends BaseTest{

        @Test
        public void login_As_Admin(){
            LoginPage loginPage = new LoginPage();
            loginPage.adminLogIn();
            actions.assertElementPresent("navigation.LogOut");
        }
        @Test
        public void delete_User_Post_As_Admin(){
            PostsPage postsPage = new PostsPage();
            postsPage.admin_Delete_Post_Of_An_User();
            actions.assertElementNotPresent("adminPostForDeletion");
        }
        @Test
        public void create_Category(){
            CategoriesAdminPage catePage = new CategoriesAdminPage();
            catePage.create_Category_Admin();
            actions.assertElementPresent("adminCreatedCategory");
        }
    }


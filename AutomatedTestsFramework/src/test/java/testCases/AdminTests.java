package testCases;

import org.junit.Test;
import com.telerikacademy.finalproject.pages.CategoriesAdminPage;
import com.telerikacademy.finalproject.pages.NavigationPage;


public class AdminTests extends BaseTest{

        @Test
        public void login_As_Admin(){
            NavigationPage navPage = new NavigationPage();
            navPage.admin_LogIn();
            actions.assertElementPresent("navigation.LogOut");
        }
        @Test
        public void delete_User_Post_As_Admin(){
            CategoriesAdminPage catePage = new CategoriesAdminPage();
            catePage.admin_Delete_Post_Of_An_User();
            actions.assertElementNotPresent("adminPostForDeletion");
        }
        @Test
        public void create_Category(){
            CategoriesAdminPage catePage = new CategoriesAdminPage();
            catePage.create_Category_Admin();
            actions.assertElementPresent("adminCreatedCategory");
        }
    }


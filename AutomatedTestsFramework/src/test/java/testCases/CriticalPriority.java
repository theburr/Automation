package testCases;

import com.telerikacademy.finalproject.pages.CategoriesAdminPage;
import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.pages.PostsPage;
import org.junit.Test;

import java.awt.*;

public class CriticalPriority extends BaseTest {

    @Test
    public void test_001_navigate_To_Home_Using_Navigation(){
        NavigationPage navPage = new NavigationPage();
        actions.clickElement(navPage.HOME_BUTTON);
        navPage.assertPageNavigated();
    }

    @Test
    public void test_002_login_HFSN_With_Right_Credentials(){
        LoginPage logInPage = new LoginPage();
        logInPage.navigate_To_Login_Page_And_Log_In_HFSN();
        logInPage.assert_Log_In_HFSN();
    }
    @Test
    public void test_003_write_New_Post_As_Registered_User(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Write_New_Post();
        postsPage.assert_New_Post_Is_Posted();
    }

    @Test
    public void test_004_user_can_comment_Post(){
        PostsPage postPage = new PostsPage();
        postPage.registered_User_Can_Comment_A_Post();
        postPage.assert_The_Comment_Is_Posted();
    }

    @Test
    public void test_005_delete_User_Post_As_Admin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_Delete_Post_Of_An_User();
        postsPage.assert_Post_Is_Deleted();
    }

    @Test
    public void test_006_delete_Comment_Of_An_User_As_Admin() {
        PostsPage postsPage = new PostsPage();
        postsPage.admin_Delete_Comment_Of_An_User();
        postsPage.assert_Comment_Is_Deleted();
    }

    @Test
    public void test_007_create_Category_As_Admin() throws AWTException {
        CategoriesAdminPage categoryPage = new CategoriesAdminPage();
        categoryPage.create_Category_Admin();
        categoryPage.assert_Category_Is_Created();
    }

}


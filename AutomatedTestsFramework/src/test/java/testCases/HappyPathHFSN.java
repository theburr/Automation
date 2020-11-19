package testCases;

import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.pages.PostsPage;
import com.telerikacademy.finalproject.utils.Elements;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HappyPathHFSN extends BaseTest {

    @Test
    public void test_001_navigate_To_Home_Using_Navigation(){
        NavigationPage navPage = new NavigationPage();
        actions.clickElement(navPage.homeButton);
        navPage.assertPageNavigated();
    }
    @Test
    public void test_002_login_HFSN_With_Right_Credentials(){
        LoginPage logPage = new LoginPage();
        logPage.NavigateToLoginPageAndLogInHFSN();
        logPage.assertPageNavigated();
    }
    @Test
    public void test_003_write_New_Post_As_Registered_User(){
//        LoginPage loginPage = new LoginPage();
//        loginPage.NavigateToLoginPageAndLogInHFSN();
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Write_New_Post();
        postsPage.assert_New_Post_Is_Posted();
    }

    @Test
    public void test_004_edit_Post_As_User(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Can_Edit_His_Post();
        postsPage.assert_The_Post_Is_Edited();
    }
    @Test
    public void test_005_delete_Post_As_User(){
        PostsPage postsPage = new PostsPage();
        postsPage.registered_User_Can_Delete_His_Post();
        postsPage.assert_The_Post_Is_Deleted();
    }
    @Test
    public void test_006_user_can_comment_Post(){
        PostsPage postPage = new PostsPage();
        postPage.registered_User_Can_Comment_A_Post();
        postPage.assert_The_Comment_Is_Posted();
    }

    @Test
    public void test_007_user_Can_Delete_His_Comment(){
        PostsPage postPage = new PostsPage();
        postPage.registered_User_Can_Delete_His_Comment();
        postPage.assert_The_Comment_Is_Deleted();
   }
}


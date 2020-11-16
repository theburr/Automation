package testCases;

import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.NavigationPage;
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
        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);
        logPage.assertPageNavigated();
    }
    @Test
    public void test_003_write_New_Post_As_Registered_User(){
        // ## Use Login Method below if have to run single test  ## //
//
//        LoginPage logPage = new LoginPage();
//        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserWriteNewPost(TITLE, DESCRIPTION);
        navPage.AssertNewPostIsPosted(TITLE);
    }
    @Test
    public void test_004_edit_Post_As_User(){
        //##Use Login Method below if have to run single test ## //

//        LoginPage logPage = new LoginPage();
//        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserCanEditHimPost(NEW_TITLE, DESCRIPTION);
        navPage.AssertThePostIsEdited();
    }
    @Test
    public void test_005_delete_Post_As_User(){
        // ## Use Login Method below if have to run single test  ## //
//
//        LoginPage logPage = new LoginPage();
//        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserCanDeleteHimPost(NEW_TITLE,DESCRIPTION);
        navPage.AssertThePostIsDeleted();
    }
    @Test
    public void test_006_user_can_comment_Post(){
        // ## Use Login Method below if have to run single test  ## //
//
//        LoginPage logPage = new LoginPage();
//        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserCanCommentAPost(COMMENT);
        navPage.AssertTheCommentIsPosted(COMMENT);
    }
    @Test
    public void test_007_user_Can_Delete_Him_Comment(){
        // ## Use Login Method below if have to run single test  ## //

//        LoginPage logPage = new LoginPage();
//        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserCanDeleteHimComment();
        navPage.AssertTheCommentIsDeleted();
    }
}


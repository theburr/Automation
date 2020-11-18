package testCases;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;
import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.utils.Elements;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import test.tmp.Base;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HappyPathHFSN extends BaseTest implements Elements {

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
        // ## Use Login Method below if have to run single test  ## //

        LoginPage logPage = new LoginPage();
        logPage.NavigateToLoginPageAndLogInHFSN();

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserWriteNewPost();
        navPage.AssertNewPostIsPosted();
    }
    @Test
    public void test_004_edit_Post_As_User(){
        //##Use Login Method below if have to run single test ## //

//        LoginPage logPage = new LoginPage();
//        logPage.NavigateToLoginPageAndLogInHFSN(USERNAME,PASSWORD);

        NavigationPage navPage = new NavigationPage();
        navPage.RegisteredUserCanEditHimPost();
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


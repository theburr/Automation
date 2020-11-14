package testCases.AdminTests;

import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.utils.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import testCases.BaseTest;

public class AdminFunctions extends BaseTest {

    UserActions actions = new UserActions();

    public void admin_LogIn() {
        NavigationPage navPage = new NavigationPage();
        actions.isElementPresentUntilTimeout(navPage.signInButton, 4);
        actions.clickElement(navPage.signInButton);
        actions.isElementPresentUntilTimeout("signInPage.Username", 4);
        actions.typeValueInField("adminUsername", "signInPage.Username");
        actions.typeValueInField("adminPassword","signInPage.Password");
        actions.clickElement("signInPage.LogInBtn");
    }
    public void admin_Delete_Post_Of_An_User(){
        admin_LogIn();
        actions.isElementPresentUntilTimeout("adminPostsButton",5 );
        actions.clickElement("adminPostsButton");
        actions.isElementPresentUntilTimeout("adminPostForDeletion",5 );
        actions.assertElementPresent("adminPostForDeletion");
        actions.clickElement("adminPostForDeletion");
        actions.clickElement("adminEditPost");
        actions.isElementPresentUntilTimeout("adminDeletePostBtn",5 );
        actions.assertElementPresent("adminDeletePostBtn");
        actions.clickElement("adminDeletePostBtn");
        actions.clickElement("adminConfirmDeletePostBtn");
        actions.isElementPresentUntilTimeout("adminPostsButton", 5);
        actions.clickElement("adminPostsButton");
    }

    public void create_Category_Admin(){
        admin_LogIn();
        actions.isElementPresentUntilTimeout("adminProfileBtn",4);
        actions.clickHiddenElement("adminCategoriesBtn");
        actions.isElementPresentUntilTimeout("adminNewCategoryBtn",4);
        actions.clickHiddenElement("adminNewCategoryBtn");
        actions.isElementPresentUntilTimeout("adminCategoryNameField",4);
        actions.uploadImage("adminCategoryUploadImage");
        actions.typeValueInField("Delete Me","adminCategoryNameField");
        actions.clickElement("adminCreateCategoryBtn");

    }
}

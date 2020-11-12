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
        actions.typeValueInField("zionalpha22qa@gmail.com", "signInPage.Username");
        actions.typeValueInField("telerikAlphaQA22$","signInPage.Password");
        actions.clickElement("signInPage.LogInBtn");
    }
    public void admin_Delete_Post_Of_An_User(){
        admin_LogIn();
        actions.isElementPresentUntilTimeout("//a[@href='/posts']",5 );
        actions.clickElement("//a[@href='/posts']");
        actions.isElementPresentUntilTimeout("//*[contains(text(), 'Post For Deletion')]",5 );
        actions.assertElementPresent("//*[contains(text(), 'Post For Deletion')]");
        actions.clickElement("//*[contains(text(), 'Post For Deletion')]");
        actions.clickElement("//i[@class='fa fa-pencil-square-o like']");
        actions.isElementPresentUntilTimeout("//a[@class='genric-btn primary-border e-large']",5 );
        actions.assertElementPresent("//a[@class='genric-btn primary-border e-large']");
        actions.clickElement("//a[@class='genric-btn primary-border e-large']");
        actions.clickElement("//button[@type='submit']");
        actions.isElementPresentUntilTimeout("//a[@href='/posts']", 5);
        actions.clickElement("//a[@href='/posts']");
    }

    public void create_Category_Admin(){
        admin_LogIn();
        actions.isElementPresentUntilTimeout("//a[@href='/users/profile']",4);
        actions.clickHiddenElement("//a[@href='/admin/categories']");
        actions.isElementPresentUntilTimeout("//a[@href='/admin/categories/new']",4);
        actions.clickHiddenElement("//a[@href='/admin/categories/new']");
        actions.isElementPresentUntilTimeout("//input[@name='category']",4);
        actions.uploadImage("category.UploadImage");
        actions.typeValueInField("Delete Me","//input[@class='form-control']");
        actions.clickElement("//button[@type='submit']");

    }
}

package testCases;

import categoriesForGroupTesting.CriticalPriority;
import categoriesForGroupTesting.MediumLowPriority;
import categoriesForGroupTesting.NegativeTestCases;
import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.NavigationPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NavigationAndLogIn extends BaseTest{

    @Test
    @Category(CriticalPriority.class)
    public void test_001_navigateToHomeUsingNavigation(){
        NavigationPage navPage = new NavigationPage();
        actions.clickElement(navPage.HOME_BUTTON);
        navPage.assertPageNavigated();
    }

    @Test
    @Category(CriticalPriority.class)
    public void test_002_loginHFSNWithRightCredentials(){
        LoginPage logInPage = new LoginPage();
        logInPage.navigate_ToLoginPageAndLogInHFSN();
        logInPage.assert_LogInHFSN();
        logInPage.logg_OutAfterTest();
    }
    @Test
    @Category(MediumLowPriority.class)
    public void test_021_userIsTryingToRegisterAlreadyRegisteredCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.register_User_WithAlreadyRegisteredEmail();
        loginPage.assert_UserCantRegisterWithAlreadyRegisteredCredentials();
    }

    @Test
    @Category(MediumLowPriority.class)
    public void test_022_userIsLoggedOutFromTheHealthyFoodSN(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_LogOut();
        loginPage.assert_UserIsLoggedOutFromTheSystem();
    }
    @Test
    @Category(NegativeTestCases.class)
    public void test_031_loginWithWrongCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_isTryingToLogInWithWrongCredentials();
        loginPage.assert_LogInWithWrongCredentials();
    }

    @Test
    @Category(NegativeTestCases.class)
    public void test_032_unregisteredUserTryingToLogInHealthyFoodSN(){
        LoginPage loginPage = new LoginPage();
        loginPage.unregistered_User_IsTryingToLogInHFSN();
        loginPage.assert_LogInWithWrongCredentials();
    }
}

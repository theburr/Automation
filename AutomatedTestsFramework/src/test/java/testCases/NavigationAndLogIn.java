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
        logInPage.navigate_To_Login_Page_And_Log_In_HFSN();
        logInPage.assert_Log_In_HFSN();
        logInPage.logging_out_after_test();
    }
    @Test
    @Category(MediumLowPriority.class)
    public void test_021_userIsTryingToRegisterAlreadyRegisteredCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.register_User_with_already_registered_email();
        loginPage.assert_The_User_Cant_register_with_already_registered_credentials();
    }

    @Test
    @Category(MediumLowPriority.class)
    public void test_022_userIsLoggedOutFromTheHealthyFoodSN(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_Log_Out();
        loginPage.assert_The_User_is_logged_out_from_the_system();
    }
    @Test
    @Category(NegativeTestCases.class)
    public void test_031_loginWithWrongCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_is_trying_to_logIn_with_invalid_credentials();
        loginPage.assert_Log_In_With_Wrong_Credentials();
    }

    @Test
    @Category(NegativeTestCases.class)
    public void test_032_unregisteredUserTryingToLogInHealthyFoodSN(){
        LoginPage loginPage = new LoginPage();
        loginPage.unregistered_user_trying_to_log_in_Healthy_food_SN();
        loginPage.assert_Log_In_With_Wrong_Credentials();
    }
}

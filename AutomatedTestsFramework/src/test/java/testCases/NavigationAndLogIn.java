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
    public void NavigateToHomeUsingNavigation(){
        NavigationPage navPage = new NavigationPage();
        actions.clickElement(navPage.HOME_BUTTON);
        navPage.assert_PageNavigated();

    }

    @Test
    @Category(CriticalPriority.class)
    public void LoginHealthyFoodSocialNetworkWithRightCredentials(){
        LoginPage logInPage = new LoginPage();
        logInPage.navigate_ToLoginPageAndLogInHFSN();
        logInPage.assert_LogInHFSN();
        logInPage.logout_FromSocialNetwork();
        logInPage.back_HomeAfterTest();
    }

    @Test
    @Category(MediumLowPriority.class)
    public void UserIsTryingToRegisterAlreadyRegisteredCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.register_NewUserWithAlreadyRegisteredEmail();
        loginPage.assert_UserCantRegisterWithAlreadyRegisteredCredentials();
        loginPage.back_HomeAfterErrorMessage();
    }

    @Test
    @Category(MediumLowPriority.class)
    public void UserIsLoggedOutFromTheHealthyFoodSN(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_LogOut();
        loginPage.assert_UserIsLoggedOutFromTheSystem();
        loginPage.back_HomeAfterTest();
    }

    @Test
    @Category(NegativeTestCases.class)
    public void LoginWithWrongCredentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_isTryingToLogInWithWrongCredentials();
        loginPage.assert_LogInWithWrongCredentials();
        loginPage.back_HomeAfterTest();
    }

    @Test
    @Category(NegativeTestCases.class)
    public void UnregisteredUserTryingToLogInHealthyFoodSN(){
        LoginPage loginPage = new LoginPage();
        loginPage.unregistered_UserIsTryingToLogInHFSN();
        loginPage.assert_LogInWithWrongCredentials();
        loginPage.back_HomeAfterTest();
    }
}

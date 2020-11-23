package testCases;

import com.telerikacademy.finalproject.pages.LoginPage;
import org.junit.Test;

public class NegativeTestCases extends BaseTest{
    @Test
    public void test_031_login_with_wrong_credentials(){
        LoginPage loginPage = new LoginPage();
        loginPage.user_is_trying_to_logIn_with_invalid_credentials();
        loginPage.assert_Log_In_HFSN();
    }
    @Test
    public void test_032_unregistered_user_trying_to_log_in_Healthy_food_SN(){
        LoginPage loginPage = new LoginPage();
        loginPage.unregistered_user_trying_to_log_in_Healthy_food_SN();
        loginPage.assert_Log_In_HFSN();
    }
}

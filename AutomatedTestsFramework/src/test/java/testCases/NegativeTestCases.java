package testCases;

import com.telerikacademy.finalproject.pages.LoginPage;
import com.telerikacademy.finalproject.pages.NegativePage;
import org.junit.Test;

public class NegativeTestCases extends BaseTest{
    @Test
    public void test_001_login_with_wrong_credentials(){
        NegativePage negativePage = new NegativePage();
        negativePage.user_is_trying_to_logIn_with_invalid_credentials();
        negativePage.assert_Log_In_HFSN();
    }
    @Test
    public void test_002_unregistered_user_trying_to_log_in_Healthy_food_SN(){
        NegativePage negativePage = new NegativePage();
        negativePage.unregistered_user_trying_to_log_in_Healthy_food_SN();
        negativePage.assert_Log_In_HFSN();
    }
}

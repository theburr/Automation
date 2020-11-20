package testCases;

import com.telerikacademy.finalproject.pages.UsersPage;
import org.junit.Test;

public class LowMediumPrio extends BaseTest{
    @Test
    public void test_001_user_is_trying_to_register_already_registered_credentials(){
        UsersPage usersPage = new UsersPage();
        usersPage.register_User_with_already_registered_email();
        usersPage.assert_The_User_Cant_register_with_already_registered_credentials();
    }
    @Test
    public void test_002_user_is_logged_out_from_the_Healthy_food_SN(){
        UsersPage usersPage = new UsersPage();
        usersPage.user_Log_Out();
        usersPage.assert_The_User_is_logged_out_from_the_system();
    }
}

package testCases.AdminTests;

import com.telerikacademy.finalproject.utils.Utils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AdminTests extends AdminFunctions{

    @Test
    public void login_As_Admin(){
        admin_LogIn();
        actions.assertElementPresent("navigation.LogOut");
    }
    @Test
    public void delete_User_Post_As_Admin(){
        admin_Delete_Post_Of_An_User();
        actions.assertElementNotPresent("adminPostForDeletion");
    }
    @Test
    public void create_Category(){
        create_Category_Admin();
        actions.assertElementPresent("adminCreatedCategory");
    }
}

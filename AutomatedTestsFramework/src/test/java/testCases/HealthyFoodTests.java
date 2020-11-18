package testCases;

import com.telerikacademy.finalproject.pages.NavigationPage;
import org.junit.Test;

public class HealthyFoodTests extends BaseTest {

    @Test
    public void navigateToHome_UsingNavigation(){

        tastyFoodAPI.authenticateDriverForUser("admin.Username", "admin.Password", actions.getDriver());

        NavigationPage navPage = new NavigationPage();
        actions.clickElement(navPage.homeButton);
        navPage.assertPageNavigated();
        actions.assertElementPresent(navPage.logOutButton);
    }
}
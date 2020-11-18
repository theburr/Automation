package testCases;

import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.utils.PropertiesManager;
import com.telerikacademy.finalproject.utils.RequestHandler;
import com.telerikacademy.finalproject.utils.UserActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Calendar;
import java.util.Date;

public class HealthyFoodTests extends BaseTest {

    @Test
    public void navigateToHome_UsingNavigation(){

        tastyFoodAPI.authenticateDriverForUser("healthyFoodAdmin.username.encoded", "healthyFoodAdmin.pass.encoded", actions.getDriver());

        NavigationPage navPage = new NavigationPage();
        actions.clickElement(navPage.homeButton);
        navPage.assertPageNavigated();
        actions.assertElementPresent(navPage.logOutButton);
    }
}
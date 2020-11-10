package testCases;
import com.telerikacademy.finalproject.pages.NavigationPage;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;

public class SignInTest extends BaseTest {
        @Test
        public void logIn_As_User() {
                NavigationPage navPage = new NavigationPage();
                actions.isElementPresentUntilTimeout(navPage.homeButton, 4);
                actions.clickElement(navPage.signInButton);
                actions.typeValueInField("theburr@abv.bg", "signInPage.Username");
                actions.typeValueInField("telerikAlphaQA22$","signInPage.Password");
                actions.clickElement("signInPage.LogInBtn");
        }
}

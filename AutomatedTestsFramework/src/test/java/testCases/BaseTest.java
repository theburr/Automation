package testCases;

import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.TastyFoodAPI.UserAuthentication;
import com.telerikacademy.finalproject.utils.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
	UserActions actions = new UserActions();
	UserAuthentication tastyFoodAPI = new UserAuthentication();

	@BeforeClass
	public static void setUp(){  UserActions.loadBrowser("base.url");	}

	//@AfterClass
	//public static void tearDown(){
	//	UserActions.quitDriver();
//	}

	public void logIn_As_User() {
		NavigationPage navPage = new NavigationPage();
		actions.isElementPresentUntilTimeout(navPage.signInButton, 4);
		actions.clickElement(navPage.signInButton);
		actions.isElementPresentUntilTimeout("signInPage.Username", 4);
		actions.typeValueInField("theburr@abv.bg", "signInPage.Username");
		actions.typeValueInField("telerikAlphaQA22$", "signInPage.Password");
		actions.clickElement("signInPage.LogInBtn");
	}
}

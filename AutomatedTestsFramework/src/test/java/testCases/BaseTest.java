package testCases;

import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.utils.UserActions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest extends NavigationPage {
	UserActions actions = new UserActions();

	@BeforeClass
	public static void setUp(){
		UserActions.loadBrowser("base.url");
	}

	@After
	public void backHome(){
		UserActions.loadBrowser("base.url");
	}
	@AfterClass
	public static void tearDown(){
		UserActions.quitDriver();
	}
}

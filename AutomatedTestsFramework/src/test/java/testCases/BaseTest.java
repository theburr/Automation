package testCases;

import com.telerikacademy.finalproject.pages.NavigationPage;
import com.telerikacademy.finalproject.utils.UserActions;
import org.junit.BeforeClass;

public class BaseTest extends NavigationPage {
	UserActions actions = new UserActions();

	@BeforeClass
	public static void setUp(){
		UserActions.loadBrowser("base.url");	}

//	@AfterClass
//	public static void tearDown(){
//		UserActions.quitDriver();
//	}
}

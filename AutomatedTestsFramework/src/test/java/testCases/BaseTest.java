package testCases;

import com.telerikacademy.finalproject.utils.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
	UserActions actions = new UserActions();
	@BeforeClass
	public static void setUp(){
		UserActions.loadBrowser("base.url");
	}

	@AfterClass
	public static void tearDown(){
		UserActions.quitDriver();
	}
}

package testSuites;


import categoriesForGroupTesting.CriticalPriority;
import categoriesForGroupTesting.HighPriority;
import categoriesForGroupTesting.MediumLowPriority;
import categoriesForGroupTesting.NegativeTestCases;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testCases.Administrator;
import testCases.NavigationAndLogIn;
import testCases.PostsFunctionalities;
import testCases.UserConnection;

@RunWith(Categories.class)
@Categories.IncludeCategory({ CriticalPriority.class, HighPriority.class, MediumLowPriority.class, NegativeTestCases.class})
@Suite.SuiteClasses( { Administrator.class, PostsFunctionalities.class, NavigationAndLogIn.class, UserConnection.class})
public class FullRegressionTestsSuite {
}

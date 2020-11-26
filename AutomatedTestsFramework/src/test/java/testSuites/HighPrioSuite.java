package testSuites;

import categoriesForGroupTesting.CriticalPriority;
import categoriesForGroupTesting.HighPriority;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testCases.Administrator;
import testCases.NavigationAndLogIn;
import testCases.PostsFunctionalities;

@RunWith(Categories.class)
@Categories.IncludeCategory(HighPriority.class)
@Suite.SuiteClasses( { Administrator.class, PostsFunctionalities.class, NavigationAndLogIn.class })

public class HighPrioSuite { }

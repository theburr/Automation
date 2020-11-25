package testSuites;

import categoriesForGroupTesting.CriticalPriority;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testCases.Administration;
import testCases.NavigationAndLogIn;
import testCases.PostsFunctionalities;

@RunWith(Categories.class)
@Categories.IncludeCategory(CriticalPriority.class)
@Suite.SuiteClasses( { Administration.class, PostsFunctionalities.class, NavigationAndLogIn.class })

public class HighPrioSuite { }

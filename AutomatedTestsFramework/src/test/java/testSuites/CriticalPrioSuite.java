package testSuites;

import categoriesForGroupTesting.CriticalPriority;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import testCases.Administration;
import testCases.NavigationAndLogIn;
import testCases.PostsFunctionalities;

@RunWith(Categories.class)
@IncludeCategory(CriticalPriority.class)
@SuiteClasses( { Administration.class, PostsFunctionalities.class, NavigationAndLogIn.class })

public class CriticalPrioSuite { }

package testSuites;

import categoriesForGroupTesting.AdminTests;
import categoriesForGroupTesting.CriticalPriority;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import testCases.Administrator;
import testCases.NavigationAndLogIn;
import testCases.PostsFunctionalities;

@RunWith(Categories.class)
@IncludeCategory({ CriticalPriority.class, AdminTests.class })
@SuiteClasses( { Administrator.class, PostsFunctionalities.class, NavigationAndLogIn.class })

public class CriticalPrioSuite { }

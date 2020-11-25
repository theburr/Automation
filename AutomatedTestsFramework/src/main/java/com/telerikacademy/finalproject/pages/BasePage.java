package com.telerikacademy.finalproject.pages;

import com.telerikacademy.finalproject.pages.Elements.BaseElements;
import com.telerikacademy.finalproject.TastyFoodAPI.UserAuthentication;
import com.telerikacademy.finalproject.utils.UserActions;
import com.telerikacademy.finalproject.utils.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public abstract class BasePage implements BaseElements {
    protected String url;
    protected WebDriver driver;
    public UserActions actions;

    public void auto_Login(String username, String password) {
        UserAuthentication tastyFoodAPI = new UserAuthentication();
        tastyFoodAPI.authenticateDriverForUser(username, password, actions.getDriver());
    }
    public BasePage(String urlKey) {
        String pageUrl = Utils.getConfigPropertyByKey(urlKey);
        this.driver = Utils.getWebDriver();
        this.url = pageUrl;
        actions = new UserActions();
    }

    public String getUrl(){
        return url;
    }

    public void navigateToPage(){
        this.driver.get(url);
    }

    public void assertPageNavigated() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("Landed URL is not as expected. Actual URL: "
                + currentUrl + ". Expected URL: " + url, currentUrl.contains(url));
    }

}

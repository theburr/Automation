package com.telerikacademy.finalproject.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserActions {
    public WebDriver getDriver() {
        return driver;
    }

    final WebDriver driver;

    public UserActions() {
        this.driver = Utils.getWebDriver();
    }

    public static void loadBrowser(String baseUrlKey) {
        Utils.getWebDriver().get(Utils.getConfigPropertyByKey(baseUrlKey));
    }

    public static void quitDriver() {
        Utils.tearDownWebDriver();
    }

    //############# ELEMENT OPERATIONS #########

    public void clickElement(String key, Object... arguments) {
        String locator = Utils.getUIMappingByKey(key, arguments);

        Utils.LOG.info("Clicking on element " + key);
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }

    public void typeValueInField(String value, String field, Object... fieldArguments) {
        String locator = Utils.getUIMappingByKey(field, fieldArguments);
        WebElement element = driver.findElement(By.xpath(locator));
        element.sendKeys(value);
    }

    public void switchToIFrame(String iframe) {
        WebElement iFrame = driver.findElement(By.xpath(Utils.getUIMappingByKey(iframe)));
        getDriver().switchTo().frame(iFrame);
    }

    //############# WAITS #########

    public boolean isElementPresentUntilTimeout(String locator,int timeout, Object... arguments) {
        try {
            String xpath = Utils.getUIMappingByKey(locator, arguments);
            Integer defaultTimeout = Integer.parseInt(Utils.getConfigPropertyByKey("config.defaultTimeoutSeconds"));
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    //############# ASSERTS #########

    public void assertElementPresent(String locator) {
        Assert.assertNotNull(driver.findElement(By.xpath(Utils.getUIMappingByKey(locator))));
    }
}

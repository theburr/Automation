package com.telerikacademy.finalproject.utils;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public void clickHiddenElement(String key, Object... arguments) {
        String locator = Utils.getUIMappingByKey(key, arguments);
        WebElement ele = driver.findElement(By.xpath(locator));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
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

    public void uploadImage(String key,Object... arguments){
        WebElement element = driver.findElement(By.xpath("//input[@id='file']"));
        String locator = Utils.getUIMappingByKey(key, arguments);
        //enter the file path onto the file-selection input field
        element.sendKeys(locator);
    }
    public void uploadPic(String key,Object... arguments){
        WebElement element = driver.findElement(By.xpath("//input[@id='picture']"));
        String locator = Utils.getUIMappingByKey(key, arguments);
        //enter the file path onto the file-selection input field
        element.sendKeys(locator);
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
        try {
            Assert.assertNotNull(driver.findElement(By.xpath(Utils.getUIMappingByKey(locator))));
        } catch (AssertionError e) {
            System.out.println("Element is not created!");
            throw e;
        }
        System.out.println("Element is present thus successfully created!");
    }
    public void assertElementNotPresent(String locator) {
            try {
                driver.findElement(By.xpath(Utils.getUIMappingByKey(locator)));
            } catch (NoSuchElementException ex) {
                System.out.println("Element is not present thus successfully deleted!");
            }
        System.out.println("Element is present thus not deleted!");
    }

    public boolean assertIsTextPresent(String text) {
        try {
            boolean b = driver.getPageSource().contains(text);
            return b;
        } catch (Exception e) {
            return false;
        }
    }
}

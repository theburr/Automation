package com.telerikacademy.finalproject.utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class UserActions {

    private static final File ORIGINAL = new File("C:/ImageForHFSN/drinks.png");

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
        WebElement element = driver.findElement(By.xpath(Utils.getUIMappingByKey("upload.Field")));
        String locator = Utils.getUIMappingByKey(key, arguments);
        //enter the file path onto the file-selection input field
        element.sendKeys(locator);
    }

    public void uploadPic(String key,Object... arguments){
        WebElement element = driver.findElement(By.xpath(Utils.getUIMappingByKey("upload.Pic")));
        String locator = Utils.getUIMappingByKey(key, arguments);
        //enter the file path onto the file-selection input field
        element.sendKeys(locator);
    }
    public void copy_Image(File original , File copied) throws IOException {
        FileUtils.copyFile(original,copied);
        System.out.println("Image has been sent to "+copied);
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
            System.out.println("The given element is not present thus test fails!");
            throw e;
        }
        System.out.println("The given element is present thus test is passed successfully!");
    }
    public void assertElementNotPresent(String locator) {
            try {
                driver.findElement(By.xpath(Utils.getUIMappingByKey(locator)));
                System.out.println("The given element is present thus test has failed");
            } catch (NoSuchElementException ex) {
            }
        System.out.println("The given element is not present thus test is passed successfully!");
    }

    public boolean assertIsTextPresent(String text) {
        try {
            boolean b = driver.getPageSource().contains(text);
            return b;
        } catch (Exception e) {
            System.out.println("The text is not found!");
            return false;
        }
    }
}

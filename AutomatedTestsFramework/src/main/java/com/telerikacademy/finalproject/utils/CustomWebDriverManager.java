package com.telerikacademy.finalproject.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomWebDriverManager {
	public enum CustomWebDriverManagerEnum {
		INSTANCE;
		private WebDriver driver = setupBrowser();

		private WebDriver setupBrowser(){
			WebDriverManager.firefoxdriver().setup();
			WebDriver firefoxDriver = new FirefoxDriver();
			firefoxDriver.manage().window().maximize();
			driver = firefoxDriver;
			return firefoxDriver;
		}

		public void quitDriver() {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
		}

		public WebDriver getDriver() {
			if (driver == null){
				setupBrowser();
			}
			return driver;
		}
	}
}

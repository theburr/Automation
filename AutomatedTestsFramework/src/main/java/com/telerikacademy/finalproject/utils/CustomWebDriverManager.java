package com.telerikacademy.finalproject.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomWebDriverManager {
	public enum CustomWebDriverManagerEnum {
		INSTANCE;
		private WebDriver driver = setupBrowser();

//// ### Use script below for Firefox Browser  ####////

//		private WebDriver setupBrowser(){
//			WebDriverManager.firefoxdriver().setup();
//			WebDriver firefoxDriver = new FirefoxDriver();
//			firefoxDriver.manage().window().maximize();
//			driver = firefoxDriver;
//			return firefoxDriver;
//		}

		//// ### Use script below for Chrome Browser  ####////

		private WebDriver setupBrowser(){
			WebDriverManager.chromedriver().setup();
			WebDriver chromeDriver = new ChromeDriver();
			chromeDriver.manage().window().maximize();
			driver = chromeDriver;
			return chromeDriver;
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

package com.telerikacademy.finalproject.TastyFoodAPI;

import com.telerikacademy.finalproject.utils.PropertiesManager;
import com.telerikacademy.finalproject.utils.RequestHandler;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class UserAuthentication {
    public void authenticateDriverForUser(String usernameKey, String passwordKey, WebDriver driver){
        String username = PropertiesManager.PropertiesManagerEnum.INSTANCE.getConfigProperties().getProperty(usernameKey);
        String password = PropertiesManager.PropertiesManagerEnum.INSTANCE.getConfigProperties().getProperty(passwordKey);

        // Authenticate and extract cookie
        RequestHandler client = new RequestHandler();
        String requestBody = "username=" + username + "&password=" + password;
        Response response = client.sendPostRequest("https://protected-hamlet-40147.herokuapp.com/authenticate", requestBody, ContentType.URLENC);
        String cookieValue = response.getDetailedCookie("JSESSIONID").getValue();
        driver.manage().addCookie(new Cookie("JSESSIONID", cookieValue, "protected-hamlet-40147.herokuapp.com", "/", null, true, true));
    }
}

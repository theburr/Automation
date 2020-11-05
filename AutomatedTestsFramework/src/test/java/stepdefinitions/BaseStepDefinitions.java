package stepdefinitions;

import com.telerikacademy.finalproject.utils.UserActions;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;

public class BaseStepDefinitions {
    @BeforeStories
    public void beforeStories(){
        UserActions.loadBrowser("base.url");
    }

    @AfterStories
    public void afterStories(){
        UserActions.quitDriver();
    }
}

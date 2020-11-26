package stepdefinitions;

import com.telerikacademy.finalproject.utils.UserActions;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;

import javax.lang.model.util.Elements;

public class BaseStepDefinitions {
    @BeforeStories
    public void beforeStories(){
        UserActions.loadBrowser("base.url");
    }

//    @AfterStories
//    public void afterStories(){
//        UserActions.quitDriver();
//    }

}

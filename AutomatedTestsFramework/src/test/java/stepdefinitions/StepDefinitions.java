package stepdefinitions;

import com.telerikacademy.finalproject.utils.UserActions;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static com.telerikacademy.finalproject.utils.Utils.getUIMappingByKey;

public class StepDefinitions extends BaseStepDefinitions{
    UserActions actions = new UserActions();

    @Given("Click $element element")
    @When("Click $element element")
    @Then("Click $element element")
    public void clickElement(String element){
        actions.clickElement(element);
    }

    @Given("Type $value in $name field")
    @When("Type $value in $name field")
    @Then("Type $value in $name field")
    public void typeInField(String value, String field){
        actions.typeValueInField(value, field);
    }
    @Given("Wait for $element")
    @When("Wait for $element")
    @Then("Wait for $element")
    public void waitForElement(String locator,int timeout){
        actions.isElementPresentUntilTimeout(locator, timeout);
    }

    @Then("Assert that $element present")
    public void assertForElementPresent(String locator){
        actions.assertElementPresent(locator);
    }

}

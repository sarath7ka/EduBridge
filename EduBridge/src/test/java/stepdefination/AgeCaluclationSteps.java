package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.AgeCalculator;

public class AgeCaluclationSteps {
    
    
    @Given("user enters the date of birth")
    public void enterDob(){

        AgeCalculator.enterDob();
    }

    @Then("user clicks the caluclate the age")
    public void userClicksTheCaluclateTheAge() {

        AgeCalculator.clickCalculate();
    }
}

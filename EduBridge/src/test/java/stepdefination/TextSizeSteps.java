package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobject.TextSize;

public class TextSizeSteps {

    @Given("user clicks the bigger text button")
    public void userClicksTheBiggerTextButton() {
        TextSize.clickBigger();
    }

    @Then("user verify the bigger text")
    public void userVerifyTheBiggerText() {
        Assert.assertEquals("font-size: 40px;",TextSize.getText());
    }

    @Given("user clicks the smaller text button")
    public void userClicksTheSmallerTextButton() {

        TextSize.clickSmaller();

    }

    @Then("user verify the smaller text")
    public void userVerifyTheSmallerText() {

        Assert.assertEquals("font-size: 12px;",TextSize.getText());
    }

    @Given("user clicks the Reset text button")
    public void userClicksTheResetTextButton() {

        TextSize.clickReset();
    }

    @Then("user verify the Reset text")
    public void userVerifyTheResetText() {

        Assert.assertEquals("font-size: 1.25rem;",TextSize.getText());
    }
}

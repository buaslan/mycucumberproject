package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class ReusableStepDefs {

    @Then("capture the screenshot")
    public void capture_the_screenshot() throws IOException {

        ReusableMethods.getScreenshot("Capturing_Screenshot");

    }
}

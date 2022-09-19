package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_010_DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_10_LoginStepDefs {

    US_010_DoctorPage us_010_doctorPage = new US_010_DoctorPage();

    @Given("user open the URL {string}")
    public void user_open_the_url(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @When("user navigate the sign in page")
    public void user_navigate_the_sign_in_page() {
        us_010_doctorPage.linkOnHomePage.click();
        us_010_doctorPage.SignInButton.click();
    }
    @When("user enters username as {string} and password as {string} and click login")
    public void user_enters_username_as_and_password_as_and_click_login(String username, String password) {

        us_010_doctorPage.usernameText.sendKeys(username);
//        sending password
        us_010_doctorPage.passwordText.sendKeys(password);
//        clicking on login button
        us_010_doctorPage.submitButton.click();

    }
    @When("user clicks on My Pages")
    public void user_clicks_on_My_Pages(){
        Driver.sleep(2000);
        us_010_doctorPage.mypagelink.click();


    }
    @When("user clicks on My Appointments")
    public void user_clicks_on_my_appointments() {
        Driver.sleep(2000);
        us_010_doctorPage.myAppointmens.click();

    }
    @When("appointments can be seen by user")
    public void appointments_can_be_seen_by_user() {
        Driver.sleep(2000);
        Assert.assertTrue(us_010_doctorPage.AppointmentsText.isDisplayed());

    }
    @When("time slots can be seen")
    public void time_slots_can_be_seen() {
        Driver.sleep(2000);
        Assert.assertTrue(us_010_doctorPage.fromDate.isDisplayed());
        Assert.assertTrue(us_010_doctorPage.toDate.isDisplayed());
    }
    @When("User checks if patient id can be seen")
    public void user_checks_if_patient_id_can_be_seen() {
        Driver.sleep(2000);
        us_010_doctorPage.patientId.isDisplayed();
    }
    @When("User checks if start date can be seen")
    public void user_checks_if_start_date_can_be_seen() {
        Driver.sleep(2000);
        us_010_doctorPage.startDate.isDisplayed();
    }
    @When("User checks if end date can be seen")
    public void user_checks_if_end_date_can_be_seen() {
        Driver.sleep(2000);
        us_010_doctorPage.endDate.isDisplayed();
    }
    @When("User checks if status can be seen")
    public void user_checks_if_status_can_be_seen() {
        Driver.sleep(2000);
        us_010_doctorPage.status.isDisplayed();
    }
    //@Then("user signs out")
    //public void user_signs_out() {
        //us_010_doctorPage.doctorName.click();

        //us_010_doctorPage.logOutButton.click();

       // Driver.sleep(2000);
        //Assert.assertTrue(us_010_doctorPage.signInAgain.isDisplayed());
    }



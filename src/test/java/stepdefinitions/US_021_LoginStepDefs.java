package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_021_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US_021_LoginStepDefs {

    WebDriver driver;
   US_021_LoginPage us_021_loginPage = new US_021_LoginPage();

    @When("user navigate the sign-in page")
    public void user_navigate_the_sign_in_page() {
       us_021_loginPage.linkOnHomePage.click();
        us_021_loginPage.SignInButton.click();

    }
    @When("user enters username as {string} and password as {string} and click signIn")
    public void user_enters_username_as_and_password_as_and_click_sign_in(String username, String password) {
        us_021_loginPage.usernameText.sendKeys(username);
//        sending password
        us_021_loginPage.passwordText.sendKeys(password);
//        clicking on login button
        us_021_loginPage.submitButton.click();
    }
    @When("user clicks on MyPages")
    public void user_clicks_on_my_pages() {
        Driver.sleep(2000);
        us_021_loginPage.mypagelink.click();
    }
    @When("User clicks on Search Patient")
    public void user_clicks_on_search_patient() {
        Driver.sleep(2000);
        us_021_loginPage.searchPatientlink.click();
    }
    @Then("Patients can be seen by user")
    public void patients_can_be_seen_by_user() {
        Assert.assertTrue(us_021_loginPage.PatientsText.isDisplayed());
    }
    @Then("User clicks Patient SSN box")
    public void user_clicks_patient_ssn_box() {
        Driver.sleep(1000);
        us_021_loginPage.ssnTextBox.click();
    }
    @Then("User enter patient SSN")
    public void user_enter_patient_ssn() {
        Driver.sleep(1000);
        us_021_loginPage.ssnTextBox.sendKeys("222-98-7654");
    }
    @Then("User clicks on Show Appointments")
    public void user_clicks_on_show_appointments() {
        Driver.sleep(1000);
        us_021_loginPage.ShowAppointmentsButton.click();
    }
    @Then("User clicks on Edit")
    public void user_clicks_on_edit() {
        Driver.sleep(1000);
        us_021_loginPage.EditButton.click();
    }
    @Then("User verifies Create or Edit an Patient Appointments")
    public void user_verifies_create_or_edit_an_patient_appointments() {
        Driver.sleep(1000);
        Assert.assertTrue(us_021_loginPage.CreateOrEditAnAppointmentText.isDisplayed());
    }
    @Then("User select UNAPPROVED PENDING CANCELLED BUT CANNOT MAKE IT COMPLETED")
    public void user_select_unapproved_pending_cancelled_but_cannot_make_it_completed() {
        Driver.sleep(1000);
        us_021_loginPage.SelectUNAPPROVED.click();

        Driver.sleep(1000);
        us_021_loginPage.SelectPENDING.click();

        Driver.sleep(1000);
        us_021_loginPage.SelectCANCELLED.click();

        Driver.sleep(1000);
        us_021_loginPage.SelectCOMPLETED.click();

        }

    @Then("User clicks on Anamnesis text area")
    public void user_clicks_on_anamnesis_text_area() {
        us_021_loginPage.AnamnesisTextArea.click();

    }
    @And("User provide Anamnesis")
    public void user_provide_anamnesis() {
        us_021_loginPage.AnamnesisTextArea.sendKeys("Test");

    }
    @Then("User clicks on Treatment text area")
    public void user_clicks_on_treatment_text_area() {
        us_021_loginPage.TreatmentTextArea.click();

    }
    @And("User provide Treatment")
    public void user_provide_treatment() {
        us_021_loginPage.TreatmentTextArea.sendKeys("Test");

    }
    @Then("User clicks on Diagnosis text area")
    public void user_clicks_on_diagnosis_text_area() {
        us_021_loginPage.DiagnosisTextArea.click();
    }
    @And("User provide Diagnosis")
    public void user_provide_diagnosis() {
        us_021_loginPage.DiagnosisTextArea.sendKeys("Test");
    }
    @Then("User clicks on Physician List")
    public void user_clicks_on_physician_list() {
        Driver.sleep(9000);
        us_021_loginPage.PhysicianList.click();
    }
    @Then("User select current doctor")
    public void user_select_current_doctor() {
        Driver.sleep(9000);
        us_021_loginPage.CurrentDoctor.click();
    }
    @Then("User clicks on Show Tests")
    public void user_clicks_on_show_tests() {
        us_021_loginPage.ShowTestsButton.click();
    }
    @Then("User verifies Tests")
    public void user_verifies_tests() {
        Assert.assertTrue(us_021_loginPage.TestsText.isDisplayed());
    }
    @Then("User can see Tests result")
    public void user_can_see_tests_result() {
        us_021_loginPage.ViewResults.click();
        Assert.assertTrue(us_021_loginPage.TestResultsText.isDisplayed());
        Assert.assertTrue(us_021_loginPage.  cholestrolText.isDisplayed());

    }
    @Then("User signs out")
    public void user_signs_out() {
        Driver.sleep(2000);
        us_021_loginPage.accountMenu.click();
        Driver.sleep(2000);
        us_021_loginPage.SignOutButton.click();

        Assert.assertTrue(us_021_loginPage.signInAgain.isDisplayed());
    }
}

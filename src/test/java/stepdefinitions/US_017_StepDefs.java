package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections4.BagUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.US_017_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
public class US_017_StepDefs {

    WebDriver driver;
    US_017_Page US017Page = new US_017_Page();
    Faker faker = new Faker();

    @When("user navigates to medunna login page")
    public void user_navigates_to_medunna_login_page() {
        US_017_Page.linkOnHomePage.click();
        US_017_Page.SignInButton.click();
    }
    @When("user signs in as {string} and password as {string} and click signIn")
    public void user_signs_in_as_and_password_as_and_click_sign_in(String username, String password) {
        US_017_Page.usernameText.sendKeys(username);
//        sending password
        US_017_Page.passwordText.sendKeys(password);
//        clicking on login button
        US_017_Page.submitButton.click();
    }
    @When("user clicks on Item&Titles")
    public void user_clicks_on_item_titles() {
        Driver.sleep(2000);
        US_017_Page.ItemsAndTitles.click();
    }
    @When("user clicks on Test Item")
    public void user_clicks_on_test_item() {
        Driver.sleep(2000);
        US_017_Page.TestItem.click();
    }
    @When("user clicks on Create a new Test Item")
    public void user_clicks_on_create_a_new_test_item() {
        Driver.sleep(1000);
        US_017_Page.CreateNewTestItem.click();
        Driver.sleep(1000);

    }

    @Then("user verifies  create or edit a Test Item")
    public void user_verifies_create_or_edit_a_test_item() {
        Driver.sleep(1000);
       Assert.assertTrue(US_017_Page.CreateNewTestItemText.isDisplayed());

    }
    @Then("user writes all information on page")
    public void user_writes_all_information_on_page() {
        Driver.sleep(1000);
        US_017_Page.CreateNewTestItem.click();
        Driver.sleep(1000);
        US_017_Page.NameBox.sendKeys(faker.name().fullName());
        Driver.sleep(1000);
        US_017_Page.description.sendKeys(faker.name().name());
        Driver.sleep(1000);
        US_017_Page.price.sendKeys("2500");
        Driver.sleep(1000);
        US_017_Page.defaultValMin.sendKeys("1000");
        Driver.sleep(1000);
        US_017_Page.defaultValMax.sendKeys("3000");
    }

        @Then("user sees Test Item is created with identifier")
        public void user_sees_test_item_is_created_with_identifier() throws IOException {
            Driver.sleep(2000);
            Assert.assertTrue(US_017_Page.alertInfo.isDisplayed());
            ReusableMethods.getScreenshot("info populated");

        }

    @Then("user clicks on Save")
    public void user_clicks_on_save() {
        Driver.sleep(2000);
        US_017_Page.SaveButton.click();

    }

    @Then("user sees A Test Item is created with identifier")
    public void admin_sees_a_test_item_is_created_with_identifier() throws InterruptedException, IOException {
        Driver.sleep(2000);
        Assert.assertTrue(US_017_Page.alertInfo.isDisplayed());
        ReusableMethods.getScreenshot("info populated");

    }
    @And("user signs out")
    public void user_signs_out() {
        US_017_Page.accountMenu.click();
        US_017_Page.signOutt.click();
        Driver.closeDriver();
    }
    @Then("user closes the application")
    public void admin_closes_the_application() {
        Driver.closeDriver();

    }
    @Then("user clicks on View button")
    public void user_clicks_on_view_button() {
        Driver.sleep(2000);
        US_017_Page.ViewButton.click();
    }
    @Then("user sees Test Item information")
    public void user_sees_test_item_information() {
        Driver.sleep(2000);
        Assert.assertTrue(US_017_Page.TestItems.isDisplayed());
    }
    @Then("user clicks on Delete button")
    public void user_clicks_on_delete_button() {
        Driver.sleep(1000);
      US_017_Page.DeleteButton.click();
        Driver.sleep(1000);
        US_017_Page.DeleteButtonNewWindows.click();
        Driver.sleep(1000);
    }
    @Then("user sees A Test Item is deleted with identifier")
    public void user_sees_a_test_item_is_deleted_with_identifier() throws IOException {
        Driver.sleep(2000);
        Assert.assertTrue(US_017_Page.alertInfo.isDisplayed());
        ReusableMethods.getScreenshot("info populated");
    }

}

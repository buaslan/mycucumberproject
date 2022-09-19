package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class US10_DB_StepDefs {
    List<Object> appointmentList;

    @Given("User connects to database")
    public void user_connects_to_database() {
        DBUtils.createConnection();

    }
    @Then("User gets appointment {string}")
    public void user_gets_appointment(String status) {
        String query = "SELECT*FROM appointment";
       appointmentList = DBUtils.getColumnData(query, status);
        System.out.println(appointmentList);

    }
    @Then("User verifies status as {string}")
    public void user_verifies_status_as(String status) {
        List<String>statusList = new ArrayList<>();
        for (Object w: appointmentList){
            statusList.add(w.toString());
        }
        Assert.assertTrue(statusList.contains(status));
    }
    @Then("User closes the database connection")
    public void user_closes_the_database_connection() {
        DBUtils.closeConnection();

    }

}

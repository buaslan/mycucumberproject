package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event;
import utilities.Driver;

public class US_010_DoctorPage {

    public US_010_DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameText;

    @FindBy(id = "password")
    public WebElement passwordText;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id='account-menu']/a")
    public WebElement linkOnHomePage;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement SignInButton;

    @FindBy(xpath = "//*[contains(text(),'MY PAGES')]")
    public WebElement mypagelink;

    @FindBy(xpath = "//*[contains(text(),'My Appointments')]")
    public WebElement myAppointmens;

    @FindBy(xpath = "//*[@id='appointment-heading']")
    public WebElement AppointmentsText;

    @FindBy(xpath = "//*[@id='fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//*[@id='toDate']")
    public WebElement toDate;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement homeSignInButton;

    @FindBy(xpath = "//*[contains(text(),'BURHAN5 BURHAN5')]")
    public WebElement doctorName;

    @FindBy(xpath = "//*[contains(text(),'Sign out')]")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[contains(text(),'SIGN IN AGAIN')]")
    public WebElement signInAgain;

    @FindBy(xpath = "//*[contains(text(),'ID')]")
    public WebElement patientId;

    @FindBy(xpath = "//*[contains(text(),'Start DateTime')]")
    public WebElement startDate;

    @FindBy(xpath = "//*[contains(text(),'End DateTime')]")
    public WebElement endDate;

    @FindBy(xpath = "//*[contains(text(),'Status')]")
    public WebElement status;

}

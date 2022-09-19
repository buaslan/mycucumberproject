package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_021_LoginPage {

    public US_021_LoginPage() {
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

    @FindBy(xpath = "//*[contains(text(),'Search Patient')]")
    public WebElement searchPatientlink;

    @FindBy(xpath = "//*[contains(text(),'Patients')]")
    public WebElement PatientsText;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//*[contains(text(),'Show Appointments')]")
    public WebElement ShowAppointmentsButton;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr/td[13]/div/a[1]")
    public WebElement EditButton;

    @FindBy(xpath = "//*[contains(text(),'Create or Edit an Appointment')]")
    public WebElement CreateOrEditAnAppointmentText;

    @FindBy(xpath = "//*[contains(text(),'UNAPPROVED')]")
    public WebElement SelectUNAPPROVED;

    @FindBy(xpath = "//*[contains(text(),'PENDING')]")
    public WebElement SelectPENDING;

    @FindBy(xpath = "//*[contains(text(),'CANCELLED')]")
    public WebElement SelectCANCELLED;

    @FindBy(xpath = "//*[contains(text(),'COMPLETED')]")
    public WebElement SelectCOMPLETED;

    @FindBy(id = "appointment-anamnesis")
    public WebElement AnamnesisTextArea;

    @FindBy(id = "appointment-treatment")
    public WebElement TreatmentTextArea;

    @FindBy(id = "appointment-diagnosis")
    public WebElement DiagnosisTextArea;

    @FindBy(id = "appointment-physician")
    public WebElement PhysicianList;

    @FindBy(xpath = "//*[contains(text(),'277692:BURHAN5 BURHAN5:PEDIATRICS')]")
    public WebElement CurrentDoctor;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr/td[13]/div/a[2]")
    public WebElement ShowTestsButton;

    @FindBy(xpath = "//*[contains(text(),'Tests')]")
    public WebElement TestsText;

    @FindBy(xpath = "//*[contains(text(),'View Results')]")
    public WebElement ViewResults;

    @FindBy(xpath = "//*[contains(text(),'Test Results')]")
    public WebElement TestResultsText;

    @FindBy(xpath = "//*[contains(text(),'cholestrol')]")
    public WebElement cholestrolText;


    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[3]")
    public WebElement SignOutButton;

    @FindBy(xpath = "//*[contains(text(),'SIGN IN AGAIN')]")
    public WebElement signInAgain;


}

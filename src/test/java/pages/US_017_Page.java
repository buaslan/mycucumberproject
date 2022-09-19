package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_017_Page {

    public US_017_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public static WebElement usernameText;

    @FindBy(id = "password")
    public static WebElement passwordText;

    @FindBy(xpath = "//button[@type = 'submit']")
    public static WebElement submitButton;

    @FindBy(xpath = "//*[@id='account-menu']/a")
    public static WebElement linkOnHomePage;

    @FindBy(xpath = "//*[text()='Sign in']")
    public static WebElement SignInButton;

    @FindBy(xpath = "//*[contains(text(),'Items&Titles')]")
    public static WebElement ItemsAndTitles;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[8]/div/a[1]")
    public static WebElement ViewButton;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[8]/div/a[3]")
    public static WebElement DeleteButton;

    @FindBy(id = "jhi-confirm-delete-cTestItem")
    public static WebElement DeleteButtonNewWindows;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div")
    public static WebElement TestItems;

    @FindBy(xpath = "//*[contains(text(),'Test Item')]")
    public static WebElement TestItem;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public static WebElement CreateNewTestItem;

    //*[@id="jh-create-entity"]


    @FindBy(xpath = "//*[contains(text(),'Create or edit a Test Item')]")
    public static WebElement CreateNewTestItemText;

    @FindBy(xpath = "//*[@id='c-test-item-name']")
    public static WebElement NameBox;

    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public static WebElement description;

    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public static WebElement price;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']")
    public static WebElement defaultValMin;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public static WebElement defaultValMax;

    @FindBy(id = "c-test-item-createdDate")
    public static WebElement Date;

    @FindBy(xpath = "//*[contains(text(),'Save')]")
    public static WebElement SaveButton;

    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div/div[1]")
    public static WebElement alertInfo;

    @FindBy (linkText = "Sign out")
    public static WebElement signOutt;
    @FindBy(id = "account-menu")
    public static WebElement accountMenu;

    @FindBy(xpath = "//*[contains(text(),'SIGN IN AGAIN')]")
    public static WebElement signInAgain;
}

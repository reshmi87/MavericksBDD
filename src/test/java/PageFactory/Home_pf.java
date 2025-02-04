package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Commons.BrowserFactory;

public class Home_pf {

	String pagetitle;
    String url = "https://dsportalapp.herokuapp.com/home";
    String uname = "milestonemavericks";
    String pwd = "Welcome@123";
    WebDriver driver = BrowserFactory.getdriverinstance();

    // Elements
    @FindBy(linkText = "Get Started") WebElement getStartedButton;
    @FindBy(linkText = "Sign in") WebElement signInButton;
    @FindBy(linkText = "Register") WebElement registerButton;
    @FindBy(css = "selector-for-data-structures-dropdown") WebElement dataStructuresDropdown;
    @FindBy(css = "selector-for-not-logged-in-popup") WebElement notLoggedInPopup;

    // Methods
    public void clickGetStarted() {
        getStartedButton.click();
    }

    public void signIn() {
        signInButton.click();
    }

    public void register() {
        registerButton.click();
    }

    public void openDataStructuresDropdown() {
        dataStructuresDropdown.click();
    }

    public boolean isNotLoggedInPopupVisible() {
        return notLoggedInPopup.isDisplayed();
    }
}
package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.BrowserFactory;

public class Home_pf {

	String pagetitle;
    WebDriver driver = BrowserFactory.getdriverinstance();
 
    @FindBy(linkText = "Get Started") WebElement getStarted;
    @FindBy(linkText = "NumpyNinja") WebElement Home;
    @FindBy(linkText = "Get Started") WebElement Homepage;
    @FindBy(linkText = "Sign in") WebElement signInButton;
    @FindBy(linkText = "Register") WebElement registerButton;
    @FindBy(linkText = "data-toggle") WebElement dataStructuresDropdown;
    @FindBy(linkText = "You are not logged in") WebElement notLoggedInPopup;

    public String checkpageTitle() {
    	PageFactory.initElements(driver,this);
		String pagetitle = driver.getTitle();
		return pagetitle;
	}
   
    // Methods
    public void clickGetStarted() {
        getStarted.click();
    }

    public void Numpyninja() {
        Home.click();
    }
    
    public void homeGetStarted() {
        Homepage.click();
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
	
	public void setUsername(String username) {
		
	}
}
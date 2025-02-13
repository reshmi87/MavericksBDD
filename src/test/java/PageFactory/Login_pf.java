package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.BrowserFactory;

public class Login_pf {

	String pagetitle;
    WebDriver driver = BrowserFactory.getdriverinstance();

    // Web elements
    
    @FindBy(linkText = "Sign in") WebElement Login;
	@FindBy (name="username") WebElement usernameField;
	@FindBy (name="password") WebElement passwordField;
    @FindBy(xpath = "//input[@type='submit']") WebElement loginButton;
    @FindBy(linkText = "Sign out") WebElement logoutButton;
    @FindBy(xpath = "//div[contains(text(), 'You are logged in')]") WebElement loginMessage;
    @FindBy(xpath = "//div[contains(text(), 'Logged out successfully')]") WebElement logoutMessage;
    @FindBy(xpath = "//div[contains(text(),'Invalid')]") WebElement invalidmessage;

    public String checkpageTitle() {
		PageFactory.initElements(driver,this);
		String pagetitle = driver.getTitle();
		return pagetitle;
    }
    
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
    	PageFactory.initElements(driver,this);
    	Login.click();
    }
    public void clickLoginbutton() {
    	loginButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public String getLoginMessage() {
    	String loginmsg = loginMessage.getText();
        return loginmsg;
    }

    public String getLogoutMessage() {
    	String logoutmsg = logoutMessage.getText();
        return logoutmsg;
    }
    
    public String geterrormessage() {
    	String errormessage = invalidmessage.getText();
    	return errormessage;
    }

    /*public boolean isLoginButton() {
        return loginButton.isDisplayed();
    }

    public boolean isLogoutButton() {
        return logoutButton.isDisplayed();
    } */
}


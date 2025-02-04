package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Commons.BrowserFactory;

public class Login_pf {

	String pagetitle;
    String url = "https://dsportalapp.herokuapp.com/home";
    String uname = "milestonemavericks";
    String pwd = "Welcome@123";
    WebDriver driver = BrowserFactory.getdriverinstance();

    // Web elements
    @FindBy(id = "username") WebElement usernameField;
    @FindBy(id = "password") WebElement passwordField;
    @FindBy(id = "loginButton") WebElement loginButton;
    @FindBy(id = "logoutButton") WebElement logoutButton;
    @FindBy(id = "loginErrorMessage") WebElement loginErrorMessage;
    @FindBy(id = "logoutMessage") WebElement logoutMessage;

    // Page methods
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public String getLoginErrorMessage() {
        return loginErrorMessage.getText();
    }

    public String getLogoutMessage() {
        return logoutMessage.getText();
    }

    public boolean isLoginButtonVisible() {
        return loginButton.isDisplayed();
    }

    public boolean isLogoutButtonVisible() {
        return logoutButton.isDisplayed();
    }
}


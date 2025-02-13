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
    @FindBy(xpath = "//div[contains(text(),'You are not logged in')]") WebElement notLoggedInPopup;
	@FindBy (linkText="Sign in") WebElement signin;
	@FindBy (name="username") WebElement username;
	@FindBy (name="password") WebElement password;
	@FindBy (xpath="//input[@type='submit']") WebElement login;
	@FindBy (xpath="//a[contains(text(),'Data Structures')]") WebElement Datastructuredd;
	@FindBy (xpath="//a[text()='Arrays']") WebElement Arraydd;
	@FindBy (xpath="//a[text()='Linked List']") WebElement LinkedListdd;
	@FindBy (xpath="//a[text()='Stack']") WebElement Stackdd;
	@FindBy (xpath="//a[text()='Queue']") WebElement Queuedd;
	@FindBy (xpath="//a[text()='Tree']") WebElement Treedd;
	@FindBy (xpath="//a[text()='Graph']") WebElement Graphdd;
	

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
    	Datastructuredd.click();
    }

    public boolean isNotLoggedInPopupVisible() {
        return notLoggedInPopup.isDisplayed();
    }
	
	public void login(String uname, String pwd) {
		signin.click();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
	
	public String getmessage() {
		String message = notLoggedInPopup.getText();
		return message;	
	}
	
	public boolean checkArray() {
		boolean isvaluepresent = Arraydd.isDisplayed();
		return isvaluepresent;
	}
	public boolean checkLinkedlist() {
		boolean isvaluepresent = LinkedListdd.isDisplayed();
		return isvaluepresent;
	}
	public boolean checkqueue() {
		boolean isvaluepresent = Queuedd.isDisplayed();
		return isvaluepresent;
	}
	public boolean checkstack() {
		boolean isvaluepresent = Stackdd.isDisplayed();
		return isvaluepresent;
	}
	public boolean checktree() {
		boolean isvaluepresent = Treedd.isDisplayed();
		return isvaluepresent;
	}
	public boolean checkgraph() {
		boolean isvaluepresent = Graphdd.isDisplayed();
		return isvaluepresent;
	}
}
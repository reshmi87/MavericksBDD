package PageFactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Commons.BrowserFactory;

public class Graph_pf {

	WebDriver driver = BrowserFactory.getdriverinstance();
	String pagetitle;

    @FindBy(linkText = "Sign in") WebElement signin;
    @FindBy(name = "username") WebElement username;
    @FindBy(name = "password") WebElement password;
    @FindBy(xpath = "//input[@type='submit']") WebElement login;
    
    @FindBy(xpath = "//h5[text()='Graph']/../a") WebElement getstarted;
    @FindBy(linkText = "Graph") WebElement graph;
    @FindBy(linkText = "Try here>>>") WebElement tryEditor;
    @FindBy(xpath = "//button[@type='button']") WebElement run;
    @FindBy(linkText = "Graph Representations") WebElement graphRepresentationLink;
    @FindBy(linkText = "Try here>>>") WebElement tryHereButton;    
    @FindBy(xpath = "//button[@type='button']") WebElement runbutton;
    @FindBy(xpath = "//pre[@id='output']") WebElement output;
    @FindBy(linkText = "Practice Questions") WebElement practiceQuestions;
	@FindBy (linkText="Search the Graph") WebElement practicequescontent;
	@FindBy (xpath="//pre[@id='output']") WebElement consoleoutput;
	@FindBy (xpath="//a[contains(text(),'Data Structures')]") WebElement Datastructuredd;
	@FindBy (xpath="//a[text()='Graph']") WebElement Graphdd;
	
	
    public void homepage(String uname, String pwd) {

		PageFactory.initElements(driver,this);
		signin.click();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
		
		
	}

    // Method to navigate to Graph page
    public String Getstarted() {
        getstarted.click();
        pagetitle = driver.getTitle();
        return pagetitle;
    }
    
    public String checkpageTitle() {
		String currentpagetitle = driver.getTitle();
			return currentpagetitle;
	}
    
    public String Graph() {
		graph.click();
        pagetitle = driver.getTitle();
        return pagetitle;
	}
    
    public void Tryhere() {
		tryEditor.click();

	}
    
    public String GraphRepresentationsPage() {
    	graphRepresentationLink.click();
        pagetitle = driver.getTitle();
        return pagetitle;
    }
    
    public void clickrun() {
    	runbutton.click();
    }

	public void PracticeQuestions() {
		practiceQuestions.click();
        
	}
	
    public boolean PracticeQuestioncontentcheck() {
    	boolean iscontentpresent = practicequescontent.isDisplayed();
    	return iscontentpresent;
    }
    
    public void entercode(String code) {    	
    	Actions actions = new Actions(driver);
		actions.sendKeys(code).perform();
    }
    public String handlealert() {
    	Alert alert = driver.switchTo().alert();
    	String alertmessage = alert.getText();
    	alert.accept();
    	return alertmessage;
    }
    public String getoutput() {
    	String output = consoleoutput.getText();
    	return output;
    }
	public String GraphpagefromDD() {
		Datastructuredd.click();
		Graphdd.click();
	    pagetitle = driver.getTitle();
		return pagetitle;
		}
}

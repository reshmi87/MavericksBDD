package PageFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    
    public String Tryhere() {
		tryEditor.click();
        pagetitle = driver.getTitle();
        return pagetitle;
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
}

package PageFactory;


import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.BrowserFactory;

public class ds_pf {
	

	
	String LoginURL ="https://dsportalapp.herokuapp.com/login";
	String Uname="milestonemavericks";
	String Pwd="Welcome@123";
	WebDriver driver = BrowserFactory.getdriverinstance();
	String pagetitle;
	protected boolean practicequestioncontent;
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement Login;
	@FindBy(xpath="//a[text()='Get Started']") WebElement dsGetstarted;
	
	@FindBy(xpath = "//h4[text()='Data Structures-Introduction']")WebElement pageTitle;
	@FindBy(xpath = "//a[@href='time-complexity' and text()='Time Complexity']")
	WebElement TimeComplexity;
    @FindBy (linkText="Practice Questions") WebElement PracticeQuestion;
    @FindBy (linkText="Search the Data Structures-Introduction") WebElement practicequescontent;
    @FindBy (linkText="Try here>>>") WebElement Tryhere;
    @FindBy (xpath="//div[@class='input']//textarea") WebElement codetextarea;
	@FindBy (xpath="//button[@type='button']") WebElement runbutton;
	@FindBy (xpath="//pre[@id='output']") WebElement consoleoutput;
   

	
	
	
public String homepage() {
		
		driver = new ChromeDriver();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.manage().window().maximize();
	 	driver.get(LoginURL);
	 	PageFactory.initElements(driver, this);
	 	
	 	username.sendKeys(Uname);
	 	password.sendKeys(Pwd);
	 	Login.click();
	 	pagetitle=driver.getTitle();
	 	return pagetitle;
	}
	
	
	
	
	public void closebrowser() {
		
		 driver.quit();
	}
	
public String dspage() {
		
		dsGetstarted.click();
		pagetitle=driver.getTitle();
		return pagetitle;
		
	}
	
	
	public String checkpageTitle() {
		
		String currentpagetitle = driver.getTitle();
	    return currentpagetitle;
	}
	
	public String clickTimeComplexityLink() {

		TimeComplexity.click();
		pagetitle=driver.getTitle();
		return pagetitle;
	}
	
	
	
	 public void PracticeQuestionClick() {
		 PracticeQuestion.click();
		 
	    }
	    
	  public boolean PracticeQuestioncontentcheck() {
	    	boolean iscontentpresent = practicequescontent.isDisplayed();
	    	return iscontentpresent;
	    }
	
	  
	  public String tryhere() {
	    	Tryhere.click();
	    	pagetitle = driver.getTitle();
	    	return pagetitle;
	    }
	  
	  public void clickrun() {
	    	runbutton.click();
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

}	



package PageFactory;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.BrowserFactory;

public class Array_pf {
	
	String pagetitle;
	protected boolean practicequestioncontent;
	WebDriver driver = BrowserFactory.getdriverinstance();
	
	@FindBy (linkText="Sign in") WebElement signin;
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement Login;
	@FindBy (xpath = "//a[@href='array']") WebElement Getstarted;
	@FindBy (xpath = "//*[text()='Data Structures']") WebElement Dropdown;
	@FindBy (linkText = "Arrays in Python") WebElement Arraysinpython;
	@FindBy (linkText="Try here>>>") WebElement Tryhere;
    @FindBy (xpath="//div[@class='input']//textarea") WebElement codetextarea;
	@FindBy (xpath="//button[@type='button']") WebElement runbutton;
	@FindBy (xpath="//pre[@id='output']") WebElement consoleoutput;
    @FindBy (linkText="Practice Questions") WebElement PracticeQuestion;
    @FindBy (linkText="Search the array") WebElement practicequescontent;
    @FindBy(xpath = "//a[@href='/question/1']")WebElement searchthearraylink;
    @FindBy (linkText = "Arrays Using List") WebElement ArraysUsingList;
    @FindBy (linkText = "Basic Operations in Lists") WebElement BasicOperations;

   
	
//public String homepage() {
//		PageFactory.initElements(driver, this);
//	 	driver.get(LoginURL);
//	 	username.sendKeys(Uname);
//	 	password.sendKeys(Pwd);
//	 	Login.click();
//	 	pagetitle=driver.getTitle();
//	 	return pagetitle;
//	}
public String homepage(String uname, String Password) {
	PageFactory.initElements(driver, this);
	signin.click();
 	username.sendKeys(uname);
 	password.sendKeys(Password);
 	Login.click();
 	pagetitle=driver.getTitle();
 	return pagetitle;
}
	
	
	
//	public void closebrowser() {
//		
//		 driver.quit();
//	}
	
public String Arraypage() {
		
		Getstarted.click();
		pagetitle=driver.getTitle();
		return pagetitle;
		
	}

public String checkpageTitle() {
	
	String currentpagetitle = driver.getTitle();
    return currentpagetitle;
}

public void dropdownselect() {
	
	Dropdown.click();
}



public String Arraysinpython() {
	
	Arraysinpython.click();
	pagetitle=driver.getTitle();
	return pagetitle;
	
}

public String ArraysUsingList() {
	ArraysUsingList.click();
	pagetitle=driver.getTitle();
	return pagetitle;
}

public String BasicOperations() {
	BasicOperations.click();
	pagetitle=driver.getTitle();
	return pagetitle;
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

public String PracticeQuestionClick() {
	 PracticeQuestion.click();
	 pagetitle = driver.getTitle();
		return pagetitle;
	 
   }

public boolean PracticeQuestioncontentcheck() {
	boolean iscontentpresent = practicequescontent.isDisplayed();
	return iscontentpresent;
}

public String SearchTheArray() {
	searchthearraylink.click();
	 pagetitle = driver.getTitle();
		return pagetitle;
			
}











	

}

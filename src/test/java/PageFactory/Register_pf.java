package PageFactory;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Commons.BrowserFactory;
import java.util.Random;


public class Register_pf {
	WebDriver driver = BrowserFactory.getdriverinstance();
	String pagetitle;
	
	@FindBy (linkText="Register") WebElement register;
	@FindBy (id="id_username") WebElement username;
	@FindBy (id="id_password1") WebElement password;
	@FindBy (id="id_password2") WebElement confirmpassword;
	@FindBy (xpath="//input[@type='submit']") WebElement registerbutton;
	@FindBy (xpath="//div[contains(text(),'New Account Created')]") WebElement successmessage;
	@FindBy (xpath="//div[@class='alert alert-primary']") WebElement errormessage;
	
	public String checkpageTitle() {
		PageFactory.initElements(driver,this);
		String pagetitle = driver.getTitle();
		return pagetitle;
	}
	public void registerpage() {
		register.click();
	}
	
	public void username(String uname) {
		username.sendKeys(uname);
	}
	
	public void password1(String pwd1) {
		password.sendKeys(pwd1);
		}
	
	public void password2(String pwd2) {
		confirmpassword.sendKeys(pwd2);
	}
	
	public void registerbutton() {
		registerbutton.click();
	}
	
	public String getsuccessmessage() {
		String successmsg = successmessage.getText();
		return successmsg;
	}
	
	public String generateuser(String uname) {
		Random rand = new Random();
		int randnum = rand.nextInt(1000);
		String newuname=uname+randnum;
		return newuname;
	}
	
	public String geterrormessage() {
		String errormsg = errormessage.getText();
		return errormsg;
	}
	
}

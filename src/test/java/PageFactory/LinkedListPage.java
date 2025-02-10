package PageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListPage {
	Logger log = LogManager.getLogger(LinkedListPage.class);

	public LinkedListPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//input[@id='id_username']")
	@CacheLookup
	WebElement inputUsername;

	@FindBy(xpath = "//input[@id='id_password']")
	@CacheLookup
	WebElement inputPassword;

	@FindBy(xpath = "//input[@value='Login']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//h5[text()='Linked List']/../a[text()='Get Started']")
	@CacheLookup
	WebElement hrefGetStarted;

	@FindBy(xpath = "//h4[text()='Linked List']")
	@CacheLookup
	WebElement linkedListPage;

	@FindBy(xpath = "//a[text()='Introduction']")
	@CacheLookup
	WebElement hrefIntroduction;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	@CacheLookup
	WebElement btnTryhere;

	@FindBy(xpath = "//button[text()='Run']")
	@CacheLookup
	WebElement btnRun;

	@FindBy(xpath = "//p[text()='Introduction']")
	@CacheLookup
	WebElement introductionPage;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement inputEditor;

	@FindBy(xpath = "//pre[@id='output']")
	@CacheLookup
	WebElement ouputEditor;

	@FindBy(xpath = "//a[text() = 'Creating Linked LIst']")
	WebElement createLinkedListLink;

	@FindBy(xpath = "//p[text()='Creating Linked LIst']")
	WebElement createLinkedListPage;

	@FindBy(xpath = "//a[text() = 'Types of Linked List']")
	WebElement typesLinkedListLink;

	@FindBy(xpath = "//p[text()='Types of Linked List']")
	WebElement typesLinkedListPage;

	@FindBy(xpath = "//a[text() = 'Implement Linked List in Python']")
	WebElement implementLinkedListLink;
	@FindBy(xpath = "//p[text()='Implement Linked List in Python']")
	WebElement implementLinkedListPage;

	@FindBy(xpath = "//a[text() = 'Traversal']")
	WebElement traversalLink;
	@FindBy(xpath = "//p[text()='Traversal']")
	WebElement traversalPage;

	@FindBy(xpath = "//a[text() = 'Insertion']")
	WebElement insertionLink;
	@FindBy(xpath = "//p[text()='Insertion']")
	WebElement insertionPage;

	@FindBy(xpath = "//a[text() = 'Deletion']")
	WebElement deletionLink;
	@FindBy(xpath = "//p[text()='Deletion']")
	WebElement deletionPage;

	@FindBy(xpath = "//a[text() = 'Practice Questions']")
	WebElement practiceQuestionsLink;

	@FindBy(xpath = "//p[text() = ' Practice Questions']")
	WebElement practiceQuestionsPage;
	
	@FindBy (linkText="Sign in") WebElement signIn;
	
	@FindBy (xpath="//a[contains(text(),'Data Structures')]") WebElement dsDropDown;
	
	@FindBy (xpath="//a[text()='Linked List']") WebElement linkedListDropDownValue;
	
	public void loginHome(String uName, String pwd) {
		signIn.click();
		setUserName(uName);
		setPassword(pwd);
		clickBtnLogin();
		
	}

	public void setUserName(String uName) {
		inputUsername.clear();
		inputUsername.sendKeys(uName);
	}

	public void setPassword(String pwd) {
		inputPassword.clear();
		inputPassword.sendKeys(pwd);
	}

	public void clickBtnLogin() {
		btnLogin.click();
	}

	public void clickGetStarted() {
		hrefGetStarted.click();
	}

	public boolean isOnLinkedListPage() {
		return linkedListPage.isDisplayed();
	}

	public void clickIntroduction() {
		hrefIntroduction.click();
	}

	public boolean isOnIntroductionPage() {
		return introductionPage.isDisplayed();
	}

	public void clickTryHere() {
		btnTryhere.click();
	}

	public boolean isOnTryEditorPage() {
		return btnRun.isDisplayed();
	}

	public void clickRun() {
		btnRun.click();
	}

	public void clickCreateLinkedList() {
		createLinkedListLink.click();
	}

	public boolean isOnCreateLinkedListPage() {
		return createLinkedListPage.isDisplayed();
	}

	public void clickTypesLinkedList() {
		typesLinkedListLink.click();
	}

	public boolean isOnTypesLinkedListPage() {
		return typesLinkedListPage.isDisplayed();
	}

	public void clickImplementLinkedList() {
		implementLinkedListLink.click();
	}

	public boolean isOnImplmentLinkedListPage() {
		return implementLinkedListPage.isDisplayed();
	}

	public void clickTraversal() {
		traversalLink.click();
	}

	public boolean isOnTraversalPage() {
		return traversalPage.isDisplayed();
	}

	public void clickInsertion() {
		insertionLink.click();
	}

	public boolean isOnInsertionPage() {
		return insertionPage.isDisplayed();
	}

	public void clickDeletion() {
		deletionLink.click();
	}

	public boolean isOnDeletionPage() {
		return deletionPage.isDisplayed();
	}

	public void clickPracticeQuestions() {
		practiceQuestionsLink.click();
	}

	public boolean isOnPracticeQuestionsPage() {

		return practiceQuestionsPage.isDisplayed();
	}

	public void sendCode(String pythonCode, WebDriver driver) {

		Actions actions = new Actions(driver);
		actions.sendKeys(inputEditor, pythonCode).perform();

	}

	public boolean isRunSuccess() {
		return ouputEditor.isDisplayed();
	}

	public String getAlertText(WebDriver webDriver) {
		Alert alert = webDriver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}
	
	public void selectLinkedListFromDsDropDown() {
		dsDropDown.click();
		linkedListDropDownValue.click();
	}

}

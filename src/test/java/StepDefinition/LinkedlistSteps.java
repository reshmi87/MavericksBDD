package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import Commons.BrowserFactory;
import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.LinkedListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedlistSteps {
	private LinkedListPage linkedListPage = null;

	@Given("User is in Home screen after logging in for LinkedList {int}")
	public void User_is_in_Home_screen_after_logging_in(int rowNum) throws Exception {
		initializeHomeScreen(rowNum);
	}

	@When("User clicks on Get Started button in Linked List panel")
	public void User_clicks_on_Get_Started_button_in_Linked_List_panel() {
		this.linkedListPage.clickGetStarted();
	}
	
	@When("User clicks on LinkedList from the DS drop down")
	public void user_clicks_on_LinkedList_from_the_ds_drop_down() {
		linkedListPage.selectLinkedListFromDsDropDown();
	}

	@Then("User should be redirected to the LinkedList page")
	public void User_should_be_redirected_to_the_LinkedList_page() {
		this.linkedListPage.isOnLinkedListPage();
	}
	
	@Given("User is in LinkedList Page {int}")
	public void User_is_in_Linked_List_panel(int rowNum) throws Exception {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
	}

	@When("User clicks on Introduction link for LinkedList")
	public void User_clicks_on_Introduction_link() {
		linkedListPage.clickIntroduction();

	}

	@Then("User should be redirected to the Introduction page for LinkedList")
	public void User_should_be_redirected_to_the_Introduction_page() {
		this.linkedListPage.isOnIntroductionPage();
	}
	
	@Given("User is in Introduction Page of LinkedList {int}")
	public void User_is_in_Introduction_Linked_List_panel(int rowNum) throws Exception {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickIntroduction();
	}


	@When("User clicks on Try here>>> button for LinkedList")
	public void User_clicks_on_Try_here_button() {
		linkedListPage.clickTryHere();
	}

	@Then("User should be redirected to TryEditor page for LinkedList")
	public void User_should_be_redirected_to_TryEditor_page() {
		linkedListPage.isOnTryEditorPage();
	}

	@Given("User is in TryEditor page and provided invalid data for LinkedList")
	public void User_is_in_TryEditor_page_and_provided_invalid_data() {
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}
	
	@Given("User is in TryEditor page of Introduction and provided invalid data for LinkedList {int}")
	public void User_is_in_TryEditor_page_of_Introduction_and_provided_invalid_data(int rowNum) throws IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickIntroduction();
		linkedListPage.clickTryHere();
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}

	@When("User clicks on Run button for LinkedList")
	public void User_clicks_on_Run_button() {
		linkedListPage.clickRun();
	}

	@Then("Alert message should be popped up for LinkedList")
	public void Alert_message_should_be_popped_up() {
		Assert.assertNotNull(linkedListPage.getAlertText(BrowserFactory.getdriverinstance()));
	}

	@Given("User is in TryEditor page and provided valid python code for LinkedList")
	public void User_is_in_TryEditor_page_and_provided_valid_python_code() throws InterruptedException {
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());

	}
	
	@Given("User is in TryEditor page of Introduction and provided valid python code for LinkedList {int}")
	public void User_is_in_TryEditor_page_of_Introduction_and_provided_valid_python_code_for_LinkedList(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickIntroduction();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());

	}
	
	@Given("User is in TryEditor page of Introduction and provided invalid python code for LinkedList {int}")
	public void User_is_in_TryEditor_page_of_Introduction_and_provided_invalid_python_code_for_LinkedList(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickIntroduction();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());

	}

	@Then("Python code should be successfully executed without any error for LinkedList")
	public void Python_code_should_be_successfully_executed_without_any_error() {
		linkedListPage.isRunSuccess();
	}

	@When("User clicks on Creating LinkedList link")
	public void User_clicks_on_Creating_LinkedList_link() {
		linkedListPage.clickCreateLinkedList();

	}

	@Then("User should be redirected to Creating LinkedList page")
	public void User_should_be_redirected_to_Creating_LinkedList_page() {
		linkedListPage.isOnCreateLinkedListPage();
	}
	
	@Given("User is in Creating LinkedList Page {int}")
	public void User_is_in_Creating_LinkedList_Page(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickCreateLinkedList();
	}
	
	@Given("User is in TryEditor page of Creating LinkedList Page and provided valid python code {int}")
	public void User_is_in_TryEditor_Creating_LinkedList_Page_provided_valid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickCreateLinkedList();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());

	}
	
	@Given("User is in TryEditor page of Creating LinkedList Page and provided invalid python code {int}")
	public void User_is_in_TryEditor_Creating_LinkedList_Page_provided_invalid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickCreateLinkedList();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());

	}

	@When("User clicks on Types of LinkedList link")
	public void User_clicks_on_Types_of_LinkedList_link() {
		//linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickTypesLinkedList();

	}
	
	@Then("User should be redirected to Types of LinkedList page")
	public void User_should_be_redirected_to_Types_of_LinkedList_page() {
		linkedListPage.isOnTypesLinkedListPage();
	}
	
	@Given("User is in Types of LinkedList Page {int}")
	public void User_is_in_Types_of_LinkedList_Page(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickTypesLinkedList();
	}
	
	@Given("User is in TryEditor page of Types of LinkedList Page and provided valid python code {int}")
	public void User_is_in_TryEditor_Types_LinkedList_Page_provided_valid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickTypesLinkedList();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());
	}
	
	@Given("User is in TryEditor page of Types of LinkedList Page and provided invalid python code {int}")
	public void User_is_in_TryEditor_Types_LinkedList_Page_provided_invalid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickTypesLinkedList();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}

	@When("User clicks on Implement LinkedList in Python link")
	public void User_clicks_on_Implement_LinkedList_in_Python_link() {
		linkedListPage.clickImplementLinkedList();
	}

	@Then("User should be redirected to Implement LinkedList in Python page")
	public void User_should_be_redirected_to_Implement_LinkedList_in_Python_page() {
		linkedListPage.isOnImplmentLinkedListPage();
	}
	
	@Given("User is in Implement LinkedList Page {int}")
	public void User_is_in_Implement_LinkedList_Page(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickImplementLinkedList();
	}
	
	@Given("User is in TryEditor page of Implement LinkedList Page and provided valid python code {int}")
	public void User_is_in_TryEditor_Implement_LinkedList_Page_provided_valid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickImplementLinkedList();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());
	}
	
	@Given("User is in TryEditor page of Implement LinkedList Page and provided invalid python code {int}")
	public void User_is_in_TryEditor_Implement_LinkedList_Page_provided_invalid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickImplementLinkedList();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}
	

	@When("User clicks on Traversal link for LinkedList")
	public void User_clicks_on_Traversal_link() {
		linkedListPage.clickTraversal();
	}

	@Then("User should be redirected to Traversal page for LinkedList")
	public void User_should_be_redirected_to_Traversal_page() {
		linkedListPage.isOnTraversalPage();
	}
	
	@Given("User is in Traversal LinkedList Page {int}")
	public void User_is_in_Traversal_LinkedList_Page(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickTraversal();

	}
	
	@Given("User is in TryEditor page of Traversal LinkedList Page and provided valid python code {int}")
	public void User_is_in_TryEditor_Traversal_LinkedList_Page_provided_valid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickTraversal();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());
	}
	
	@Given("User is in TryEditor page of Traversal LinkedList Page and provided invalid python code {int}")
	public void User_is_in_TryEditor_Traversal_LinkedList_Page_provided_invalid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickTraversal();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}

	@When("User clicks on Insertion link for LinkedList")
	public void User_clicks_on_Insertion_link() {
		linkedListPage.clickInsertion();
	}

	@Then("User should be redirected to Insertion page for LinkedList")
	public void User_should_be_redirected_to_Insertion_page() {
		linkedListPage.isOnInsertionPage();
	}
	
	@Given("User is in Insertion LinkedList Page {int}")
	public void User_is_in_Insertion_LinkedList_Page(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickInsertion();
	}
	
	@Given("User is in TryEditor page of Insertion LinkedList Page and provided valid python code {int}")
	public void User_is_in_TryEditor_Insertion_LinkedList_Page_provided_valid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickInsertion();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());
	}
	
	@Given("User is in TryEditor page of Insertion LinkedList Page and provided invalid python code {int}")
	public void User_is_in_TryEditor_Insertion_LinkedList_Page_provided_invalid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickInsertion();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}

	@When("User clicks on Deletion link for LinkedList")
	public void User_clicks_on_Deletion_link() {
		linkedListPage.clickDeletion();
	}

	@Then("User should be redirected to Deletion page for LinkedList")
	public void User_should_be_redirected_to_Deletion_page() {
		linkedListPage.isOnDeletionPage();
	}
	
	@Given("User is in Deletion LinkedList Page {int}")
	public void User_is_in_Deletion_LinkedList_Page(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickDeletion();
	}
	
	@Given("User is in TryEditor page of Deletion LinkedList Page and provided valid python code {int}")
	public void User_is_in_TryEditor_Deletion_LinkedList_Page_provided_valid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickDeletion();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("print'hello'", BrowserFactory.getdriverinstance());
	}
	
	@Given("User is in TryEditor page of Deletion LinkedList Page and provided invalid python code {int}")
	public void User_is_in_TryEditor_Deletion_LinkedList_Page_provided_invalid_python_code(int rowNum) throws InterruptedException, IOException {
		initializeHomeScreen(rowNum);
		this.linkedListPage.clickGetStarted();
		linkedListPage.clickDeletion();
		linkedListPage.clickTryHere(); 
		linkedListPage.sendCode("hello", BrowserFactory.getdriverinstance());
	}

	@When("User clicks Practice Questions link for LinkedList")
	public void User_clicks_Practice_Questions_link() {
		linkedListPage.clickPracticeQuestions();

	}

	@Then("User should be able to navigate to Practice Questions page and page content should be displayed for LinkedList")
	public void User_should_be_able_to_navigate_to_Practice_Questions_page_and_page_content_should_be_displayed() {
		boolean isOnPracticeQuestions = linkedListPage.isOnPracticeQuestionsPage();
		Assert.assertTrue(isOnPracticeQuestions);
	}
	
	private void initializeHomeScreen(int rowNum) throws IOException {
		LoggerLoad.info("Initializing Home Screen for LinkedList Module");
		linkedListPage = new LinkedListPage(BrowserFactory.getdriverinstance());
		ExcelReader read = new ExcelReader();
		linkedListPage.loginHome(read.getusername(rowNum), read.getpassword(rowNum));
	}
}

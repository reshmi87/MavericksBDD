package StepDefinition;

import org.junit.Assert;

import Commons.LinkedListHelper;
import PageFactory.LinkedListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.LinkedListPage;
//import utilities.LinkedListHelper;

public class LinkedlistSteps {
	private LinkedListPage linkedListPage = null;

	@Given("User is in Home screen after logging in for LinkedList")
	public void User_is_in_Home_screen_after_logging_in() throws InterruptedException {
		LinkedListHelper.setupDriver();
		LinkedListHelper.openPage("https://dsportalapp.herokuapp.com/login");
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.setUserName("milestonemavericks");
		linkedListPage.setPassword("Welcome@123");
		linkedListPage.clickBtnLogin();
	}

	@Given("User is in Linked List Page")
	public void User_is_in_Linked_List_panel() {
		this.linkedListPage.clickGetStarted();
	}

	@When("User clicks on Get Started button in Linked List panel")
	public void User_clicks_on_Get_Started_button_in_Linked_List_panel() {
		this.linkedListPage.clickGetStarted();
	}

	@Then("User should be redirected to the LinkedList page")
	public void User_should_be_redirected_to_the_LinkedList_page() {
		this.linkedListPage.isOnLinkedListPage();
	}

	@When("User clicks on Introduction link for LinkedList")
	public void User_clicks_on_Introduction_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickIntroduction();

	}

	@Then("User should be redirected to the Introduction page for LinkedList")
	public void User_should_be_redirected_to_the_Introduction_page() {
		this.linkedListPage.isOnIntroductionPage();
	}

	@When("User clicks on Try here>>> button for LinkedList")
	public void User_clicks_on_Try_here_button() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickTryHere();
	}

	@Then("User should be redirected to TryEditor page for LinkedList")
	public void User_should_be_redirected_to_TryEditor_page() {
		linkedListPage.isOnTryEditorPage();
	}

	@Given("User is in TryEditor page and provided invalid data for LinkedList")
	public void User_is_in_TryEditor_page_and_provided_invalid_data() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.sendCode("hello", LinkedListHelper.getDriver());
	}

	@When("User clicks on Run button for LinkedList")
	public void User_clicks_on_Run_button() {
		linkedListPage.clickRun();
	}

	@Then("Alert message should be popped up for LinkedList")
	public void Alert_message_should_be_popped_up() {
		Assert.assertNotNull(linkedListPage.getAlertText(LinkedListHelper.getDriver()));
	}

	@Given("User is in TryEditor page and provided valid python code for LinkedList")
	public void User_is_in_TryEditor_page_and_provided_valid_python_code() throws InterruptedException {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.sendCode("print'hello'", LinkedListHelper.getDriver());

	}

	@Then("Python code should be successfully executed without any error for LinkedList")
	public void Python_code_should_be_successfully_executed_without_any_error() {
		linkedListPage.isRunSuccess();
	}

	@When("User clicks on back button for LinkedList")
	public void User_clicks_on_back_button() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		LinkedListHelper.navigateBack();

	}

	@When("User clicks on Creating LinkedList link")
	public void User_clicks_on_Creating_LinkedList_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickCreateLinkedList();

	}

	@Then("User should be redirected to Creating LinkedList page")
	public void User_should_be_redirected_to_Creating_LinkedList_page() {
		linkedListPage.isOnCreateLinkedListPage();
	}

	@When("User clicks on Types of LinkedList link")
	public void User_clicks_on_Types_of_LinkedList_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickTypesLinkedList();

	}

	@Then("User should be redirected to Types of LinkedList page")
	public void User_should_be_redirected_to_Types_of_LinkedList_page() {
		linkedListPage.isOnTypesLinkedListPage();
	}

	@When("User clicks on Implement LinkedList in Python link")
	public void User_clicks_on_Implement_LinkedList_in_Python_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickImplementLinkedList();

	}

	@Then("User should be redirected to Implement LinkedList in Python page")
	public void User_should_be_redirected_to_Implement_LinkedList_in_Python_page() {
		linkedListPage.isOnImplmentLinkedListPage();

	}

	@When("User clicks on Traversal link for LinkedList")
	public void User_clicks_on_Traversal_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickTraversal();

	}

	@Then("User should be redirected to Traversal page for LinkedList")
	public void User_should_be_redirected_to_Traversal_page() {
		linkedListPage.isOnTraversalPage();

	}

	@When("User clicks on Insertion link for LinkedList")
	public void User_clicks_on_Insertion_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickInsertion();

	}

	@Then("User should be redirected to Insertion page for LinkedList")
	public void User_should_be_redirected_to_Insertion_page() {
		linkedListPage.isOnInsertionPage();
	}

	@When("User clicks on Deletion link for LinkedList")
	public void User_clicks_on_Deletion_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickDeletion();
	}

	@Then("User should be redirected to Deletion page for LinkedList")
	public void User_should_be_redirected_to_Deletion_page() {
		linkedListPage.isOnDeletionPage();
	}

	@When("User clicks Practice Questions link for LinkedList")
	public void User_clicks_Practice_Questions_link() {
		linkedListPage = new LinkedListPage(LinkedListHelper.getDriver());
		linkedListPage.clickPracticeQuestions();

	}

	@Then("User should be able to navigate to Practice Questions page and page content should be displayed for LinkedList")
	public void User_should_be_able_to_navigate_to_Practice_Questions_page_and_page_content_should_be_displayed() {
		boolean isOnPracticeQuestions = linkedListPage.isOnPracticeQuestionsPage();
		LinkedListHelper.closeDriver();
		Assert.assertTrue(isOnPracticeQuestions);
	}
}

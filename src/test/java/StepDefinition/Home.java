package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.Home_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {
	
	private Home_pf hpf;
	String pagetitle;
	String newuname; 
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		hpf = new Home_pf();
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "Ds-algo", "Not on the DS Algo portal");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		hpf.clickGetStarted();
	}

	@Then("The user will be redirected to homepage")
	public void the_user_will_be_redirected_to_homepage() {
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@Given("The user can open ds-algo page")
	public void the_user_can_open_ds_algo_page() {
		hpf = new Home_pf();
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("when user get the ds-algo link")
	public void when_user_get_the_ds_algo_link() {
		hpf.Numpyninja();
	}

	@Then("Then user land on the home page")
	public void then_user_land_on_the_home_page() {
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	}

	@When("user clicks the Data Structures Get Started Button")
	public void user_clicks_the_data_structures_get_started_button() {
		hpf.homeGetStarted();
	}

	@Then("User will see the pop of You are not login")
	public void user_will_see_the_pop_of_you_are_not_login() {
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "Data Structures", "Not on the Data Structures page");
	}

	@When("user clicks the Data Structures drop-down button from Excel {int}")
	public void user_clicks_the_data_structures_drop_down_button_from_excel(Integer Rownum) throws IOException{
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		hpf.setUsername(username);
		hpf.openDataStructuresDropdown();
	}

	@Then("Users will see Arrays, Linked list, Stack, Queue, trees and Graph different module names in drop down")
	public void users_will_see_arrays_linked_list_stack_queue_trees_and_graph_different_module_names_in_drop_down() {
		pagetitle = hpf.checkpageTitle();
	    assertEquals(pagetitle, "Dropdown", "Not on the Dropdwon page");
	}

	@Given("User can open ds-algo home page")
	public void user_can_open_ds_algo_home_page() {
		hpf = new Home_pf();
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("user clicks the Data Structures drop-down module")
	public void user_clicks_the_data_structures_drop_down_module() {
		hpf.Numpyninja();
	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		hpf = new Home_pf();
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
		hpf.signIn();

	}

	@Then("User will be redirected to Sign in page")
	public void user_will_be_redirected_to_sign_in_page() {
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "Signin", "Not on the Signin page");
	}

	@When("The user clicks Register")
	public void the_user_clicks_register() {
		hpf.register();
	}

	@Then("User will be redirected to Register form")
	public void user_will_be_redirected_to_register_form() {
		pagetitle = hpf.checkpageTitle();
		assertEquals(pagetitle, "Register", "Not on the Register page");
	}
}

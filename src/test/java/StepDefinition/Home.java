package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;

import Commons.ConfigReader;
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
		String actualmessage = hpf.getmessage();
		String Expectedmessage = "You are not logged in";
		assertEquals(actualmessage, Expectedmessage, "Incorrect message");
	}
	
	@When("user clicks the Data Structures drop-down button")
	public void user_clicks_the_data_structures_drop_down_button() throws IOException {
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		hpf.login(username, password);
		hpf.openDataStructuresDropdown();
	}

	@Then("Users will see Arrays, Linked list, Stack, Queue, trees and Graph different module names in drop down")
	public void users_will_see_arrays_linked_list_stack_queue_trees_and_graph_different_module_names_in_drop_down() {
		boolean arrays = true, linkedlist= true, stack=true, queue=true, tree=true, graph=true;
		assertEquals(hpf.checkArray(), arrays, "Arrays not present");
		assertEquals(hpf.checkLinkedlist(), linkedlist, "Linked List not present");
		assertEquals(hpf.checkstack(), stack, "Stack not present");
		assertEquals(hpf.checkqueue(), queue, "Queue not present");
		assertEquals(hpf.checktree(), tree, "Tree not present");
		assertEquals(hpf.checkgraph(), graph, "Graph not present");
	}
}

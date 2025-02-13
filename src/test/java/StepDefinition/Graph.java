package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import Commons.ConfigReader;
import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.Graph_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph {
	
	private Graph_pf gpf;
	String pagetitle;
	boolean practicequestion;
	@Given("The user is in the Home page after logged in using Excel {int}")
	public void the_user_is_in_the_home_page_after_logged_in_using_excel(Integer Rownum) throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		gpf=new Graph_pf();
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		String password = read.getpassword(Rownum);	
		gpf.homepage(username, password);
	}

	@When("The user clicks the Getting Started button in Graph Pane or select Graph item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_graph_pane_or_select_graph_item_from_the_drop_down_menu() {
		LoggerLoad.info("Moving to Graph page..");
		pagetitle = gpf.Getstarted();
	}

	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() {
		assertEquals(pagetitle, "Graph", "Not on the Graph page");
		LoggerLoad.info("Current page: "+pagetitle);
	    LoggerLoad.info("Hooks called to close the browser.....");
	}

	@Given("The user is in the Graph page after logged in using Excel {int}")
	public void the_user_is_in_the_graph_page_after_logged_in_using_excel(Integer Rownum) throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		gpf=new Graph_pf();
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		String password = read.getpassword(Rownum);	
		gpf.homepage(username, password);
		LoggerLoad.info("Moving to Graph page..");
	}

	@When("The user clicks Graph button")
	public void the_user_clicks_graph_button() {
		LoggerLoad.info("Moving to Graph page..");
		pagetitle = gpf.Graph();
	}

	@Given("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		gpf=new Graph_pf();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		gpf.homepage(username, password);
		LoggerLoad.info("Moving to Graph page..");
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		pagetitle = gpf.Tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		assertEquals(pagetitle, "tryhere", "Not on the tryherepage");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("The user clicks Graph Representations button")
	public void the_user_clicks_graph_representations_button() {
		pagetitle = gpf.GraphRepresentationsPage();
	}

	@Then("The user should be directed to Graph Representations Page")
	public void the_user_should_be_directed_to_graph_representations_page() {
		assertEquals(pagetitle, "graph ReprentationPage", "Not on the tryherepage");
	    System.out.println("Current page: "+pagetitle);
	}

	@Given("The user is in the Graph Representations page after logged in")
	public void the_user_is_in_the_graph_representations_page_after_logged_in() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		gpf=new Graph_pf();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		gpf.homepage(username, password);
		LoggerLoad.info("Moving to Graph Representation page..");
	}

	@When("The user clicks Practise Question button")
	public void the_user_clicks_practise_question_button() {
		  gpf.PracticeQuestions();
	}

	@Then("The user should be directed to Practise Questions Page")
	public void the_user_should_be_directed_to_practise_questions_page() {
		assertEquals(pagetitle, "Practise Questions", "Not on the Practise Questionpage");
	    System.out.println("Current page: "+pagetitle);
	}
}

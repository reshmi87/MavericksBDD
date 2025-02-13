package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import Commons.ConfigReader;
import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.Graph_pf;
import PageFactory.Tree_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph {
	
	private Graph_pf gpf;
	String pagetitle;
	boolean practicequestioncontent;

@Given("User has signed in dsAlgoPortal")
public void user_has_signed_in_ds_algo_portal() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	gpf=new Graph_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	gpf.homepage(username, password);
}

@Given("Graph - User is in the Home page")
public void graph_user_is_in_the_home_page() {
	LoggerLoad.info("User is in Home page");
}

@When("User clicks on Get Started button under the section Graph")
public void user_clicks_on_get_started_button_under_the_section_graph() {
	LoggerLoad.info("Moving to Graph page..");
	pagetitle = gpf.Getstarted();
}

@Then("User lands on the Graph page")
public void user_lands_on_the_graph_page() {
    assertEquals(pagetitle, "Graph", "Not on the Graph page");
    LoggerLoad.info("Current page: "+pagetitle);
}

@Given("User is in the Graph home page.")
public void user_is_in_the_graph_home_page() {
	pagetitle = gpf.Getstarted();
}

@When("User clicks on the hyperlink Graph")
public void user_clicks_on_the_hyperlink_graph() {
	pagetitle = gpf.Graph();

}

@Then("User lands on the Graph Sub page")
public void user_lands_on_the_graph_sub_page() {
	assertEquals(pagetitle, "Graph", "Not on the Graph page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("User is in the Graph Sub page")
public void user_is_in_the_graph_sub_page() {
	pagetitle = gpf.Getstarted();
	pagetitle = gpf.Graph();
	}

@When("Graph - User clicks on the Practice Questions from the side navigation bar")
public void graph_user_clicks_on_the_practice_questions_from_the_side_navigation_bar() {
    gpf.PracticeQuestions();
}

@Then("Graph - User lands on the Practice Questions page and is able to view the content successfully")
public void graph_user_lands_on_the_practice_questions_page_and_is_able_to_view_the_content_successfully() {
	practicequestioncontent = gpf.PracticeQuestioncontentcheck();
    assertEquals(practicequestioncontent, true);
}

@Given("User is in Try Editor page from Graph Sub page")
public void user_is_in_try_editor_page_from_graph_sub_page() {
	pagetitle = gpf.Getstarted();
	pagetitle = gpf.Graph();
	gpf.Tryhere();
}

@When("Graph - User clicks on Run Button without entering the code")
public void graph_user_clicks_on_run_button_without_entering_the_code() {
	gpf.clickrun();
}

@Then("Graph - An Alert window with the error message is displayed")
public void graph_an_alert_window_with_the_error_message_is_displayed() {
	String alertmessage = gpf.handlealert();
	LoggerLoad.info(alertmessage);  

}

@When("User clicks on Run Button after entering a invalid python code from Excel {int} for Graph Module")
public void user_clicks_on_run_button_after_entering_a_invalid_python_code_from_excel_for_graph_module(Integer Rownum) throws IOException {
	ExcelReader read = new ExcelReader();
	String tryherecode = read.gettryherecode(Rownum);
	LoggerLoad.info(tryherecode);
	gpf.entercode(tryherecode);
	gpf.clickrun();
}

@Then("An Alert window with the error message from Excel {int} for Graph Module is displayed")
public void an_alert_window_with_the_error_message_from_excel_for_graph_module_is_displayed(Integer Rownum) throws IOException {
	String alertmessage = gpf.handlealert();
	LoggerLoad.info("Alert Message received:"+alertmessage);
	ExcelReader read = new ExcelReader();
	String outputmessage = read.gettryheremessage(Rownum);	
	assertEquals(alertmessage, outputmessage, "Incorrect output");
}

@When("User clicks on Run Button after entering a valid python code from Excel {int} for Graph Module")
public void user_clicks_on_run_button_after_entering_a_valid_python_code_from_excel_for_graph_module(Integer Rownum) throws IOException {
	ExcelReader read = new ExcelReader();
	String tryherecode = read.gettryherecode(Rownum);
	System.out.println(tryherecode);
	gpf.entercode(tryherecode);
	gpf.clickrun();
}

@Then("Correct output is displayed in the console from Excel {int} for Graph Module")
public void correct_output_is_displayed_in_the_console_from_excel_for_graph_module(Integer Rownum) throws IOException {
	ExcelReader read = new ExcelReader();
	String outputmessage = read.gettryheremessage(Rownum);
	String actualoutput=gpf.getoutput();
	assertEquals(actualoutput, outputmessage, "Incorrect output");
	LoggerLoad.info(actualoutput);
}

@When("User clicks on the hyperlink Graph Representation")
public void user_clicks_on_the_hyperlink_graph_representation() {
    pagetitle = gpf.GraphRepresentationsPage();
}

@Then("User lands on the Graph Representation Sub page")
public void user_lands_on_the_graph_representation_sub_page() {
	assertEquals(pagetitle, "Graph Representations", "Not on the Graph Representations page");
	LoggerLoad.info("Current page: "+pagetitle);

}

@Given("User is in Try Editor page from Graph Representation Sub page")
public void user_is_in_try_editor_page_from_graph_representation_sub_page() {
	pagetitle = gpf.Getstarted();
	pagetitle = gpf.GraphRepresentationsPage();
	gpf.Tryhere();

}

@Given("Graph - User signed in dsAlgo Portal and is on the home page")
public void graph_user_signed_in_ds_algo_portal_and_is_on_the_home_page() {
	LoggerLoad.info("User is in home page after sign in");    
}

@When("User clicks on Graph from the drop down above.")
public void user_clicks_on_graph_from_the_drop_down_above() {
	LoggerLoad.info("Moving to Graph page from dropdown..");
	pagetitle = gpf.GraphpagefromDD();
}

@Then("User navigates to Graph page.")
public void user_navigates_to_graph_page() {
	 assertEquals(pagetitle, "Graph", "Not on the Graph page");
}




}

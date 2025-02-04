package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Commons.ConfigReader;
import Commons.LoggerLoad;
import PageFactory.Array_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_sd extends Array_pf{
	Array_pf Apf=new Array_pf();
	String pagetitle;
	
//Background
	
@Given("The user is in the Home page after Sign in")
public void the_user_is_in_the_home_page_after_sign_in() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	assertEquals(pagetitle, "NumpyNinja", "Not on the NumpyNinja Home page");
	LoggerLoad.info(pagetitle);
   
}

@When("The user clicks the Getting Started button in Array panel")
public void the_user_clicks_the_getting_started_button_in_array_panel() {
	

	 pagetitle=Apf.Arraypage();
	 LoggerLoad.info(pagetitle);
    	
}
@Then("The user should able to view Array Page")
public void the_user_should_able_to_view_array_page() {
    
	assertEquals(pagetitle, "Array","Not on the Array");
	   LoggerLoad.info(pagetitle);
}


//@A1--done

@Given("The Array-user is in the Home page after Sign in")
public void the_array_user_is_in_the_home_page_after_sign_in() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.checkpageTitle();
	assertEquals(pagetitle, "Array", "Not on the Data Structures-Introduction");
	LoggerLoad.info(pagetitle);
}

@When("The user select Array item from the drop down menu")
public void the_user_select_array_item_from_the_drop_down_menu() {
	
	Apf.dropdownselect();
	
}

@Then("The Array-user should able to view Array Page")
public void the_array_user_should_able_to_view_array_page() {
	pagetitle = Apf.checkpageTitle();
	assertEquals(pagetitle, "Array", "Not on the Array page");
	LoggerLoad.info(pagetitle);
}

//@A2--done

@Given("The user is in the Array page after Sign in")
public void the_user_is_in_the_array_page_after_sign_in() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.checkpageTitle();
	assertEquals(pagetitle, "Array", "Not in the Array page");
	LoggerLoad.info(pagetitle);
	
	
}

@When("The user clicks Arrays in Python link")
public void the_user_clicks_arrays_in_python_link() {
    
	pagetitle=Apf.Arraysinpython();
	 LoggerLoad.info(pagetitle);
	
	
}

@Then("The user should be redirected to Arrays in Python page")
public void the_user_should_be_redirected_to_arrays_in_python_page() {
    
	pagetitle = Apf.checkpageTitle();
	assertEquals(pagetitle, "Arrays in Python", "Not on the Time Complexity page");
	LoggerLoad.info(pagetitle);
	//Apf.closebrowser();
		
}


//@A3--Done

@Given("The user is on the Arrays in Python page")
public void the_user_is_on_the_arrays_in_python_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.Arraysinpython();
	assertEquals(pagetitle, "Arrays in Python", "Not on the Array page");
	LoggerLoad.info(pagetitle);
    
	
}

@When("The user clicks Try here button in Arrays in Python page")
public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
    
	pagetitle = Apf.tryhere();
	
}

@Then("The user should be redirected to a page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	
    
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
	//dspf.closebrowser();
}

//@A4-Done-Failed

@Given("The user1 is in the try Editor page")
public void the_user1_is_in_the_try_editor_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle=Apf.Arraysinpython();
	pagetitle=Apf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
    
}

@When("The user clicks the Run Button without entering the code in the Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	
	 Apf.clickrun();
}

@Then("The user1 should able to see an error message in alert window")
public void the_user1_should_able_to_see_an_error_message_in_alert_window() {
    
	String alertmessage = Apf.handlealert();
	LoggerLoad.info(alertmessage);
//	Apf.closebrowser();
	
}

//@A5--Done

@Given("The user2 is in the try Editor page")
public void the_user2_is_in_the_try_editor_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle=Apf.Arraysinpython();
	pagetitle=Apf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
    
}

@When("The user2 write the invalid code in Editor and click the Run Button")
public void the_user2_write_the_invalid_code_in_editor_and_click_the_run_button() {
    
	
	Apf.entercode("Hello");
	Apf.clickrun();
}

@Then("The user2 should able to see an error message in alert window")
public void the_user2_should_able_to_see_an_error_message_in_alert_window() {
	
	String alertmessage = Apf.handlealert();
	LoggerLoad.info(alertmessage);
	//dspf.closebrowser();
}


//@A6--Done
@Given("The user3 is in the try Editor page")
public void the_user3_is_in_the_try_editor_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle=Apf.Arraysinpython();
	pagetitle=Apf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
	
	
}

@When("The user1 write the valid code in Editor and click the Run Button")
public void the_user1_write_the_valid_code_in_editor_and_click_the_run_button() {
	
	Apf.entercode("print(\"NumpyNinja\")");
	Apf.clickrun();
    
}

@Then("The user1 should able to see output in the console")
public void the_user1_should_able_to_see_output_in_the_console() {
	
	String output=Apf.getoutput();
	LoggerLoad.info(output);
	//Apf.closebrowser();
    
}


//@A7---Done
@Given("The Array-user is in the Array page after Sign in")
public void the_array_user_is_in_the_array_page_after_sign_in() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.Arraysinpython();
	assertEquals(pagetitle, "Arrays in Python", "Not on the Arrays in Python page");
	LoggerLoad.info(pagetitle);
		
}
@When("The user1 clicks Practice Questions button")
public void the_user1_clicks_practice_questions_button() {
	
	Apf.PracticeQuestionClick();   
}


@Then("The user should be redirected to Practice page")
public void the_user_should_be_redirected_to_practice_page() {
	
	practicequestioncontent = Apf.PracticeQuestioncontentcheck();
    assertEquals(practicequestioncontent, true);
 //   Apf.closebrowser();
	
}


//@A8
@When("The user clicks Arrays Using List link")
public void the_user_clicks_arrays_using_list_link() {
	Apf.ArraysUsingList();  
}
@Then("The user should be redirected to Arrays Using List page")
public void the_user_should_be_redirected_to_arrays_using_list_page() {
    
	pagetitle = Apf.ArraysUsingList();
	assertEquals(pagetitle, "Arrays Using List", "Not on the Arrays Using List page");
	LoggerLoad.info(pagetitle);
	//Apf.closebrowser();
}

//A9--Done

@Given("The user is on the Arrays Using List page")
public void the_user_is_on_the_arrays_using_list_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.ArraysUsingList();
	assertEquals(pagetitle, "Arrays Using List", "Not on the Array page");
	LoggerLoad.info(pagetitle);
}

@When("The user clicks Try here button in Arrays Using List page")
public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	pagetitle = Apf.tryhere();
}

@Then("The Array-user should be redirected to a page having an try Editor with a Run button to test")
public void the_array_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

//@A10--done-failed

@Given("The user4 is in the try Editor page")
public void the_user4_is_in_the_try_editor_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle=Apf.ArraysUsingList();
	pagetitle=Apf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("The user1 clicks the Run Button without entering the code in the Editor")
public void the_user1_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	 Apf.clickrun();
}
@Then("The user should able to see an error message in alert window")
public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	String alertmessage = Apf.handlealert();
	LoggerLoad.info(alertmessage);
//	Apf.closebrowser();
}



//@A11--Done
@Given("The user5 is in the try Editor page")
public void the_user5_is_in_the_try_editor_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle=Apf.ArraysUsingList();
	pagetitle=Apf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
    
}

@When("The user3 write the invalid code in Editor and click the Run Button")
public void the_user3_write_the_invalid_code_in_editor_and_click_the_run_button() {
	Apf.entercode("Hello");
	Apf.clickrun();
}

@Then("The user3 should able to see an error message in alert window")
public void the_user3_should_able_to_see_an_error_message_in_alert_window() {
	String alertmessage = Apf.handlealert();
	LoggerLoad.info(alertmessage);
}

//@A12---Done

@Given("The user6 is in the try Editor page")
public void the_user6_is_in_the_try_editor_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle=Apf.ArraysUsingList();
	pagetitle=Apf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("The user2 write the valid code in Editor and click the Run Button")
public void the_user2_write_the_valid_code_in_editor_and_click_the_run_button() {
	Apf.entercode("print(\"Milestone Mavericks\")");
	Apf.clickrun();
    
}

@Then("The user2 should able to see output in the console")
public void the_user2_should_able_to_see_output_in_the_console() {
	String output=Apf.getoutput();
	LoggerLoad.info(output);
}

//A13---Done

@Given("The array-user1 is in the Array page after Sign in")
public void the_array_user1_is_in_the_array_page_after_sign_in() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.ArraysUsingList();
	assertEquals(pagetitle, "Arrays Using List", "Not on the Arrays Using List");
	LoggerLoad.info(pagetitle);
		
}

@When("The user2 clicks Practice Questions button")
public void the_user2_clicks_practice_questions_button() {
	Apf.PracticeQuestionClick();   
}

@Then("The user1 should be redirected to Practice page")
public void the_user1_should_be_redirected_to_practice_page() {
	practicequestioncontent = Apf.PracticeQuestioncontentcheck();
    assertEquals(practicequestioncontent, true);
    //Apf.closebrowser();
}

//A14--Done

@Given("The user0 is in the Array page after Sign in")
public void the_user0_is_in_the_array_page_after_sign_in() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.checkpageTitle();
	assertEquals(pagetitle, "Array", "Not in the Array page");
	LoggerLoad.info(pagetitle);
	
	
}

@When("The user clicks Basic Operations in Lists link")
public void the_user_clicks_basic_operations_in_lists_link() {
	
	Apf.BasicOperations();  
}

@Then("The user should be redirected to Basic Operations in Lists page")
public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
	pagetitle = Apf.BasicOperations();
	assertEquals(pagetitle, "Basic Operations in Lists", "Not on the Basic Operations in Lists page");
	LoggerLoad.info(pagetitle);
}

//@A15--Done


@Given("The user is on the Basic Operations in Lists page")
public void the_user_is_on_the_basic_operations_in_lists_page() throws IOException {
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	pagetitle=Apf.homepage(username,password);
	pagetitle = Apf.BasicOperations();
	assertEquals(pagetitle, "Basic Operations in Lists", "Not on the Basic Operations in Lists page");
	LoggerLoad.info(pagetitle);
}

@When("The user clicks Try here button in Basic Operations in Lists page")
public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	pagetitle = Apf.tryhere();
}

@Then("The user1 should be redirected to a page having an try Editor with a Run button to test")
public void the_user1_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

//@A16

@Given("The user7 is in the try Editor page")
public void the_user7_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user2 clicks the Run Button without entering the code in the Editor")
public void the_user2_clicks_the_run_button_without_entering_the_code_in_the_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user4 should able to see an error message in alert window")
public void the_user4_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user8 is in the try Editor page")
public void the_user8_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user4 write the invalid code in Editor and click the Run Button")
public void the_user4_write_the_invalid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user5 should able to see an error message in alert window")
public void the_user5_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user9 is in the try Editor page")
public void the_user9_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user3 write the valid code in Editor and click the Run Button")
public void the_user3_write_the_valid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user3 should able to see output in the console")
public void the_user3_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user1 is in the Array page after Sign in")
public void the_user1_is_in_the_array_page_after_sign_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks Practice Questions button")
public void the_user_clicks_practice_questions_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user0 should be redirected to Practice page")
public void the_user0_should_be_redirected_to_practice_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user01 is in the Array page after Sign in")
public void the_user01_is_in_the_array_page_after_sign_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks Applications of Array link")
public void the_user_clicks_applications_of_array_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the Applications of Array page")
public void the_user_is_on_the_applications_of_array_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks Try here button in Applications of Array")
public void the_user_clicks_try_here_button_in_applications_of_array() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user2 should be redirected to a page having an try Editor with a Run button to test")
public void the_user2_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user10 is in the try Editor page")
public void the_user10_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user3 clicks the Run Button without entering the code in the Editor")
public void the_user3_clicks_the_run_button_without_entering_the_code_in_the_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user6 should able to see an error message in alert window")
public void the_user6_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user11 is in the try Editor page")
public void the_user11_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user5 write the invalid code in Editor and click the Run Button")
public void the_user5_write_the_invalid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user7 should able to see an error message in alert window")
public void the_user7_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user12 is in the try Editor page")
public void the_user12_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user4 write the valid code in Editor and click the Run Button")
public void the_user4_write_the_valid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user4 should able to see output in the console")
public void the_user4_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user2 is in the Array page after Sign in")
public void the_user2_is_in_the_array_page_after_sign_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user01 clicks Practice Questions button")
public void the_user01_clicks_practice_questions_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



@Then("The user01 should be redirected to Practice page")
public void the_user01_should_be_redirected_to_practice_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//@A27(passed but not cleared aready exsiting code)
@Given("The user1 is on the practice question editor")
public void the_user1_is_on_the_practice_question_editor() {
	pagetitle=Apf.ArraysUsingList();
	pagetitle=Apf.PracticeQuestionClick();
	pagetitle=Apf.SearchTheArray();
	assertEquals(pagetitle, "Assessment", "Not on the Assessment");
	LoggerLoad.info("Current page: "+pagetitle);

}

@When("The user6 write the invalid code in Editor and Click the Run Button")
public void the_user6_write_the_invalid_code_in_editor_and_click_the_run_button() {
	//clear already exiesting code
	Apf.entercode("Hello");
	Apf.clickrun();
}

@Then("The user8 should able to see an error message in alert window")
public void the_user8_should_able_to_see_an_error_message_in_alert_window() {
	
	String alertmessage = Apf.handlealert();
	LoggerLoad.info(alertmessage);
	//dspf.closebrowser();
}

@Given("The user2 is on the practice question editor")
public void the_user2_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user5 write the valid code in Editor and Click the Run Button")
public void the_user5_write_the_valid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user5 should able to see output in the console")
public void the_user5_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user3 is on the practice question editor")
public void the_user3_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user1 write the invalid code in Editor and Click the Submit Button")
public void the_user1_write_the_invalid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user see an error message {string}")
public void the_user_see_an_error_message(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user4 is on the practice question editor")
public void the_user4_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user1 write the valid code in Editor and Click the Submit Button")
public void the_user1_write_the_valid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user see success message Submission successful")
public void the_user_see_success_message_submission_successful() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user5 is on the practice question editor")
public void the_user5_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user7 write the invalid code in Editor and Click the Run Button")
public void the_user7_write_the_invalid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user9 should able to see an error message in alert window")
public void the_user9_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user6 is on the practice question editor")
public void the_user6_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user6 write the valid code in Editor and Click the Run Button")
public void the_user6_write_the_valid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user6 should able to see output in the console")
public void the_user6_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user7 is on the practice question editor")
public void the_user7_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user2 write the invalid code in Editor and Click the Submit Button")
public void the_user2_write_the_invalid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user see an error message Error occurred during submission")
public void the_user_see_an_error_message_error_occurred_during_submission() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user8 is on the practice question editor")
public void the_user8_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user2 write the valid code in Editor and Click the Submit Button")
public void the_user2_write_the_valid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user01 see success message Submission successful")
public void the_user01_see_success_message_submission_successful() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user9 is on the practice question editor")
public void the_user9_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user8 write the invalid code in Editor and Click the Run Button")
public void the_user8_write_the_invalid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user10 should able to see an error message in alert window")
public void the_user10_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user10 is on the practice question editor")
public void the_user10_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user7 write the valid code in Editor and Click the Run Button")
public void the_user7_write_the_valid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user7 should able to see output in the console")
public void the_user7_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user11 is on the practice question editor")
public void the_user11_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user3 write the invalid code in Editor and Click the Submit Button")
public void the_user3_write_the_invalid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user12 is on the practice question editor")
public void the_user12_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user3 write the valid code in Editor and Click the Submit Button")
public void the_user3_write_the_valid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user02 see success message Submission successful")
public void the_user02_see_success_message_submission_successful() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user13 is on the practice question editor")
public void the_user13_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user9 write the invalid code in Editor and Click the Run Button")
public void the_user9_write_the_invalid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user11 should able to see an error message in alert window")
public void the_user11_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user14 is on the practice question editor")
public void the_user14_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user8 write the valid code in Editor and Click the Run Button")
public void the_user8_write_the_valid_code_in_editor_and_click_the_run_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user8 should able to see output in the console")
public void the_user8_should_able_to_see_output_in_the_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user15 is on the practice question editor")
public void the_user15_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user4 write the invalid code in Editor and Click the Submit Button")
public void the_user4_write_the_invalid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user16 is on the practice question editor")
public void the_user16_is_on_the_practice_question_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user4 write the valid code in Editor and Click the Submit Button")
public void the_user4_write_the_valid_code_in_editor_and_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user001 see success message Submission successful")
public void the_user001_see_success_message_submission_successful() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}

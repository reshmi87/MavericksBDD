package StepDefinition;

import static org.testng.Assert.assertEquals;

import Commons.LoggerLoad;
import PageFactory.ds_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ds_sd extends ds_pf{
	
	ds_pf dspf=new ds_pf();
	String pagetitle;
	//Background
	@Given("The user is in the Home page after logged in for Data Structures - Introduction page")
	public void the_user_is_in_the_home_page_after_logged_in_for_data_structures_introduction_page() {
		
		pagetitle=dspf.homepage();
		assertEquals(pagetitle, "NumpyNinja", "Not on the NumpyNinja Home page");
		LoggerLoad.info(pagetitle);
	}

	@When("The user clicks Get Started button in Data Structures - Introduction panel")
	public void the_user_clicks_get_started_button_in_data_structures_introduction_panel() {
		
		 pagetitle=dspf.dspage();
		 LoggerLoad.info(pagetitle);
		 
		 
	}

	@Then("The user should able to view Data Structures- Introduction Page")
	public void the_user_should_able_to_view_data_structures_introduction_page() {
		
		assertEquals(pagetitle, "Data Structures-Introduction","Not on the Data Structures-Introduction");
		   LoggerLoad.info(pagetitle);
		  
	}
	
	//@DS1-done-Passed

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		
		pagetitle = dspf.checkpageTitle();
		assertEquals(pagetitle, "Data Structures-Introduction", "Not on the Data Structures-Introduction");
		LoggerLoad.info(pagetitle);
	}

	@When("The user clicks Time Complexity link Data Structures- Introduction Page")
	public void the_user_clicks_time_complexity_link_data_structures_introduction_page() {
		
		 pagetitle=dspf.clickTimeComplexityLink();
		 LoggerLoad.info(pagetitle);
	}

	@Then("The user should be redirected to Time Complexity page of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_page_of_data_structures_introduction() {
		
		pagetitle = dspf.checkpageTitle();
		assertEquals(pagetitle, "Time Complexity", "Not on the Time Complexity page");
		LoggerLoad.info(pagetitle);
		//dspf.closebrowser();
	}
	
	//@DS2-Done -failed

	@Given("The user is in the Time Complexity page of Data structures-Introduction")
	public void the_user_is_in_the_time_complexity_page_of_data_structures_introduction() {
		
		pagetitle = dspf.clickTimeComplexityLink();
		assertEquals(pagetitle, "Time Complexity", "Not on the Time Complexity page");
		LoggerLoad.info(pagetitle);
	}

	@When("The user clicks the Practice Questions link in the Data structures-Introduction")
	public void the_user_clicks_the_practice_questions_link_in_the_data_structures_introduction() {
	
		dspf.PracticeQuestionClick();
	}

	@Then("The user should be redirected to Practice Questions in the Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_in_the_data_structures_introduction() {
		
		practicequestioncontent = dspf.PracticeQuestioncontentcheck();
	    assertEquals(practicequestioncontent, true);
	    dspf.closebrowser();
	}
	
	//@DS3-Done-passed

	@Given("The DS-user is in the Time Complexity page of Data structures-Introduction")
	public void the_ds_user_is_in_the_time_complexity_page_of_data_structures_introduction() {
		
		pagetitle = dspf.clickTimeComplexityLink();
		assertEquals(pagetitle, "Time Complexity", "Not on the Time Complexity page");
		LoggerLoad.info(pagetitle);
	}

	@When("The user clicks Try here button in the Data structures-Introduction")
	public void the_user_clicks_try_here_button_in_the_data_structures_introduction() {
	    
		pagetitle = dspf.tryhere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test Data structures-Introduction")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_data_structures_introduction() {
	    
		
		assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
		LoggerLoad.info("Current page: "+pagetitle);
		//dspf.closebrowser();
	}
	
	//@DS4--Done-passed(Bug)-not showing alert window

	@Given("The ds-user is in the try Editor page of Data structures-Introduction")
	public void the_ds_user_is_in_the_try_editor_page_of_data_structures_introduction() {
		
		pagetitle=dspf.clickTimeComplexityLink();
		pagetitle=dspf.tryhere();
		assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
		LoggerLoad.info("Current page: "+pagetitle);
	    
	}

	@When("The user clicks the Run Button without entering the code in the Editor of Data structures-Introduction")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_data_structures_introduction() {
	    
		 dspf.clickrun();
		
	}
	

	@Then("The user should able to see an error message in alert window of Data structures-Introduction")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_data_structures_introduction() {
		
		String alertmessage = dspf.handlealert();
		LoggerLoad.info(alertmessage);
		dspf.closebrowser();
	}
	
	//@DS5-Done

	@Given("The DS-user is in the try Editor page of Data structures-Introduction")
	public void user_is_in_the_try_editor_page_of_data_structures_introduction() {
		
		pagetitle=dspf.clickTimeComplexityLink();
		pagetitle=dspf.tryhere();
		assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("The user write the invalid code in Editor and click the Run Button to test Data structures-Introduction")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_to_test_data_structures_introduction() {
		
		dspf.entercode("abcd");
		dspf.clickrun();
	}

	@Then("The DS-user should able to see an error message in alert window of Data structures-Introduction")
	public void the_ds_user_should_able_to_see_an_error_message_in_alert_window_of_data_structures_introduction() {
		
		String alertmessage = dspf.handlealert();
		LoggerLoad.info(alertmessage);
		//dspf.closebrowser();
	}
	//@DS6-Done

	@Given("The user is in the try Editor page of Data structures-Introduction")
	public void the_user_is_in_the_try_editor_page_of_data_structures_introduction() {
		
		pagetitle=dspf.clickTimeComplexityLink();
		pagetitle=dspf.tryhere();
		assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("The user write the valid code in Editor and click the Run Button to test Data structures-Introduction")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_to_test_data_structures_introduction() {
	    
		dspf.entercode("print(\"hello\")");
		dspf.clickrun();
	}

	@Then("The user should able to see output in the console of Data structures-Introduction")
	public void the_user_should_able_to_see_output_in_the_console_of_data_structures_introduction() {
		String output=dspf.getoutput();
		LoggerLoad.info(output);
		//dspf.closebrowser();
	}




}

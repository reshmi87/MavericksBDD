package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.Register_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	private Register_pf rpf;
	String pagetitle;
	String newuname;
	
	@Given("Users can open the register page")
	public void users_can_open_the_register_page() {
		rpf = new Register_pf();
		pagetitle = rpf.checkpageTitle();
	}

	@When("When user click register tab")
	public void when_user_click_register_tab() {
	rpf.registerpage();
	}

	@Then("Then user will land to register page")
	public void then_user_will_land_to_register_page() {
		pagetitle = rpf.checkpageTitle();
		assertEquals(pagetitle, "Registration", "Not on the Registration page");
	    LoggerLoad.info("Current page: "+pagetitle);	
	}

	@Given("The user opens the Register_pf Page")
	public void the_user_opens_the_register_page() {
		rpf = new Register_pf();
		rpf.registerpage();
		pagetitle = rpf.checkpageTitle();
	}


	@When("The user clicks Register button after entering Username from sheet {int} with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_from_sheet_with_other_fields_empty(Integer Rownum) throws IOException {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		rpf.username(username);
		rpf.registerbutton();
	}

	@Then("then user will be display an error Please fill out this field below Password textbox")
	public void then_user_will_be_display_an_error_please_fill_out_this_field_below_password_textbox() {
		pagetitle = rpf.checkpageTitle();
	    assertEquals(pagetitle, "Registration", "Not on the Registration page");
	}

	@Given("The user opens Register_pf Page")
	public void the_user_opens_register_page() {
		rpf = new Register_pf();
		rpf.registerpage();
	}


	@When("The user opens Register Page using credentials from {int}")
	public void the_user_opens_register_page_using_credentials_from(Integer Rownum) throws IOException {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		newuname = rpf.generateuser(username);
		String password = read.getpassword(Rownum);
		rpf.username(newuname);
		rpf.password1(password);
		rpf.password2(password);
		rpf.registerbutton();
		}
	@Then("The user should be redirected to Homepage with the message New Account Created. You are logged in as username from {int}")
	public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created_you_are_logged_in_as_username_from(Integer Rownum) throws IOException {
		String successmessage = "New Account Created. You are logged in as "+newuname;
		String actualmessage = rpf.getsuccessmessage();
		LoggerLoad.info(actualmessage);
		assertEquals(actualmessage, successmessage, "Registration not successful");
	}

	@Given("The user is in the Registration page")
	public void the_user_is_in_the_registration_page() {
		rpf = new Register_pf();
		rpf.registerpage();
	}
	
	@When("The user enters a name  from sheet {int} with invalid characters other than Letters digits")
	public void the_user_enters_a_name_from_sheet_with_invalid_characters_other_than_letters_digits(Integer Rownum) throws IOException  {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		newuname = username;
		String password = read.getpassword(Rownum);
		rpf.username(newuname);
		rpf.password1(password);
		rpf.password2(password);
		rpf.registerbutton();
		}
	
	@Then("Then user will be display an error message Please enter a valid username")
	public void then_user_will_be_display_an_error_message_please_enter_a_valid_username() {
		String actualerrormessage = rpf.geterrormessage();
		String experrormessage = "Please enter valid username";
		LoggerLoad.info("Displayed error message:"+actualerrormessage);
		assertEquals(actualerrormessage, experrormessage, "Incorrect error message");
	}

	@When("The user clicks Register button after entering different passwords for Password and Password confirmation fields using {int} from sheet")
	public void the_user_clicks_register_button_after_entering_different_passwords_for_password_and_password_confirmation_fields_using_from_sheet(Integer Rownum) throws IOException {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		newuname = username;
		String password = read.getpassword(Rownum);
		rpf.username(newuname);
		rpf.password1(password);
		rpf.password2("Welcome@5");
		rpf.registerbutton();
	}
	
	
	@Then("Then the user will display an error message password_mismatch The two password fields did not match")
	public void then_the_user_will_display_an_error_message_password_mismatch_the_two_password_fields_did_not_match() {
		String actualerrormessage = rpf.geterrormessage();
		String experrormessage = "password_mismatch:The two password fields didn’t match.";
		LoggerLoad.info("Displayed error message:"+actualerrormessage);
		assertEquals(actualerrormessage, experrormessage, "Incorrect error message");
	}


	@When("The user clicks Register button after entering Username and password from sheet {int} with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_from_sheet_with_password_confirmation_field_empty(Integer Rownum) throws IOException {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		newuname = username;
		String password = read.getpassword(Rownum);
		rpf.username(newuname);
		rpf.password1(password);
		rpf.registerbutton();

	}
	@Then("then user will be display an error Please fill out this field below Password Confirmation textbox")
	public void then_user_will_be_display_an_error_please_fill_out_this_field_below_password_confirmation_textbox() {
		pagetitle = rpf.checkpageTitle();
	    assertEquals(pagetitle, "Registration", "Not on the Registration page");
	}

	@When("The user enters a Password with characters less than {int} from sheet {int}")
	public void the_user_enters_a_password_with_characters_less_than_from_sheet(Integer int1, Integer Rownum) throws IOException {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		String password = read.getpassword(Rownum);
		rpf.username(username);
		rpf.password1(password);
		rpf.password2(password);
		rpf.registerbutton();
	}
	
	@Then("then the user will be displayed an error message Password should contain at least eight characters")
	public void then_the_user_will_be_displayed_an_error_message_password_should_contain_at_least_eight_characters() {
		String actualerrormessage = rpf.geterrormessage();
		String experrormessage = "Password must contain atleast 8 characters";
		LoggerLoad.info("Displayed error message:"+actualerrormessage);
		assertEquals(actualerrormessage, experrormessage, "Incorrect error message");

	}


}

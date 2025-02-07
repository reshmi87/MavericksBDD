package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.Login_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	private Login_pf lpf;
	String pagetitle;
	String newuname;
	
	@Given("User can open Sign in page ds-Algo")
	public void user_can_open_sign_in_page_ds_algo() {
		lpf = new Login_pf();
		pagetitle = lpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("User click sign in button")
	public void user_click_sign_in_button() {
	    lpf.clickLogin();
	}

	@Then("User will be redirected to the in-page")
	public void user_will_be_redirected_to_the_in_page() {
		pagetitle = lpf.checkpageTitle();
		assertEquals(pagetitle, "Sigin", "Not on the Sigin page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@Given("Users can open Sign in page")
	public void users_can_open_sign_in_page() {
		lpf = new Login_pf();
		pagetitle = lpf.checkpageTitle();
		assertEquals(pagetitle, "Signin", "Not on the Signin page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("User enter Username and Password without register from excel sheet {int}")
	public void user_enter_username_and_password_without_register_from_excel_sheet(Integer Rownum) throws IOException {
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		lpf.enterUsername(username);
		lpf.clickLogin();
	}

	@Then("The user will see a pop-up that says Invalid Username and Password")
	public void the_user_will_see_a_pop_up_that_says_invalid_username_and_password() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@Then("The user will see a pop-up that says If you don't have an account, please Register")
	public void the_user_will_see_a_pop_up_that_says_if_you_don_t_have_an_account_please_register() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@When("User try to sign in without entering Username Password")
	public void user_try_to_sign_in_without_entering_username_password() {
	    lpf.clickLogin();
	}

	@Then("Then the User will display an error message Please fill out this field in a username")
	public void then_the_user_will_display_an_error_message_please_fill_out_this_field_in_a_username() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@When("User try to sign in without entering  Password from excel sheet {int}")
	public void user_try_to_sign_in_without_entering_password_from_excel_sheet(Integer Rownum) throws IOException{
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		lpf.enterUsername(username);
		lpf.clickLogin();
	}

	@Then("Then the User will display an error message Please fill out this field in a Password")
	public void then_the_user_will_display_an_error_message_please_fill_out_this_field_in_a_password() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@When("The user enters an invalid user id {double} password combination from excel sheet {int}")
	public void the_user_enters_an_invalid_user_id_password_combination_from_excel_sheet(Double double1, Integer Rownum) throws IOException{
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		lpf.enterUsername(username);
		lpf.clickLogin();
	}

	@Then("Then user will display Please check your user id")
	public void then_user_will_display_please_check_your_user_id() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@When("The user enters an valid user id {double} invalid password from excel sheet {int}")
	public void the_user_enters_an_valid_user_id_invalid_password_from_excel_sheet(Double double1, Integer Rownum) throws IOException{
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		lpf.enterUsername(username);
		lpf.clickLogin();
	}

	@Then("Then user will display Please check your password")
	public void then_user_will_display_please_check_your_password() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@When("The user enters an invalid user id {double} valid password from excel sheet {int}")
	public void the_user_enters_an_invalid_user_id_valid_password_from_excel_sheet(Double double1, Integer Rownum) throws IOException{
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		lpf.enterUsername(username);
		lpf.clickLogin();
	}

	@Then("Then user will display Invalid username and password")
	public void then_user_will_display_invalid_username_and_password() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@When("The user enters an valid user id {double} password from excel sheet {int}")
	public void the_user_enters_an_valid_user_id_password_from_excel_sheet(Double double1, Integer Rownum) throws IOException{
		ExcelReader read = new ExcelReader();
		String username = read.getusername(Rownum);
		lpf.enterUsername(username);
		lpf.clickLogin();
	}

	@Then("Then user should be redirected to Home Page with the message You are logged in and with the user name on the top")
	public void then_user_should_be_redirected_to_home_page_with_the_message_you_are_logged_in_and_with_the_user_name_on_the_top() {
		pagetitle = lpf.checkpageTitle();
	    assertEquals(pagetitle, "Signin", "Not on the Registration page");
	}

	@Given("User is login and see the sign out")
	public void user_is_login_and_see_the_sign_out() {
		lpf = new Login_pf();
		pagetitle = lpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}

	@When("User try to click sign out")
	public void user_try_to_click_sign_out() {
		lpf.clickLogout();
	}

	@Then("then user we see message on home page Logged out succcessfully")
	public void then_user_we_see_message_on_home_page_logged_out_succcessfully() {
		pagetitle = lpf.checkpageTitle();
		assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
	    LoggerLoad.info("Current page: "+pagetitle);
	}
}

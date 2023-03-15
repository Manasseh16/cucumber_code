package com.Step_Definition;

import com.baseClass.BaseClassCucumber;
import com.poManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClassCucumber {

	PageObjectManager pom = new PageObjectManager(driver);
	@Given("user launch the application")
	public void user_launch_the_application() throws Exception {
		geturl("https://www.nykaa.com/");

		implicity(5);
		
	}
	
	@When("sign in button")
	public void sign_in_button() throws Exception {
		actionMethod("movetoelement", pom.getSign().getSignButton());
		thread(3);
		
		
	}

	@When("user needs to click the option of Sign in with Mobile\\/Email")
	public void user_needs_to_click_the_option_of_sign_in_with_mobile_email() throws Exception {
		actionMethod("click",pom.getSign().getMobile());
		thread(4);
	}

	@When("user needs to enter the Mobile number in the mobile number tab")
	public void user_needs_to_enter_the_mobile_number_in_the_mobile_number_tab() {
		sendkeys(pom.getSign().getMobile(), "9698629797");
	}

	@When("user needs to click the Proceed button")
	public void user_needs_to_click_the_proceed_button() {
		actionMethod("click",pom.getSign().getProceed());
		
	}

	@When("user needs to enter the OTP received through mobile in the console windows")
	public void user_needs_to_enter_the_otp_received_through_mobile_in_the_console_windows() {
		
		
	}

	@When("verify otp")
	public void verify_otp() {
		actionMethod("click", pom.getSign().getVerify());
		
	}


	@When("user move the curser to hair by using action method")
	public void user_move_the_curser_to_hair_by_using_action_method() {
		actionMethod("movetoelement", pom.getProduct().getHair());
	}

	@When("user click the shampoo by using action method")
	public void user_click_the_shampoo_by_using_action_method() throws Exception {
		actionMethod("click", pom.getProduct().getShampoo());
		thread(5);
		windowsHandling("multiple");
	}

	@When("user choose the shampoo brand")
	public void user_choose_the_shampoo_brand() {
		actionMethod("click", pom.getProduct().getBrand());
		windowsHandling("multiple");

	}

	@When("add to bag")
	public void add_to_bag() {
		actionMethod("click", pom.getProduct().getAddBag());
	}

	@When("user click the cart button")
	public void user_click_the_cart_button() {
		frames(null, null, null);

	}

	@When("user click the proceed button")
	public void user_click_the_proceed_button() {
		click(pom.getCart().getProceedButton());

	}

	@When("user click continue as guest")
	public void user_click_continue_as_guest() {
		click(pom.getAddress().getGuest());

	}

	@When("user fill the house number")
	public void user_fill_the_house_number() {
		sendkeys(pom.getAddress().getHouse(),"no 5");
     
	}

	@When("user fill the road name")
	public void user_fill_the_road_name() {
		sendkeys(pom.getAddress().getRoad(),"1 st cross street");

	}

	@When("fill the name")
	public void fill_the_name() {
		sendkeys(pom.getAddress().getName(),"manasseh");

	}

	@When("mobile number")
	public void mobile_number() {
		sendkeys(pom.getAddress().getMobile(),"9698629797");

	}

	@When("email id")
	public void email_id() {
sendkeys(pom.getAddress().getEmail(),"manasgade555@gmail.com");

	}

	@When("pincode")
	public void pincode() {
		sendkeys(pom.getAddress().getPincode(),"600095");
		

	}

	@When("click ship to the address")
	public void click_ship_to_the_address() {
		click(pom.getAddress().getShip());

	}

	@When("user click cod")
	public void user_click_cod() {
click(pom.getPay().getCod());
	}

	@When("click place order")
	public void click_place_order() {
		click(pom.getPay().getPlaceorder());

	}

}

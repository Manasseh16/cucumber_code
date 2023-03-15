package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
public static WebDriver driver;	
	@FindBy(xpath = "//button[text()=\"Continue as guest\"]")
	private WebElement guest;
	@FindBy(xpath = "//input[@placeholder=\"House/ Flat/ Office No.\"]")
	private WebElement house;
	@FindBy(xpath = "//textarea[@placeholder=\"Road Name/ Area /Colony\"]")
	private WebElement road;
	@FindBy(xpath = "//input[@placeholder=\"Name\"]")
	private WebElement name;
	@FindBy(xpath = "//input[@placeholder=\"Phone\"]")
	private WebElement mobile;
	@FindBy(xpath = "//input[@placeholder=\"Email ID (Optional)\"]")
	private WebElement email;
	@FindBy(xpath = "//input[@placeholder=\"Pincode\"]")
	private WebElement pincode;
	@FindBy(xpath = "//button[text()=\"Ship to this address\"]")
	private WebElement ship;
	
	public WebElement getGuest() {
		return guest;
	}
	public WebElement getHouse() {
		return house;
	}
	public WebElement getRoad() {
		return road;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getShip() {
		return ship;
	}
	
	public Address(WebDriver d) {
driver = d;
		PageFactory.initElements(driver, this);
	}

}

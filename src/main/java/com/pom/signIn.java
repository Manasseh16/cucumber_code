package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {

	public static WebDriver driver;
	
	@FindBy(xpath = "//button[text()=\"Sign in with Mobile / Email\"]")
	private WebElement signButton;
	@FindBy(xpath = "//input[@placeholder=\"Enter Email ID or Phone Number\"]")
	private WebElement mobile;
	@FindBy(xpath = "//button[@class=\"button big fill full \"]")
	private WebElement proceed;
	@FindBy(xpath = "//input[@placeholder=\"OTP\"]")
	private WebElement otp;
	@FindBy(xpath = "//button[@class=\"button big fill full \"]")
	private WebElement verify;
	
	public WebElement getSignButton() {
		return signButton;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getOtp() {
		return otp;
	}
	public WebElement getVerify() {
		return verify;
	}
	public signIn(WebDriver d) {
		
		driver = d;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

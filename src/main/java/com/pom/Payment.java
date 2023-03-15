package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver;
	@FindBy(xpath = "//p[text()=\"Cash on delivery\"]")
	private WebElement cod;
	@FindBy(xpath = "//button[text()=\"Place order\"]")
	private WebElement placeorder;

	public WebElement getCod() {
		return cod;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	public Payment(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

}

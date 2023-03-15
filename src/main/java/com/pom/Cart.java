package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	public static WebDriver driver;
	
    @FindBy(xpath = "//span[@class=\"cart-count\"]")
	private WebElement cartButton ;
    @FindBy(xpath = "//span[text()=\"Proceed\"]")
	private WebElement proceedButton;
		
	public WebElement getCartButton() {
		return cartButton;
	}
	public WebElement getProceedButton() {
		return proceedButton;
	}
	public Cart(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

}


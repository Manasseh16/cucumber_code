package com.poManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.Address;
import com.pom.Cart;
import com.pom.Payment;
import com.pom.ProductSelection;
import com.pom.signIn;

public class PageObjectManager {
	public static WebDriver driver;

	private ProductSelection product;
	private Cart cart;
	private Payment pay;
	private Address address;
    private signIn sign;

	public signIn getSign() {
	return sign;
}

	public ProductSelection getProduct() {
		return product;
	}

	public Cart getCart() {
		return cart;
	}

	public Payment getPay() {
		return pay;
	}

	public Address getAddress() {
		return address;
	}

	public PageObjectManager(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
}

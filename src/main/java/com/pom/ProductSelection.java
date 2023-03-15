package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.baseClass.baseClass;

public class ProductSelection {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()=\"hair\"]")
	private WebElement hair;
	@FindBy(xpath = "//a[text()=\"Shampoo\"]")
	private WebElement shampoo;

	@FindBy(xpath = "//img[@alt=\"L'Oreal Professionnel Density Advanced, Scalp Advanced, For Thinning Hair With Omega 6\"]")
	private WebElement brand;
	@FindBy(xpath = "(//span[text()=\"Add to Bag\"])[1]")
	private WebElement addBag;


	public WebElement getHair() {
		return hair;
	}

	public WebElement getShampoo() {
		return shampoo;
	}

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getAddBag() {
		return addBag;
	}

	public ProductSelection(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
}

package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCucumber {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if ((browser.equalsIgnoreCase("firefox"))) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver1\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "Driver1\\iedriver.exe");
			driver = new InternetExplorerDriver();
			return driver;
		} else {
			System.out.println("invalid Web Driver");
		} 
		return driver;

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateAll(String navigate) {
		driver.navigate().to(navigate);

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void gettitle() {
		driver.getTitle();
	}

	public static void currenturl() {
		driver.getCurrentUrl();
	}

	public static void gettext(WebElement value) {
		value.getText();
	}

	public static void get(String z) {
		driver.get(z);
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void text(WebElement k) {
		k.getText();

	}

	public static void attribute(WebElement a, String value) {
		a.getAttribute(value);
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void click(WebElement click) {
		click.click();
	}

	public static void isEnable(WebElement i) {
		boolean enabled = i.isEnabled();
		System.out.println(enabled);
	}

	public static void isSelected(WebElement i) {
		boolean selected = i.isSelected();
		System.out.println(selected);

	}

	public static void isDisplayed(WebElement i) {
		boolean displayed = i.isDisplayed();
		System.out.println(displayed);
	}

	public static void dropDownMethod(String type, WebElement element, String value) {

		Select s = new Select(element);
		if (s.isMultiple() == true) {
			System.out.println("TRUE");

			if (type.equalsIgnoreCase(value)) {
				s.selectByValue(value);

			} else if (type.equalsIgnoreCase(value)) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);

			} else if (type.equalsIgnoreCase(value)) {
				s.selectByVisibleText(value);

			} else {
				System.out.println("NOT AVAILABLE");

			}

		} else {
			System.out.println("NOT MULTIPLE");
		}
	}

	public static void multipleDropDownMethods(String type, WebElement Element, String Value) {
		Select a = new Select(Element);

		if (type.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = a.getOptions();

			for (WebElement webElement : options) {
				System.out.println(webElement.getText());
			}
		} else if (type.equalsIgnoreCase("getalloptions")) {
			List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				System.out.println(webElement.getText());

			}

		} else if (type.equalsIgnoreCase("getfirstselectedoptions")) {
			WebElement firstSelectedOption = a.getFirstSelectedOption();
			a.getFirstSelectedOption();

		}

		else {
			System.out.println("INVALID");
		}

	}

	public static void actionMethod(String option, WebElement Element) {

		Actions a = new Actions(driver);
		if (option.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(Element).build().perform();

		} else if (option.equalsIgnoreCase("click")) {
			a.click(Element).build().perform();
		} else if (option.equalsIgnoreCase("release")) {
			a.release(Element).build().perform();
		} else if (option.equalsIgnoreCase("move")) {
			a.moveToElement(Element).build().perform();
		} else if (option.equalsIgnoreCase("rightclick")) {
			a.contextClick(Element).build().perform();

		} else if (option.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(Element).build().perform();

		}

		else {
			System.out.println("INVALID");
		}

	}

	public static void dragdrop(WebElement src, WebElement dest) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest);
	}

	public static void implicity(int c) {
		driver.manage().timeouts().implicitlyWait(c, TimeUnit.SECONDS);

	}

	public static void thread(int v) throws Exception {
		Thread.sleep(v);

	}

	public static void screenshot(String name) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\manasseh j\\eclipse-workspace\\com\\Screenshot" + "name" + ".png");
		FileUtils.copyFile(screenshotAs, dest);
	}

	public static void javaScriptExecutor(String type, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("down")) {
			js.executeScript("window.ScrollBy(0,4000)");

		} else if (type.equalsIgnoreCase("up")) {
			js.executeScript("window.Scrollby(0.-4500)");

		} else if (type.equalsIgnoreCase("intoview")) {
			js.executeScript("arguments[0]scrollIntoView();", element);
		} else {
			System.out.println("java Script Not Found");
		}
	}

	public static void alert(String value) {
		if (value.equals("ok")) {
			driver.switchTo().alert().accept();

		} else if (value.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();

		} else {
			System.out.println("NO ALERT");
		}

	}

	public static void promptAlert(String input, String value) {
		driver.switchTo().alert().sendKeys(input);

		if (value.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();

		} else {
			System.out.println("no alert");
		}

	}

	public static void windowsHandling(String type) {
		if (type.equalsIgnoreCase("single")) {
			String windowHandle = driver.getWindowHandle();
			String windowtitle = driver.switchTo().window(windowHandle).getTitle();
			System.out.println(windowtitle);

		} else if (type.equalsIgnoreCase("singles"))
			
		{
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windows : windowHandles) {
				String title1 = driver.switchTo().window(windows).getTitle();
				System.out.println(title1);

			}
		}
	}

	public static void windowsHandling1() {
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windows : windowHandles) {
			driver.switchTo().window(windows);

		}

	}

	public static void frames(String type, WebElement element, String value) {

		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("frameRefName")) {
			driver.switchTo().frame(element);
		} else {
			System.out.println("NO FRAMES");

		}

	}
}

package com.Runner_Class;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClassCucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\manasseh j\\eclipse-workspace\\cucumber\\src\\test\\java\\com\\feature", glue= "com.Step_Definition")

public class TestRunner {
public static WebDriver driver;

//before class

@BeforeClass
public static void set_up() {
 driver = BaseClassCucumber.browserLaunch("chrome");
}
public static void End_pro() {
driver.close();
}


}

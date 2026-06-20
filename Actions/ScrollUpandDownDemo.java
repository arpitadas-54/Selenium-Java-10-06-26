package com.ActionsCommandsDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUpandDownDemo {
	
	WebDriver driver;
	String url = "https://www.nopcommerce.com/en";
	
    @Test
	public void Test() throws Exception {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);
	
	((JavascriptExecutor) driver).executeScript("scroll(0,6600)");
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)"," ");
    }
}

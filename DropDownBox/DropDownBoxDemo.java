//Write a program using selenium webdriver, count no of items from dropdown box in test automation practice application, and print listed items listed in dropdown box.
//Use TestNg Framework
package com.DropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownBoxDemo {
	WebDriver driver;
	String url = "https://testautomationpractice.blogspot.com/";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void DropDownList() throws Exception {
		driver.get(url);
		WebElement Country_Dropdown = driver.findElement(By.id("country"));
		Select country_list= new Select(Country_Dropdown);
		
		country_list.selectByIndex(3);
		Thread.sleep(5000);
		country_list.selectByVisibleText("India");
		Thread.sleep(5000);
		
		WebElement option = country_list.getFirstSelectedOption();
		String countryindex = option.getText();
		System.out.println(countryindex);
		
		List<WebElement> c_list = country_list.getOptions();
		int total_month = c_list.size();
		System.out.println("Total months count in List : " + total_month);
		
		for (WebElement ele : c_list) {
			String coun_name = ele.getText();
		    System.out.println("Country Names in list: "+ coun_name);
		}
	}
}

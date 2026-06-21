package com.SeleniumWebDriverAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.Helper;



public class DemoAlert {
	String URL = "https://demoqa.com/alerts";

	@Test
	public void TestBrowser() throws Exception {
		WebDriver driver = Helper.SourceBrowser("Google Chrome");
		driver.get(URL);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(10000);

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		System.out.println("The Text :" + text);

		if (text.equals("You clicked a button")) {
			System.out.println("Alert is clicked");
		} else {
			System.out.println("Alert is text is wrong");
		}

		alert.accept();

	}

}

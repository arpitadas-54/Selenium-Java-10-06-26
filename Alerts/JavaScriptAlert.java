package com.SeleniumWebDriverAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utility.Helper;

public class JavaScriptAlert {
	String URL = "https://testing.qaautomationlabs.com/javaScript-alert.php";
	public void TestPopups() {
		WebDriver driver = Helper.SourceBrowser("GC");
		driver.navigate().to("URL");
		
		driver.findElement(By.xpath("//button[normalize-space()='Show Confirm']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		
		if(text.contains("")) {
			System.out.println("The text is correct");
		}else {
			System.out.println("The text is worong");
		}
		alert.accept();
		
		
	}
	
	

}

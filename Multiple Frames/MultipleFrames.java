package com.MultipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleFrames {
		@Test
		 public void Frames() throws Exception {
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 String url = "file:///C:/Coforge/index.html";
			 driver.navigate().to(url);
			
			 
			 
			 int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
			 System.out.println("Number of Frames: " + totalnoofframes);
			 
			 driver.switchTo().frame("easycalculation");
			 driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
			 driver.findElement(By.id("log_email")).sendKeys("7735390822");
			 driver.findElement(By.id("log_password")).sendKeys("Arpita@123");
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//input[@name='log_submit']")).click();
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			 //Switchframe is used because it cant directly switch from one frame to another, it comes back an then navigate to another website
			    driver.navigate().to(url);
				Thread.sleep(5000);
				driver.switchTo().frame("practiceautomation");
				driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
				driver.findElement(By.id("username")).sendKeys("student");
				driver.findElement(By.id("password")).sendKeys("Password123");
				driver.findElement(By.id("submit")).click();
				String Title1= driver.getTitle();
				System.out.println(Title1);
				
				
				driver.navigate().to(url);
				Thread.sleep(5000);
				driver.switchTo().frame("Selenium");
				driver.navigate().to("https://www.selenium.dev/");
				driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
				
				String title2 = driver.getTitle();
				System.out.println(title2);
				Thread.sleep(5000);
				
				
				driver.quit();
			}
			 
		}


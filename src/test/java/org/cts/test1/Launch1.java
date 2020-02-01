package org.cts.test1;


import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class Launch1 {
		
		public	static  WebDriver driver;
		
		@Test
		public void tc1() {
			Assert.assertTrue(true);	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokularaja\\eclipse-workspace\\Testng\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();	
			 driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
			
		}
		
		@Test(dependsOnMethods="tc1")
		private void test() {
			driver.findElement(By.id("email")).sendKeys("234567890");
			driver.findElement(By.id("pass")).sendKeys("98765");
			System.out.println("success");
		}
		

	}



package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mariv\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com\r\n");
		
		//find the locator of username---->verify
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		//insert
		txtUsername.sendKeys("greens");
		
		//find the locator of password--->verify
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		
		//insert
		txtPassword.sendKeys("hello@1234");
		
		//close
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); //to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://github.com/login");  // link which we have to give
		Thread.sleep(3000); // 3seconds time we are giving here.
		WebElement usernameTxt = driver.findElement(By.id("login_field")); //we have stored this reference in username variable, So that we can able to use usernameTxt.
	
		
		if(usernameTxt.isDisplayed()) 
		{
			if(usernameTxt.isEnabled())
			{
			usernameTxt.sendKeys("Sai");
			String enteredText = usernameTxt.getAttribute("value");
			System.out.println(enteredText);
			Thread.sleep(3000);			
			usernameTxt.sendKeys(" Dheeraj");
			//usernameTxt.clear();
			
			}
		
		
			else
			
			System.err.println("username textbox is not displayed");
		}	
		else 
		
		System.err.println("username textbox is not Enabled");
		
	
	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",
				element);

	}
	
}

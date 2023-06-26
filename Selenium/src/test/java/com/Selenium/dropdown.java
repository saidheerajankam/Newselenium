package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v109.browser.Browser;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	//public static void main(String[] args) throws Exception {
		
		
		
		
	public void	FirstTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"); 
		Thread.sleep(3000); 
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		List<WebElement>courseNameDropdownOptions = courseNameDropdown.getOptions();
		for (WebElement option :courseNameDropdownOptions) {
			System.out.println(option.getText());
		}		 
		courseNameDropdown.selectByIndex(1);
		Thread.sleep(3000);
		courseNameDropdown.selectByValue("net");
		Thread.sleep(3000);
		courseNameDropdown.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text - " +selectedText);
					
	}
}
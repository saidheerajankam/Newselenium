package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiselectiondropdown {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"); // link which we have to give
	Thread.sleep(3000); // 3seconds time we are giving here.
	WebElement ideElement = driver.findElement(By.id("ide"));
	Select ideDropdown = new Select(ideElement);
	List<WebElement>courseNameDropdownOptions = ideDropdown.getOptions();
	for (WebElement option :courseNameDropdownOptions) {
		System.out.println(option.getText());
	}		 
	ideDropdown.selectByIndex(0);
	Thread.sleep(3000);
	ideDropdown.selectByValue("ij");
	Thread.sleep(3000);
	ideDropdown.selectByVisibleText("NetBeans");
	Thread.sleep(3000);
	ideDropdown.deselectByVisibleText("IntelliJ IDEA");
	
	
	List<WebElement>  selectedOptions = ideDropdown.getAllSelectedOptions();
	for (WebElement selectedOption : selectedOptions) {
		System.out.println("Selected visible text - " +selectedOption.getText());
	}

	}
}
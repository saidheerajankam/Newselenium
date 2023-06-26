package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html"); // link which we have to give
		driver.findElement(By.id("name")).sendKeys("Text1"); //Main document
		Thread.sleep(5000);
		
		driver.switchTo().frame("frm1");  //frame1
		
		Select coursename_dd = new Select(driver.findElement(By.id("course")));
		coursename_dd.selectByVisibleText("Java");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent(); 
		
		driver.switchTo().frame("frm2");   //frame2
		
		driver.findElement(By.id("firstName")).sendKeys("Ankam");	
		Thread.sleep(5000);
		driver.switchTo().defaultContent();  //Main document
		
		driver.switchTo().frame("frm1"); //frame1
		coursename_dd.selectByVisibleText("Dot Net");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent(); //Main document
		driver.findElement(By.id("name")).clear();		
		driver.findElement(By.id("name")).sendKeys("Text2");
		driver.quit();
	}
}

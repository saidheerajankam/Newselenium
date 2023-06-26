package com.Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		//RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize chrome browser page	
		driver.get("https://www.irctc.co.in/nget/train-search"); // link which we have to give
	
		//File
		TakesScreenshot scrshot = (TakesScreenshot) driver; //we did casting & converted to driver	
		File sourceFile = scrshot.getScreenshotAs(OutputType.FILE);  //Call getScreenshotAs method to create image file
		File destFile = new File("./Screenshots/img1.jpg");                  //Move image file to new destination
		FileUtils.copyFile(sourceFile, destFile);                         //Copy file at destination
		System.out.println("Screenshot saved successfully");
		driver.quit();
		
		
		
		
		
		
		
	}
}

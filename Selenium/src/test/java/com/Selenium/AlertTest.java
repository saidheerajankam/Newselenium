package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {
	//public static void main(String[] args) throws Exception {
		public void MyFirstTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); // link which we have to give

		//Alert Box - 2 Operations
	//	System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		//Confirm Box - 3 Operations
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("confirmBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		
//
//		driver.findElement(By.id("confirmBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		//Prompt Box - 4 Operations
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("promptBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("Sai Dheeraj");
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("promptBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.id("output")).getText());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
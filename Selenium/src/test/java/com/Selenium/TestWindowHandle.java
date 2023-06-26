package com.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowHandle {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // to import
		driver.manage().window().maximize(); // to maximize chrome browser page

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); // link which we have to give

//		//Single window
//		String parentWindowHandle = driver.getWindowHandle();
//		System.out.println("parent window handle - "+parentWindowHandle + driver.getTitle());
//		driver.findElement(By.id("newWindowBtn")).click();
//		Thread.sleep(3000);
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String windowHandle : windowHandles) {
//			if (!windowHandle.equals(parentWindowHandle)) {
//				driver.switchTo().window(windowHandle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("Sai Dheeraj");
//				Thread.sleep(3000);
//				driver.close();
//			}
//			
//	//		System.out.println(windowHandle + driver.getTitle());
//			
//		}
//		driver.switchTo().window(parentWindowHandle);
//		driver.findElement(By.id("name")).sendKeys("Sai Dheeraj");
//		Thread.sleep(3000);		
//	driver.quit();

		// Single window
		String parentWindowHandle = driver.getWindowHandle(); 
		System.out.println("Parent window handle - " + parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);

				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Sai Dheeraj");
		Thread.sleep(3000);
		driver.quit();

	}
}
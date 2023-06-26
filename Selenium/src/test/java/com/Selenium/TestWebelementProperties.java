package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebelementProperties {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://github.com/login");
		
//		System.out.println(driver.findElement(By.name("commit")).getTagName());
//		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
//		WebElement usernameTxt = driver.findElement(By.id("login_field"));
//		usernameTxt.sendKeys("sai@gmail.com");
//		System.out.println(usernameTxt.getAttribute("value"));
//		System.out.println(driver.findElement(By.xpath("//*[@for='login_field']")).getText());
//		driver.quit();
		
//		System.out.println(driver.findElement(By.name("commit")).getCssValue("background"));
		
		
		
}
}
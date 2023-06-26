package com.Selenium;

//WebDriverManager.chromedriver().setup(); // to open chrome browser
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
//WebDriver driver = new ChromeDriver(options); //to import
//driver.manage().window().maximize(); // to maximize chrome browser page
//driver.get("https://github.com/login");  // link which we have to give
//Thread.sleep(3000); // 3seconds time we are giving here.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;

	@BeforeTest
	public void InitialiseBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

//	@Test
//	public void LaunchApp() {
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//	}

	@Test
	public void EnterLoginDetails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}

	@Test
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
	}

	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
	}
}
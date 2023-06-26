package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxes {
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup(); // to open chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); //to import
		driver.manage().window().maximize(); // to maximize chrome browser page
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");  // link which we have to give
		Thread.sleep(3000); // 3seconds time we are giving here.
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));
		hindiChk.click(); //check
		Thread.sleep(3000);
		if(hindiChk.isSelected())
			hindiChk.click(); //uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		
		
	}
}
package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import javax.swing.text.Highlighter.Highlight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.ScreenshotException;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters {
	public void MyFirstTest() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	//	driver.get("https://www.myatos.net/irj/portal");
		driver.get("https://github.com/login");  // link which we have to give
		Thread.sleep(3000); // 3seconds time we are giving here.
		highlight(driver, driver.findElement(By.id("login_field"))); //highlight method is selenium 
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.linkText("Forgot password?"))); // complete name
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an"))); // Like nick name or half name.
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
		
		
	}
	
	
	public void Myclassnew() throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.myatos.net/irj/portal");

			driver.findElement(By.xpath("//*[@class=\"atosIconFont atosIconFont-clock_dotted_arrow\"]")).click();
			driver.findElement(By.xpath("//*[@name='com.siemens.dxa.applications.web.authn.challenging.username']"))
					.sendKeys("A865821");
			driver.findElement(By.xpath("//*[@name='com.siemens.dxa.applications.web.authn.challenging.response']"))
					.sendKeys("Explore1629@");
			driver.findElement(By.xpath("//*[@name='com.siemens.dxa.applications.web.authn.challenging.response2']"))
					.click();
			Thread.sleep(10000);

			WebElement element = driver.findElement(By.xpath("//*[@value='Login']"));

			element.click();
		
	}
	
	

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",
				element);
	}

}

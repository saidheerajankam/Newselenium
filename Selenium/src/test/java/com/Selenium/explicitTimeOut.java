package com.Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.runtime.Runtime.CallFunctionOnResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitTimeOut {
	public void MySecondTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);		
		driver.manage().window().maximize();
	//	WebDriverWait wait = new WebDriverWait(driver,10);
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		driver.get("https://testproject.io/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
//				Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
//					@Override
//					public Boolean apply(WebDriver WebDriver) {
//						return WebDriver.findElement(By.id("username")).isDisplayed();
//					}
//					};
					
				
			
		//		wait.until(f);
			//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("SAI");
			}
		}
		}
}

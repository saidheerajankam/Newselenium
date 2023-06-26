package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v109.browser.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mainclass extends Locaters {

	

	
	
	@Test(priority = 1 , enabled = false)
	public void test1() throws Exception{
		Mainclass M1 = new Mainclass();
		M1.MyFirstTest();		
	}
	
	@Test(priority = 2 , enabled = true)
	public void test2() throws Exception{
		Mainclass M1 = new Mainclass();
		M1.Myclassnew();		
	}

	
	
	
	
//	@Test(priority = 2 , enabled = true)
//	public void test2() throws Exception{
//		Mainclass M1 = new Mainclass();
//		M1.MySecondTest();		
//	}
	
	
}
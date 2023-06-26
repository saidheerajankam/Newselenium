package Realtimeprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class myatos {
	WebDriver driver;

	@BeforeTest
	public void InitialiseBrowser() throws InterruptedException {
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

	public void clickByActions(WebElement element) {
		Actions builder = new Actions(driver);
		Action click = builder.click(element).build();
		click.perform();
	}

}

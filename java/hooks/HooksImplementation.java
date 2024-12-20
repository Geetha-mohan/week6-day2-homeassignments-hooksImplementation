package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import base.ProjectSpecificMethos;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends ProjectSpecificMethos {
	
	@Before
	public void preConditions() {
		options = new EdgeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");

		driver = new EdgeDriver((EdgeOptions) options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//login
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
	}
	
	@After
	public void postConditions() {
		driver.quit();
	}

}

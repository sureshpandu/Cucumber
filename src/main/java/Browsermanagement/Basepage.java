package Browsermanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Basepage {
	
	WebDriver driver;
	
	@Before
	
	public void browser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E://Automationtools//chromedriver.exe");
		driver=new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
	

}

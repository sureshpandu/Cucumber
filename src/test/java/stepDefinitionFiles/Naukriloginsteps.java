package stepDefinitionFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Naukriloginsteps {
	
	WebDriver driver;
	
	
	
	@Given("^Navigate to naukri home page click on login$")
	public void navigate_to_naukri_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","E://Automationtools//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("login_Layer")).click();
	
	}
	
	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		
		
		driver.findElement(By.name("email")).sendKeys("suresh.pvr@outlook.com");
		driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("Suresh594@");
		}
	

	@And("^click on enter$")
	public void click_on_enter() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@value='Login']")).click();
	}

	@Then("^logged in successfully$")
	public void logged_in_successfully() throws Throwable {
		System.out.println("logged in successfully");
		driver.findElement(By.xpath(".//*[@id='colL']/div[2]/div[1]/a[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(".//*[@id='uploadLink']")).click();
		driver.findElement(By.xpath(".//*[@id='attachCV']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\suresh\\Desktop\\autoit\\resumeupload1.exe");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='editForm']/div[7]/button")).click();
		driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]")).click();
		driver.findElement(By.xpath(".//*[@id='mainHeader']/div/div/ul[2]/li[2]/div/ul/li[5]/a")).click();
         driver.quit();
	   
	}


}

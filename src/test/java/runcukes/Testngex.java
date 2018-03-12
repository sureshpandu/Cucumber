package runcukes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngex {
	WebDriver driver;
	
	@Test
	public void open() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E://Automationtools//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.name("email")).sendKeys("suresh.pvr@outlook.com");
		driver.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("Suresh594@");
		driver.findElement(By.xpath(".//*[@value='Login']")).click();
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

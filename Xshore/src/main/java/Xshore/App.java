package Xshore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
	public WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome Browser Opened");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://xshore.com/xshore-1");
		Thread.sleep(3000);
		
	}

	@Test(priority = 1)
	public void doLogin() throws InterruptedException {
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		System.out.println("click on accept Cookies");
		Thread.sleep(2000);
		
		driver.findElement(By.id("downaerrow")).click();
		System.out.println("click on down arrow");
		Thread.sleep(2000);
	}
	
	
		
		
	
	}
	


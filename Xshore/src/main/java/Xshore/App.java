package Xshore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome Browser Opened");
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://xshore.com/xshore-1");
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void Openwebsite() throws InterruptedException {

		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		System.out.println("click on accept Cookies");
		Thread.sleep(2000);
		
		

	}

	@Test(priority = 2)
	public void eelex8000() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='button']//img")).click();
		System.out.println("click on Menu");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='html-body']/div[3]/header/div[2]/div[1]/ul/div/li[1]/a")).click();
		System.out.println("click on eelex800");
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void SeaTrialandDesignOrder() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='html-body']/div[3]/header/div[1]/div[2]/div/div[2]/div/ul/li/a[contains(text(),'Sea Trial')]"))
				.click();
		System.out.println("click on SeaTrial Menu");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='html-body']/div[3]/header/div[1]/div[1]/div/div[2]/div/ul/li[5]/a")).click();
		System.out.println("click on Design & Order");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div/div/div[1]/div[2]/div/a")).click();
		System.out.println("click on Design & Order Eelex 8000");
		Thread.sleep(2000);
		
		
	}
	@Test(priority = 4)
	public void Technology() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='html-body']/div[3]/header/div[1]/div[1]/div/div[2]/div/ul/li[3]/a")).click();
		System.out.println("click on FAQ");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button']//img")).click();
		System.out.println("click on Menu");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='html-body']/div[3]/header/div[2]/div[1]/ul/div/li[5]/a")).click();
		System.out.println("click on Technology");
		Thread.sleep(2000);
		
	
		
		
	
	}
	
	
	

}


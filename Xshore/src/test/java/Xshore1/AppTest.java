package Xshore1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Xshore.App;




public class AppTest extends App
{
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

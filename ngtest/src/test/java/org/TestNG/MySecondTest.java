package org.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySecondTest {

	@Test(description="searching for iphone")
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.RETURN);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}

}

package org.mdt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vatadepalli\\Desktop\\Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//		String title = driver.getTitle();
//		System.out.println(title);
		
/*		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement submit = driver.findElement(By.id("u_0_3"));

		email.sendKeys("mazhaemail@tuzhaemail.com");
		password.sendKeys("konachPassword");
		submit.submit();
*/
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Vijaya Aditya");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Tadepalli");
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("8206378277");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("monsterTruck76@");
		
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("17");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jun");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
//		year.selectByIndex(10);
		year.selectByVisibleText("1994");
		
	    WebElement sex = driver.findElement(By.id("u_0_7"));
	    sex.click();
	    
	    WebElement button = driver.findElement(By.name("websubmit"));
	    button.click();

		String text = driver.findElement(By.id("js_be")).getText();
		System.out.println("Erro :" + text);
	    

	}

}

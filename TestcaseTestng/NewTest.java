package TestcaseTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver driver;
  @BeforeMethod
  void OpenApp() {
	  	driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
  }
  @Test
  void Sortby() throws InterruptedException {
	  driver.findElement(By.xpath("//a[@title='Food']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sort By']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Sort-2' and text() = 'Rating']")).click();  
  }
  @Test
  void Login() {
	  driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("mobile")).sendKeys("9867541236");
  }
  @AfterMethod
  void Logout() {
	  driver.quit();
	  
  }
}

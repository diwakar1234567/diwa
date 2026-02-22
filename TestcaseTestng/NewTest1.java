package TestcaseTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  @Test(priority = 1)
  void Openapp() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://instagram.com/");
  }
  @Test(priority = 2)
  void Login() {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ig_diwa_");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("diwakar12");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test(priority = 3)
  void Quit() {
	  driver.quit();
  }
}

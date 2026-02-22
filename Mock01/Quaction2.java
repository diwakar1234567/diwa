package Mock01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quaction2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("diwakar");
		driver.findElement(By.id("LastName")).sendKeys("K");
		driver.findElement(By.name("Email")).sendKeys("diwakar@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("diwa12");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("diwa12");
		driver.quit();
		

	}

}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assingment6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Diwakar");
        driver.findElement(By.id("LastName")).sendKeys("K");
        driver.findElement(By.id("Email")).sendKeys("diwakar@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Diwa23");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Diwa23");
        driver.quit();
	}

}

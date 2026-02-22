package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment17 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zeptonow.com/");
		driver.findElement(By.xpath("//span[text()='Search for']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='ADD'])[1]")).click();
		driver.findElement(By.xpath("//button[@data-testid='auto-address-btn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='ADD'])[3]")).click();
		driver.findElement(By.xpath("(//img[@data-testid='product-card-image']/preceding::button)[04]")).click();
		driver.close();
		
	}

}

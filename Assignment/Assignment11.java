package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//span[text()='25.00' or text()='50.00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}

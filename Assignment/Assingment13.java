package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[@title='Food']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sort By']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Sort-2' and text() = 'Rating']")).click();
		driver.quit();

	}

}

package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSurronding {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com");
		Thread.sleep(5000);
		driver.findElement(By.id("men")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='nike shues']/../..//button[@type='button']")).click();

	}

}

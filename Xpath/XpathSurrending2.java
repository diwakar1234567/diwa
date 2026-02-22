package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSurrending2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//div[text()='Jul 2025']/../..//li[@id='snd_4_10/07/2025']")).click();
		String Date =driver.findElement(By.xpath("//span[@id='ddayno']")).getText();
		System.out.println(Date);
		
	}

}

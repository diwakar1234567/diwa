package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocater {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("diwakar");
		driver.findElement(By.name("password")).sendKeys("diwakar121");
		driver.findElement(By.tagName("button")).click();
		driver.quit();
	}

}

package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelecter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Phone");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.quit();
		
		
	}

}

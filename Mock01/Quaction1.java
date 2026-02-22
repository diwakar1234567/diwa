package Mock01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quaction1 {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("9874561230");
		driver.findElement(By.id("pass")).sendKeys("diwa987456");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}

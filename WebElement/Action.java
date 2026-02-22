package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.id("small-searchterms"));
		element.sendKeys("Mobile");
		element.clear();
		element.sendKeys("Mobile");	
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		driver.quit();
	}

}

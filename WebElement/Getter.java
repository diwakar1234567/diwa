package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Health Book']/../..//input[@value='Add to cart']")).click();
		String text = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		System.out.println("The Text of the message "+ text);
	}

}

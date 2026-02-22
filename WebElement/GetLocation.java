package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
	Point posistionofthepage =  driver.manage().window().getPosition();
		 System.out.println(" Position of the webpage " + posistionofthepage);
		Point Element = driver.findElement(By.xpath("//div[text()='Log in']")).getLocation();
		System.out.println(" Location of the webelement " + Element);
		System.out.println(" X axis of the webelement " + Element.getX());
		System.out.println(" Y axis of the webelement " + Element.getY());
		driver.quit();
	}

}

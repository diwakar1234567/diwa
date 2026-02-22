package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 Dimension Sizeofthepage =  driver.manage().window().getSize();
		 System.out.println("Size of the webpage " + Sizeofthepage);
		Dimension Element = driver.findElement(By.xpath("//div[text()='Log in']")).getSize();
		System.out.println(" Size of the webelement " + Element);
		System.out.println(" Hight of the webelement " + Element.getHeight());
		System.out.println(" Width of the webelement " + Element.getWidth());
		driver.quit();
	}

}

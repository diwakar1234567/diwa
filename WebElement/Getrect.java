package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getrect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Rectangle Element = driver.findElement(By.xpath("//div[text()='Log in']")).getRect();
		System.out.println("The Size and location  " + Element);
		System.out.println("The Hight of the element " + Element.getHeight());
		System.out.println("The Width of the element " + Element.getWidth());
		System.out.println("The X axis of the element " + Element.getX());
		System.out.println("The Y axis of the element " + Element.getY());
		driver.quit();
		
		//navigat to facebook without get method 
		//mavigate to instagrame without using get method 
		//perform forward back and refresh method 
	}

}

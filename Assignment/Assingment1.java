package Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String Title = driver.getTitle();
		String Url = driver.getCurrentUrl();
		System.out.println("The Title of the page is "+ Title);
		System.out.println("The Url of the page is "+ Url);
		driver.manage().window().setPosition(new Point(-4,-5));
	}

}

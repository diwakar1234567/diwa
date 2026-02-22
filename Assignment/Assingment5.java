package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		System.out.println("The Window id is "+ driver.getWindowHandle());
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().refresh();
		System.out.println("The Window id is "+ driver.getWindowHandle());		
	}
}

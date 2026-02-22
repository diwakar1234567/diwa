package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().refresh();
		System.out.println("The title of the WebPage is "+ driver.getTitle());
		driver.quit();
	}
}
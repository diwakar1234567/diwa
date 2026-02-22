package chromdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cars24.com/");
		String Title = driver.getTitle();
		System.out.println("Title of webpage is "+ Title);
		String Url = driver.getCurrentUrl();
		System.out.println("Title of webpage is "+ Url);
		driver.quit();
		WebDriver driver1 = new ChromeDriver();
		driver1.close();
	}

}

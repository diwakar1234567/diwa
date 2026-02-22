package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println("The Url of WebPage is "+ driver.getCurrentUrl());
		driver.quit();
	}

}

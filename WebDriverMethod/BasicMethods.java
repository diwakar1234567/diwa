package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    String Title =	driver.getTitle();
		System.out.println("Title of the Webpage is "+ Title);
	    String Url =driver.getCurrentUrl();
		System.out.println("The Url of WebPage is "+ Url);
		String PageSource = driver.getPageSource();
		System.out.println("The page source is " + PageSource);
	    driver.get("https://www.instagram.com/");
		String Title1 =	driver.getTitle();
		System.out.println("Title of the Webpage is "+ Title1);
		String Url1 = driver.getCurrentUrl();
		System.out.println("The url of Webpage is "+ Url1);
		String PageSource1 = driver.getPageSource();
		System.out.println("The page source is " + PageSource1);
		
	   
	}
	
}
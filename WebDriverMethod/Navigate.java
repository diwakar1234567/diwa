package WebDriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");	
		driver.navigate().to(new URL("https://www.instagram.com/"));
		driver.navigate().back();
	String Url=	driver.getCurrentUrl();
	System.out.println("The url of Webpage is "+Url);
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}

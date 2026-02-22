package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPENCHROME {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\Chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        System.out.println("Browser opened");
        driver.manage().window().maximize();
        System.out.println("Browser maximised");
        driver.close();
        System.out.println("Browser closed");
	}
}

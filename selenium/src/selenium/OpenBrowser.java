package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenBrowser {
	public WebDriver Open(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(Inputs.link);
	        driver.manage().window().maximize();
	        return driver;
	}
}
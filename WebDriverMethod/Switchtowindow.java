package WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtowindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allid =driver.getWindowHandles();
		allid.remove(parent);
		for(String ids : allid) {
			driver.switchTo().window(ids);
			driver.close();
		}
		Thread.sleep(2000);
		driver.quit();
	}

}

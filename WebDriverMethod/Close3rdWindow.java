package WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close3rdWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String ids : allid) {
			driver.switchTo().window(ids);
			String url =driver.getCurrentUrl();
			if(url.contains("https://www.youtube.com/user/nopCommerce")) {
				driver.close();
			}
		}
		driver.quit();
	}

}

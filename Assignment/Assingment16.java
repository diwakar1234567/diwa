package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment16 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        String parent =	driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allid = driver.getWindowHandles();
		allid.remove(parent);
		//Switch the Browser window 
		for (String id : allid) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.close();
		}
		driver.quit();
	}

}

package WebDriverMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> sid = driver.getWindowHandles();
		List<String> ids = new ArrayList<>(sid);
		/*for(String listid : ids) {
			driver.switchTo().window(listid);
			System.out.println("The Sid Is "+ listid + " Title of the window is "+ driver.getCurrentUrl());
		}*/
		if(ids.size() >=2) {
			driver.switchTo().window(ids.get(2));
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}

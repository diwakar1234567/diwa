package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions Act = new Actions(driver);
		driver.get("https://demowebshop.tricentis.com/");
		
		//WebElement Ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		//Act.scrollToElement(Ele).perform();
		//Ele.click();
		//Act.scrollByAmount(500, 500).perform();
		Act.moveByOffset(460, 195).perform();
		
		//driver.quit();
		
	}

}

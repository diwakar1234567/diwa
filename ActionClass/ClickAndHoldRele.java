package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldRele {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("Diwakakr");
		WebElement Eye =  driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
		Actions act = new Actions(driver);
		act.clickAndHold(Eye).perform();
		Thread.sleep(2000);
		act.release().perform();
		
		
	}

}

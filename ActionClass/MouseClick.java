package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/buttons");
		
		WebElement Ele = driver.findElement(By.id("doubleClickBtn"));
		WebElement Ele1 = driver.findElement(By.id("rightClickBtn"));
		WebElement Ele2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions Act = new Actions(driver);
		Act.doubleClick(Ele).perform();
		Act.contextClick(Ele1).perform();
		Act.click(Ele2).perform();
	}

}

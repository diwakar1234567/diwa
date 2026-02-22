package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment15 {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tnstc.in/OTRSOnline/");
		driver.findElement(By.id("txtdeptDateOtrip")).click();
 WebElement Option =	driver.findElement(By.xpath("//select[@data-event='change']"));
		Select op2 = new Select(Option);
		op2.selectByIndex(1);
		driver.findElement(By.xpath("//span[text()='2025']/../../..//a[text()='23']")).click();
		driver.quit();
	}

}

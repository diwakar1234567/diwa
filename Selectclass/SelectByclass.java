package Selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByclass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement ele = driver.findElement(By.id("day"));
		Select Day = new Select(ele);
		Day.selectByValue("12");
		
		WebElement ele1 = driver.findElement(By.id("month"));
		Select Month = new Select(ele1);
		Month.selectByIndex(9);
		
		WebElement ele2 = driver.findElement(By.id("year"));
		Select Year = new Select(ele2);
		Year.selectByVisibleText("1999");

}
}
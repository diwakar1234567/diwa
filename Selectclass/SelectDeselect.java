package Selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Books")).click();
		
		WebElement Ele = driver.findElement(By.xpath("//span[text()='Sort by']/..//select[@id='products-orderby']"));
		Select Sortby =new Select(Ele);
		Sortby.selectByVisibleText("Price: Low to High");
		
		WebElement Ele1 = driver.findElement(By.id("products-pagesize"));
		Select Display =new Select(Ele1);
		Display.selectByIndex(1);
		
		WebElement Ele2 = driver.findElement(By.id("products-viewmode"));
		Select View =new Select(Ele2);
		View.selectByVisibleText("List");
	}

}

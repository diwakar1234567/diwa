package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConyains {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@type='submit'and @value='Log in']")).click();
   WebElement errormes = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]"));
		System.out.println(errormes.getText());
      /*  String errormes = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
		System.out.println(errormes);
*/		driver.quit();
		}

}

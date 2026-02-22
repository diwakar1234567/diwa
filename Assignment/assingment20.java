package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingment20 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		WebElement Element = driver.findElement(By.xpath("//span[contains (text(),'Login was unsuccessful.')]"));
		if (Element.isDisplayed()) {
			System.out.println("Log in Not Succesfull : " + Element.getText());
		}
		else 
		{
			System.out.println("Login Succes");
		}
		Thread.sleep(4000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Fiction']/../..//input[@value='Add to cart']")).click();
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().to("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("diwakar");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("diwakar11");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		WebElement Element1 = driver.findElement(By.xpath("//div[contains (text(),'Sorry, your password was incorrect.')]"));
		if (Element1.isDisplayed()) {
			System.out.println("Log in Not Succesfull : " + Element1.getText());
		}
		else 
		{
			System.out.println("Login Succes");
		}
		
		driver.quit();
	}

}

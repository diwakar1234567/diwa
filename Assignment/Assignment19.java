package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment19 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//List will return the button element
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Continue shopping']"));
		//is the list is empty it will return true and ! will change to false 
		//is the list is not empty it will become false and ! will change to true 
        //the list is not empty next condition will be checked and 
        //is displayed it will be clicked using the index of the list
		if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
			elements.get(0).click(); // ✅ click on the button WebElement
		}
		Thread.sleep(2000);
		WebElement element =driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Iphone");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();
		Thread.sleep(2000);
	String msgtext =driver.findElement(By.xpath("//b[text()=' Your order is eligible for FREE Delivery. ']")).getText();
		Thread.sleep(2000);
		System.out.println(msgtext);
		driver.quit();
	}

}

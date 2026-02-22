package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAddress {

	public static void main(String[] args) {
		OpenBrowser open =new OpenBrowser();
		WebDriver driver = open.Open();
		LogIn login =new LogIn();
		login.loginToSite(driver);
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("(//input[@type=\"button\"])[5]")).click();
		driver.switchTo().alert().accept();
		if(driver.findElements(By.xpath("(//input[@type=\"button\"])[5]")).size()>3) {
			System.out.println("Address not deleted");
		}
		else
		{
			System.out.println("Address is deleted");
		}
	
	}

}

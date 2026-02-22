package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAddress {

	public static void main(String[] args) {
		OpenBrowser open =new OpenBrowser();
	WebDriver driver = open.Open();
	LogIn login =new LogIn();
	login.loginToSite(driver);
	driver.findElement(By.linkText("My account")).click();
	driver.findElement(By.linkText("Addresses")).click();
	driver.findElement(By.className("add-address-button")).click();
	driver.findElement(By.id("Address_FirstName")).sendKeys(Inputs.FirstName);
	driver.findElement(By.id("Address_LastName")).sendKeys(Inputs.LastName);
	driver.findElement(By.id("Address_Email")).sendKeys(Inputs.Email);
	driver.findElement(By.id("Address_CountryId")).sendKeys("India");
	driver.findElement(By.id("Address_City")).sendKeys(Inputs.City);
	driver.findElement(By.id("Address_Address1")).sendKeys(Inputs.Address1);
	driver.findElement(By.id("Address_ZipPostalCode")).sendKeys(Inputs.ZipPostalCode);
	driver.findElement(By.id("Address_PhoneNumber")).sendKeys(Inputs.PhoneNumber);
	driver.findElement(By.className("save-address-button")).click();
	
	if (driver.findElements(By.className("edit-address-button")).size() > 0) {
		System.out.println("The Edit Button is vissible");
	}
	else 
	{
		System.out.println("The Edit Button is  vissible");
	}
	}
}

package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Register {
	public void RegLog(WebDriver driver) {
		 driver.findElement(By.linkText("Register")).click();
	        System.out.println("Current page URL"+ driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/register"));
	        driver.findElement(By.id("gender-male")).click();
	        driver.findElement(By.id("FirstName")).sendKeys(Inputs.FirstName);
	        driver.findElement(By.id("LastName")).sendKeys(Inputs.LastName);
	        driver.findElement(By.id("Email")).sendKeys(Inputs.Email);
	        driver.findElement(By.id("Password")).sendKeys(Inputs.Password);
	        driver.findElement(By.id("ConfirmPassword")).sendKeys(Inputs.ConfirmPassword);
	        driver.findElement(By.id("register-button")).click();
	        System.out.println("Current page URL"+ driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/registerresult/1"));
	}
}
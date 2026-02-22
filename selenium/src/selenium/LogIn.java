package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LogIn {
 public void loginToSite(WebDriver driver) {
	        driver.findElement(By.linkText("Log in")).click();    
	        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Inputs.Email);
	        driver.findElement(By.cssSelector("input[id='Password']")).sendKeys(Inputs.Password);
	        System.out.println("Title after login: " + driver.getTitle());
	        driver.findElement(By.className("login-button")).click();
	        System.out.println("Login attempted");
    }
}
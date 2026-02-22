package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LogOut {
 public void logOutSite(WebDriver driver) {
     driver.findElement(By.linkText("Log out")).click();
     System.out.println("Successfully logged out");
 }
}
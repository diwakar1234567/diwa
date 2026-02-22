package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RegisterSS {

	public static void main(String[] args) throws IOException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Diwakakr");
			driver.findElement(By.id("LastName")).sendKeys("K");
			driver.findElement(By.id("Email")).sendKeys("K123@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("K1231d");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("K1231d");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File  tep =ts.getScreenshotAs(OutputType.FILE);
			File per = new File("./SSfile/Rig.jpg");
			FileHandler.copy(tep, per);
			}

}

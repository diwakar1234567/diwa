package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment8 {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://track.meramonitor.com/");
		driver.findElement(By.id("form-field-input-c56c086b-d8e9-435e-56de-cd63d85846c9-comp-m9vm02ep3-")).sendKeys("Diwakar");
		driver.findElement(By.id("form-field-input-989fd093-be53-4cca-3fbf-e40483ce388e-comp-m9vm02ep3-")).sendKeys("Diwa@gmail.com");
		driver.findElement(By.id("form-field-input-8e720e64-fdc3-42f2-5a98-e6fed2f7afd9-comp-m9vm02ep3-")).sendKeys("9876543210");
		driver.findElement(By.id("form-field-input-be012384-6bcd-4ccd-b047-8c4c5d708706-comp-m9vm02ep3-")).sendKeys("Diwail.com");
		driver.quit();
	}

}

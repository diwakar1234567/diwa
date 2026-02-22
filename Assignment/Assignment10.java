package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kodi aruvi kottuthe song");
		driver.findElement(By.xpath("//button[@title='Search' and @class='ytSearchboxComponentSearchButton ytSearchboxComponentSearchButtonDark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@tabindex='-1' and @id='thumbnail' and @rel='null']")).click();
	}

}

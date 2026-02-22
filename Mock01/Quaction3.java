package Mock01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quaction3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("kodi aruvi song");
		driver.findElement(By.cssSelector("button[title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@style='background-color: transparent;'])[3]")).click();
		driver.quit();
		//div[@class='_highlighter-box_1i14u_349'][10]

	}

}

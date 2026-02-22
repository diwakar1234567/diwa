package WebElement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		String att =   driver.findElement(By.id("small-searchterms")).getAttribute("name");
		System.out.println(att);
		//navigate to amazon enter iphone in the search box clear the text enter samsung on the search box 
		//click on search button 
		//navigate to amazon 
		//search for iphone click on 3rd add to cart button 
		//capture the message text 
	}

}

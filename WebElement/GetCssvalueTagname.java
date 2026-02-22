package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssvalueTagname {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		WebElement element = driver.findElement(By.partialLinkText("Try actiTIME"));
	System.out.println( "The color of the Text is "+ element.getCssValue("color"));
	System.out.println( "The font of the Text is "+ element.getCssValue("font-size"));
	System.out.println( "The BG color of the Text is "+ element.getCssValue("background-color"));
	System.out.println( "The color of the tagname is "+ element.getTagName());
	driver.quit();

	}

}

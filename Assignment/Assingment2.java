package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Dimension Size = driver.manage().window().getSize();
		System.out.println("The Size of the window is "+ Size);
		driver.manage().window().setSize(new Dimension(500, 700));
		Dimension ChangedSize = driver.manage().window().getSize();
		Point position =driver.manage().window().getPosition();
		System.out.println("The Size of the window is "+ ChangedSize +"The position is " + position);
	}

}

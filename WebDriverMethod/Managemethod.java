package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.manage().window().fullscreen();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dimension size = new Dimension(300, 300);
		driver.manage().window().setSize(size);
	   Point position =driver.manage().window().getPosition();
	   System.out.println(position);
	   System.out.println(position.getX());
	   System.out.println(position.getY());
	   Point position = new Point(-6, -6);
	   driver.manage().window().setPosition(position);*/
		driver.manage().window().setPosition(new Point(-6, -6));
		driver.quit();
}
}
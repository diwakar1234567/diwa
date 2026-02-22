package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AddCart{
	public void Cart(WebDriver driver) {
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
	    WebElement link = driver.findElement(By.partialLinkText("Shopping cart"));
	    	String linkText = link.getText();
	    	System.out.println("Text of the Shopping cart" +linkText);
	    driver.findElement(By.id("add-to-cart-button-13")).click();
	    WebElement link1 = driver.findElement(By.linkText("Shopping cart"));
    	String linkText1 = link1.getText();
    	System.out.println("Text of the Shopping cart"+ linkText1);
		driver.findElement(By.linkText("Shopping cart")).click();
		if (linkText.equalsIgnoreCase(linkText1)) {
			System.out.println("Product is not added");		
		}
		else
		{
			System.out.println("Product added Successfully");
		}
	}
}

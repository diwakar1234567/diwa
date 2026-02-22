package selenium;

import org.openqa.selenium.WebDriver;

public class AddToCart {
	public static void main(String[] args) {
		OpenBrowser open=new OpenBrowser();
		WebDriver driver=open.Open();
		LogIn login=new LogIn();
		login.loginToSite(driver);
		AddCart cart =new AddCart();
		cart.Cart(driver);
	}

}

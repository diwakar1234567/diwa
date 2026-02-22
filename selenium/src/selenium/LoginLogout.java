package selenium;
import org.openqa.selenium.WebDriver;
public class LoginLogout {
	public static void main(String[] args) {
		OpenBrowser open = new OpenBrowser();
		WebDriver driver = open.Open();
		LogIn login=new LogIn();
		login.loginToSite(driver);
		LogOut logout= new LogOut();
		logout.logOutSite(driver);
		System.out.println("Browser closed");
		driver.close();
	}
}
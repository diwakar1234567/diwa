package selenium;
import org.openqa.selenium.WebDriver;
public class RegisterLogout {
	public static void main(String[] args) {
		OpenBrowser open=new OpenBrowser();
		WebDriver driver =open.Open();
        Register reg =new Register();
        reg.RegLog(driver);
        LogOut log=new LogOut();
        log.logOutSite(driver);
	}
}
package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {

    public static void main(String[] args) {
        OpenBrowser open = new OpenBrowser();
        WebDriver driver = open.Open();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait object

        LogIn login = new LogIn();
        login.loginToSite(driver);

        AddCart cart = new AddCart();
        cart.Cart(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CountryId"))).sendKeys("India");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("termsofservice"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("opc-billing")));
        new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("billing-address-select")))).selectByIndex(1);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"button\"])[2]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("PickUpInStore"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"button\"])[3]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("opc-payment_method")));
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.id("paymentmethod_0"), true));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"button\"])[5]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("opc-payment_info")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout-payment-info-load")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"button\"])[6]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("opc-confirm_order")));
        String Url1 = driver.getCurrentUrl();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type=\"button\"])[7]"))).click();
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(Url1)));
        String Url2 = driver.getCurrentUrl();

        if (Url1.equals(Url2)) {
            System.out.println("Order not placed: " + Url2);
        } else {
            System.out.println("Order is placed: " + Url2);
        }

  
    }
}

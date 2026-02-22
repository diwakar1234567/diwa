package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assingment14 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement button = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
            if (button.isDisplayed()) {
                button.click();

                // Wait for "Mobiles" link to be clickable after popup disappears
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobiles']")));
            }
        } catch (Exception e) {
            System.out.println("Continue shopping button not found or not visible. Proceeding to next step.");
        }

        // Continue after wait
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();0

       driver.findElement(By.xpath("//span[text()='Apple']/../..//a[@class='a-link-normal']")).click();
    }
}

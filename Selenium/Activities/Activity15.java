import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Activity15 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        WebElement Username = driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));

        Username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);


    }
}


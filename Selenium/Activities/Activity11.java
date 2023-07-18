import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.v1.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the checkbox and click it
        driver.findElement(By.name("toggled")).click();
        System.out.println("Checkbox is selected: " + driver.findElement(By.name("toggled")).isSelected());
        driver.findElement(By.name("toggled")).click();
        System.out.println("Checkbox is selected: " + driver.findElement(By.name("toggled")).isSelected());

        // Close the browser
        driver.close();
    }
}

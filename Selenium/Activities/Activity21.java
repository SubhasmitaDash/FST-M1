import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity21 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.v1.training-support.net/selenium/tab-opener");
        System.out.println("Home page title: " + driver.getTitle());

        System.out.println("Current tab: " + driver.getWindowHandle());
        driver.findElement(By.id("launcher")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Currently open windows: " + driver.getWindowHandles());

        // Switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Current tab: " + driver.getWindowHandle());
        System.out.println("Page title: " + driver.getTitle());
        String pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        driver.findElement(By.id("actionButton")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        // Close the browser
        driver.quit();
    }
}

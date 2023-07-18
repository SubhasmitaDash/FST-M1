import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriver driver = new FirefoxDriver();   //launching webdriver
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
        checkbox.click();
        // Wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());
        // Click the button again
        checkbox.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());

        // Close the browser
        driver.close();
    }
}

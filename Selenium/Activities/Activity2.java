import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriver driver=new FirefoxDriver();   //launching webdriver
        driver.get("https://training-support.net/selenium/login-form"); //navigating to website
        String Title=driver.getTitle();   //Getting title
        System.out.println(Title);

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));

        driver.findElement(By.className("ui button")).click();
        driver.close();

    }
}

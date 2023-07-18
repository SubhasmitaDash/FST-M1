import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriver driver=new FirefoxDriver();   //launching webdriver
        driver.get("https://training-support.net/"); //navigating to website
        String Title=driver.getTitle();   //Getting title
        System.out.println(Title);

        driver.findElement(By.id("about-link")).click();
        String newTitle=driver.getTitle();
        System.out.println(newTitle);
    }
}

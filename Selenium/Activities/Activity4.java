import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriver driver=new FirefoxDriver();   //launching webdriver
        driver.get("https://www.training-support.net/selenium/target-practice"); //navigating to website
        String Title=driver.getTitle();   //Getting title and printing to console
        System.out.println(Title);

        String ThirdText=driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println(ThirdText);

        String FifthText= driver.findElement(By.xpath("//h5[contains(@class,'ui green header')]")).getText();
        System.out.println(FifthText);

        //Getting violet Class
        System.out.println(driver.findElement(By.xpath("//button[contains(@class,'ui violet button')]")).getAttribute("class"));
        //Getting Grey button
        System.out.println(driver.findElement(By.xpath("//button[contains(@class,'ui grey button')]")).getAttribute("class"));

        driver.close();

    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();

        driver.get("https://www.v1.training-support.net/selenium/input-events");
        String Title=driver.getTitle();  //Getting Title of the page

        Actions act=new Actions(driver);
        act.sendKeys("S").build().perform();
        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        driver.quit();
    }

}

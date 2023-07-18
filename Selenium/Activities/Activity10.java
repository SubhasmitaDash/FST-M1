import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String Title=driver.getTitle();
        System.out.println(Title);

        Boolean result=driver.findElement(By.id("dynamicCheckbox")).isSelected();
        System.out.println(result);
        Thread.sleep(1000);
        driver.findElement(By.id("toggleCheckbox")).click();
        Boolean newresult=driver.findElement(By.id("toggleCheckbox")).isDisplayed();
        System.out.println(newresult);

        driver.quit();

    }
}

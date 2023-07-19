package Job_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class JobActivity5 {
    WebDriver driver=new FirefoxDriver();
    @Test
    public void JobsPage(){
        driver.navigate().to("https://alchemy.hguy.co/jobs/");
        WebElement navigation=driver.findElement(By.xpath("//span[@class='menu-toggle-icon']"));
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        String Title=driver.findElement(By.className("ast-site-identity")).getText();
        System.out.println(Title);
        Boolean Result=driver.findElement(By.xpath("//*[@id=\"post-7\"]/header/h1")).isDisplayed();
        System.out.println(Result);
        driver.close();

    }
}

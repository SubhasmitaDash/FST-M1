package Job_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobActivity3 {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
       driver=new FirefoxDriver();

    }

    @Test
    public void URLofHeaderImage(){
        driver.get("https://alchemy.hguy.co/jobs/");
        String URL=driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/div/img")).getAttribute("src");
        System.out.println(URL);
        driver.close();
    }
}

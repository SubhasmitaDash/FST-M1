package Job_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobActivity2 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @Test
    public void URLofTheHeaderImage(){
        driver.get("https://alchemy.hguy.co/jobs/");
        String Title=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        System.out.println("Title is "+Title);
        String ExpectedTitle="Welcome to Alchemy Jobs";
        //Assert.assertEquals("Title","ExpectedTitle");
        if(Title==ExpectedTitle){
            driver.close();
        }
    }
}

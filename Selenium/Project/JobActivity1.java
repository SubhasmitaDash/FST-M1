package Job_Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobActivity1 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void BeforeTest(){
        //Login to the portal by using UN and Pw
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-login.php?redirect_to=https%3A%2F%2Falchemy.hguy.co%2Fjobs%2Fjob-dashboard%2F");
        driver.findElement(By.name("log")).sendKeys("root");
        driver.findElement(By.name("pwd")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("wp-submit")).click();
    }
    @Test
    public void VerifyWebsiteTitle(){
        driver.get("https://alchemy.hguy.co/jobs/");
        String Title=driver.findElement(By.className("ast-site-identity")).getText();
        System.out.println("Title is "+Title);
        String ExpectedTitle="Alchemy Jobs – Job Board Application";
        //Assert
        Assert.assertEquals(ExpectedTitle,"Alchemy Jobs – Job Board Application");
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}

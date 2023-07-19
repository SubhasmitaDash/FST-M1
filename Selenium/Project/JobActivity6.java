package Job_Project.Activity6;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JobActivity6 {
    WebDriver driver=new FirefoxDriver();
    WebDriverWait wait;
    @BeforeTest
    public void ApplyToaJob(){
        driver.navigate().to("https://alchemy.hguy.co/jobs/");
        WebElement navigation=driver.findElement(By.xpath("//span[@class='menu-toggle-icon']"));
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();

    }
    @Test
    public void test() throws Exception {
        driver.findElement(By.linkText("Jobs")).click();
        WebElement textbox=driver.findElement(By.id("search_keywords"));
        textbox.sendKeys("Banking");
        driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/job/ibm-pune-6-bankingtestjob-7/']")).click();
        driver.findElement(By.xpath("//input[@class='application_button button']")).click();
        Thread.sleep(2000);
        String Text=driver.findElement(By.xpath("//a[@href='mailto:abhiram@cklabs.com?subject=Application%20via%20BankingTestJob%20listing%20on%20https%3A%2F%2Falchemy.hguy.co%2Fjobs']")).getText();
        System.out.println(Text);
        driver.quit();

    }

}

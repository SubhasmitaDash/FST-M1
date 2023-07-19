package Job_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JobActivity4 {
    WebDriver driver=new FirefoxDriver();
    @Test
    public void SecondHeading(){
        driver.get("https://alchemy.hguy.co/jobs/");
        String SecondHeading=driver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2")).getText();
        String ExpectedHeading="Quia quis non";
        System.out.println(SecondHeading);
        if(SecondHeading==ExpectedHeading)
            driver.close();
    }
}

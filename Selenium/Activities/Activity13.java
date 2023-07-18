import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriver driver = new FirefoxDriver();   //launching webdriver
        driver.get("https://training-support.net/selenium/tables"); //navigating to website
        String Title = driver.getTitle();   //Getting title and printing to console
        System.out.println(Title);
        //Finding number of rows
        System.out.println(driver.findElements(By.xpath("//table[contains(@class,'ui celled striped table')]/tbody/tr")).size());
        //Number of columns
        System.out.println(driver.findElements(By.xpath("//table[contains(@class,'ui celled striped table')]/tbody/tr[1]/td")).size());
        //print all the cell values in the third row of the table.
        List<WebElement> lst=driver.findElements(By.xpath("//table[contains(@class,'ui celled striped table')]/ tbody/tr[3]/td"));
        for (WebElement cellvalue:lst){
            System.out.println(cellvalue.getText());
        }
        //print the cell value at the second row second column.
        List<WebElement> lst2=driver.findElements(By.xpath("//table[contains(@class,'ui celled striped table')]/ tbody/tr[2]/td[2]"));
        for (WebElement cellvalue2:lst2){
            System.out.println(cellvalue2.getText());
        }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriver driver = new FirefoxDriver();   //launching webdriver
        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println(driver.getTitle());

        WebElement football=driver.findElement(By.xpath("//img[@id='draggable"));
        WebElement dropzone1= driver.findElement(By.xpath("//div[@id='droppable'"));
        WebElement dropzone2= driver.findElement(By.xpath("//div[@id='dropzone2'"));
        Actions act= new Actions(driver);
        act.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
        act.dragAndDrop(football,dropzone2).build().perform();

        driver.quit();
    }

}

package Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleTask {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @Test(priority = 1)
    public void test(){
       // driver.findElement(AppiumBy.id("welcome_get_started")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Create new task")));
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("add_task_done")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("task_name")));
        String FirstTask=driver.findElement(AppiumBy.id("task_name")).getText();
        System.out.println("First Task is "+FirstTask);
        Assert.assertEquals(FirstTask,"Complete Activity with Google Tasks");

    }
    @Test(priority = 2)
    public void test2(){
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Create new task")));
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("task_name")));
        String SecondTask=driver.findElement(AppiumBy.id("task_name")).getText();
        System.out.println("First Task is "+SecondTask);
        Assert.assertEquals(SecondTask,"Complete Activity with Google Keep");

    }
    @Test(priority = 3)
    public void test3(){
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Create new task")));
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("task_name")));
        String ThirdTask=driver.findElement(AppiumBy.id("task_name")).getText();
        System.out.println("First Task is "+ThirdTask);
        Assert.assertEquals(ThirdTask,"Complete the second Activity Google Keep");

    }
    @AfterTest
    public void teardown(){
        driver.quit();

    }
}

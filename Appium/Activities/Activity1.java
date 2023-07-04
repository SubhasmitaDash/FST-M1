import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity1 {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @Test
    public void activity(){
        driver.findElement(AppiumBy.id("digit_9")).click();
        driver.findElement(AppiumBy.id("op_mul")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("result_final")));
        driver.findElement(AppiumBy.id("eq")).click();
        System.out.println(driver.findElement(AppiumBy.id("result_final")).getText());


    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }


}

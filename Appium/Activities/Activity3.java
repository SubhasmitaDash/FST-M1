import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity3 {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    @Test
    public void activityPlus(){
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.id("digit_9")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("result")));
        String result = driver.findElement(AppiumBy.id("result")).getText();
        System.out.println("Result is "+result);
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }

}

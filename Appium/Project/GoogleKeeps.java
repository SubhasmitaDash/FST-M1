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

public class GoogleKeeps {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @Test
    public void test(){
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("edit_note_text")));
        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("TEST- Appium Project");
        //waiting for the presence of back button
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Navigate up")));
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        //Asser
        String Test=driver.findElement(AppiumBy.xpath("//androidx.cardview.widget.CardView[@content-desc=\"TEST- Appium Project. \"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(Test,"TEST- Appium Project");

    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}

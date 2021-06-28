import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class FramesWindows {
    WebDriver driver;
    public static final String DriverProperty = "webdriver.chrome.driver";
    public static final String LocalDriver = "src\\test\\WebDriver\\chromedriver.exe";

    @Test
    public void Frames() {
        System.setProperty(DriverProperty, LocalDriver);
         driver = new ChromeDriver();
         driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        String originalWindow = driver.getWindowHandle();
       final Set<String> oldWindowsSet = driver.getWindowHandles();
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("html/body/a/img")).click();
        Set<String> newWindowsSet = driver.getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        newWindowsSet.iterator().next();
        driver.switchTo().window(originalWindow);
        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@wmode='transparent']")));
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

    }
}

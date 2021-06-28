import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.DriverPropertyInfo;

public class StartingStoppingDriver {
    protected WebDriver driver;
   public static final String DriverProperty = "webdriver.chrome.driver";
    public static final String LocalDriver = "src\\test\\WebDriver\\chromedriver.exe";

@Test
    public void DriverPerform () {
    System.setProperty(DriverProperty, LocalDriver);
     driver = new ChromeDriver();
        driver.get("https://www.guru99.com/");
        driver.manage().window().maximize();


    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
    driver.findElement(By.linkText("Selenium")).sendKeys(selectLinkOpeninNewTab);
    driver.quit();
    }


}

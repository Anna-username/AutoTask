import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPath {
    WebDriver driver;
    public static final String DriverProperty = "webdriver.chrome.driver";
    public static final String LocalDriver = "src\\test\\WebDriver\\chromedriver.exe";
    @Test
    public void ExampleXpath(){
        System.setProperty(DriverProperty, LocalDriver);
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        driver.manage().window().maximize();
        By CSSName = By.cssSelector("input[name='emailid']");
        driver.findElement(CSSName).sendKeys("testert573@gmail.com");
        By Submit = By.cssSelector("input[type=submit]");
        driver.findElement(Submit).click();
        By Selenium = By.linkText("Selenium");
        driver.findElement(Selenium).click();
        By Auto = By.linkText("Selenium Auto IT");
        driver.findElement(Auto).click();
        By TextFind = By.xpath("//span[contains(@class,'button') and text()='Create A Course']");
        driver.findElement(TextFind).click();
        By IDFind = By.xpath("//span[@id='postjob']");
        driver.findElement(IDFind).click();


    }
}

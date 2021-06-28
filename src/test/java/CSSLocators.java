import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CSSLocators {
    WebDriver driver;
    WebDriverWait wait;
    public static final String DriverProperty = "webdriver.chrome.driver";
    public static final String LocalDriver = "src\\test\\WebDriver\\chromedriver.exe";
    public void Driver(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 150);

    }
    public void Selenium(){

    }
@Test
    public void Lcator() {
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
    By AttributeMatches = By.cssSelector("a[href=\"../../test/tooltip.html\"]");
    driver.findElement(AttributeMatches).click();
By Selenium2 = By.cssSelector("Selenium");
   // wait.until(ExpectedConditions.visibilityOfElementLocated(Selenium2));
    driver.findElement(Selenium2).click();
    By RadioDemo = By.linkText("Radio & Checkbox Demo");
    driver.findElement(RadioDemo).click();
    By Selectors = By.cssSelector("input[id='vfb-6-0']");
    driver.findElement(Selectors).click();


    }

}
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception {
    protected WebDriver driver;
    public static final String DriverProperty = "webdriver.chrome.driver";
    public static final String LocalDriver = "src\\test\\WebDriver\\chromedriver.exe";
    @Test
    public void Exceptions  (){
        System.setProperty(DriverProperty, LocalDriver);
        driver = new ChromeDriver();
        driver.get("https://www.guru99.com/");
        try {
            driver.manage().window().maximize();
            driver.switchTo().frame("a077aa5e");
            driver.findElement(By.xpath("html/body/a/img")).click();
        }catch (NoSuchFrameException e){
            driver.switchTo().frame("a077aa5e");
        }
    }
}

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverValue {
    protected WebDriver driver;
    public static final String DriverProperty = "webdriver.chrome.driver";
    public static  final  String LocalDriver = "src\\test\\WebDrivers\\chromedriver.exe";

    public void DriverExecute () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.hospitalrun.io/#/login");
        driver.manage().window().maximize();
    }


}

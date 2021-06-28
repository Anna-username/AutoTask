import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;
WebDriverWait wait;


By Username = By.xpath("//input[@type='text']");
By Password = By.xpath("//input[@type='password']");
By SignIn = By.xpath("//button[@class='btn btn-lg btn-primary btn-block']");

public LoginPage (WebDriver driver) {
this.driver = driver;
    this.wait =  new WebDriverWait(driver, 150);

}

public LoginPage ConfirmForm (String name, String password) {
    driver.findElement(Username).sendKeys(name);
    driver.findElement(Password).sendKeys(password);
    driver.findElement(SignIn).click();
    return this;

}
}

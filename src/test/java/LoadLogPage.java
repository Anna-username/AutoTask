import org.testng.annotations.Test;

public class LoadLogPage extends DriverValue {

    @Test
    public void mainPage() {

        LoginPage page = new LoginPage(this.driver);
        page.ConfirmForm("hr.doctor@hospitalrun.io", "HRt3st12");
    }


}

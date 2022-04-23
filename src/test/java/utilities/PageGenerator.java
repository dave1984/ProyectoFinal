package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;
import pages.LoginPage;

public class PageGenerator {
    public static  <TPage extends LoginPage> TPage getInstance (Class<TPage> pageClass , WebDriver driver ) throws Exception {
        try {
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

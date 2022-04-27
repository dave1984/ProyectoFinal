package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;
import pages.BasePage;

public class PageGenerator {
    public static  <TPage extends BasePage> TPage getInstance (WebDriver driver , Class<TPage> pageClass ) throws Exception {
        try {
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

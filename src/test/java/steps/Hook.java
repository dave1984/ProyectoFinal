package steps;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class Hook {

    protected static WebDriver driver;

    public Hook(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public static WebDriver getDriver() {

        return driver;
    }
/*
    public static void setDriver(WebDriver driver) {
        Hook.driver = driver;
    }

 */
@Before
public void setupClass() throws Exception{
    System.setProperty("webdriver.chrome.driver","C:/Users/David/OneDrive/Documentos/ProyectoFinal/ProyectoFinal/src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //driver.get("https://es.surveymonkey.com/");

}

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }



}

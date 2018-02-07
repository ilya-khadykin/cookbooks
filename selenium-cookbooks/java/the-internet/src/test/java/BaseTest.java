import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DynamicLoadingPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    }

    @After
    public void tearDown() {
        webDriver.close();
    }
}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DynamicLoadingPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestDynamicLoading extends BaseTest {
    private HomePage homePage;
    private DynamicLoadingPage dynamicLoadingPage;

    @Before
    public void setUp() {
        super.setUp();

        homePage = PageFactory.initElements( webDriver, HomePage.class );
        dynamicLoadingPage = PageFactory.initElements( webDriver, DynamicLoadingPage.class );
    }

    @Test
    public void testHomePageNavigation() {
        webDriver.get( HomePage.URL );
        homePage.clickOnDynamicLoadingLink();
        Assert.assertEquals( "Dynamically Loaded Page Elements", dynamicLoadingPage.getPageHeaderText() );
    }

    @Test
    public void testWaitForHiddenElement() throws Exception {
        webDriver.get(DynamicLoadingPage.URL);
        dynamicLoadingPage
                .clickOnHiddenElementLink()
                .clickOnStartButton();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30 );
        WebElement helloWorldLabel = webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
        Assert.assertEquals("Hello World!", helloWorldLabel.getText());
    }
}
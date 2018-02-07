package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URL;

public class HomePage extends AbstractPage{
    public static final String URL = BASE_URL;

    @FindBy(linkText = "Dynamic Loading")
    private WebElement dynamicLoadingLink;

    public void clickOnDynamicLoadingLink() {
        dynamicLoadingLink.click();
    }

}

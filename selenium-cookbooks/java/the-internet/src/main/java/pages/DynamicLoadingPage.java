package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends AbstractPage{
    public static final String URL = BASE_URL + "/dynamic_loading";

    @FindBy(css = ".example > h3")
    private WebElement pageHeader;
    @FindBy(partialLinkText = "Element on page that is hidden")
    private WebElement hiddenElementLink;
    @FindBy(css = "#start > button")
    private WebElement startButton;

    public String getPageHeaderText() {
        return pageHeader.getText();
    }

    public DynamicLoadingPage clickOnHiddenElementLink() {
        hiddenElementLink.click();
        return this;
    }

    public DynamicLoadingPage clickOnStartButton() {
        startButton.click();
        return this;
    }
}

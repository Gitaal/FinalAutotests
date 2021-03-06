package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by OWL on 27.01.2018.
 */
public class SearchPage {

    @FindBy(name = "glf-pricefrom-var")
    WebElement priceFrom;

    @FindBy(xpath = "//label[text()='Samsung']")
    WebElement samsung;

    @FindBy(xpath = "//label[text()='LG']")
    WebElement lg;

    @FindBy(xpath = "//button[@class='button button_action_n-filter-apply button_size_s button_pseudo_yes button_theme_pseudo i-bem button_js_inited']")
    WebElement buttonApply;

    @FindBy(xpath = "//button/span[text()='Показывать по 12']")
    public WebElement showTwelve;

    @FindBy(xpath = "(//div[@class='n-snippet-card2__title'])[1]")
    public WebElement firstElement;

    @FindBy(xpath = "//input[@id='header-search']")
    public WebElement headerSearch;

    @FindBy(xpath = "//button/span[text()='Найти']/..")
    WebElement buttonSearch;

    @FindBy(xpath = "//h1[@class='title title_size_28 title_bold_yes']")
    public WebElement tovar;

    public SearchPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void filterApply() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(priceFrom)).sendKeys("20000");
        wait.until(ExpectedConditions.visibilityOf(samsung)).click();
        wait.until(ExpectedConditions.visibilityOf(lg)).click();
    }


    public void clickButtonApply() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(buttonApply)).click();
    }

    public void showTwelve() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(showTwelve));
    }

    public void searchFirstElement() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(firstElement)).getText();
        headerSearch.sendKeys(firstElement.getText());
        wait.until(ExpectedConditions.visibilityOf(buttonSearch)).click();
    }

    public void tovarText() {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10, 1000);
        wait.until(ExpectedConditions.visibilityOf(tovar)).getText();
        headerSearch.getAttribute("value");
    }

}

package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class uiActions extends commonOps
{
    @Step("Click on Element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Clear Text from Text-Field")
    public static void clear(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(Keys.CONTROL + "a");
        elem.sendKeys(Keys.DELETE);
    }

    @Step("Send Text to Text-Field")
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("Scroll To Element")
    public static void scrollToElement (WebElement elem)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
    }

    @Step("Scroll To Element & Click")
    public static void scrollClickElement (WebElement elem)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.click();
    }

    @Step("Scroll To Element in Page Bottom & Click")
    public static void scrollBottomElement (WebElement elem)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(elem));
    }
}

package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class verifications extends commonOps
{

    @Step("Verify Condition is True")
    public static void softAssertTrueCondition (boolean bol, String comment)
    {
        softAssertion.assertTrue(bol, comment);
    }

    @Step("Verify Element is Displayed")
    public static void softAssertElementIsDisplayed (WebElement elem, String comment)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        softAssertion.assertTrue(elem.isDisplayed(), comment);
    }

    @Step("Verify Text in Element")
    public static void softAssertTextInElement (WebElement elem, String expectedValue, String comment)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        softAssertion.assertEquals(elem.getText(), expectedValue, comment);
    }
}

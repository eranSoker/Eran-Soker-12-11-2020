package WorkFlows;

import Extensions.verifications;
import Utilities.commonOps;
import io.qameta.allure.Step;

import java.util.Set;

public class webFlows extends commonOps
{

    @Step("Verify Web Title")
    public static void webTitle (String webTitle)
    {
        verifications.softAssertTrueCondition(driver.getTitle().equals(webTitle),"URL title is WRONG");
    }

    @Step("Verify Web Title Contains Text")
    public static void urlContainsText (String partialURL)
    {
        verifications.softAssertTrueCondition(driver.getCurrentUrl().contains(partialURL),driver.getCurrentUrl() + " - URL is NOT containing text - " + partialURL);
    }

    @Step("Get Get Url And Match")
    public static void GetMatchUrl (String link)
    {
        Set<String> winHandles = driver.getWindowHandles();
        driver.switchTo().window(winHandles.toArray()[1].toString());
        verifications.softAssertTrueCondition(driver.getCurrentUrl().contains(link),"Current URL is Wrong - " + driver.getCurrentUrl() + " ,NOT equals to - " + link);
        driver.close();
        driver.switchTo().window(winHandles.toArray()[0].toString());
    }
}

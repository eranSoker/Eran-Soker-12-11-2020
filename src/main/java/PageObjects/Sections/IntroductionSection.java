package PageObjects.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IntroductionSection
{
    @FindBy(xpath="//section[contains(@class,'Introduction')]/h2/span") // NOT full screen
    public WebElement txtTitle_WeRHerolo;

    @FindBy(xpath="//section[contains(@class,'Introduction')]/h2[2]/span")
    public WebElement txtTitle_DevelopmentLeaders;

    @FindBy(xpath="//h1[2]")
    public WebElement txt_Introduction;

    @FindBy(xpath="//div[contains(@class,'introduction')]/h4")
    public List<WebElement> list_txt_Introduction;
}

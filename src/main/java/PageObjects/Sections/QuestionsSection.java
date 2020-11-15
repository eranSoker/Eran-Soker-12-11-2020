package PageObjects.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class QuestionsSection
{
    @FindBy(xpath="//section[contains(@class,'Questions')]//h2/span")
    public WebElement txtTitle_Questions;

    @FindBy(xpath="//section[contains(@class,'Questions')]//h4")
    public List<WebElement> list_txtTitle_Questions;

    @FindBy(xpath="//section[contains(@class,'Questions')]//p")
    public List<WebElement> list_txt_Questions;
}

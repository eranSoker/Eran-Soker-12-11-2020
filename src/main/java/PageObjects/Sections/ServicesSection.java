package PageObjects.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServicesSection
{
    @FindBy(xpath="//*[text()='איך נוכל לעזור לכם?']")
    public WebElement txtTitle_HowWeCanHelp;

    @FindBy(tagName="h3")
    public List<WebElement> list_txtTitle_Services;

    @FindBy(xpath="//section[contains(@class,'services')]//p/span")
    public List<WebElement> list_txt_Services;

    @FindBy(xpath="//img[contains(@class,'ServiceImg')]")
    public List<WebElement> list_icon_Services;
}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopupFooter
{
    @FindBy(id="footer")
    public WebElement footer;

    @FindBy(xpath="//label[contains(@class,'Footer__Label')]")
    public WebElement txtTitle_footer;

    @FindBy(xpath="//input[contains(@class,'Footer__Input') and @name='name']")
    public WebElement input_footerName;

    @FindBy(xpath="//input[contains(@class,'Footer__Input') and @name='email']")
    public WebElement input_footerEmail;

    @FindBy(xpath="//input[contains(@class,'Footer__Input') and @name='phone']")
    public WebElement input_footerPhone;

    @FindBy(xpath="//button[contains(@class,'Footer__Button')]")
    public WebElement btn_FooterSend;
}

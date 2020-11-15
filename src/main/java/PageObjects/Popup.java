package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Popup
{
    @FindBy(xpath="//div[contains(@class,'onUnloadPopup__ModalWrapper')]")
    public WebElement popup;

    @FindBy(xpath="//div[contains(@class,'LogoLeft')]/img")
    public WebElement img_popupLogoLeft;

    @FindBy(xpath="//p[contains(@class,'LeftTitle')]/span")
    public WebElement txt_popupLeftTitle;

    @FindBy(xpath="//p[contains(@class,'LeftSubTitle')]/span")
    public WebElement txt_popupLeftSubTitle;

    @FindBy(xpath="//label[contains(@class,'onUnloadPopup__Label')]/span")
    public WebElement txtTitle_popup;

    @FindBy(xpath="//p[contains(@class,'Subtitle1')]/span")
    public WebElement txtSubtitle_GetInfo;

    @FindBy(xpath="//p[contains(@class,'Subtitle2')]/span")
    public WebElement txtSubtitle_LeaveDetails;

    @FindBy(xpath="//input[contains(@class,'onUnloadPopup') and @name='name']")
    public WebElement input_PopupName;

    @FindBy(xpath="//input[contains(@class,'onUnloadPopup') and @name='email']")
    public WebElement input_PopupEmail;

    @FindBy(xpath="//input[contains(@class,'onUnloadPopup') and @name='phone']")
    public WebElement input_PopupPhone;

    @FindBy(xpath="//button[contains(@class,'onUnloadPopup')]")
    public WebElement btn_GetCallPopup;

    @FindBy(xpath="//span[contains(@class,'onUnloadPopup__CloseModalBtn')]")
    public WebElement btn_ClosePopup;
}

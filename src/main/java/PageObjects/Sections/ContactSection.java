package PageObjects.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactSection
{
    @FindBy(xpath="//section[contains(@class,'contactUs')]//h2/span")
    public WebElement txtTitle_ContactUs;

    @FindBy(xpath="//p[contains(@class,'contactUs__SubtitleDesktop')]/span")
    public List<WebElement> list_subtitle_ContactUs;

    @FindBy(xpath="//label[@for='name']/span")
    public WebElement txtTitle_Name;

    @FindBy(xpath="//label[@for='company']/span")
    public WebElement txtTitle_Company;

    @FindBy(xpath="//label[@for='email']/span")
    public WebElement txtTitle_Email;

    @FindBy(xpath="//label[@for='telephone']/span")
    public WebElement txtTitle_Telephone;

    @FindBy(xpath="//input[@id='name']")
    public WebElement input_Name;

    @FindBy(xpath="//input[@id='company']")
    public WebElement input_Company;

    @FindBy(xpath="//input[@id='email']")
    public WebElement input_Email;

    @FindBy(xpath="//input[@id='telephone']")
    public WebElement input_Telephone;

    @FindBy(xpath="//a[contains(@class,'ButtonContact')]")
    public WebElement btn_ContactUs;

    //contactUs Section - Left Side
    @FindBy(xpath="//div[contains(@class,'contactPerson')]/img")
    public WebElement img_contactPerson;

    @FindBy(xpath="//p[contains(@class,'contactPerson__Name')]/span")
    public WebElement txt_contactPersonName;

    @FindBy(xpath="(//p[contains(@class,'commun__ContactText')]/span)[1]")
    public WebElement txt_contactPersonRoll;

    @FindBy(xpath="//p[contains(@class,'contactPerson__Phone')]")
    public WebElement txt_contactPersonPhone;

    @FindBy(xpath="//a[contains(@href,'mailto:')]")
    public WebElement link_contactPersonMail;

    @FindBy(xpath="//p[contains(@class,'contactPerson__Address')]")
    public WebElement txt_CompanyAddress;

    @FindBy(xpath="//div[contains(@class,'socialMediaBar')]/a")
    public List<WebElement> list_btn_SocialMedia;

// when Text Field inputs are invalid
    @FindBy(xpath="//input[@id='name']/following-sibling::span")
    public WebElement txt_NameErrorText;

    @FindBy(xpath="//input[@id='company']/following-sibling::span")
    public WebElement txt_CompanyErrorText;

    @FindBy(xpath="//input[@id='email']/following-sibling::span")
    public WebElement txt_MailErrorText;

    @FindBy(xpath="//input[@id='telephone']/following-sibling::span")
    public WebElement txt_PhoneErrorText;
}

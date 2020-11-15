package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MutualElements
{
    @FindBy(xpath="//a[contains(@class,'backToTop')]")
    public WebElement btn_BackToTop;

    @FindBy(xpath="//a[contains(@class,'callUsWhatsapp')]")
    public WebElement btn_CallUsWhatsapp;
}

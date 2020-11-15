package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Header
{
    @FindBy(id="logom")
    public WebElement img_logo;

    @FindBy(xpath="//h2[contains(@class,'logo__Text')]/span")
    public List<WebElement> list_txt_logo;

    @FindBy(xpath="//img[contains(@class,'ImgFrameworks')]")
    public List<WebElement> list_img_frameworks;
}

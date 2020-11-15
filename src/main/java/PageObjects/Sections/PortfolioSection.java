package PageObjects.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PortfolioSection
{
    @FindBy(xpath="//section[contains(@class,'Portfolio')]/h2/span")
    public WebElement txtTitle_Portfolio;

    @FindBy(xpath="((//div[@class='slick-track'])[1]/div)[position()>1]")
    public List<WebElement> list_img_Portfolio;

    @FindBy(xpath="(//ul[@class='slick-dots'])[1]//div")
    public List<WebElement> list_PortfolioDots;

    @FindBy(xpath="//div[contains(@class,'slick-next')]")
    public WebElement btn_NextArrow;

    @FindBy(xpath="//div[contains(@class,'slick-prev')]")
    public WebElement btn_PrevArrow;
}

package PageObjects.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomersSection
{
    @FindBy(xpath="//section[contains(@class,'customers')]//h2/span")
    public WebElement txtTitle_Customers;

    @FindBy(xpath="(//ul[@class='slick-dots'])[2]//div")
    public List<WebElement> list_CustomersDots;
}

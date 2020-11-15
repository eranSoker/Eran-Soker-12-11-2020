package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static SoftAssert softAssertion = new SoftAssert();

    public static PageObjects.Header header;
    public static PageObjects.Popup popup;
    public static PageObjects.PopupFooter popupFooter;
    public static PageObjects.MutualElements mutualElements;
    public static PageObjects.Sections.IntroductionSection introductionSection;
    public static PageObjects.Sections.ServicesSection servicesSection;
    public static PageObjects.Sections.PortfolioSection portfolioSection;
    public static PageObjects.Sections.CustomersSection customersSection;
    public static PageObjects.Sections.QuestionsSection questionsSection;
    public static PageObjects.Sections.ContactSection contactSection;

}

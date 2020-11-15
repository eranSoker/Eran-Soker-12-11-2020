package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends commonOps
{
    public static void init()
    {
        header = PageFactory.initElements(driver, PageObjects.Header.class);
        popup = PageFactory.initElements(driver, PageObjects.Popup.class);
        popupFooter = PageFactory.initElements(driver, PageObjects.PopupFooter.class);
        mutualElements = PageFactory.initElements(driver, PageObjects.MutualElements.class);

        introductionSection = PageFactory.initElements(driver, PageObjects.Sections.IntroductionSection.class);
        servicesSection = PageFactory.initElements(driver, PageObjects.Sections.ServicesSection.class);
        portfolioSection = PageFactory.initElements(driver, PageObjects.Sections.PortfolioSection.class);
        customersSection = PageFactory.initElements(driver, PageObjects.Sections.CustomersSection.class);
        questionsSection = PageFactory.initElements(driver, PageObjects.Sections.QuestionsSection.class);
        contactSection = PageFactory.initElements(driver, PageObjects.Sections.ContactSection.class);
    }
}

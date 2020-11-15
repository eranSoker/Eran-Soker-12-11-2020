package Tests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Utilities.listeners.class)
public class regression extends commonOps
{
    @Test(priority = 0, description = "Test01: Verify URL Title")
    @Description("Test Description: Verify URL title is correct")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test01_VerifyURLTitle()
    {
        webFlows.webTitle("הירולו - חברת פיתוח מובילה המתמחה בפתרונות פרונט אנד");
        softAssertion.assertAll();
    }

    @Test(priority = 1, description = "Test02: Verify Header Display")
    @Description("Test Description: Verify all Header's elements are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test02_HeaderElementsDisplay()
    {
        verifications.softAssertElementIsDisplayed(header.img_logo, "img_logo is NOT Displayed");
        verifications.softAssertElementIsDisplayed(header.list_txt_logo.get(0),"list_txt_logo[1] is NOT Displayed");
        verifications.softAssertElementIsDisplayed(header.list_txt_logo.get(1),"list_txt_logo[2] is NOT Displayed");
        for (WebElement framwork:header.list_img_frameworks)
            verifications.softAssertElementIsDisplayed(framwork,"framwork is NOT Displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 2, description = "Test03: Verify Header Text")
    @Description("Test Description: Verify all text is correct for Header's elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test03_HeaderElementsText()
    {
        verifications.softAssertTextInElement(header.list_txt_logo.get(0),"מפתחים","Wrong Text - list_txt_logo[1] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(header.list_txt_logo.get(1),"בשפה שלך","Wrong Text - list_txt_logo[2] - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 3, description = "Test04: Verify Introduction Section Display")
    @Description("Test Description: Verify all elements in Introduction Section are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test04_IntroductionSectionDisplay()
    {
        verifications.softAssertElementIsDisplayed(introductionSection.txtTitle_DevelopmentLeaders,"txtTitle_WeRHerolo is NOT Displayed");
        verifications.softAssertElementIsDisplayed(introductionSection.txt_Introduction,"txt_Introduction is NOT Displayed");
        verifications.softAssertElementIsDisplayed(introductionSection.list_txt_Introduction.get(0),"list_txt_Introduction[1] is NOT Displayed");
        verifications.softAssertElementIsDisplayed(introductionSection.list_txt_Introduction.get(1),"list_txt_Introduction[2] is NOT Displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 4, description = "Test05: Verify Introduction Section Text")
    @Description("Test Description: Verify all text is correct for Introduction Section elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test05_IntroductionSectionText()
    {
        verifications.softAssertTextInElement(introductionSection.txtTitle_DevelopmentLeaders,"הירולו - מובילים בפיתוח","Wrong Text - txtTitle_WeRHerolo - NOT AS EXPECTED"); //TODO - it's changes
        verifications.softAssertTextInElement(introductionSection.txt_Introduction,"הירולו היא חברת פיתוח מובילה המתמחה בפתרונות Front-End ו-Full Stack.","Wrong Text - txt_Introduction - NOT AS EXPECTED");
        verifications.softAssertTextInElement(introductionSection.list_txt_Introduction.get(0),"עד היום, בנינו מאות אפליקציות ווב ומובייל עבור עשרות לקוחות באמצעות הטכנולוגיות החדישות ביותר בתעשייה.","Wrong Text - list_txt_Introduction[1] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(introductionSection.list_txt_Introduction.get(1),"אם אתם זקוקים לפיתוח מכל סוג או הרחבה וחיזוק צוות הפיתוח שלכם – הגעתם למקום הנכון.","Wrong Text - list_txt_Introduction[2] - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 5, description = "Test06: Verify Services Section Display")
    @Description("Test Description: Verify all elements in Services Section are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test06_ServicesSectionDisplay()
    {
        verifications.softAssertElementIsDisplayed(servicesSection.txtTitle_HowWeCanHelp,"txtTitle_HowWeCanHelp is NOT Displayed");
        for (WebElement serviceTitle:servicesSection.list_txtTitle_Services)
            verifications.softAssertElementIsDisplayed(serviceTitle,"serviceTitle is NOT Displayed\"");
        for (WebElement service:servicesSection.list_txt_Services)
            verifications.softAssertElementIsDisplayed(service,"service is NOT Displayed");
        for (WebElement serviceIcon:servicesSection.list_icon_Services)
            verifications.softAssertElementIsDisplayed(serviceIcon,"serviceIcon is NOT Displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 6, description = "Test07: Verify Services Section Text")
    @Description("Test Description: Verify all text is correct for Services Section elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test07_ServicesSectionText()
    {
        verifications.softAssertTextInElement(servicesSection.txtTitle_HowWeCanHelp,"איך נוכל לעזור לכם?","Wrong Text - txtTitle_HowWeCanHelp - NOT AS EXPECTED");
        verifications.softAssertTextInElement(servicesSection.list_txtTitle_Services.get(0),"מיקור חוץ לפיתוח Frontend ובודקי איכות","Wrong Text - list_txtTitle_Services[1] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(servicesSection.list_txtTitle_Services.get(1),"פרויקט Full Stack מקצה לקצה","Wrong Text - list_txtTitle_Services[2] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(servicesSection.list_txtTitle_Services.get(2),"ייעוץ ושדרוג ל–JavaScript","Wrong Text - list_txtTitle_Services[3] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(servicesSection.list_txt_Services.get(0),"אנחנו בונים צוותים המורכבים ממפתחי Full Stack, צד לקוח (React, Angular, Vue), בודקי איכות (ידני ואוטומציה) ומנהלי פרויקטים. בעזרתנו תוכלו להקים במהירות צוות טכנולוגי איכותי וממוקצע.","Wrong Text - list_txt_Services[1] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(servicesSection.list_txt_Services.get(1),"אנחנו בונים צוות המותאם לפי הצרכים שלכם ודואגים לתהליך הפיתוח מקצה לקצה. מנהלי הפרויקטים שלנו דואגים לנהל את הפרויקט בצורה הנכונה והאפקטיבית ביותר. עובדים בספרינטים ומתודולוגיות Agile.","Wrong Text - list_txt_Services[2] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(servicesSection.list_txt_Services.get(2),"אנחנו יכולים לשדרג לכם את האתר ו/או האפליקציה שלכם, לדאוג שתהיו מעודכנים עם הטכנולוגיות החדשות ביותר ולבחון את בסיס הקוד יחד איתכם.","Wrong Text - list_txt_Services[3] - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 7, description = "Test08: Verify Portfolio Section Display")
    @Description("Test Description: Verify all elements in Portfolio Section are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test08_PortfolioSectionDisplay()
    {
        uiActions.scrollToElement(portfolioSection.txtTitle_Portfolio);
        verifications.softAssertElementIsDisplayed(portfolioSection.txtTitle_Portfolio,"txtTitle_Portfolio is NOT Displayed");
        for (WebElement portfolioDots:portfolioSection.list_PortfolioDots)
            verifications.softAssertElementIsDisplayed(portfolioDots,"portfolioDots is NOT Displayed");
        verifications.softAssertElementIsDisplayed(portfolioSection.btn_NextArrow,"btn_NextArrow is NOT Displayed");
        verifications.softAssertElementIsDisplayed(portfolioSection.btn_PrevArrow,"btn_PrevArrow is NOT Displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 8, description = "Test09: Verify Portfolio Section Text")
    @Description("Test Description: Verify all text is correct for Portfolio Section elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test09_PortfolioSectionText()
    {
        verifications.softAssertTextInElement(portfolioSection.txtTitle_Portfolio,"עבודות לדוגמה","Wrong Text - txtTitle_Portfolio - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 9, description = "Test10: Verify the Dots in Portfolio Section Slide")
    @Description("Test Description: Verify all images exist in the slide and the dots are working in Portfolio Section")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test10_PortfolioSectionDots() throws InterruptedException
    {
        for (int i=0; i<portfolioSection.list_PortfolioDots.size(); i++) {
            uiActions.scrollClickElement(portfolioSection.list_PortfolioDots.get(i));
            Thread.sleep(1500);
            verifications.softAssertTrueCondition(portfolioSection.list_PortfolioDots.get(i).findElement(By.xpath("./parent::li")).getAttribute("class").equals("slick-active"),"Dot number: " + i + " - is NOT Colored");
            verifications.softAssertTrueCondition(portfolioSection.list_img_Portfolio.get(i).getAttribute("class").equals("slick-slide slick-active slick-current"),"Image number: " + i + " - is NOT Displayed");
            verifications.softAssertTrueCondition(!portfolioSection.list_img_Portfolio.get(i).findElement(By.xpath(".//img")).getAttribute("src").isEmpty(),"Image number: " + i + " - link is Empty");
        }
        softAssertion.assertAll();
    }

    @Test(priority = 10, description = "Test11: Verify the Arrows in Portfolio Section Slide")
    @Description("Test Description: Verify all images exist in the slide and the Arrows are working in Portfolio Section")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test11_PortfolioSectionArrows() throws InterruptedException
    {
        for (int i=0; i<portfolioSection.list_PortfolioDots.size()-1; i++) {
            uiActions.scrollClickElement(portfolioSection.btn_NextArrow);
            Thread.sleep(2000);
            verifications.softAssertTrueCondition(portfolioSection.list_PortfolioDots.get(i+1).findElement(By.xpath("./parent::li")).getAttribute("class").equals("slick-active"),"Dot number: " + i + " - is NOT Colored");
            verifications.softAssertTrueCondition(portfolioSection.list_img_Portfolio.get(i+1).getAttribute("class").equals("slick-slide slick-active slick-current"),"Image number: " + i + " - is NOT Displayed");
            verifications.softAssertTrueCondition(!portfolioSection.list_img_Portfolio.get(i+1).findElement(By.xpath(".//img")).getAttribute("src").isEmpty(),"Image number: " + i + " - link is Empty");
        }
        softAssertion.assertAll();
    }

    @Test(priority = 11, description = "Test12: Verify Customer Section Display")
    @Description("Test Description: Verify all elements in Customer Section are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test12_CustomerSectionDisplay()
    {
        uiActions.scrollToElement(customersSection.txtTitle_Customers);
        verifications.softAssertElementIsDisplayed(customersSection.txtTitle_Customers,"txtTitle_Customers is NOT Displayed");
        for (WebElement customersDots:customersSection.list_CustomersDots)
            verifications.softAssertElementIsDisplayed(customersDots,"customersDots is NOT Displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 12, description = "Test13: Verify Customer Section Text")
    @Description("Test Description: Verify all text is correct for Customer Section elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test13_CustomerSectionText()
    {
        verifications.softAssertTextInElement(customersSection.txtTitle_Customers,"כמה מהלקוחות שלנו","Wrong Text - txtTitle_Customers - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 14, description = "Test15: Verify Questions Section Display")
    @Description("Test Description: Verify all elements in Questions Section are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test15_QuestionsSectionDisplay()
    {
        uiActions.scrollToElement(questionsSection.txtTitle_Questions);
        for (int i=0; i<questionsSection.list_txtTitle_Questions.size(); i++)
            verifications.softAssertElementIsDisplayed(questionsSection.list_txtTitle_Questions.get(i),"list_txtTitle_Questions number:" + i + " is NOT displayed");
        for (int i=0; i<questionsSection.list_txt_Questions.size(); i++)
            verifications.softAssertElementIsDisplayed(questionsSection.list_txt_Questions.get(i),"list_txt_Questions number:" + i + " is NOT displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 15, description = "Test16: Verify Questions Section Text")
    @Description("Test Description: Verify all text is correct for Questions Section elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test16_QuestionsSectionText()
    {
        uiActions.scrollToElement(questionsSection.txtTitle_Questions);
        for (int i=0; i<questionsSection.list_txtTitle_Questions.size(); i++)
            verifications.softAssertTextInElement(questionsSection.list_txtTitle_Questions.get(i),getData("QuestionTitle"+(i+1)),"WRONG text for " + getData("QuestionTitle"+(i+1)) + " - NOT AS EXPECTED");
        for (int i=0; i<questionsSection.list_txt_Questions.size(); i++)
            verifications.softAssertTextInElement(questionsSection.list_txt_Questions.get(i),getData("QuestionText"+(i+1)),"WRONG text for " + getData("QuestionText"+(i+1)) + " - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 16, description = "Test17: Verify Contact Section Display")
    @Description("Test Description: Verify all elements in Contact Section are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test17_ContactSectionDisplay()
    {
        verifications.softAssertElementIsDisplayed(contactSection.txtTitle_ContactUs,"txtTitle_ContactUs is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.list_subtitle_ContactUs.get(0),"list_subtitle_ContactUs[2] is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.list_subtitle_ContactUs.get(1),"list_subtitle_ContactUs[1] is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txtTitle_Name,"txtTitle_Name is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txtTitle_Company,"txtTitle_Company is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txtTitle_Email,"txtTitle_Email is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txtTitle_Telephone,"txtTitle_Telephone is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.input_Name,"input_Name is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.input_Company,"input_Company is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.input_Email,"input_Email is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.input_Telephone,"input_Telephone is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.btn_ContactUs,"btn_ContactUs is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.img_contactPerson,"img_contactPerson is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_contactPersonName,"txt_contactPersonName is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_contactPersonRoll,"txt_contactPersonRoll is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_contactPersonPhone,"txt_contactPersonPhone is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.link_contactPersonMail,"link_contactPersonMail is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_CompanyAddress,"txt_CompanyAddress is NOT displayed");
        for (int i=0; i<contactSection.list_btn_SocialMedia.size(); i++)
            verifications.softAssertElementIsDisplayed(contactSection.list_btn_SocialMedia.get(i),"list_btn_SocialMedia number:" + i + " is NOT displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 17, description = "Test18: Verify Contact Section Text")
    @Description("Test Description: Verify all text is correct for Contact Section elements")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test18_ContactSectionText()
    {
        verifications.softAssertTextInElement(contactSection.txtTitle_ContactUs,"רוצים לשמוע עוד?","WRONG text for txtTitle_ContactUs - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.list_subtitle_ContactUs.get(0),"צרו קשר או השאירו לנו פרטים ונשמח לחזור אליכם.","WRONG text for list_subtitle_ContactUs[0] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.list_subtitle_ContactUs.get(1),"יחד נבנה את הפתרון המתאים למוצר שלכם.","WRONG text for list_subtitle_ContactUs[1] - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txtTitle_Name,"שם","WRONG text for txtTitle_Name - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txtTitle_Company,"חברה","WRONG text for txtTitle_Company - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txtTitle_Email,"דואר אלקטרוני","WRONG text for txtTitle_Email - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txtTitle_Telephone,"טלפון","WRONG text for txtTitle_Telephone - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.btn_ContactUs,"דברו איתנו","WRONG text for btn_ContactUs - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_contactPersonName,"מתי קורלנד","WRONG text for txt_contactPersonName - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_contactPersonRoll,"מנהל פיתוח עסקי","WRONG text for txt_contactPersonRoll - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_contactPersonPhone,"054-4945333","WRONG text for txt_contactPersonPhone - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.link_contactPersonMail,"mati@herolo.co.il","WRONG text for link_contactPersonMail - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_CompanyAddress,"רח' בצלאל 8, רמת גן","WRONG text for txt_CompanyAddress - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 18, description = "Test19: Verify Mail Text Field Function")
    @Description("Test Description: Verify mail text field functionality - enter invalid email")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test19_VerifyMailTextField()
    {
        String[] invalidMails = {"email","email@email","email789","email@email.","email@email.commm"};
        for (String invalidMail:invalidMails) {
            uiActions.updateText(contactSection.input_Email, invalidMail);
            uiActions.click(contactSection.btn_ContactUs);
            verifications.softAssertElementIsDisplayed(contactSection.txt_MailErrorText, "txt_MailErrorText is NOT displayed for - " + invalidMail);
            uiActions.clear(contactSection.input_Email);
        }
        softAssertion.assertAll();
    }

    @Test(priority = 19, description = "Test20: Verify Phone Text Field Function")
    @Description("Test Description: Verify phone text field functionality - enter invalid phone")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test20_VerifyPhoneTextField()
    {
        String[] invalidPhones = {"123","1234567890","05212345678","123phone.","052--1234567","phone"};
        for (String invalidPhone:invalidPhones) {
            uiActions.updateText(contactSection.input_Telephone, invalidPhone);
            uiActions.click(contactSection.btn_ContactUs);
            verifications.softAssertElementIsDisplayed(contactSection.txt_PhoneErrorText, "txt_PhoneErrorText is NOT displayed for - " + invalidPhone);
            uiActions.clear(contactSection.input_Telephone);
        }
        softAssertion.assertAll();
    }

    @Test(priority = 20, description = "Test21: Verify Text Error Messages Under text Fields Display & Text")
    @Description("Test Description: Verify error messages display and text under text field when not filing them")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test21_VerifyErrorMessageTextField()
    {
        uiActions.scrollBottomElement(contactSection.btn_ContactUs);
        uiActions.click(contactSection.btn_ContactUs);
        verifications.softAssertElementIsDisplayed(contactSection.txt_NameErrorText, "txt_NameErrorText is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_CompanyErrorText, "txt_CompanyErrorText is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_MailErrorText, "txt_MailErrorText is NOT displayed");
        verifications.softAssertElementIsDisplayed(contactSection.txt_PhoneErrorText, "txt_PhoneErrorText is NOT displayed");
        verifications.softAssertTextInElement(contactSection.txt_NameErrorText,"שדה שם הוא שדה חובה","WRONG text for txt_NameErrorText - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_CompanyErrorText,"שדה חברה הוא שדה חובה","WRONG text for txt_CompanyErrorText - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_MailErrorText,"שדה אימייל הוא שדה חובה","WRONG text for txt_MailErrorText - NOT AS EXPECTED");
        verifications.softAssertTextInElement(contactSection.txt_PhoneErrorText,"שדה טלפון הוא שדה חובה","WRONG text for txt_PhoneErrorText - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 21, description = "Test22: Verify Text Field")
    @Description("Test Description: Verify all text fields are working in contact section")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test22_VerifyValidTextField()
    {
        String name = "Eran";
        String company = "Soker";
        String email = "Eran123@gogol.com";
        String phone = "0521234567";
        uiActions.updateText(contactSection.input_Name,name);
        uiActions.updateText(contactSection.input_Company,company);
        uiActions.updateText(contactSection.input_Email,email);
        uiActions.updateText(contactSection.input_Telephone,phone);
        verifications.softAssertTrueCondition(contactSection.input_Name.getAttribute("value").equals(name),"NAME - Text filed is NOT working");
        verifications.softAssertTrueCondition(contactSection.input_Company.getAttribute("value").equals(company),"COMPANY - Text filed is NOT working");
        verifications.softAssertTrueCondition(contactSection.input_Email.getAttribute("value").equals(email),"EMAIL - Text filed is NOT working");
        verifications.softAssertTrueCondition(contactSection.input_Telephone.getAttribute("value").equals(phone),"TELEPHONE - Text filed is NOT working");
        softAssertion.assertAll();
    }

    @Test(priority = 22, description = "Test23: Verify Send Message")
    @Description("Test Description: Verify send message is working in contact section")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test23_VerifySendMessage() throws InterruptedException
    {
        String name = "Eran";
        String company = "Soker";
        String email = "Eran123@gogol.com";
        String phone = "0521234567";
        uiActions.updateText(contactSection.input_Name,name);
        uiActions.updateText(contactSection.input_Company,company);
        uiActions.updateText(contactSection.input_Email,email);
        uiActions.updateText(contactSection.input_Telephone,phone);
        uiActions.click(contactSection.btn_ContactUs);
        Thread.sleep(3000);
        webFlows.urlContainsText("thank-you");
        softAssertion.assertAll();
    }

    @Test(priority = 23, description = "Test24: Verify Social Media Buttons")
    @Description("Test Description: Verify social media buttons are working")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test24_SocialMediaButtons()
    {
        String[] socialMedia = {"linkedin", "whatsapp", "facebook", "herolo"};
        uiActions.scrollBottomElement(contactSection.txtTitle_ContactUs);
        for (int i = 0; i < contactSection.list_btn_SocialMedia.size(); i++)
        {
            uiActions.click(contactSection.list_btn_SocialMedia.get(i));
            webFlows.GetMatchUrl(socialMedia[i]);
        }
        softAssertion.assertAll();
    }

    @Test(priority = 24, description = "Test25: Verify WhatsApp Button")
    @Description("Test Description: Verify whatsapp button is working")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test25_VerifyWhatsappButton()
    {
        uiActions.click(mutualElements.btn_CallUsWhatsapp);
        webFlows.GetMatchUrl("whatsapp");
        softAssertion.assertAll();
    }

    @Test(priority = 25, description = "Test26: Verify Slide to the top Button")
    @Description("Test Description: Verify slide to the top button is working")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test26_VerifySlideTopPageButton() throws InterruptedException
    {
        uiActions.scrollToElement(contactSection.txtTitle_ContactUs);
        uiActions.click(mutualElements.btn_BackToTop);
        Thread.sleep(1500);
        verifications.softAssertTrueCondition(wait.until(ExpectedConditions.visibilityOf(header.img_logo)).isDisplayed(),"Back to the top is not working - img_logo is NOT visible");
        softAssertion.assertAll();
    }

    @Test(priority = 26, description = "Test27: Verify Footer Disappears When Reach To Page Bottom")
    @Description("Test Description: Verify footer disappears when reach the bottom of the page")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test27_FooterDisappears() throws InterruptedException
    {
        uiActions.scrollToElement(contactSection.txtTitle_ContactUs);
        Thread.sleep(1000);
        verifications.softAssertTrueCondition(!popupFooter.footer.isDisplayed(),"Footer still display - NOT AS EXPECTED");
        softAssertion.assertAll();
    }

    @Test(priority = 27, description = "Test28: Verify Send Message Footer")
    @Description("Test Description: Verify send message in footer is working")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test28_VerifySendMessageFooter() throws InterruptedException
    {
        String name = "Eran";
        String email = "Eran123@gogol.com";
        String phone = "0521234567";
        uiActions.scrollToElement(portfolioSection.txtTitle_Portfolio);
        uiActions.updateText(popupFooter.input_footerName, name);
        uiActions.updateText(popupFooter.input_footerEmail, email);
        uiActions.updateText(popupFooter.input_footerPhone, phone);
        uiActions.click(popupFooter.btn_FooterSend);
        Thread.sleep(1500);
        webFlows.urlContainsText("thank-you");
        softAssertion.assertAll();
    }

    @Test(priority = 28, description = "Test29: Verify Popup Display")
    @Description("Test Description: Verify all Popup's elements are display")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test29_PopupElementsDisplay() throws InterruptedException
    {
        uiActions.scrollToElement(customersSection.txtTitle_Customers);
        for (int i = 0; i < 10; i++) {
            uiActions.scrollClickElement(portfolioSection.btn_NextArrow);
            Thread.sleep(1500);
        }
        uiActions.scrollToElement(contactSection.txtTitle_ContactUs);
        uiActions.scrollToElement(introductionSection.txt_Introduction);
        wait.until(ExpectedConditions.visibilityOf(popup.popup));
        verifications.softAssertElementIsDisplayed(popup.txtTitle_popup, "txtTitle_popup is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.img_popupLogoLeft, "img_popupLogoLeft is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.txt_popupLeftTitle, "txt_popupLeftTitle is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.txt_popupLeftSubTitle, "txt_popupLeftSubTitle is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.txtSubtitle_GetInfo, "txtSubtitle_GetInfo is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.txtSubtitle_LeaveDetails, "txtSubtitle_LeaveDetails is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.input_PopupName, "input_PopupName is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.input_PopupEmail, "input_PopupEmail is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.input_PopupPhone, "input_PopupPhone is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.btn_GetCallPopup, "btn_GetCallPopup is NOT Displayed");
        verifications.softAssertElementIsDisplayed(popup.btn_ClosePopup, "btn_ClosePopup is NOT Displayed");
        softAssertion.assertAll();
    }

    @Test(priority = 29, description = "Test30: Verify Send Message Popup")
    @Description("Test Description: Verify send message from popup is working")
    @Story("Test Home Page")
    @Severity(SeverityLevel.CRITICAL)
    public void test30_VerifySendMessagePopup() throws InterruptedException
    {
        String name = "Eran";
        String email = "Eran123@gogol.com";
        String phone = "0521234567";
        uiActions.scrollToElement(customersSection.txtTitle_Customers);
        for (int i=0 ; i<10; i++) {
            uiActions.scrollClickElement(portfolioSection.btn_NextArrow);
            Thread.sleep(1500);
        }
        uiActions.scrollToElement(contactSection.txtTitle_ContactUs);
        uiActions.scrollToElement(introductionSection.txt_Introduction);
        wait.until(ExpectedConditions.visibilityOf(popup.popup));
        uiActions.updateText(popup.input_PopupName,name);
        uiActions.updateText(popup.input_PopupEmail,email);
        uiActions.updateText(popup.input_PopupPhone,phone);
        uiActions.click(popup.btn_GetCallPopup);
        Thread.sleep(2000);
        webFlows.urlContainsText("thank-you");
        softAssertion.assertAll();
    }


    
    @BeforeMethod(description = "Before Method Initialize SoftAssert", alwaysRun = true)
    @Description("Before each method initialize soft assertion")
    public void beforeMethod()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssertion = softAssert;
    }
}

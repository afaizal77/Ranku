package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.UniversityHomePage;
import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteplmpl {

    private WebDriver driver = Driver.driver;
    private UniversityHomePage universityHomePagePage = PageFactory.initElements(driver, UniversityHomePage.class);

    @Step("Navigate to Program list page")
    public void clickOnlineProgramLabel(){
        universityHomePagePage.ClickOnlinePrograms();
    }

    @Step("Page title is <pageTitle>")
    public void isPageTitleEquals(String pageTitle){
        Assert.assertEquals("Page title differs!\n", pageTitle, universityHomePagePage.getPageTitle());
    }

    @Step("Load Page")
    public void loadPage(){
        universityHomePagePage.loadPage();
    }
}

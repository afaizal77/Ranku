package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.programDetailsPage;
import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProgramDetailsPageSteplmpl {
    private WebDriver driver = Driver.driver;
    private programDetailsPage programDetailsPagePage = PageFactory.initElements(driver, programDetailsPage.class);

    @Step("Verify <DetailsHeader> details in Program page with <RealValue>")
    public void VerifyProgramDetails(String DetailsHeader, String RealValue){
        programDetailsPagePage.VeifyProgramDetails(DetailsHeader, RealValue);
    }
}

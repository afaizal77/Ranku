package com.maxsoft.webautomation.stepimpl;

import com.maxsoft.webautomation.pages.ProgramListPage;
import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProgramListPageSteplmpl {

    private WebDriver driver = Driver.driver;
    private ProgramListPage programListPagePage = PageFactory.initElements(driver, ProgramListPage.class);

    @Step("Filter <degreeLevel> Degree type")
    public void filterDegreeType(String degreeType){
        programListPagePage.filterDegreeType(degreeType);
    }

    @Step("Filter <degreeField> Degree field")
    public void filterDegreeField(String degreeField){
        programListPagePage.filterDegreeField(degreeField);
    }

    @Step("Search <degreeName> Degree name")
    public void searchDegreeName(String degreeName){
        programListPagePage.searchDegreeInProgramList(degreeName);
    }

    @Step("Select degree <DegreeName> from Degree list")
    public void selectDegreeFromDegreeList(String Sample){
        programListPagePage.selectDegreeFromDegreeList(Sample);
    }
}

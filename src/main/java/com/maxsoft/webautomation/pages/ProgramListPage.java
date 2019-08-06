package com.maxsoft.webautomation.pages;

import com.maxsoft.webautomation.common.Base;
import com.maxsoft.webautomation.util.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramListPage extends Base {

    private WebDriver driver = Driver.driver;

    @FindBy (xpath = "//select[@aria-label='Degree Level']")
    private WebElement DD_DEGREETYPE;

    @FindBy (xpath = "//select[@aria-label='Degree Field']")
    private WebElement DD_DEGREEFIELD;

    @FindBy (xpath = "//input[@aria-label='What do you want to learn?']")
    private WebElement TXT_SEARCHDEGREE;

    @FindBy (xpath = "//button[text()='Search']")
    private WebElement BTN_PROGRAMSEARCH;

    @FindBy (xpath = "//a[@title='Engineering Management, MEM - University of Nebraska - Lincoln']")
    private WebElement LBL_DEGREENAME;

    public void filterDegreeType(String degreeType){
        selectDropDownList(DD_DEGREETYPE,degreeType);
    }

    public void filterDegreeField(String degreeField){

        String FieldDropDown = "//select[@aria-label='Degree Field']";
        WebElement valueFieldDropDown = driver.findElement(By.xpath(FieldDropDown));
        freeze(5);
        selectDropDownList(valueFieldDropDown,degreeField);
    }

    public void searchDegreeInProgramList(String degreeName){
        setTextAs(TXT_SEARCHDEGREE,degreeName);
        clickElement(BTN_PROGRAMSEARCH);
    }

    public void selectDegreeFromDegreeList(String Sample){
        String sample = "//a[@title='"+Sample+"']";
        WebElement LL_Sample = driver.findElement(By.xpath(sample));
        clickElement(LL_Sample);
    }
}

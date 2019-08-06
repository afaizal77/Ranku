package com.maxsoft.webautomation.pages;

import com.maxsoft.webautomation.common.Base;
import com.maxsoft.webautomation.util.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class programDetailsPage extends Base {

    private WebDriver driver = Driver.driver;
    @FindBy(xpath = "//div[@class='stats']//ul//li//dl//dt[contains(text(),'Total Credits')]/following-sibling::dd")
    private WebElement ELE_TOTALCREDITS;

    public void VeifyProgramDetails(String DetailsHeader, String realValue){
        String courseDetails = "//div[@class='stats']//ul//li//dl//dt[contains(text(),'"+DetailsHeader+"')]/following-sibling::dd";
        WebElement valuecourseDetails = driver.findElement(By.xpath(courseDetails));
        String value = getText(valuecourseDetails);
        Assert.assertEquals(value,realValue);
    }

}

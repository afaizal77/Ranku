package com.maxsoft.webautomation.pages;

import com.maxsoft.webautomation.common.Base;
import com.maxsoft.webautomation.util.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversityHomePage extends Base {

    private static String LoginPageUrl = URL;
    private WebDriver driver = Driver.driver;

    @FindBy(xpath="(//a[text()='Sign Up or Log In'])[2]")
    private WebElement LBL_SIGNIN;

    @FindBy(xpath="//button[text()='Sign In']")
    private WebElement BTN_SIGNIN;

    @FindBy(xpath = "//input[@id='login-email']")
    private WebElement TXT_EMAIL;

    @FindBy(xpath = "//input[@id='login-password']")
    private WebElement TXT_PASSWORD;

    @FindBy(xpath = "//button[text()='Log In']")
    private WebElement BTN_LOGIN;

    @FindBy(xpath = "//a[text()='Online Programs']")
    private WebElement LBL_ONLINEPROGRAMS;

    public UniversityHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToLogin(){
        driver.get(LoginPageUrl);
    }

    public void UserSignIn(String username, String password){

        clickElement(LBL_SIGNIN);
        clickElement(BTN_SIGNIN);
        setTextAs(TXT_EMAIL,username);
        setTextAs(TXT_PASSWORD,password);
        clickElement(BTN_LOGIN);

    }

    public void ClickOnlinePrograms(){
        clickElement(LBL_ONLINEPROGRAMS);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void loadPage(){
        freeze(5);
    }

}
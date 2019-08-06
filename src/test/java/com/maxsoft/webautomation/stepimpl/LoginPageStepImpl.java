package com.maxsoft.webautomation.stepimpl;
import com.maxsoft.webautomation.pages.UniversityHomePage;
import com.maxsoft.webautomation.util.driver.Driver;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageStepImpl {

    private WebDriver driver = Driver.driver;
    private UniversityHomePage loginPage = PageFactory.initElements(driver, UniversityHomePage.class);

    @Step("On login page")
    public void navigateToLogin(){
        loginPage.navigateToLogin();
    }

    @Step("Login to the application using the username as <username> and password as <password>")
    public void UserSignIn(String username, String password){
        loginPage.UserSignIn(username, password);
    }


}
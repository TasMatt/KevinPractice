package com.parabank.steps;

import com.parabank.pages.LoginPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class LoginSteps extends WebDriverTestCase
{

    @QAFTestStep(description = "User Invokes parabank login page")
    public void userInvokesParabankLoginPage()
    {
        LoginPage loginPage = new LoginPage();

        loginPage.invoke();

        loginPage.textCustomerLogin.waitForPresent(20000);

        loginPage.waitForPageToLoad();

        // validate the customer login text displays
        Validator.assertTrue(loginPage.textCustomerLogin.isPresent(),"Customer Login text does not display","Customer Login text display");
    }

    @QAFTestStep(description = "User enters {username} and {password}")
    public void user_enters_and(String strUserName, String strPassword)
    {
        LoginPage loginPage = new LoginPage();

        // click on username textbox and enter username
        loginPage.textBoxUserName.click();
        loginPage.textBoxUserName.sendKeys(strUserName);

        // click on password textbox and enter password
        loginPage.textBoxPassWord.click();
        loginPage.textBoxPassWord.sendKeys(strPassword);

    }

    @QAFTestStep(description = "User clicks on login button")
    public void user_clicks_on_login_button()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.btnLoginIn.click();
    }

    @QAFTestStep(description = "User validates username text displays")
    public void user_validates_Username_text_displays()
    {
        LoginPage loginPage = new LoginPage();

        //waif for username text to load
        loginPage.textUserName.waitForPresent(20000);

        // wait for page to load
        loginPage.waitForPageToLoad();

        // validate the username label displays
        Validator.assertTrue(loginPage.textUserName.isPresent(),"Username text does not display","Username text displays");

    }

    @QAFTestStep(description = "User validates username textbox displays")
    public void user_validates_Username_textbox_displays()
    {
        LoginPage loginPage = new LoginPage();

        //waif for username textbox to load
        loginPage.textBoxUserName.waitForPresent(20000);

        // wait for page to load
        loginPage.waitForPageToLoad();

        // validate the username textbox displays
        Validator.assertTrue(loginPage.textBoxUserName.isPresent(),"Username textbox does not display","Username textbox displays");
    }

    @QAFTestStep(description = "User validates password text displays")
    public void user_validates_Password_text_displays()
    {
        LoginPage loginPage = new LoginPage();

        //waif for password text to load
        loginPage.textPassWord.waitForPresent(20000);

        // wait for page to load
        loginPage.waitForPageToLoad();

        // validate the upassword text displays
        Validator.assertTrue(loginPage.textPassWord.isPresent(), "Password text does not display","Password text displays");
    }

    @QAFTestStep(description = "User validates Password textbox displays")
    public void user_validates_Password_textbox_displays()
    {

        LoginPage loginPage = new LoginPage();

        //waif for password texbox to load
        loginPage.textBoxPassWord.waitForPresent(20000);

        // wait for page to load
        loginPage.waitForPageToLoad();

        // validate the password textbox displays
        Validator.assertTrue(loginPage.textBoxPassWord.isPresent(),"Password textbox does not display","Password textbox displays");
    }

    @QAFTestStep(description = "User logs into application using {username} and {password}")
    public static void loginInOne(String strUsername, String strPassword) {


    }

}

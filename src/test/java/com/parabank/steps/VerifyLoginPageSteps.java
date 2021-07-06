package com.parabank.steps;

import com.parabank.pages.LoginPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyLoginPageSteps extends WebDriverTestCase
{

    @Given("User invokes parabank login page")
    public void user_Invokes_Parabank_Login_Page()
    {
        LoginPage loginPage = new LoginPage();

        // invoke the login page
        loginPage.invoke();

        //waif for customer login label to load
        loginPage.textCustomerLogin.waitForPresent(20000);

        // wait for page to load
        loginPage.waitForPageToLoad();

        // validate the customer login text displays
        Validator.assertTrue(loginPage.textCustomerLogin.isPresent(),"Customer Login text does not display","Customer Login text display");

    }

    @Then("User validates username text displays")
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

    @Then("User validates username textbox displays")
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

    @Then("User validates password text displays")
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

    @Then("User validates Password textbox displays")
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

}

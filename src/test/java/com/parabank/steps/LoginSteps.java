package com.parabank.steps;

import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends WebDriverTestCase
{

    @Given("User Invokes parabank login page")
    public void user_Invokes_parabank_login_page()
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

    @When("^User enters \"(.*)\" and \"(.*)\"")
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

    @And("User clicks on login button")
    public void user_clicks_on_login_button()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.btnLoginIn.click();
    }

    @Then("User verifies home screen displays")
    public void user_verifies_home_screen_displays()
    {
        HomePage homePage = new HomePage();
        Validator.assertTrue(homePage.textWelcome.isPresent(),"User cannot verify welcome message","User verifies welcome text displays");
    }

}

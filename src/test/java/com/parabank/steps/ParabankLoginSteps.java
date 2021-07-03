package com.parabank.steps;

import com.parabank.pages.ParabankLoginPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class ParabankLoginSteps extends WebDriverTestCase
{
    @QAFTestStep(description = "User Invokes Parabank Login Page")
    public static void invokeLoginPage()
    {

        ParabankLoginPage loginPage = new ParabankLoginPage();

        loginPage.invoke();
        loginPage.labelUserName.waitForPresent(20000);

        loginPage.waitForPageToLoad();

        //Validator.verifyTrue(true, "fail", "sccess"); // will fails the steps but continue the rest

        Validator.assertTrue(loginPage.labelUserName.isPresent(),"Login page is not displaying, test failed","Login page is displayed"); // will fail the test and stop executing the script

    }

    @QAFTestStep(description = "User validates username label")
    public static void userValidatesUserNAmeLabel()
    {

        ParabankLoginPage loginPage = new ParabankLoginPage();


        loginPage.labelUserName.waitForPresent(20000);

        loginPage.waitForPageToLoad();

        //Validator.verifyTrue(true, "fail", "sccess"); // will fails the steps but continue the rest

        Validator.assertTrue(loginPage.labelUserName.getText().contentEquals("Username"),
                "usrname label displayed is incorrect the actual label is "+loginPage.labelUserName.getText(),"usrname label displayed currectly");

        loginPage.labelUserName.verifyText("Username2", "username label");




    }
}

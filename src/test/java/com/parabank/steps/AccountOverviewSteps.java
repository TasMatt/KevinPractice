package com.parabank.steps;

import com.parabank.pages.AccountOverviewPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class AccountOverviewSteps extends WebDriverTestCase
{
    @QAFTestStep(description = "User verifies home screen displays")
    public void user_verifies_home_screen_displays()
    {
        AccountOverviewPage accountOverviewPage = new AccountOverviewPage();
        Validator.assertTrue(accountOverviewPage.textWelcome.isPresent(),"User cannot verify welcome message","User verifies welcome text displays");
    }
}

package com.parabank.steps;

import com.parabank.pages.AboutUsPage;
import com.parabank.pages.AccountOverviewPage;
import com.parabank.pages.BasePage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class CommonSteps extends WebDriverTestCase
{

    @QAFTestStep(description = "User navigates to {page} page")
    public static void navigation(String strPage) {

        BasePage basePage = new BasePage();
        AboutUsPage aboutUsPage = new AboutUsPage();

        switch (strPage) {
            case "About Us":
                basePage.linkAboutUs.click();
                aboutUsPage.waitForPageToLoad();
                aboutUsPage.headerParaSoftDemoWebsite.waitForPresent(20000);
                Validator.assertTrue(aboutUsPage.headerParaSoftDemoWebsite.isPresent(),
                        "The about us page is not displayed. Test exited.",
                        "The about us page is displayed successfully.");

            case "Services":




        }

    }


}

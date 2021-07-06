package com.parabank.pages;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AccountOverviewPage extends BasePage
{
	@Override
	protected void openPage(PageLocator locator, Object... args)
	{

	}

	public void invoke()
	{
		driver.get("/");
		driver.manage().window().maximize();
	}

	@FindBy(locator = "xpath=//b[contains(text(),'Welcome')]")
	public QAFWebElement textWelcome;




}

package com.parabank.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class BasePage extends WebDriverBaseTestPage<WebDriverTestPage>
{

	@Override
	protected void openPage(PageLocator locator, Object... args)
	{
		// TODO Auto-generated method stub
		
	}

	@FindBy(locator = "xpath=(//a[text()='About Us'])[1]")
	public QAFWebElement linkAboutUs;




}

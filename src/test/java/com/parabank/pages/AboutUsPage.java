package com.parabank.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AboutUsPage extends WebDriverBaseTestPage<WebDriverTestPage>
{

	@Override
	protected void openPage(PageLocator locator, Object... args)
	{
		// TODO Auto-generated method stub
		
	}

	@FindBy(locator = "//h1[@class='title']")
	public QAFWebElement headerParaSoftDemoWebsite;




}

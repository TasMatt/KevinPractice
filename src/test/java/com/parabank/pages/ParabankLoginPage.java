package com.parabank.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ParabankLoginPage extends ParabankBasePage
{
	@Override
	protected void openPage(PageLocator locator, Object... args)
	{
		// TODO Auto-generated method stub

	}

	public void invoke() {
		driver.get("/");
		driver.manage().window().maximize();
	}

	@FindBy(locator = "xpath=//b[text()='Username']")
	public QAFWebElement labelUserName;

	@FindBy(locator = "xpath=//input[@name='username']")
	public QAFWebElement textBoxUserName;

	@FindBy(locator = "xpath=//b[text()='Password']")
	public QAFWebElement labelPassWord;

	@FindBy(locator = "xpath=//input[@name='Password']")
	public QAFWebElement textBoxPassWord;



}

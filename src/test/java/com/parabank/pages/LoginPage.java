package com.parabank.pages;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class LoginPage extends BasePage
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

	@FindBy(locator = "xpath=//h2[text()='Customer Login']")
	public QAFWebElement textCustomerLogin;

	@FindBy(locator = "xpath=//b[text()='Username']")
	public QAFWebElement textUserName;

	@FindBy(locator = "xpath=//input[@name='username']")
	public QAFWebElement textBoxUserName;

	@FindBy(locator = "xpath=//b[text()='Password']")
	public QAFWebElement textPassWord;

	@FindBy(locator = "xpath=//input[@name='password']")
	public QAFWebElement textBoxPassWord;

	@FindBy(locator = "xpath=//input[@value='Log In']")
	public QAFWebElement btnLoginIn;



}

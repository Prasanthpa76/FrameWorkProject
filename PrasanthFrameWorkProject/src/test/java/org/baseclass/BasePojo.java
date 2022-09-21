package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePojo extends BaseXlFill {

	// non para constructor
	public BasePojo() {
		PageFactory.initElements(driver, this);
	}

	// private webelement
	@FindBy(id = "join_neu_email_field")
	private WebElement txtUser;

	@FindBy(id = "join_neu_password_field")
	private WebElement txtPass;

	@FindBy(name = "submit_attempt")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;

	}

	public WebElement getTxtPass() {
		return txtPass;

	}

	public WebElement getBtnLogin() {
		return btnLogin;

	}

}

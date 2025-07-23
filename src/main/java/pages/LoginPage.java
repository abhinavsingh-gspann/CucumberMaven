package pages;

import org.openqa.selenium.By;

import factory.DriverFactory;

public class LoginPage {
	
	private final By USERNAME_TXTFIELD_LOC = By.id("customer_email");
	private final By PASSWORD_TXTFIELD_LOC = By.id("customer_password");
	private final By SIGN_IN_BTN_LOC = By.xpath("//*[@value='Sign In']");
	
	
	public void enterUsername(String email) {
		DriverFactory.getDriver().findElement(USERNAME_TXTFIELD_LOC).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		DriverFactory.getDriver().findElement(PASSWORD_TXTFIELD_LOC).sendKeys(password);
	}
	
	public void clickOnSignInBtn() {
		DriverFactory.getDriver().findElement(SIGN_IN_BTN_LOC).click();
	}

}

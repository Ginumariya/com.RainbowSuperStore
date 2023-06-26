package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPageClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	public LoginPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[text()='Sign In']")
	WebElement signIn;

	@FindBy(xpath = "//*[text()=' Admin']")
	WebElement adminText;

	@FindBy(xpath = "//*[text()=' Alert!']")
	WebElement alert;

	@FindBy(xpath = "//input[@id='remember']")
	WebElement rememberMeCheckBox;

	public void login(String uname, String Pword) {
		gl.typeElement(userName, uname);
		gl.typeElement(password, Pword);
		gl.clickOnElement(signIn);
	}

	public String getTextofAdmin() {
		return gl.getTextofElement(adminText);

	}

	public String getTextofAlertMessage() {
		return gl.getTextofElement(alert);

	}

	public boolean isRememberMeCheckBoxSelectedOrNot() {
		return gl.isSelected(rememberMeCheckBox);

	}

}

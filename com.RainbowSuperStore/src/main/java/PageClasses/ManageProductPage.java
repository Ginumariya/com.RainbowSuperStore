package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageProductPage {
	WebDriver driver;
	
	GeneralUtilities gl = new GeneralUtilities();
	
	public ManageProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="(//*[@class='form-control'])[3]")
    WebElement productCode;
	
	@FindBy(xpath="(//*[contains(@class,'table ')]//tbody//tr[1]//td[1]//button[@type='button'])[1]")
	WebElement text;
	public void clickOnSearch() {
		gl.clickOnElement(search);
	}
	
	public void typeonProductCode(String value) {
		gl.typeElement(productCode, value);
	}
	
	public boolean textDisplayedOrNot() {
		return gl.isDisplayed(text);
	}
	
	

}

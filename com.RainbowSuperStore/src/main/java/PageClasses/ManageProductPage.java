package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.FluentWaitClass;
import utilities.GeneralUtilities;

public class ManageProductPage {
	WebDriver driver;
	
	GeneralUtilities gl = new GeneralUtilities();
	ExplicitWait ew=new ExplicitWait();
	FluentWaitClass fw=new FluentWaitClass();
	
	public ManageProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="(//*[@class='form-control'])[3]")
    WebElement productCode;
	
	@FindBy(xpath="(//*[contains(@class,'table ')]//tbody//tr[1]//td[1]//button[@type='button'])[1]")
	WebElement productCodeText;
	public void clickOnSearch() {
		ew.elementToBeClickableWait(driver, search);
		gl.clickOnElement(search);
		
		
	}
	
	public void typeonProductCode(String value) {
		ew.presenceOfElementLoactedWait(driver, "(//*[@class='form-control'])[3]");
		gl.typeElement(productCode, value);
	}
	
	public boolean textDisplayedOrNot() {
		fw.visibilityOfWait(productCodeText, driver);
		return gl.isDisplayed(productCodeText);
	}
	
	

}

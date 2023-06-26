package PageClasses;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.FileUpload;
import utilities.GeneralUtilities;

public class ManageExpensePage {
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	FileUpload f=new FileUpload();
	
	public ManageExpensePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[text()='List Expense'])[1]")
	WebElement listExpenseText;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-danger']")
	WebElement newManageExpense;
	
	@FindBy(xpath="//select[@id='user_id']")
	WebElement userdropdown;
	
	@FindBy(xpath="//input[@class='form-control date']")
	WebElement date;
	
	@FindBy(xpath="//select[@id='ex_cat']")
	WebElement categoryDropdown;
	
	@FindBy(xpath="//select[@id='order_id']")
	WebElement orderIdDropdown;
	
	@FindBy(xpath="//select[@id='purchase_id']")
	WebElement purchaseIdDropdown;
	
	@FindBy(xpath="//select[@id='ex_type']")
	WebElement expenseTypeDropDown;
	
	@FindBy(xpath="//input[@class='form-control']")
	WebElement amount;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//*[@id='content']")
	WebElement remarks;
	
	@FindBy(xpath="//*[@name='userfile']")
	WebElement choosefile;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement expenseCreatedAlert;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="(//*[@class='form-control selectpicker'])[2]")
	WebElement categoryDropDown1;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")
	WebElement search1;
	
	@FindBy(xpath="//*[contains(@class,'table table')]//tbody//tr[1]//td[1]")
	WebElement fruitsText;
	
	
   

	
	
	public boolean listExpenseTextDisplayedOrNot() {
		return gl.isDisplayed(listExpenseText);
	}
	
	public void clickonNewManageExpense() {
		gl.clickOnElement(newManageExpense);
	}
	
	public void userdropdownselectbyindex() {
		gl.selectByIndex(userdropdown, 3);
	}
	
	
	public void typeOnDateTab(String value) {
		gl.clearElement(date);
		gl.typeElement(date, value);
		
	}
	public void categoryDropdownselectbyindex() {
		gl.selectByIndex(categoryDropdown, 5);
	}
	public void orderIdDropdownselectbyValue() {
		gl.selectByValue(orderIdDropdown, "11");
	}
	public void puchaseIdDropdwoanSelectbyValue() {
		gl.selectByValue(purchaseIdDropdown, "13");
	}
	
	public void expenseTypeDropDownSelectByIndex() {
		gl.selectByIndex(expenseTypeDropDown, 3);
	}
	
	public void typeonAmount(String value) {
		gl.typeElement(amount, value);
	}
	
	public void typeOnRemarks(String value) {
		gl.typeElement(remarks, value);
	}
	
	public void uploadfileUsingSendKeys(String value) {
		gl.typeElement(choosefile, value);
	}
	public void clickonSaveButton() {
		gl.clickElementjs(saveButton, driver);
	}
	public boolean ExpenseCreatedAlertIsDisplayedOrNot() {
		return gl.isDisplayed(expenseCreatedAlert);
	}
	
	public void clickonSearch() {
		gl.clickOnElement(search);
	}
	
	public void categoryDropDown1SelectedByIndex() {
		gl.selectByIndex(categoryDropDown1, 5);
	}
	public void clickonSearch1() {
		WebDriverWait waitclick=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitclick.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-danger btn-fix']")));
		gl.clickElementjs(search1, driver);
	}
	
	public boolean fruitsTextIsDisplayedOrNot() {
		WebDriverWait waitclick=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitclick.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,'table table')]//tbody//tr[1]//td[1]")));
		return gl.isDisplayed(fruitsText);
	}
	
	public void clickOnChooseFileButton() {
		gl.clickElementjs(choosefile, driver);
	}
	public void sampleFileUpload() throws AWTException {
		f.fileUpload();
		
		
	}
	
	

}

package PageClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelRead;
import utilities.GeneralUtilities;

public class ExpenseCatogory {
	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	
	public ExpenseCatogory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[text()='Expense Category'])[2]")
	WebElement expenseCategoryText;
	
	@FindBy(xpath="(//*[@class='fas fa-edit'])[1]")
	WebElement newadd;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement title;
	
	@FindBy(xpath="(//*[@type='submit'])[2]")
	WebElement save;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]")
	WebElement frenchFries;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement mainsearch;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement titile1;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	WebElement search1;
	
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")
	WebElement deleteIcon;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement alertMessage;
	
	public String getTextofExpenseCategory() {
		return gl.getTextofElement(expenseCategoryText);
	}
	
	public void clickonnew() {
		gl.clickOnElement(newadd);
	}
	
	public void typeonTitle(String value) {
		gl.typeElement(title, value);
	}
	
	public void clickonSave() {
		gl.clickOnElement(save);
	}
	
	public boolean FrenchfriesTextDisplayedOrNot() {
		return gl.isDisplayed(frenchFries);
	}
	
	public void clickonMainSearch() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='btn btn-rounded btn-primary']")));
		gl.clickElementjs(mainsearch, driver);
	}
	
	public void typeontitile1(String value) {
		gl.typeElement(titile1, value);
	}
	
	public void clickOnSearch1() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@type='submit'])[1]")));
		
		gl.clickElementjs(search1, driver);
	}
	
	public void clickOnDeleteIcon() {
		gl.clickOnElement(deleteIcon);
	}
	public void alertAccept() {
		gl.alertAccept(driver);
	}
	
	public boolean alertMessageDisplayedOrNot() {
		return gl.isDisplayed(alertMessage);
	}
	
	public String expenseRead(int row,int column) throws IOException {
		return ExcelRead.getStringData(row, column);
	}
	
	

}

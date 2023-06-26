package PageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePageClass {
	
		
		WebDriver driver;
		
		GeneralUtilities gl=new GeneralUtilities();
		
		public HomePageClass(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@class='fas fa-arrow-circle-right']")
		List<WebElement>allTile;
		
		@FindBy(xpath="(//*[contains(text(),'Manage Orders')])[1]")
		WebElement manageOrders;
		
		@FindBy(xpath="(//a[@class='nav-link'])[5]")
		WebElement manageExpense;
		
		@FindBy(xpath="//*[text()='Expense Category']")
		WebElement expenseCategory;
		
		@FindBy(xpath="(//i[@class='far fa-circle nav-icon'])[3]")
		WebElement manageExpensebutton;
		
		@FindBy(xpath="(//*[@class=' nav-link'])[2]")
		WebElement manageProduct;
		
		
		
		
		
		public boolean isAllTilesDisplayed() {
			
				for(WebElement element1:allTile) {
				gl.isDisplayed(element1);
				
			}
				return true;
		}
		
		public void clickManageExpense() {
			gl.clickOnElement(manageExpense);
		}
		
		public void clickonExpenseCategory() {
			gl.clickOnElement(expenseCategory);
		}
		
		public void clickonManageExpensebutton() {
			gl.clickOnElement(manageExpensebutton);
		}
		
		public void clickOnManagaeProduct() {
			gl.clickOnElement(manageProduct);
		}
		
		
			
			
		
}
		
		





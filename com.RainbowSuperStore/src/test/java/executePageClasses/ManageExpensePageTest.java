package executePageClasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import PageClasses.ManageExpensePage;
import reTryAnalyzer.RetryAnalyzer;

public class ManageExpensePageTest extends BaseClass{
	LoginPageClass lp;
	HomePageClass hp;
	ManageExpensePage mp;
  @Test (priority = 0,retryAnalyzer=RetryAnalyzer.class,groups = {"group1"})
  public void verifyManageExpensePageisDisplayedOrNot() {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mp=new ManageExpensePage(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonManageExpensebutton();
	  boolean actual=mp.listExpenseTextDisplayedOrNot();
	  Assert.assertTrue(actual);
	  
  }
  @Test(priority = 1,retryAnalyzer=RetryAnalyzer.class,groups = {"create"})
  public void verifytoCreateNewManageExpense() throws AWTException, IOException {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mp=new ManageExpensePage(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonManageExpensebutton();
	  mp.clickonNewManageExpense();
	  mp.userdropdownselectbyindex();
	  mp.typeOnDateTab("23/06/2023");
//	  mp.typeOnDateTab(mp.readValueInteger(7, 1));
	  mp.categoryDropdownselectbyindex();
	  mp.orderIdDropdownselectbyValue();
	  mp.puchaseIdDropdwoanSelectbyValue();
	  mp.expenseTypeDropDownSelectByIndex();
//	  mp.typeonAmount("1000");
	  mp.typeonAmount(mp.readValueInteger(8, 1));
//	  mp.typeOnRemarks("good");
	  mp.typeOnRemarks(mp.readValue(9, 1));
//	  mp.uploadfileUsingSendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\sample.jpg");
	  mp.clickOnChooseFileButton();
	  mp.sampleFileUpload();
	  
	  mp.clickonSaveButton();
	  boolean actual=mp.ExpenseCreatedAlertIsDisplayedOrNot();
	  Assert.assertTrue(actual);
	  
  }
  @Test(priority = 2,retryAnalyzer=RetryAnalyzer.class,groups = {"search"})
  public void verifyToSearchCreatedManagaeExpense() {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mp=new ManageExpensePage(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonManageExpensebutton();
	  mp.clickonSearch();
	  mp.categoryDropDown1SelectedByIndex();	  
	  mp.clickonSearch1();
	  boolean actual=mp.fruitsTextIsDisplayedOrNot();
	  Assert.assertTrue(actual);
	  
	  
  
  
}
}

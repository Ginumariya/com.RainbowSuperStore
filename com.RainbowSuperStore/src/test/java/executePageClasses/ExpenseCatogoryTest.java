package executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.ExpenseCatogory;
import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import reTryAnalyzer.RetryAnalyzer;

public class ExpenseCatogoryTest extends BaseClass {
	 LoginPageClass lp;
	 HomePageClass hp;
	 ExpenseCatogory ec;
  @Test(priority = 1,retryAnalyzer=RetryAnalyzer.class,groups = {"group1"})
  public void verifyExpensecategoryPageisDisplayedorNot() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	  String actual=ec.getTextofExpenseCategory();
	  String exp="Expense Category";
	  Assert.assertEquals(actual, exp);
	  
	  
	  
	 
  }
  @Test(priority = 2,retryAnalyzer=RetryAnalyzer.class,groups = {"create"})
  public void verifyToCreateNewExpense() throws IOException {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	 ec.clickonnew();
	
	 ec.typeonTitle(ec.expenseRead(3,1));
	 
	 ec.clickonSave();
	 boolean actual=ec.FrenchfriesTextDisplayedOrNot();
	 boolean exp=true;
	 Assert.assertEquals(actual, exp);
	 
	  
  }
  @Test(priority = 3,retryAnalyzer=RetryAnalyzer.class,groups = {"search"})
  public void verifyToSearchCreatedExpense() throws IOException {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	 ec.clickonMainSearch();
	 ec.typeontitile1(ec.expenseRead(3, 1));
	
	 ec.clickOnSearch1();
	 boolean actual=ec.FrenchfriesTextDisplayedOrNot();
	 boolean exp=true;
	 Assert.assertEquals(actual, exp);
  
  
  
  }
  @Test(priority = 4,retryAnalyzer=RetryAnalyzer.class,groups = {"group2"})
  public void verifyToDeleteCreatedexpense() throws IOException {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	ec.clickonnew();
	ec.typeonTitle(ec.expenseRead(3,1));
	
	ec.clickonSave();
	 

	 ec.clickOnDeleteIcon();
	 ec.alertAccept();
	 boolean actual=ec.alertMessageDisplayedOrNot();
	 boolean exp=true;
	 Assert.assertEquals(actual, exp);
  
  
  
  }
}

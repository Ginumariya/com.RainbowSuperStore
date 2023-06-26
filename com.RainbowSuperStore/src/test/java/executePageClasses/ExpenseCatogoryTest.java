package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.ExpenseCatogory;
import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;

public class ExpenseCatogoryTest extends BaseClass {
	 LoginPageClass lp;
	 HomePageClass hp;
	 ExpenseCatogory ec;
  @Test(priority = 1)
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
  @Test(priority = 2)
  public void verifyToCreateNewExpense() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	 ec.clickonnew();
	 ec.typeonTitle("FrenchFries");
	 ec.clickonSave();
	 boolean actual=ec.FrenchfriesTextDisplayedOrNot();
	 boolean exp=true;
	 Assert.assertEquals(actual, exp);
	 
	  
  }
  @Test(priority = 3)
  public void verifyToSearchCreatedExpense() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	 ec.clickonMainSearch();
	 ec.typeontitile1("FrenchFries");
	 ec.clickOnSearch1();
	 boolean actual=ec.FrenchfriesTextDisplayedOrNot();
	 boolean exp=true;
	 Assert.assertEquals(actual, exp);
  
  
  
  }
  @Test(priority = 4)
  public void verifyToDeleteCreatedexpense() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ec=new ExpenseCatogory(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickManageExpense();
	  hp.clickonExpenseCategory();
	  
	 ec.clickonnew();
	 ec.typeonTitle("FrenchFries");
	 ec.clickonSave();
	 ec.clickOnDeleteIcon();
	 ec.alertAccept();
	 boolean actual=ec.alertMessageDisplayedOrNot();
	 boolean exp=true;
	 Assert.assertEquals(actual, exp);
  
  
  
  }
}

package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.LoginPageClass;
import reTryAnalyzer.RetryAnalyzer;

public class LogInPageTestClass extends BaseClass {
	LoginPageClass lp;
	
  @Test(priority = 0,dataProviderClass = DataProviderLogin.class,dataProvider = "SucsessfullLoginDP",retryAnalyzer=RetryAnalyzer.class)
  public void verifySucsessfullLogin(String uname,String password) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(uname,password);
	  String actual=lp.getTextofAdmin();
	  String exp="Admin";
	  Assert.assertEquals(actual, exp);
	  }
  @Test(priority = 1,dataProviderClass = DataProviderLogin.class,dataProvider = "UnSucsessfullLoginDP",retryAnalyzer=RetryAnalyzer.class)
  public void verifyunsucessfullLogin(String uname,String password) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(uname,password);
	  String actual=lp.getTextofAlertMessage();
	  String exp="Alert!";
	  Assert.assertEquals(actual, exp);
	  }
  @Test(priority = 2,retryAnalyzer=RetryAnalyzer.class)
  public void verifyrememberMeCheckBoxIsSelectedOrNot() {
	  
	  lp=new LoginPageClass(driver);
		 boolean result=lp.isRememberMeCheckBoxSelectedOrNot();
		 Assert.assertTrue(result);
	  }
 
  
	  
  
  
  
	  
  }
  


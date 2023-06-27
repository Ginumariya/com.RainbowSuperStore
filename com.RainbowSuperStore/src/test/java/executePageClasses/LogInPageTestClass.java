package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.LoginPageClass;

public class LogInPageTestClass extends BaseClass {
	LoginPageClass lp;
	
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "SucsessfullLoginDP")
  public void verifySucsessfullLogin(String uname,String password) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(uname,password);
	  String actual=lp.getTextofAdmin();
	  String exp="Admin";
	  Assert.assertEquals(actual, exp);
	  }
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "UnSucsessfullLoginDP")
  public void verifyunsucessfullLogin(String uname,String password) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(uname,password);
	  String actual=lp.getTextofAlertMessage();
	  String exp="Alert!";
	  Assert.assertEquals(actual, exp);
	  }
  @Test
  public void verifyrememberMeCheckBoxIsSelectedOrNot() {
	  
	  lp=new LoginPageClass(driver);
		 boolean result=lp.isRememberMeCheckBoxSelectedOrNot();
		 Assert.assertFalse(result);
	  }
 
  
	  
  
  
  
	  
  }
  


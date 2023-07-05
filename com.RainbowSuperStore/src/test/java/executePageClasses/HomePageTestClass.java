package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import reTryAnalyzer.RetryAnalyzer;

public class HomePageTestClass extends BaseClass{
	
	  LoginPageClass lp;
	  HomePageClass hp;
	
  @Test(retryAnalyzer=RetryAnalyzer.class,groups = {"group1"})
  public void verifyAllTilesAreDisplayedOrNotInHomePage() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  
	  lp.login("admin","admin" );
	  
	  boolean actul=hp.isAllTilesDisplayed();
	  Assert.assertTrue(actul);
	  
	
  }
}

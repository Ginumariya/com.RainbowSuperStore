package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import PageClasses.ManageProductPage;
import reTryAnalyzer.RetryAnalyzer;

public class ManageProductPageTest extends BaseClass {
	LoginPageClass lp;
	HomePageClass hp;
	ManageProductPage mpp;
  @Test(retryAnalyzer=RetryAnalyzer.class)
  public void verifyToSearchaProduct() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mpp=new ManageProductPage(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickOnManagaeProduct();
	  mpp.clickOnSearch();
	  mpp.typeonProductCode("1185");
	  boolean actual=mpp.textDisplayedOrNot();
	  Assert.assertTrue(actual);
	  
	  
	  
  }
}

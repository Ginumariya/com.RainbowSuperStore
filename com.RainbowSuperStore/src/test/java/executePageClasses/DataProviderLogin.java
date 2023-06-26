package executePageClasses;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderLogin {
  

  @DataProvider(name = "UnSucsessfullLoginDP")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "jinu", "admin" },
      new Object[] { "admin", "jinu" },
      new Object[] { "jinu", "jinu123" },
    };
  }
  @DataProvider(name = "SucsessfullLoginDP")
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { "admin", "admin" },
      
    };
  }
}

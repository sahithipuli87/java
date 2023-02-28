package hybridDemos;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pompages.BrowserFactory;
import Pompages.ClsEbay;
import ddfDemos.EbayTestData;

public class HybridEbayProdSearchTest {
  @Test(dataProvider="ebayData")
    public void prodSearch(String cat,String prod)
    {
	  WebDriver driver=BrowserFactory.startBrowser("chrome","http://ebay.com");
	  ClsEbay obj=new ClsEbay(driver);
	  obj.fnSearch(prod);
	  
	  Reporter.log(" ' " + prod + " ' product search test is Succesful...",true);
    }
  @DataProvider
  public Object[][] ebayData() throws Exception
  {
	  Object[][]  myExcelData=EbayTestData.getExcelData("C:\\Users\\sahit\\Downloads\\mvnDemo1-20230216T063855Z-001\\mvnDemo1\\src\\test\\resources\\ebay.xlsx");
	  return myExcelData;
  }
}

	  
	  

  


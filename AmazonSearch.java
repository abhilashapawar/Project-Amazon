package com.qa.amazon;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.AmazonPage.Amazonpages_01;
import com.qa.utility.ExcelUtility;


public class AmazonSearch extends BaseClass
{
	 @Test(dataProvider="getdata")
	  public void amazonShop(String input) throws InterruptedException
	  {
		 //Thread.sleep(30000);
		 Amazonpages_01 page=new Amazonpages_01(driver);
		 page.getTypetosearch().clear();
		  page.getTypetosearch().sendKeys(input);
		  page.getTypetosearch().sendKeys(Keys.ENTER);
		 
	      page.getSelecting().click();
	      
	      Set<String> window=driver.getWindowHandles();
	      String handle=null;
	      for(String shift : window)
	      {
	    	  handle=shift;
	      }
	      driver.switchTo().window(handle);
	      
		  page.getCartAdd().click();
		  page.getHome().click();
		  
	  }
		@DataProvider(name="getdata")
		public Object[][] getData() throws IOException
		{
			String xlPath="C:\\Users\\abhilasha pawar\\eclipse-workspace\\seleniumautomation\\src\\test\\java\\com\\qa\\utility\\amazontestdata.xlsx";
			String xlSheet="Sheet1";
		   int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
		   int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		   String[][] data= new String[rowCount][cellCount];
		   for(int i=1;i<=rowCount;i++)
		   {
			   for(int j=0;j<cellCount;j++)
			   {
				   data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			   }
		   }
		   return data;
			
		}  
	

}

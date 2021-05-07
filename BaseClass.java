package com.qa.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass
{
	WebDriver driver;
	//AmazonPage page;

	@Parameters({"Browser","url"})
	@BeforeClass
	public void SetUp(String Browser,String url)
	{
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abhilasha pawar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		
		{
     
     System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abhilasha pawar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
     driver=new EdgeDriver();
		}
		else
		{
      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\abhilasha pawar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
      driver=new InternetExplorerDriver();
		}
	
		driver.get(url);
	}

	
	@AfterClass
	public void TearDown()
	{
			driver.quit();
	}
	

}

	



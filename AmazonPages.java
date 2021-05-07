package com.qa.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages
{
	WebDriver driver;
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]")
	WebElement Login;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement Email;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement Password;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement LoginBtn;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement SearchForProduct;
	@FindBy(xpath="//div[contains(text(),'My Account')]")
	WebElement MyAccount;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")
	WebElement ClickOnProduct;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]")
	WebElement Logout;
	
	public WebElement getLogin() {
		return Login;
		
	}
	public WebElement getEmail() {
		return Email;                                                  
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	public WebElement getSearchForProduct() {
		return SearchForProduct;
	}
	public WebElement getMyAccount() {
		return MyAccount; 
	}
	public WebElement getClickOnProduct() {
		return  ClickOnProduct;
	}
	
	
	public WebElement getLogout() {
		return Logout;
	}
	
	public AmazonPages(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver, this);
	}

}



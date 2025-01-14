package com.app.pageobject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class HomePage_Locators extends BaseClass{
	
	public  HomePage_Locators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="q") 
	private WebElement searbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement serchbtn;
	
	@FindBy(xpath="//div[@class='KzDlHZ']")
	private WebElement selectmob;
	
	public WebElement getSearchBox() {
		return searbox;
	}
	
	public WebElement getSearchBtn() {
		return serchbtn;
	}
	
	public WebElement getSelectMob() {
		return selectmob;
	}
	
	
	
	
}

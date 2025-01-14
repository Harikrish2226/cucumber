package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.HomePage_PageExe;

public class ProductPage_Locators extends HomePage_PageExe {
	
	public ProductPage_Locators() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
	private WebElement addTocCart;


	public WebElement getAddToCart() {
		return addTocCart;
		
	}

}

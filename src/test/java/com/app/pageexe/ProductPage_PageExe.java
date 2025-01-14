package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.pageobject.ProductPage_Locators;

public class ProductPage_PageExe extends ProductPage_Locators {

	public static void addTocart() {
		BaseClass.clickbuton(new ProductPage_Locators().getAddToCart());
	}
	
	
	
}

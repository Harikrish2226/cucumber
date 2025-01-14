package com.app.pageexe;

import java.util.Set;

import com.app.base.BaseClass;
import com.app.pageobject.HomePage_Locators;

public class HomePage_PageExe extends HomePage_Locators {
	
	public static void searchBox(String sname) {
		BaseClass.inputText(new HomePage_Locators().getSearchBox(), sname);
	}
	
	public static void searchBtn() {
		BaseClass.clickbuton(new HomePage_Locators().getSearchBtn());
	}
	
	public static void selectPhone() {
		BaseClass.clickbuton(new HomePage_Locators().getSelectMob());
		String homewindow = driver.getWindowHandle();

		Set<String> multiwindows = driver.getWindowHandles();

		for (String window : multiwindows) {
			if (!window.equals(homewindow)) {
				driver.switchTo().window(window);
				break;

			}
		}

	}

}

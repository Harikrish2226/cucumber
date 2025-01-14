package com.app.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.app.base.BaseClass;
import com.app.pageexe.HomePage_PageExe;
import com.app.pageexe.ProductPage_PageExe;

import io.cucumber.java.en.*;

public class StepDefinition extends ProductPage_PageExe {
	public static WebDriver driver = null;

	@Given("Browser launch and enter the url {string}")
	public void browser_launch_and_enter_the_url(String string) {
		BaseClass.browserlaunchWithUrl(string);
	}

	@When("Go to the global search box and search {string} and click")
	public void go_to_the_global_search_box_and_search_and_click(String string) {
		HomePage_PageExe.searchBox(string);
		HomePage_PageExe.searchBtn();

	}

	@When("select the mobile")
	public void select_the_mobile() {
		HomePage_PageExe.selectPhone();
	}

	@When("go to the product details page and click the add to cart button")
	public void go_to_the_product_details_page_and_click_the_add_to_cart_button() {
		ProductPage_PageExe.addTocart();

	}

	@Then("Mobile added in the Addtocart")
	public void mobile_added_in_the_addtocart() {
   BaseClass.screenShot();
		System.out.println("Mobile added in the Cart sucessfully");

	}

}

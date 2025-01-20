package com.sample;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//llkkk
public class DisableInfoBar {
	public static void main(String[] args) {
		//close info bar in chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");

	}

}

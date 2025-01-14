package com.app.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver = null;
	
	public static void browserlaunchWithUrl(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void inputText(WebElement element, String name) {
		element.sendKeys(name);
		
	}
	
	public static void clickbuton(WebElement element) {
		element.click();
	}
	
	public static void screenShot()  {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String date =sm.format(d);
		System.out.println(date);
		File dest = new File("C:\\Users\\Hari\\eclipse-workspace-latestnew\\Flipkart\\src\\"
				+ "test\\resources\\snap" + date + ".png");

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

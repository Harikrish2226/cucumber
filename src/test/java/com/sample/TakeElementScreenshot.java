package com.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeElementScreenshot {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("pass"));

		WebElement login = driver.findElement(By.linkText("Log in"));

		File srcuser = username.getScreenshotAs(OutputType.FILE);
		File srcpass = password.getScreenshotAs(OutputType.FILE);
		File srclogin = login.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcuser, new File("./target/screenshot/username.png"));
			FileUtils.copyFile(srcpass, new File("./target/screenshot/password.png"));
			FileUtils.copyFile(srclogin, new File("./target/screenshot/login.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

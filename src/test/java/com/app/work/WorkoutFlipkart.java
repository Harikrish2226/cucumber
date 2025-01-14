package com.app.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkoutFlipkart {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://www.flipkart.com/");
		
	WebElement search =	driver.findElement(By.name("q"));
	search.sendKeys("IPhone 16");
		WebElement btn =driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		
	String mobile =	driver.findElement(By.className("KzDlHZ")).getText();
	System.out.println(mobile);
	
	
	}

}

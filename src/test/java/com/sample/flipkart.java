package com.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		
		//browser launch and enter the url
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		
		//home page 
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Iphone 16");
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();

		WebElement selphone = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
		selphone.click();
        String homewindow = driver.getWindowHandle();
        String hometitle=	driver.getTitle();
        System.out.println(hometitle);

		Set<String> multiwindows = driver.getWindowHandles();

		for (String window : multiwindows) {
			if (!window.equals(homewindow)) {
				driver.switchTo().window(window);
				break;

			}
		}
		
	String currentTitle=	driver.getTitle();
	System.out.println(currentTitle);

		//addtocart page
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));

		addtocart.click();

	}
}

package com.app.work;

import java.awt.Desktop.Action;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkoutFlipkart {

	public static void main(String[] args) throws InterruptedException {
		String watch = "Casio";
		String page = "10";

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Fashion']")).click();
		driver.findElement(By.xpath("//div[@class='bpjkJb']//span[3]")).click();

		Thread.sleep(3000);
		WebElement watches = driver.findElement(By.xpath("//div[@class='wZsanD']//a[@title='" + watch + "']"));
		Actions act = new Actions(driver);
		act.moveToElement(watches).click().perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(3000);

		WebElement pten = driver.findElement(By.xpath("//nav[@class='WSL9JP']//a[text()='"+page+"']"));

		js.executeScript("arguments[0].scrollIntoView(true)", pten);
		js.executeScript("arguments[0].click()", pten);
		
		Thread.sleep(3000);

		WebElement peleven = driver.findElement(By.xpath("//nav[@class='WSL9JP']//a[text()='11']"));
		js.executeScript("arguments[0].scrollIntoView(true)", peleven);
		js.executeScript("arguments[0].click()", peleven);

		Thread.sleep(5000);

	List<WebElement> names =	driver.findElements(By.xpath("//a[contains(@class, 'WKTcLC')]"));
	
	List<WebElement> prices =	driver.findElements(By.xpath("//div[@class= 'Nx9bqj']"));
	
	Map<String, String> nameAndPrice = new HashMap<>();
	for(int i =0; i<names.size(); i++) {
	nameAndPrice.put(names.get(i).getText(), prices.get(i).getText());
	}
	
	Set<Entry<String, String>> entrySet = nameAndPrice.entrySet();
	for(Entry<String, String> np: entrySet) {
		System.out.println(np);
	}
		
	}

}

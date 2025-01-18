package com.dbsample;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserCredential extends DB_Reuse {
	public static WebDriver driver = null;

	public static void main(String[] args) throws SQLException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		ResultSet rs = queryRead(Constant.loginDetails);
		while (rs.next()) {
			if ("yuvaraj".equalsIgnoreCase(rs.getString("name"))) {
				driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
				driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
				driver.findElement(By.id("login")).click();
				
			}
		}

	}
}

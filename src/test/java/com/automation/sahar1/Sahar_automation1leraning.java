package com.automation.sahar1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sahar_automation1leraning {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com"); 
		driver.quit();
	
	
	
	
	
		WebDriver driver1 = new FirefoxDriver(); // Ctrl+Shift+O
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com");
		driver1.quit();
		
		
		WebDriver driver2 = new EdgeDriver(); // Ctrl+Shift+O
		driver2.manage().window().maximize();
		driver2.get("https://tutorialsninja.com/demo");
		driver2.quit();
	}
	
	
	
	
	
	
}
	

	



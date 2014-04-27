package com.qspider;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchSuggestion
{
		WebDriver driver;  
	
		 @BeforeTest  
		 public void start()
		 {  
		   driver = new FirefoxDriver();   
		 }  
		    
		 @Test  
		  public SearchSuggestion()
		 {  
		    
		  driver.get("http://google.com");  
		  driver.findElement(By.id("gbqfq")).sendKeys("vam");  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		    
		   WebElement table = driver.findElement(By.className("gssb_m"));   
		    java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));   
		    Iterator<WebElement> i = rows.iterator();   
		   System.out.println("-----------------------------------------");   
		   while(i.hasNext()) {   
		           WebElement row = i.next(); 
		           System.out.println(row.getText());
		           java.util.List<WebElement> columns = row.findElements(By.tagName("td"));   
		            Iterator<WebElement> j = columns.iterator();   
		           while(j.hasNext()) {   
		                   WebElement column = j.next();   
		                   System.out.println(column.getText());   
		           }   
		           System.out.println("");   
		              
		   System.out.println("-----------------------------------------");   

   
		  }   
		 }
}



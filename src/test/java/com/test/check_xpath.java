package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class check_xpath {
	
	WebDriver driver= null;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  String url="http://demowebshop.tricentis.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@type='text'][@id='small-searchterms']")).click();
      driver.findElement(By.xpath("//input[@class='email']")).sendKeys("basab29@gmail.com");
      
	  
  }
}

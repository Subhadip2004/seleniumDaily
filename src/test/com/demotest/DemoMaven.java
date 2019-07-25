package com.demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMaven {
	
	 WebDriver driver= null;
	
  @Test
  public void f() {
	 
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
		
		  driver=new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		  driver.get(url);
		  driver.manage().window().maximize();
		  System.out.println("Print title of the Page"+driver.getTitle());

	  }
	  
	  
  }


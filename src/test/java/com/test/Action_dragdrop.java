package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_dragdrop {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  WebElement from=driver.findElement(By.xpath("//*[@id=ctl00_ContentPlaceholder1_RadTreeView1]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	  WebElement to=driver.findElement(By.xpath("//*[@id=ctl00_ContentPlaceholder1_priceChecker]/div[1]"));
	  Actions act1=new Actions(driver);
	  act1.dragAndDrop(from,to).perform();
	  Thread.sleep(2000);
	  String price=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
	  System.out.println("the final price is: "+price);
	  
  }
}

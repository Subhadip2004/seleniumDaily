package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class mouse_movement {
  @Test
  public void mousemovements() throws InterruptedException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Actions act1=new Actions(driver);
	  ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\TRAINING_B6B.00.10\\Desktop\\reports\\mouse_movements.html");
	  ExtentReports extent=new ExtentReports();
	  extent.attachReporter(reporter);
	  ExtentTest mouse_move=extent.createTest("HDFC Bank");
	  mouse_move.log(Status.INFO,"This is actions demo in HDFC");
	  
	  act1.moveToElement(driver.findElement(By.xpath("//img[@class='popupCloseButton' and @src='https://www.hdfcbank.com/assets/images/cancel.png ']"))).click();
	  Thread.sleep(2000);
	  mouse_move.log(Status.PASS,"Popup box is closed successfully");
	  act1.moveToElement(driver.findElement(By.xpath("//a[@class='mainlink'][@href='/personal/products']"))).perform();
	  Thread.sleep(2000);
	  mouse_move.log(Status.PASS,"Mouse hovering to products is successful");
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	  Thread.sleep(2000);
	  mouse_move.log(Status.PASS,"Mouse hovering to demat is successful");
	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().build().perform();
	  Thread.sleep(2000);
	  mouse_move.log(Status.PASS,"Mouse hovering and clicking on demat account is successful");
	  System.out.println("The page url is: "+driver.getCurrentUrl());
	  Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	  Thread.sleep(2000);
	  mouse_move.log(Status.FAIL,MarkupHelper.createLabel("The test failed",ExtentColor.RED));
	  driver.close();
	  mouse_move.addScreenCaptureFromPath("C:\\Users\\TRAINING_B6B.00.10\\Desktop\\failed.PNG");
	  extent.flush();
  }
}

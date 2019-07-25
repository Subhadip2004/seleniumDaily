package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataTable {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  System.out.println("the page title is: "+driver.getTitle());
	  driver.findElement(By.linkText("SignIn")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  Thread.sleep(5000);
	  driver.findElement(By.name("password")).sendKeys("password123");
	  Thread.sleep(5000);
	  driver.findElement(By.name("Login")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[4]/a/span")).click();
	  Thread.sleep(5000);
	  WebElement objtable=driver.findElement(By.xpath("/html/body/b/section/div"));
	  List<WebElement> Allrows=objtable.findElements(By.tagName("tr"));
	  for (int n=1;n<Allrows.size();n++) {
		  List<WebElement> cells=Allrows.get(n).findElements(By.tagName("td"));
		  System.out.println("Order id: "+cells.get(0).getText());
		  System.out.println("Date of order: "+cells.get(2).getText());
	  }
	  
	  driver.close();
	  
  }
}

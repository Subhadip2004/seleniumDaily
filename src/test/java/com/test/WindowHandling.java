package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  String url="https://www.online.citibank.co.in/";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.xpath("//*[@id=container]/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
	  driver.findElement(By.xpath("//input[@type='text' and @id='User_Id']")).sendKeys("basab29@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password'  and @id='password' and @onkeyup='testPassword3(1);']")).sendKeys("asdf234!@#$");
	  System.out.println("child window title is: "+driver.getTitle());
	  driver.close();
	  driver.switchTo().window(parentwindow);
	  System.out.println("parent window title is: "+driver.getTitle());
	  
  }
}

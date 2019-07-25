package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApachePoi_3 {
  @Test
  public void f() throws IOException {
	  
	  File src=new File("C:\\Users\\TRAINING_B6B.00.10\\Desktop\\ApachePoi.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook WB=new XSSFWorkbook(fis);
	  XSSFSheet SH=WB.getSheetAt(0);
	  System.out.println("1st row no.: "+SH.getFirstRowNum());
	  System.out.println("last row no.: "+SH.getLastRowNum());
	  int row_Count=SH.getLastRowNum()-SH.getFirstRowNum();
	  System.out.println("ROw Count is: "+row_Count);
	  for(int i=0;i<=row_Count;i++) {
		  System.out.println(SH.getRow(i).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(i).getCell(1).getStringCellValue());
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.00.10\\Desktop\\Browsers_and_Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	 driver.findElement(By.name("userName")).sendKeys(SH.getRow(i).getCell(0).getStringCellValue());
	 driver.findElement(By.id("password")).sendKeys(SH.getRow(i).getCell(1).getStringCellValue());
	 driver.findElement(By.xpath("//input[@name='Login']")).click();
	 driver.close();
	 
	 
	 //writing into excel file
	 
	 XSSFRow header=SH.getRow(0);
	 XSSFCell header2=header.createCell(2);
	 header2.setCellValue("Status");
	 SH.getRow(1).createCell(2).setCellValue("PASS");
	 SH.getRow(2).createCell(2).setCellValue("FAIL");
	 SH.getRow(3).createCell(2).setCellValue("FAIL");
	 FileOutputStream fos=new FileOutputStream(src);
	 WB.write(fos);
	 
	  }
	  
  }
}

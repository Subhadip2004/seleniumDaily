package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Apache_poi {
  @Test
  public void f() throws IOException {
	  
	  File src=new File("C:\\Users\\TRAINING_B6B.00.10\\Desktop\\ApachePoi.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet SH=wb.getSheetAt(0);
	  System.out.println("1st row number: "+SH.getFirstRowNum());
	  System.out.println("last row number: "+SH.getLastRowNum());
	  int rowCount=SH.getLastRowNum()-SH.getFirstRowNum();
	  System.out.println("Row Count is: "+rowCount);
	  System.out.println(SH.getRow(0).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(0).getCell(1).getStringCellValue());
	  
	  
	  
  }
}

package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/commondata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet("sheet1");
		  int count = sh.getLastRowNum();
		  
		   for(   int i = 0;i<count;i++) {
				  Row  row = sh.getRow(i);
					  Cell cell = row.getCell(0);
					  Cell cell1 = row.getCell(1);
					  String cellvalue = cell.getStringCellValue();
					  String cellvalue1 = cell1.getStringCellValue();
				  System.out.println(cellvalue+ "\t" +cellvalue1);
				  
				 
			  }
			 
		  
		 
		  
		  
	}
}

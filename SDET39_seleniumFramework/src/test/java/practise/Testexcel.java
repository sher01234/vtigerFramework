package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testexcel {
public static void main(String[] args) throws Throwable   {
	FileInputStream fis=new FileInputStream("./data/commondata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet("sheet1");
	  Row row = sheet.getRow(1);
	  Cell cell = row.getCell(0);
	  String cellValue = cell.getStringCellValue();
	  System.out.println(cellValue);
}
}

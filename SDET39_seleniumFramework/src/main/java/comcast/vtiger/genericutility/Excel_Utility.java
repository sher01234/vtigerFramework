package comcast.vtiger.genericutility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility 
{
	/**
	 * This method is used to fetch data from Excel sheet
	 */
public String getExcelData(String SheetName,int RowNumber,int cellNumber) throws Throwable{
	FileInputStream fis=new FileInputStream("./data/teatdata.xlsx");
	Workbook book = WorkbookFactory.create(fis);
//	  Sheet sheet = book.getSheet("SheetName");
//	  Row row = sheet.getRow(RowNumber);
//	  Cell cell = row.getCell(cellNumber);
//	 String cellvalue = cel.getStringCellValue();
	  
	DataFormatter format=new DataFormatter();
	return format.formatCellValue(book.getSheet(SheetName).getRow(RowNumber).getCell(cellNumber));
	
	  
	  
}
}

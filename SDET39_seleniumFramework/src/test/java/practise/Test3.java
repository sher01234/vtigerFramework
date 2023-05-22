package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./data/commondata1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet("sheet1");
     Row r = sh.createRow(7);
     Cell cel = r.createCell(2);
     cel.setCellValue("sheryy");
     FileOutputStream fos=new FileOutputStream("./data/commondata1.xlsx");
     wb.write(fos);
     wb.close();
}
}

package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteToExcel {
  @Test
  
  public static void WriteDataToExcel() throws Exception
  {
	  File src = new File("C:\\Users\\Pooja\\OneDrive\\Desktop\\Test.xlsx");
	  FileInputStream fs = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  
	 XSSFSheet sht1 = wb.getSheet("Practise");
	 File read= new File("C:\\Users\\Pooja\\OneDrive\\Desktop\\Test.xlsx");
	 FileOutputStream fos = new FileOutputStream(read);
	 sht1.getRow(9).getCell(1).setCellValue("Execute the value");
	 
	 sht1.createRow(26).createCell(5).setCellValue("Creating Row and Column");
	 
	 wb.write(fos);
  }
}

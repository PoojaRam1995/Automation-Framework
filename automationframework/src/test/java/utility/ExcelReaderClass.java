package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReaderClass {
	
	@Test
	
	public void ExcelReader() throws Exception
	{
		File src =new File("C:\\Users\\Pooja\\OneDrive\\Desktop\\Test.xlsx");
		
		FileInputStream fs= new FileInputStream(src); 
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet s1= wb.getSheet("Practise");
		
	  String value = s1.getRow(7).getCell(1).getStringCellValue();
	
		System.out.println(value);
		
		String value1 = s1.getRow(12).getCell(0).getStringCellValue();
		
		System.out.println(value1);
		
		int value2 = s1. getLastRowNum();
		System.out.println(value2);
		
		int value3 =s1.getRow(1).getLastCellNum();
		System.out.println(value3);
		
		DataFormatter df = new DataFormatter();
		
		for(int row=0;row<=value2;row++)
		{
			for(int column=0;column<=value3;column++)
			{
				String formatValue = df.formatCellValue(s1.getRow(row).getCell(column));
				System.out.println(formatValue);
				
				
			}
		}
	}

}

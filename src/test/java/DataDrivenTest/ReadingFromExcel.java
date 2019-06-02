package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\Selenium Programs\\WebElement\\DataExcel\\nopCommerce.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("RegisterData");
		
		int rowcount = sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++) 
		{
			XSSFRow Currentrow = sh.getRow(i);
			for(int j=0;j<colcount;j++) 
			{
				String value = Currentrow.getCell(j).toString();
				System.out.print(" "+value);
			}
			System.out.println();
		}
	}

}

package WorkSheet;

import java.io.FileInputStream;
import java.security.cert.CRL;

import com.sun.rowset.internal.Row;

public class ExcelCode {

	public static FileInputStream f ;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String readStringData(int i, int j)
	{
		f= new FileInputStream("‪C:\\Users\\HP\\Desktop\\excelread.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		
	}
	public static double readIntegerData(int i, int j)
	{
		f= new FileInputStream("‪C:\\Users\\HP\\Desktop\\excelread.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		return c.getNumericCellValue();
	}
	}
}





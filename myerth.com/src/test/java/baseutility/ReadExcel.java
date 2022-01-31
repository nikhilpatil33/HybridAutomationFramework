package baseutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	XSSFWorkbook work_book;
	XSSFSheet sheet;
	public ReadExcel(String path) throws IOException 
	{
		File f=new File(path);
		FileInputStream stream = new FileInputStream(f);
		work_book = new XSSFWorkbook(stream);
		
	}
	
	public String getData(int sheetnumber, int row, int column){
		sheet = work_book.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		} 
		public int getRowCount(int sheetIndex){
		int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
		}
}

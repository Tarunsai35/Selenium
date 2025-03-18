package day_40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File---> WorkBook--->Sheet--->Rows---->cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdate\\data.xlsx");
		
		XSSFWorkbook workbok = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbok.getSheet("Sheet1");
		
		int totalrow = sheet.getLastRowNum();
		System.out.println("no.of rows "+totalrow);
		
		int totalcell = sheet.getRow(1).getLastCellNum();
		System.out.println("no.of cells "+totalcell);
		
		for(int r=0;r<=totalrow;r++) {
			
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c=0;c<totalcell;c++) {
				XSSFCell currentcell = currentrow.getCell(c);
				System.out.print(currentcell.toString()+"\t");
			}
			System.out.println();
		}
		workbok.close();
		file.close();
	}
}

package day_40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File---> WorkBook--->Sheet--->Rows---->cells

public class ReadingDatainSpecifRowAndCell {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdate\\myfileRandom.xlsx");
		
		XSSFWorkbook workbok = new XSSFWorkbook();
		
		XSSFSheet sheet = workbok.createSheet("Data");
		
		XSSFRow row = sheet.createRow(3);
		
		XSSFCell cell = row.createCell(4);
		
		cell.setCellValue("welcome");
		
		workbok.write(file);
		workbok.close();
		file.close();
		
		System.out.println("file creted....");
		
	}
}

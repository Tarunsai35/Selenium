package day_40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataDynamicIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdate\\myfile_dynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row..?");
		int noOfRow = sc.nextInt();
		System.out.println("Enter no of cells..?");
		int noOfCells = sc.nextInt();
		
		for(int r=0;r<=noOfRow;r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			
			for(int c=0;c<noOfCells;c++) {
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("File created.........");
		
	}
}

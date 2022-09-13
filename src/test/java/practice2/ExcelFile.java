package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFile {

	@Test
	public void readExcel() throws IOException {
		File file = new File("./src/test/resources/My excel.xls");
		FileInputStream fis = new FileInputStream(file);          //to read 

		// xlsx-XSSFWorkbook   //xls = HSSF WorkBook 
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis);

		// xlsx-XSSFSheet
		HSSFSheet sheet = hssfWorkbook.getSheet("Sheet1");

		int lastrowNum = sheet.getLastRowNum();

		for (int i = 1; i <= lastrowNum; i++) {

			// xlsx-XSSFRow
			HSSFRow row = sheet.getRow(i);
			int lastCellNum = row.getLastCellNum();
			for (int j = 0; j < lastCellNum; j++) {
				System.out.print(row.getCell(j).getStringCellValue() + " : ");
			}
			System.out.println();
		}
	}
}

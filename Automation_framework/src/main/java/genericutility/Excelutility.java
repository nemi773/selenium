package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex ) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./test/resources/testdata/fireflinktest_case.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	public boolean getbooleanDataFromExcel(String sheetName,int rowIndex,int colIndex ) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./test/resources/testdata/fireflinktest_case.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	
	public double getNumericDataFromExcel(String sheetName,int rowIndex,int colIndex ) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./test/resources/testdata/fireflinktest_case.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	
	public LocalDateTime getDateDataFromExcel(String sheetName,int rowIndex,int colIndex ) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./test/resources/testdata/fireflinktest_case.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}
	
}

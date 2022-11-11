package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String  fetchdataExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
	// convert physical representation of excel sheet into java representation
	FileInputStream fis = new FileInputStream("./src/test/resources/excelData.xlsx");
	// load the java representation of excel file
	Workbook workbook = WorkbookFactory.create(fis);
	// accessing the sheet
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	
	}
}

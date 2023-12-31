package genericLibraries;
	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.testng.annotations.DataProvider;

	public class ExcelUtility 
	{
		/**
		 * 
		 * @param sheetName
		 * @param rowNum
		 * @param columnNumber
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public String readingsingleData(String sheetName,int rowNum,int columnNumber) throws EncryptedDocumentException, IOException {
			File file = new File("vtiger");
			Workbook workbook =WorkbookFactory.create(file);
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(columnNumber).toString();
			
		}

		/*public String readingsingleData(String sheetName,int rowNum,int columnNumber) throws EncryptedDocumentException, IOException {
			return WorkbookFactory
			.create(new File("vtiger"))
			.getSheet(sheetName)
			.getRow(rowNum)
			.getCell(columnNumber)
			.toString();*/
	  @DataProvider(name="testdata")
		 public Object[][] readingMultipleData() throws EncryptedDocumentException, IOException
		 {
			 File file = new File("./src/test/resources/Book1.xlsx");
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data = new Object[rowCount][cellCount];
			for (int row=0;row<rowCount;row++)
			{
				Row actualrow = sheet.getRow(row);
				for (int cell=0;cell<actualrow.getLastCellNum();cell++)
				{
					data[row][cell]= actualrow.getCell(cell).toString();
				}
			}
			return data;
		 }
		
		
	}




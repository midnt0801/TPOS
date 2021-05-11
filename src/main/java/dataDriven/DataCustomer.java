package dataDriven;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataCustomer {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public DataCustomer(String excelPath, String sheetName) {

		try {

			projectPath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/data/CreateCustomer1.xlsx");
			sheet = workbook.getSheet("Sheet1");
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		 getRowCount();
		 getColCount();
//		 getCellDataString(1,0);
//		 getCellDataNumber(2,1);
		 return;
	}

	public static int getRowCount() {
		int rowCount = 0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: " + rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;

	}

	public static int getColCount() {
		int colCount = 0;
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of cols: " + colCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;

	}

	public static String getCellDataString(int rowNum, int colNum) {

		String cellData = "";
		DataFormatter formatter = new DataFormatter();

		try {

			cellData = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));			
			//System.out.println(cellData);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

	public static double getCellDataNumber(int rowNum, int colNum) {

		double cellData1 = 0;
		try {

			cellData1 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData1;
	}
	
	
}



package dataDriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataLogin {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public dataLogin(String excelPath, String sheetName) {

		try {

			projectPath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Data/Login.XML.xlsx");
			sheet = workbook.getSheet("Sheet1");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		 getRowCount();
		 getColCount();
//		 getCellDataString(1,0);
//		 getCellDataNumber(2,1);
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
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();			
			//System.out.println(cellData);
			

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

	public static double getCellDataNumber(int rowNum, int colNum) {

		double cellData = 0;
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	
}
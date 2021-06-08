package resources;

import java.io.IOException;
import org.testng.Assert;
import TPOS.LOGIN.Login1;
import TPOS.category.Products1;
import dataDriven.DataGroupofProducts;

public class AddMyGroupofProducts {
	public AddMyGroupofProducts() throws IOException {
		/*
		 * base base.initializeDriver();
		 */
		
	}

	//@Test(priority=1)
	public void login() throws Exception {
		
		base.driver.get(base.prop.getProperty("url"));
		Login1 l=new Login1(base.driver);
		l.getEmail().sendKeys("admin");
		l.getPassword().sendKeys("123123@");
		l.getLogin().click();
		Thread.sleep(5000);
	
		String expectedUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		String actualUrl = base.driver.getCurrentUrl();
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}
	//THÊM FIlE EXCEL ĐÚNG 
	//@SuppressWarnings("static-access")
	//@Test(dataProvider="3",priority = 4)
	public  void AddNewGroupofProducts(String Ten , String Thutu) throws Exception,IOException
	{
		//base.driver.get(base.prop.getProperty("url1"));
		Products1 l = new Products1(base.driver);
		l.getnhapten().sendKeys(Ten);
		l.getthutu().sendKeys(Thutu);
		Thread.sleep(3000);
		boolean checkTen= false;
		if (Ten.length() <=100)
		{
			checkTen = true;
		}
		
		boolean checkThutu= false;
		if(Thutu.length() <=100)
		{
			checkThutu =true;
		}
		Assert.assertTrue(checkTen);
		Assert.assertTrue(checkThutu);
	
		System.out.println("Test completed");
		l.getclickluu().click();
		Thread.sleep(3000);
		l.getclickthemlai().click();
		Thread.sleep(3000);
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/productcategory/form";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		Assert.assertEquals(actualUrl,expectedUrl);
	}
	
	//@DataProvider(name = "3")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\TMT\\eclipse-workspace\\TPOSVN\\data\\GroupofProducts.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	@SuppressWarnings("static-access")
	public static Object[][] testData(String excelPath, String sheetName) {

		DataGroupofProducts excel = new DataGroupofProducts(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
		
			for (int j = 0; j < colCount; j++) {

				String cellDataString = excel.getCellDataString(i, j);
				System.out.print(cellDataString + " | ");
				data[i - 1][j] = cellDataString;

			}
			System.out.println();
		}
		return data;
	}
	
}

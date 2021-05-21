package resources;

import java.io.IOException;

import org.testng.Assert;

import TPOS.LOGIN.Login1;
import TPOS.Sales.AddCustomer;
import dataDriven.DataSupplier;

public class AddMySupplier {
//	/public  base base  = new base();
	
	public AddMySupplier() throws IOException {
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
	
		String expectedUrl = base.driver.getCurrentUrl();
		String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}
	//@SuppressWarnings("static-access")
	//@Test(dataProvider="3",priority = 4)
	public  void AddNewCustomer(String Supplier , /*String date,*/String ContactNumber, String Email,String Street, String City, String District, String Commune) throws Exception,IOException
	{
		//base.driver.get(base.prop.getProperty("url1"));
		AddCustomer l = new AddCustomer(base.driver);
		l.getNhapten().sendKeys(Supplier);
		
		l.getDienThoai().sendKeys(ContactNumber);
		l.getEmail().sendKeys(Email);
		Thread.sleep(3000);
		
		l.getstreet().sendKeys(Street);
		l.getcity().sendKeys(City);
		l.getdistrict().sendKeys(District);
		l.getcommune().sendKeys(Commune);
		boolean checkCustomer= false;
		if (Supplier.length() <=100)
		{
			checkCustomer = true;
		}
		boolean checkContactNumber= false;
		if(ContactNumber.length() <=100)
		{
			checkContactNumber =true;
		}
		boolean checkEmail= false;
		if(Email.length() <=100)
		{
			checkEmail =true;
		}
		boolean checkStreet= false;
		if(Street.length() <=100)
		{
			checkStreet =true;
		}
		boolean checkCity= false;
		if(City.length() <=200)
		{
			checkCity =true;
		}boolean checkDistrict= false;
		if(District.length() <=100)
		{
			checkDistrict =true;
		}boolean checkCommune= false;
		if(Commune.length() <=100)
		{
			checkCommune =true;
		}
		Assert.assertTrue(checkCustomer);
		Assert.assertTrue(checkContactNumber);
		Assert.assertTrue(checkEmail);
		Assert.assertTrue(checkStreet);
		Assert.assertTrue(checkCity);
		Assert.assertTrue(checkDistrict);
		Assert.assertTrue(checkCommune);
		Assert.assertTrue(checkContactNumber);
		System.out.println("Test completed");
		l.getBtnLuuKH().click();
		Thread.sleep(5000);
		l.getBtnThemKHM().click();
		Thread.sleep(3000);
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/fastpurchaseorder/invoiceform1";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		Assert.assertEquals(actualUrl,expectedUrl);
	}
	
	//@DataProvider(name = "3")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\TMT\\eclipse-workspace\\TPOSVN\\data\\Supplier.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	@SuppressWarnings("static-access")
	public static Object[][] testData(String excelPath, String sheetName) {

		DataSupplier excel = new DataSupplier(excelPath, sheetName);

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

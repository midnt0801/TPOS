package resources;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import TPOS.LOGIN.Login1;
import TPOS.Sales.AddCustomer;
import dataDriven.DataCustomer;

public class AddMyCustomer {
	public  base base  = new base();
	
	public AddMyCustomer() throws IOException {
		/*
		 * base base.initializeDriver();
		 */
		
	}

	//@Test(priority=1)
//	public void login() throws Exception {
//		
//		base.driver.get(base.prop.getProperty("url"));
//		Login1 l=new Login1(base.driver);
//		l.getEmail().sendKeys("admin");
//		l.getPassword().sendKeys("123123@");
//		l.getLogin().click();
//		Thread.sleep(5000);
//	
//		String expectedUrl = base.driver.getCurrentUrl();
//		String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
//		System.out.println(expectedUrl);
//		System.out.println(actualUrl);
//		Assert.assertEquals(expectedUrl, actualUrl); 
//	}
	//@SuppressWarnings("static-access")
	//@Test(dataProvider="2",priority = 3)
	public  void AddNewCustomer(String Customer , /*String date,*/String ContactNumber, String Email,String Street, String City, String District, String Commune) throws Exception,IOException
	{
		base.driver.get(base.prop.getProperty("https://tmt30.tpos.vn/#/app/dashboard"));
		AddCustomer l = new AddCustomer(base.driver);
		l.getNhapten().sendKeys(Customer);
		
		l.getDienThoai().sendKeys(ContactNumber);
		l.getemail1().sendKeys(Email);
		Thread.sleep(3000);
		
		l.getstreet1().sendKeys(Street);
		l.getcity1().sendKeys(City);
		l.getdistrict1().sendKeys(District);
		l.getCommune1().sendKeys(Commune);
		boolean checkCustomer= false;
		if (Customer.length() <=100)
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
		l.getclickLuuThemkhachhang1().click();
		Thread.sleep(5000);
		l.getclickThemlaikhachhang().click();
		Thread.sleep(3000);
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/partner/customer/form";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		Assert.assertEquals(actualUrl,expectedUrl);
	}
	
	//@DataProvider(name = "2")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\TMT\\eclipse-workspace\\LOGIN\\data\\CreateCustomer1.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}
	
	@SuppressWarnings("static-access")
	public static Object[][] testData(String excelPath, String sheetName) {

		DataCustomer excel = new DataCustomer(excelPath, sheetName);

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
	


		/*
		 * //// l.getngaysinh1().sendKeys(date); // // SimpleDateFormat dFormat = new
		 * SimpleDateFormat("dd/MM/yyyy"); // // Date mydate = dFormat.parse(date); //
		 * // Calendar cal = Calendar.getInstance(); // // cal.setTime(mydate); // //
		 * String[] arr =
		 * {"Tháng 1 , Tháng 2 , Tháng 3 , Tháng 4 , Tháng 5 , Tháng 6 , Tháng 7 , Tháng 8 , Tháng 9 , Tháng 10 , Tháng 11 , Tháng 12 "
		 * }; // // int day = cal.get(java.util.Calendar.DAY_OF_MONTH); // // String
		 * myMonth = ""; // // for(int i = 0; i < 12; i++) { // if(i+1 ==
		 * cal.get(java.util.Calendar.MONTH)) { // myMonth = arr[i]; // } // } // // int
		 * year=cal.get(java.util.Calendar.YEAR); // // myMonth = myMonth + year; // //
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/span[2]"
		 * )).click(); // // Thread.sleep(2000); // // while(true) { // String text =
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/span[2]/span"
		 * )).getText(); // // if(text.equals(myMonth)) { // break; // } // else { //
		 * driver.findElement(By.xpath("/html/body/div[5]/div")).click(); // } // } //
		 * // driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[2]/tbody/tr/td/[contains(text(),'+day+']"
		 * )).click();
		 * 
		 */	
		
//		l.getpricelist1().sendKeys(PriceList);
//		l.getdefaultdiscount1().sendKeys(defaultdiscount.toString(0));
	
package TPOS.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddCustomer {
	
	public WebDriver driver;
	

	// Nhập thông tin trong thêm khách hàng 
	By Nhapten=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/h1/input");
	By ngaysinh=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/input");
	By DienThoai=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[2]/tbody/tr[1]/td[2]/div/input");
	By Email=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[2]/tbody/tr[2]/td[2]/input");
	By nhomkhachhang=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[3]/td[2]/div[1]/div");
	By street=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[1]/input");
	By city=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[2]/span/span/input");
	By district=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/span/span/input");
	By commune=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[4]/span/span/input");
	By pricelist=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[3]/td[2]/span[1]/span/input");
	By defaultdiscount=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[4]/td[2]/span/span/input[1]");
	By BtnLuuKH=By.xpath("/html/body/div[1]/div/div/div[3]/div/footer/button[1]");
	By BtnThemKHM=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/button[1]");
	By btndong=By.xpath("/html/body/div[1]/div/div/div[3]/div/footer/button[2]");
	By texttravenhapten=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/span");
	//Mục bán hàng:(BANHANG-TRAHANG-HOADONGIAOHANG-LICHSUDOISOAT)
	By clickbanhang=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
	
	//BANHANG
	By clickmucbanhang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[3]/ul/li[1]/a");
	By clickThemKHtrongbanhang=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	By clickthongtin=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/ul/li[1]/a");
	By clickthongtingiaohang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/ul/li[2]/a");
	By clickthongtinnguoinhan=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/ul/li[3]/a");
	By clickthongtinkhac=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/ul/li[4]/a");

	//TRAHANG
	
	By clickmuctrahang=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]");
	By clickThemKHtrongtrahang=By.xpath("//button[@type='button'][contains(.,'Thêm')]");
	
	//HOADONGIAOHANG
	By clickmuchoadongiaohang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[3]/ul/li[3]/a");
	By clickthemhoadongiaohang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div[1]/div[1]/div/button[1]");
	By clickthemtufile=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div[1]/div[1]/div/button[2]");
	By clickcapnhaptrangthaigiaohangall=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div[1]/div[1]/div/button[3]");
	By clickguilaivandon=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div/div[1]/div[1]/div/button[4]");
	By checkboxguilaivandon=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
	By thongbaoloiguilaivandon=By.xpath("//*[@id=\"toast-container\"]/div/div/div/div");
	By luuguilaivandon=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/footer[1]/button[1]");
	By thongbaotrueguilaivandon=By.xpath("//*[@id=\"toast-container\"]/div/div/div/div");
	By clickchonbtndoitac=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div[1]/div/span/span/span[2]");
	By clickchondoitac=By.xpath("/html/body/div[5]/div/div[2]/ul/li[5]");
	By clickchoosefile=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div[2]/div/div/input");
	By clicknhap=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div[3]/div/button[1]");
	By clicktrolai=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div[3]/div/button[2]");
	By clicktaimauexcel=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div[3]/div/a");
	By clickLuuNhapexcel=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div[5]/button[1]");
	By thongbaoluuthanhcong=By.xpath("//*[@id=\"toast-container\"]/div/div");
	By sanphamthanhtoan=By.xpath("//*[@id=\"vm.grid\"]/div[2]/table/tbody/tr[3]/td[3]");
	By btnthanhtoan=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
	//Đăng kí thanh toán
	By pTTToan=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/table[1]/tbody/tr[2]/td[2]/span[1]/span/span[2]/span");
	By pTTTienmat=By.xpath("/html[1]/body[1]/div[14]/div[1]/div[2]/ul[1]/li[3]");
	By btnthanhtoanin=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/footer[1]/button[1]");
	
	
	
	/* HOADONGIAOHANG ->THEM ->BANHANG */
	//Mục BAOGIA
	By clickbaogia=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[4]/a");
	By clickthembaogia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div[1]/div/button");
	By clickthemkhtrongbaogia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div/div/div[2]/table[1]/tbody/tr[1]/td[2]/div/button");
		
	//Mục DONDATHANG
	By clickdondathang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[5]/a");
	By clickthemdondathang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div[1]/div/button");
	By clickthemkhtrongddh=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span[2]/button[1]");
	//Mục SALEONLINE
	By clicksaleonline=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[6]/a");
	By clickmucdonhang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[6]/ul/li[2]/a");
	By clickchondonhang=By.xpath("//*[@id=\"3badb215-a3cf-4306-8987-458223997bd7\"]");
	By clicktaohdtrongso=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/div[2]/div[2]/div/button[4]");
	/* SALEONLINE->TAOHOADON->BANHANG*/
	
	//DANH MUC KHACH HANG
	By clickdanhmuc=By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[11]/a[1]");
	By clickKhachhang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[11]/ul/li[5]/a");
	By clickBtnThemKhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/div[1]/div/div/button[1]");
	By clickLuuThemkhachhang1=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
	By clickThemlaikhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/div[1]/div/div[1]/button[2]");
	
	//Nhập thông tin trong khách hàng ở mục danh mục
	By ngaysinh1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/input");
	By dienthoai1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[2]/tbody/tr[1]/td[2]/div/input");
	By email1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[2]/tbody/tr[2]/td[2]/input");
	By nhomkh1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[3]/td[2]/div[1]/div");
	By street1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/input");
	By city1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[2]/span/span/input");
	By district1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[3]/span/span/input");
	By Commune1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[4]/span/span/input");
	By prictlist1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[3]/td[2]/span[1]/span/input");
	By defaultdiscount1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[4]/td[2]/span/span/input[1]");
	By calender1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/span[2]");
	public AddCustomer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		}
		public WebElement getbtnthanhtoan() 
		{
	
			return driver.findElement(btnthanhtoan);
		}
		public WebElement getbtnthanhtoanin() 
		{
	
			return driver.findElement(btnthanhtoanin);
		}
		public WebElement getpTTToan() 
		{
	
			return driver.findElement(pTTToan);
		}
		public WebElement getpTTTienmat() 
		{
	
			return driver.findElement(pTTTienmat);
		}
		public WebElement getsanphamthanhtoan() 
		{
	
			return driver.findElement(sanphamthanhtoan);
		}
		public WebElement getthongbaotrue() 
		{
	
			return driver.findElement(thongbaotrueguilaivandon);
		}
		public WebElement getthongbaoloi() 
		{
	
			return driver.findElement(thongbaoloiguilaivandon);
		}
		public WebElement getluuguilaivandon() 
		{
	
			return driver.findElement(luuguilaivandon);
		}
		public WebElement getcheckboxguilaivandon() 
		{
	
			return driver.findElement(checkboxguilaivandon);
		}
		public WebElement getcapnhaptrangthaigiaohangall() 
		{
	
			return driver.findElement(clickcapnhaptrangthaigiaohangall);
		}
		public WebElement getguilaivandon() 
		{
	
			return driver.findElement(clickguilaivandon);
		}
		public WebElement getthongbaoluuthanhcong() 
		{
	
			return driver.findElement(thongbaoluuthanhcong);
		}
		public WebElement getclickLuuNhapexcel() 
		{
	
			return driver.findElement(clickLuuNhapexcel);
		}
		public WebElement getclickchonbtndoitac() 
		{
	
			return driver.findElement(clickchonbtndoitac);
		}
		public WebElement getclickchondoitac() 
		{
		
			return driver.findElement(clickchondoitac);
		}	
		public WebElement getclickchoosefile() 
		{
		
			return driver.findElement(clickchoosefile);
		}
		public WebElement getclicknhap() 
		{
		
			return driver.findElement(clicknhap);
		}
		public WebElement getclicktaimauexcel() 
		{
		
			return driver.findElement(clicktaimauexcel);
		}
		public WebElement getclicktrolai() 
		{
		
			return driver.findElement(clicktrolai);
		}
		public WebElement getclickthemtufile() 
		 {
		
			 return driver.findElement(clickthemtufile);
		}
		public WebElement getbtndong() 
		 {
		
			 return driver.findElement(btndong);
		}
		public WebElement getclickthongtin() 
		 {
		
			 return driver.findElement(clickthongtin);
		}
		public WebElement getclickthongtingiaohang() 
		 {
		
			 return driver.findElement(clickthongtingiaohang);
		}
		public WebElement getclickthongtinnguoinhan() 
		 {
		
			 return driver.findElement(clickthongtinnguoinhan);
		}
		public WebElement getclickthongtinkhac() 
		 {
		
			 return driver.findElement(clickthongtinkhac);
		}
		public WebElement gettexttravenhapten() 
		 {
		
			 return driver.findElement(texttravenhapten);
		}
		public WebElement getclickmucdonhang() 
		 {
		
			 return driver.findElement(clickmucdonhang);
		}
		public WebElement getclickthemkhtrongbaogia() 
		 {
		
			 return driver.findElement(clickthemkhtrongbaogia);
		}
		public WebElement getclickmuchoadongiaohang() 
		 {
		
			 return driver.findElement(clickmuchoadongiaohang);
		}
			public WebElement getclickthemhoadongiaohang() 
		 {
			
			 return driver.findElement(clickthemhoadongiaohang);
		}
	
		public WebElement getclickbaogia() 
		 {
		
			 return driver.findElement(clickbaogia);
		}
		public WebElement getclickthembaogia() 
		 {
		
			 return driver.findElement(clickthembaogia);
		}
		public WebElement getclickdondathang() 
		 {
		
			 return driver.findElement(clickdondathang);
		}
		public WebElement getclickthemdondathang() 
		 {
		
			 return driver.findElement(clickthemdondathang);
		}
		public WebElement getclickthemkhtrongddh() 
		 {
		
			 return driver.findElement(clickthemkhtrongddh);
		}
		public WebElement getclicksaleonline() 
		 {
		
			 return driver.findElement(clicksaleonline);
		}
		public WebElement getclickchondonhang() 
		 {
		
			 return driver.findElement(clickchondonhang);
		}
		public WebElement getclicktaohdtrongso() 
		 {
		
			 return driver.findElement(clicktaohdtrongso);
		}
		
		public WebElement getclickbanhang() 
		 {
		
			 return driver.findElement(clickbanhang);
		}
		public WebElement getclickmucbanhang() 
		 {
		
			 return driver.findElement(clickmucbanhang);
		}
		public WebElement getclickThemKHtrongbanhang() 
		 {
		
			 return driver.findElement(clickThemKHtrongbanhang);
		}
	
	
		public WebElement getBtnThemKHM() 
		 {
		
			 return driver.findElement(BtnThemKHM);
		}
		 public WebElement getclickThemKHtrongtrahang() 
		 {
		
			 return driver.findElement(clickThemKHtrongtrahang);
		}
			
		 public WebElement getclickmuctrahang() 
		 {
		
			 return driver.findElement(clickmuctrahang);
		}
		
		
		public WebElement getngaysinh1() 
		{
		
			 return driver.findElement(ngaysinh1);
		}
		public WebElement getemail1() 
		{
		
			 return driver.findElement(email1);
		}
		public WebElement getnhomkh1() 
		{
		
			 return driver.findElement(nhomkh1);
		}
		public WebElement getstreet1() 
		{
		
			 return driver.findElement(street1);
		}
		public WebElement getcity1() 
		{
		
			 return driver.findElement(city1);
		}
		public WebElement getdistrict1() 
		{
		
			 return driver.findElement(district1);
		}
		public WebElement getCommune1() 
		{
		
			 return driver.findElement(Commune1);
		}	
		public WebElement getpricelist1() 
		{
			
			 return driver.findElement(prictlist1);
		}
		public WebElement getdefaultdiscount1() 
		{
		
			 return driver.findElement(defaultdiscount1);
		}	
		public WebElement getclickThemlaikhachhang() 
		{
		
			 return driver.findElement(clickThemlaikhachhang);
		}
		public WebElement getclickLuuThemkhachhang1() 
		{
		
			 return driver.findElement(clickLuuThemkhachhang1);
		}
		public WebElement getclickdanhmuc() 
		{
		
			 return driver.findElement(clickdanhmuc);
		}	
		public WebElement getclickKhachhang() 
		{
			
			 return driver.findElement(clickKhachhang);
		}	
		public WebElement getclickBtnThemKhachhang() 
		{
			
			 return driver.findElement(clickBtnThemKhachhang);
		}
		public WebElement getngaysinh() 
		{
		
			 return driver.findElement(ngaysinh);
		}
		public WebElement getEmail()   
		{
			
			 return driver.findElement(Email);
		} 
		public WebElement getnhomkhachhang() 
		{
			
			 return driver.findElement(nhomkhachhang);
		} 
		public WebElement getstreet() 
		{
			
			 return driver.findElement(street);
		}
		public WebElement getcity() 
		{
			
			 return driver.findElement(city);
		}
		public WebElement getdistrict() 
		{
			
			 return driver.findElement(district);
		}
		public WebElement getcommune() 
		{
			
			 return driver.findElement(commune);
		}
		public WebElement getpricelist() 
		{
			
			 return driver.findElement(pricelist);
		}
		public WebElement getdefaultdiscount() 
		{
			
			 return driver.findElement(defaultdiscount);
		}	
		public WebElement getNhapten() 
		{
		
			 return driver.findElement(Nhapten);
		}
		public WebElement getDienThoai() 
		{
		
			 return driver.findElement(DienThoai);
		}
		 public WebElement getBtnLuuKH() 
		{
		
			 return driver.findElement(BtnLuuKH);
		}
	}

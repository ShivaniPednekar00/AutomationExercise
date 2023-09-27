package Calling_Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation_ExercisePages.Cart_Page;
import Automation_ExercisePages.Contactus_page;
import Automation_ExercisePages.Home_Page;
import Automation_ExercisePages.Login_Page;
import Automation_ExercisePages.Logout_Page;
import Automation_ExercisePages.Product_Page;
import Automation_ExercisePages.Register_Page;
import Automation_ExercisePages.SubScription;
import Automation_ExercisePages.TestCases;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CallingAllMethods {
	WebDriver driver;
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	Register_Page re;
	Login_Page l;
	Logout_Page o;
	Contactus_page c;
	TestCases f;
	Product_Page p;
	SubScription sub;
	Home_Page h;
	Cart_Page ca;
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addExtensions(new File("./Extenctions/AdBlock.crx"));
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		Thread.sleep(8000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		re=new Register_Page(driver);
		l=new Login_Page(driver);
		o=new Logout_Page(driver);
		c= new Contactus_page(driver);
		f=new TestCases(driver);
		p=new Product_Page(driver);
		sub=new SubScription(driver);
		h=new Home_Page(driver);
		ca=new Cart_Page(driver);
		
		String filePath="C:\\Users\\admin\\Desktop\\Data.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet("Sheet1");
	}
	@Test 
	public void callingMethods() throws InterruptedException
	{
		
		
//		re.home();
//		re.Sign_LoginBtn();
//		re.New_User();
//		int rows =sheet.getLastRowNum();
//		System.out.println("number of rows:" +rows);
//		for(int r=2;r<=2;r++)
//		{
//			
//			XSSFRow row=sheet.getRow(r);
//			System.out.println(sheet.getRow(1).getCell(1).toString());
//			XSSFCell Name=row.getCell(0);
//			XSSFCell email=row.getCell(1);
//			XSSFCell Pass=row.getCell(2);
//			XSSFCell FName=row.getCell(3);
//			XSSFCell lName=row.getCell(4);
//			XSSFCell company=row.getCell(5);
//			XSSFCell Add1=row.getCell(6);
//			XSSFCell Add2=row.getCell(7);
//			XSSFCell State=row.getCell(8);
//			XSSFCell City=row.getCell(9);
//			XSSFCell Zipcode=row.getCell(10);
//			XSSFCell Mobile=row.getCell(11);
//			re.signup(Name.toString(),email.toString());
//		
//			re.SignupCli();
//			re.AcInfo();
//			re.title();
//			re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//
//			re.ClickCreateAcc();
//			re.accreated();
//			re.continueBtn();
//			Thread.sleep(3000);
//			re.DeleteAcc();
//			Thread.sleep(3000);
//			
//		}
//		//reg
//		re.Sign_LoginBtn();
//		int rowss =sheet.getLastRowNum();
//		System.out.println("number of rows:" +rowss);
//		for(int r=2;r<=2;r++)
//		{
//			
//			XSSFRow row=sheet.getRow(r);
//			System.out.println(sheet.getRow(1).getCell(1).toString());
//			XSSFCell Name=row.getCell(0);
//			XSSFCell email=row.getCell(1);
//			XSSFCell Pass=row.getCell(2);
//			XSSFCell FName=row.getCell(3);
//			XSSFCell lName=row.getCell(4);
//			XSSFCell company=row.getCell(5);
//			XSSFCell Add1=row.getCell(6);
//			XSSFCell Add2=row.getCell(7);
//			XSSFCell State=row.getCell(8);
//			XSSFCell City=row.getCell(9);
//			XSSFCell Zipcode=row.getCell(10);
//			XSSFCell Mobile=row.getCell(11);
//			re.signup(Name.toString(),email.toString());
//			re.SignupCli();
//			re.AcInfo();
//			re.title();
//			re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//
//			re.ClickCreateAcc();
//			Thread.sleep(3000);
//			re.accreated();
//			re.continueBtn();
//			Thread.sleep(3000); 
//			
//			l.signup();
//			l.loginIsVisible();
//		//int ro =sheet.getLastRowNum();
//			//System.out.println("number of rows:" +rows);
//			for(int s=2;s<=2;s++)
//			{
//			
//				XSSFCell emails=row.getCell(1);
//				XSSFCell Passs=row.getCell(2);
//				l.uEmail(emails.toString());
//				l.Upaswd(Passs.toString());
//				l.logbtnClick();
//				l.DeleteAcc();
//			}
//			
//			//INVALID LOGIN
//			l.signup();
//			l.loginIsVisible();
//		int roL =sheet.getLastRowNum();
//			//System.out.println("number of rows:" +rows);
//			for(int s=1;s<=1;s++)
//			{
//			
//				XSSFCell emails=row.getCell(1);
//				XSSFCell Passs=row.getCell(2);
//				l.uEmail(emails.toString());
//				l.Upaswd(Passs.toString());
//				l.logbtnClick();
//				Thread.sleep(3000);
//				l.invalid();
//			}
//			//LOGOUT
//			re.Sign_LoginBtn();
//			int rowsss =sheet.getLastRowNum();
//			//System.out.println("number of rows:" +rowss);
//			for(int t=2;t<=2;t++)
//			{
//				
//				XSSFRow row=sheet.getRow(t);
//				//System.out.println(sheet.getRow(1).getCell(1).toString());
//				XSSFCell Name=row.getCell(0);
//				XSSFCell email=row.getCell(1);
//				XSSFCell Pass=row.getCell(2);
//				XSSFCell FName=row.getCell(3);
//				XSSFCell lName=row.getCell(4);
//				XSSFCell company=row.getCell(5);
//				XSSFCell Add1=row.getCell(6);
//				XSSFCell Add2=row.getCell(7);
//				XSSFCell State=row.getCell(8);
//				XSSFCell City=row.getCell(9);
//				XSSFCell Zipcode=row.getCell(10);
//				XSSFCell Mobile=row.getCell(11);
//				re.signup(Name.toString(),email.toString());
//				re.SignupCli();
//				re.AcInfo();
//				re.title();
//				re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//
//				re.ClickCreateAcc();
//				Thread.sleep(3000);
//				re.accreated();
//				re.continueBtn();
//				Thread.sleep(3000); 
//				
//			}
//				
//			l.signup();
//			l.loginIsVisible();
//		int rowl =sheet.getLastRowNum();
//			//System.out.println("number of rows:" +rows);
//			for(int s=2;s<=2;s++)
//			{
//				XSSFRow row=sheet.getRow(s);
//				XSSFCell emails=row.getCell(1);
//				XSSFCell Passs=row.getCell(2);
//				l.uEmail(emails.toString());
//				l.Upaswd(Passs.toString());
//				l.logbtnClick();
//				Thread.sleep(3000);
//				o.logout();
//				Thread.sleep(3000);
//				driver.navigate().back();
//			}
		
//			re.Sign_LoginBtn();
//			int rowss =sheet.getLastRowNum();
//			System.out.println("number of rows:" +rowss);
//			for(int r=1;r<=1;r++)
//			{
//				
//				XSSFRow row=sheet.getRow(r);
//				System.out.println(sheet.getRow(1).getCell(1).toString());
//				XSSFCell Name=row.getCell(0);
//				XSSFCell email=row.getCell(1);
//				re.signup(Name.toString(),email.toString());
//				re.SignupCli();
//				re.already();
//			}
//		c.ClickConta();
//		f.testcasess();
//		driver.navigate().back();
//		p.product();
//		p.viewDetails();
//		driver.navigate().back();
//		p.Searchbox();
//		driver.navigate().back();
//		driver.navigate().back();
//		sub.subscriptionhome();
//		sub.cart();
//		sub.subscriptionhome();
//		 h.home();		
//		 Thread.sleep(3000);
//		 p.AddtoCart();
//		 ca.addtoCarts();
//		 Thread.sleep(3000);
//		 re.reg();
//		 re.New_User();
//			int rows =sheet.getLastRowNum();
//			System.out.println("number of rows:" +rows);
//			for(int r=2;r<=2;r++)
//			{
//				
//				XSSFRow row=sheet.getRow(r);
//				System.out.println(sheet.getRow(1).getCell(1).toString());
//				XSSFCell Name=row.getCell(0);
//				XSSFCell email=row.getCell(1);
//				XSSFCell Pass=row.getCell(2);
//				XSSFCell FName=row.getCell(3);
//				XSSFCell lName=row.getCell(4);
//				XSSFCell company=row.getCell(5);
//				XSSFCell Add1=row.getCell(6);
//				XSSFCell Add2=row.getCell(7);
//				XSSFCell State=row.getCell(8);
//				XSSFCell City=row.getCell(9);
//				XSSFCell Zipcode=row.getCell(10);
//				XSSFCell Mobile=row.getCell(11);
//				re.signup(Name.toString(),email.toString());
//			
//				re.SignupCli();
//				re.AcInfo();
//				re.title();
//				re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//	
//				re.ClickCreateAcc();
//				re.accreated();
//				re.continueBtn();
//				Thread.sleep(3000);
//				ca.addtoCarts();
//				ca.comment();
//				re.DeleteAcc();
//				}
//			
//			Thread.sleep(3000);
//			re.Sign_LoginBtn();
//			re.New_User();
//
//			for(int r=2;r<=2;r++)
//			{
//				
//				XSSFRow row=sheet.getRow(r);
//				System.out.println(sheet.getRow(1).getCell(1).toString());
//				XSSFCell Name=row.getCell(0);
//				XSSFCell email=row.getCell(1);
//				XSSFCell Pass=row.getCell(2);
//				XSSFCell FName=row.getCell(3);
//				XSSFCell lName=row.getCell(4);
//				XSSFCell company=row.getCell(5);
//				XSSFCell Add1=row.getCell(6);
//				XSSFCell Add2=row.getCell(7);
//				XSSFCell State=row.getCell(8);
//				XSSFCell City=row.getCell(9);
//				XSSFCell Zipcode=row.getCell(10);
//				XSSFCell Mobile=row.getCell(11);
//				re.signup(Name.toString(),email.toString());
//			
//				re.SignupCli();
//				re.AcInfo();
//				re.title();
//				re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//	
//				re.ClickCreateAcc();
//				re.accreated();
//				re.continueBtn();
//				Thread.sleep(3000);
//				p.AddtoCart();
//				ca.addtoCarts();
//				ca.comment();
//				ca.contu();
//				re.DeleteAcc();
//			}
		////TC16
//		re.Sign_LoginBtn();
//		re.New_User();
//
//		for(int r=2;r<=2;r++)
//		{
//			
//			XSSFRow row=sheet.getRow(r);
//			System.out.println(sheet.getRow(1).getCell(1).toString());
//			XSSFCell Name=row.getCell(0);
//			XSSFCell email=row.getCell(1);
//			XSSFCell Pass=row.getCell(2);
//			XSSFCell FName=row.getCell(3);
//			XSSFCell lName=row.getCell(4);
//			XSSFCell company=row.getCell(5);
//			XSSFCell Add1=row.getCell(6);
//			XSSFCell Add2=row.getCell(7);
//			XSSFCell State=row.getCell(8);
//			XSSFCell City=row.getCell(9);
//			XSSFCell Zipcode=row.getCell(10);
//			XSSFCell Mobile=row.getCell(11);
//			re.signup(Name.toString(),email.toString());
//		
//			re.SignupCli();
//			re.AcInfo();
//			re.title();
//			re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//
//			re.ClickCreateAcc();
//			re.accreated();
//			re.continueBtn();
//			Thread.sleep(3000);
//			
//			l.signup();
//			l.loginIsVisible();
//	
//			for(int zz=2;zz<=2;zz++)
//			{
//				
//				XSSFCell emails=row.getCell(1);
//				XSSFCell Passs=row.getCell(2);
//				l.uEmail(emails.toString());
//				l.Upaswd(Passs.toString());
//				l.logbtnClick();
//				Thread.sleep(3000);
//				p.AddtoCart();
//				ca.addtoCarts();
//				ca.comment();
//				ca.contu();
//				re.DeleteAcc();
//			
//			}
//		}
//		
		////TC17
		
//		p.AddtoCart();	
//		ca.cart();
//		ca.cros();
		
		////TC18
//		h.home();
//		h.category();
		
		////TC19
//		p.product();
//		p.brand();
		
		
		////TC20
//		p.product();
//		Thread.sleep(3000);
//		p.Searchbox();
//		p.AddtoCart();
//		ca.cart();
//		p.top();
//		re.Sign_LoginBtn();
//		for(int r=2;r<=2;r++)
//		{
//			
//			XSSFRow row=sheet.getRow(r);
//			System.out.println(sheet.getRow(1).getCell(1).toString());
//			XSSFCell Name=row.getCell(0);
//			XSSFCell email=row.getCell(1);
//			XSSFCell Pass=row.getCell(2);
//			XSSFCell FName=row.getCell(3);
//			XSSFCell lName=row.getCell(4);
//			XSSFCell company=row.getCell(5);
//			XSSFCell Add1=row.getCell(6);
//			XSSFCell Add2=row.getCell(7);
//			XSSFCell State=row.getCell(8);
//			XSSFCell City=row.getCell(9);
//			XSSFCell Zipcode=row.getCell(10);
//			XSSFCell Mobile=row.getCell(11);
//			re.signup(Name.toString(),email.toString());
//			re.SignupCli();
//			re.AcInfo();
//			re.title();
//			re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());
//
//			re.ClickCreateAcc();
//			Thread.sleep(3000);
//			re.accreated();
//			re.continueBtn();
//			Thread.sleep(3000); 
//			
//			l.signup();
//			l.loginIsVisible();
//
//			for(int s=2;s<=2;s++)
//			{
//			
//				XSSFCell emails=row.getCell(1);
//				XSSFCell Passs=row.getCell(2);
//				l.uEmail(emails.toString());
//				l.Upaswd(Passs.toString());
//				l.logbtnClick();
//				ca.cart();
//				p.top();
//				l.DeleteAcc();
//				
//			}
//		}
		////TC21
//		p.product();
//		p.viewProduct();
		
		
		//TC22
//		h.home();
//		h.recommended();
		
		////TC23
		re.Sign_LoginBtn();
		re.New_User();
		for(int pp=2;pp<=2;pp++)
		{
			
			XSSFRow row=sheet.getRow(pp);
			XSSFCell Name=row.getCell(0);
			XSSFCell email=row.getCell(1);
			XSSFCell Pass=row.getCell(2);
			XSSFCell FName=row.getCell(3);
			XSSFCell lName=row.getCell(4);
			XSSFCell company=row.getCell(5);
			XSSFCell Add1=row.getCell(6);
			XSSFCell Add2=row.getCell(7);
			XSSFCell State=row.getCell(8);
			XSSFCell City=row.getCell(9);
			XSSFCell Zipcode=row.getCell(10);
			XSSFCell Mobile=row.getCell(11);
			re.signup(Name.toString(),email.toString());
		
			re.SignupCli();
			re.AcInfo();
			re.title();
			re.form(Pass.toString(), FName.toString(), lName.toString(), company.toString(), Add1.toString(), Add2.toString(), State.toString(), City.toString(), Zipcode.toString(), Mobile.toString());

			re.ClickCreateAcc();
			re.accreated();
			re.continueBtn();
		}
}
}


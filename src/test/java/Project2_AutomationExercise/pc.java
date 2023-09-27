package Project2_AutomationExercise;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

public class pc {
	WebDriver driver;
	Register_Page re;
	Login_Page l;
	Logout_Page o;
	Contactus_page c;
	TestCases f;
	Product_Page p;
	SubScription sub;
	Cart_Page ca;
	Home_Page h;
	@Test
	public void zi() throws InterruptedException {
		re=new Register_Page(driver);
		l=new Login_Page(driver);
		o=new Logout_Page(driver);
		c= new Contactus_page(driver);
		f=new TestCases(driver);
		p=new Product_Page(driver);
		sub=new SubScription(driver);
		h=new Home_Page(driver);
		ca=new Cart_Page(driver);
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt=new ChromeOptions();
	opt.addExtensions(new File("./Extenctions/AdBlock.crx"));
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	
	driver.get("http://automationexercise.com");
	//Thread.sleep(3000);
	//h.home();		
	 Thread.sleep(3000);
	 JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(6000);
	 p.AddtoCart();
	 ca.addtoCarts();
	 Thread.sleep(3000);
	 re.reg();
	
	}

}

package Project2_AutomationExercise;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main_code_Automation {
	WebDriver driver;
	Repository rp;
	
	@BeforeSuite
	public void LaunchChrome() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addExtensions(new File("./Extenctions/AdBlock.crx"));
		driver=new ChromeDriver(opt);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void register() throws InterruptedException
	{
		
		
		rp=new Repository(driver);
		String a=rp.home.getText();
		Assert.assertEquals(a, "Home");
		rp.Signup.click();
		Thread.sleep(3000);
		String b=rp.newUserSignup.getText();
		Assert.assertEquals(b, "New User Signup!");
		
	}
	@Test
	public void form() {
	    rp=new Repository(driver);
	    rp.name.sendKeys("shi");
		rp.email.sendKeys("lzabacdasgao@gmail.com");
		rp.signupbtn.click();
		String c=rp.accinfo.getText();
		Assert.assertEquals(c, "ENTER ACCOUNT INFORMATION");
		rp.title.click();
		rp.passw.sendKeys("fgg");
		
		Select s=new Select(rp.day);
		s.selectByVisibleText("10");
		Select m=new Select(rp.month);
		m.selectByVisibleText("February");
		Select y=new Select(rp.year);
		y.selectByVisibleText("2020");
		rp.c1.click();
		rp.c2.click();
		rp.fName.sendKeys("shi");
		rp.lName.sendKeys("oihf");
		rp.company.sendKeys("gggf");
		
		
		rp.add1.sendKeys("hjj,kjgg,jhhgg");
		
		rp.Add2.sendKeys("hgf,vhh,nnnb");
		rp.state.sendKeys("goa");
		rp.city.sendKeys("mapusa");
		rp.zipcode.sendKeys("5689");
		
		rp.mobile.sendKeys("8765432165");
		rp.createacc.click();
		String d=rp.acc.getText();
		Assert.assertEquals(d, "ACCOUNT CREATED!");
		rp.continuee.click();
		
		
		}
	@Test
	public void delete() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    rp=new Repository(driver);
	String e=rp.con.getText();
	Assert.assertEquals(e, "Logged in as shi");
	rp.nn.click();
	String f=rp.nnn.getText();
	Assert.assertEquals(f, "ACCOUNT DELETED!");
	rp.co.click();
	Thread.sleep(3000);
	}
	@Test
	public void lo()
	{
		rp=new Repository(driver);
		String h=rp.home.getText();
		Assert.assertEquals(h, "Home");
		rp.Signup.click();
		String g=rp.login.getText();
		Assert.assertEquals(g, "Login to your account");
		
	}
	public void Login()
	{
		rp=new Repository(driver);
		rp.logName.sendKeys("lzabacdasgao@gmail.com");
		rp.logpas.sendKeys("fgg");
		rp.logbtn.click();
		
	}
	@Test
	public void incorrectCred()
	{
		rp.logName.sendKeys("n@gmail.com");
		rp.logpas.sendKeys("fgg");
		rp.logbtn.click();


	}
	@Test
	public void logout()
	{
		rp=new Repository(driver);
		String e=rp.con.getText();
		Assert.assertEquals(e, "Logged in as shi");
		rp.logout.click();
		rp.Signup.click();
		String g=rp.login.getText();
		Assert.assertEquals(g, "Login to your account");
		
	}
	@Test
	public void incEmail()
	{
		rp=new Repository(driver);
	    rp.name.sendKeys("shi");
		rp.email.sendKeys("A@gmail.com");
		rp.signupbtn.click();
		String s=rp.errms.getText();
		Assert.assertEquals(s,"Email Address already exist!");
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test
	public void contactus()
	{
		rp=new Repository(driver);
		rp.contactus.click();
		String a=rp.getinTouch.getText();
		Assert.assertEquals(a, "GET IN TOUCH");
		rp.cname.sendKeys("shi");
		rp.cemail.sendKeys("fgh@fgh");
		rp.csubject.sendKeys("ghhh");
		rp.msg.sendKeys("vvbb");
		rp.file.sendKeys("C:\\Users\\admin\\Desktop\\TestData.xlsx");
		rp.submitbtn.click();
			
		
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String b=rp.succ.getText();
		Assert.assertEquals(b, "Success! Your details have been submitted successfully.");
		rp.homm.click();
		String c=rp.home.getText();
		Assert.assertEquals(c, "Home");
	}

}

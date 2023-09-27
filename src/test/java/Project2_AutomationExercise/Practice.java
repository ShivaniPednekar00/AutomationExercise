package Project2_AutomationExercise;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	WebDriver driver;
	Repository rp;
	@Test
	public void vvv() throws InterruptedException
	{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addExtensions(new File("./Extenctions/AdBlock.crx"));
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("http://automationexercise.com");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		rp=new Repository(driver);
		String a=rp.home.getText();
		Assert.assertEquals(a, "Home");
		//System.out.println(a);
		rp.Signup.click();
		String b=driver.findElement(By.xpath("//div[@class='signup-form']/child::h2")).getText();
		Assert.assertEquals(b, "New User Signup!");
		//System.out.println(b);
		driver.findElement(By.xpath("//form[@action='/signup']/child::input[2]")).sendKeys("shivani");
		driver.findElement(By.xpath("//form[@action='/signup']/child::input[3]")).sendKeys("jjjb@bgmail.com");
		driver.findElement(By.xpath("//form[@action='/signup']/child::button")).click();
		String c=driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']/child::div/child::h2/child::b")).getText();
		Assert.assertEquals(c, "ENTER ACCOUNT INFORMATION");
		//System.out.println(c);
		driver.findElement(By.xpath("//div[@class='radio-inline'][2]/child::label/child::div/child::span/child::input")).click();
		driver.findElement(By.xpath("//form[@action='/signup']/child::div[4]/child::input")).sendKeys("hgf");
		
		//day
		WebElement day=driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByVisibleText("10");
		
		
		//month  
		WebElement month=driver.findElement(By.id("months"));
		Select m=new Select(month);
		m.selectByVisibleText("February");
		
		//year
		
				WebElement year=driver.findElement(By.id("years"));
				Select y=new Select(year);
				y.selectByVisibleText("2020");
				
				
				driver.findElement(By.xpath("//form[@action='/signup']/child::div[6]/child::div[1]/child::span/child::input")).click();
				driver.findElement(By.xpath("//form[@action='/signup']/child::div[7]/child::div/child::span/child::input")).click();
				driver.findElement(By.id("first_name")).sendKeys("shivani");
				driver.findElement(By.id("last_name")).sendKeys("njnh");
				driver.findElement(By.id("company")).sendKeys("dominoz");
				driver.findElement(By.id("address1")).sendKeys("hgh,vhg,vbvg,vg");
				driver.findElement(By.id("address2")).sendKeys("jh,hbh,jnj,nj");
				driver.findElement(By.id("state")).sendKeys("Goa");
				driver.findElement(By.id("city")).sendKeys("panjim");
				driver.findElement(By.id("zipcode")).sendKeys("900");
				driver.findElement(By.id("mobile_number")).sendKeys("09876");
				
				driver.findElement(By.xpath("//form[@action='/signup']/child::button")).click();
				
				String d=driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/child::h2")).getText();
				Assert.assertEquals(d, "ACCOUNT CREATED!");
				//System.out.println(d);
				driver.findElement(By.xpath("//div[@class='pull-right']/child::a")).click();
				String e=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[10]/child::a")).getText();
				
				Assert.assertEquals(e, "Logged in as shivani");
				
				driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[5]/child::a")).click();
				
				String f=driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/child::h2/child::b")).getText();
				Assert.assertEquals(f, "ACCOUNT DELETED!");
				//System.out.println(f);
				driver.findElement(By.xpath("//div[@class='pull-right']/child::a")).click();
				
				
		
		

//		
				
	}
	

}

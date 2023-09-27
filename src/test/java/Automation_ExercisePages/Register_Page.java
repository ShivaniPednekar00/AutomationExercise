package Automation_ExercisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Register_Page {
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")public WebElement home;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a")public WebElement Signup;
	//signup
	@FindBy(xpath="//div[@class='signup-form']/child::h2")public WebElement newUserSignup;
	@FindBy(xpath="//form[@action='/signup']/child::input[2]")public WebElement name;
	@FindBy(xpath="//form[@action='/signup']/child::input[3]")public WebElement  Email;
	@FindBy(xpath="//form[@action='/signup']/child::button")public WebElement signupbtn;
	@FindBy(xpath="//form[@action='/signup']/child::p")public WebElement error;//ALREADY EXIXT
	
	@FindBy(xpath="//div[@class='col-sm-4 col-sm-offset-1']/child::div/child::h2/child::b")public WebElement accinfo;
	@FindBy(xpath="//div[@class='radio-inline'][2]/child::label/child::div/child::span/child::input")public WebElement title ;
	@FindBy(xpath="//form[@action='/signup']/child::div[4]/child::input")WebElement passw;
	@FindBy(id="days")WebElement day;
	@FindBy(id="months")WebElement month;
	@FindBy(id="years")WebElement year;
	@FindBy(xpath="//form[@action='/signup']/child::div[6]/child::div[1]/child::span/child::input")public WebElement c1 ;
	@FindBy(xpath="//form[@action='/signup']/child::div[7]/child::div/child::span/child::input")public WebElement c2;
	@FindBy(id="first_name")WebElement fName;
	@FindBy(id="last_name")public WebElement LName;
	@FindBy(id="company")WebElement Company ;
	@FindBy(id="address1")WebElement add1;
	@FindBy(id="address2")WebElement add2;
	@FindBy(id="state")WebElement state;
	@FindBy(id="city")WebElement city;
	@FindBy(id="zipcode")WebElement Zipcode;
	@FindBy(id="mobile_number")WebElement mobile;
	@FindBy(xpath="//form[@action='/signup']/child::button")WebElement createacc;
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']/child::h2")WebElement acc;
	@FindBy(xpath="//div[@class='pull-right']/child::a")WebElement continuee;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[10]/child::a")WebElement con;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[5]/child::a")WebElement nn;
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']/child::h2/child::b")WebElement nnn;
	@FindBy(xpath="//div[@class='pull-right']/child::a")WebElement co;
	@FindBy(xpath="//p[@class='text-center'][2]/child::a[1]")public WebElement reg;
	
	
	WebDriver driver;
	public Register_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	
	public void home()
	{
		
		String a=home.getText();
		Assert.assertEquals(a, "Home");
	}
	public void Sign_LoginBtn()
	{
		Signup.click();
	}
	public void New_User()
	{
		String b=newUserSignup.getText();
		Assert.assertEquals(b, "New User Signup!");
	}
	public void signup(String Name,String email)
	{
		
		name.sendKeys(Name);
		Email.sendKeys(email);
	}

	public void SignupCli()
	{

		signupbtn.click();
	}
	//EMAIL ALREADY EXIST
	public void already()
	{
		String s=error.getText();
		Assert.assertEquals(s, "Email Address already exist!");
	}
	
	
	public void AcInfo()
	{
		String c=accinfo.getText();
		Assert.assertEquals(c, "ENTER ACCOUNT INFORMATION");
	}
	public void title()
	{
		title.click();
	}
	public void form(String Pass,String FName,String lName,String company,String Add1,String Add2,String State,String City,String zipcode,String Mobile)
	{
		passw.sendKeys(Pass);
		Select s=new Select(day);
		s.selectByVisibleText("10");
		Select m=new Select(month);
		m.selectByVisibleText("February");
		Select y=new Select(year);
		y.selectByVisibleText("2020");
		c1.click();
		c2.click();
		fName.sendKeys(FName);
		LName.sendKeys(lName);
		Company.sendKeys(company);
		add1.sendKeys(Add1);
		add2.sendKeys(Add2);
		state.sendKeys(State);
		city.sendKeys(City);
		Zipcode.sendKeys(zipcode);
		mobile.sendKeys(Mobile);
	}

	public void ClickCreateAcc()
	{
		createacc.click();
	}
	public void accreated()
	{
		String d=acc.getText();
		Assert.assertEquals(d, "ACCOUNT CREATED!");
	}
	public void continueBtn()
	{
		continuee.click();
		
	}
	
	
	//DELETE ACCOUNT
	public void DeleteAcc()
	{
		String e=con.getText();
		Assert.assertEquals(e, "Logged in as shi");
		nn.click();
		String f=nnn.getText();
		Assert.assertEquals(f, "ACCOUNT DELETED!");
		co.click();
	}
	public void reg()
	{
		reg.click();
	}

}

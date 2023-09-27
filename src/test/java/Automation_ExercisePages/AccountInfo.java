package Automation_ExercisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AccountInfo {
	
	@FindBy(xpath="//div[@class='col-sm-4 col-sm-offset-1']/child::div/child::h2/child::b")WebElement accinfo;
	@FindBy(xpath="//div[@class='radio-inline'][2]/child::label/child::div/child::span/child::input")WebElement title ;
	@FindBy(xpath="//form[@action='/signup']/child::div[4]/child::input")WebElement passw;
	@FindBy(id="days")WebElement day;
	@FindBy(id="months")WebElement month;
	@FindBy(id="years")WebElement year;
	@FindBy(xpath="//form[@action='/signup']/child::div[6]/child::div[1]/child::span/child::input")WebElement c1 ;
	@FindBy(xpath="//form[@action='/signup']/child::div[7]/child::div/child::span/child::input")WebElement c2;
	@FindBy(id="first_name")WebElement fName;
	@FindBy(id="last_name")WebElement lName;
	@FindBy(id="company")WebElement company ;
	@FindBy(id="address1")WebElement add1;
	@FindBy(id="address2")WebElement Add2;
	@FindBy(id="state")WebElement state;
	@FindBy(id="city")WebElement city;
	@FindBy(id="zipcode")WebElement zipcode;
	@FindBy(id="mobile_number")WebElement mobile;
	@FindBy(xpath="//form[@action='/signup']/child::button")WebElement createacc;
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']/child::h2")WebElement acc;
	@FindBy(xpath="//div[@class='pull-right']/child::a")WebElement continuee;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[10]/child::a")WebElement con;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[5]/child::a")WebElement nn;
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']/child::h2/child::b")WebElement nnn;
	@FindBy(xpath="//div[@class='pull-right']/child::a")WebElement co;
	
	WebDriver driver;
	public AccountInfo(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

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
	public void password()
	{
		passw.sendKeys("fgg");
	}
	public void day()
	{
		Select s=new Select(day);
		s.selectByVisibleText("10");
	}
	public void month()
	{
		Select m=new Select(month);
		m.selectByVisibleText("February");
	}
	public void year()
	{
		Select y=new Select(year);
		y.selectByVisibleText("2020");
	}
	public void checbox()
	{
		c1.click();
		c2.click();
	}
	public void fname()
	{
		fName.sendKeys("shi");
	}
	public void lname()
	{
		lName.sendKeys("oihf");
	}
	public void company()
	{
		company.sendKeys("gggf");
	}
	public void Address()
	{
		add1.sendKeys("hjj,kjgg,jhhgg");
		Add2.sendKeys("hgf,vhh,nnnb");
	}
	public void state()
	{
		state.sendKeys("goa");
	}
	public void city()
	{
		city.sendKeys("mapusa");
	}
	public void Zipcode()
	{
		zipcode.sendKeys("5689");
	}
	public void mobile()
	{
		mobile.sendKeys("8765432165");
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
	
}

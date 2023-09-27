package Automation_ExercisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_Page {
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")WebElement home;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a")WebElement Signup;
	@FindBy(xpath="//div[@class='login-form']/child::h2")WebElement login;
	@FindBy(xpath="//form[@action='/login']/child::input[2]")WebElement logName;
	@FindBy(xpath="//form[@action='/login']/child::input[3]")WebElement logpas;
	@FindBy(xpath="//form[@action='/login']/child::button")WebElement logbtn;
	@FindBy(xpath="//form[@action='/login']/child::p")WebElement inc;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[10]/child::a")public WebElement con;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[5]/child::a")public WebElement nn;
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']/child::h2/child::b")public WebElement nnn;
	@FindBy(xpath="//div[@class='pull-right']/child::a")public WebElement co;
	
	
	WebDriver driver;
	public Login_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	public void home()
	{
		String h=home.getText();
		Assert.assertEquals(h, "Home");
	}
	public void signup()
	{
		Signup.click();
	}
	public void loginIsVisible()
	{
		String g=login.getText();
		Assert.assertEquals(g, "Login to your account");
	}
	public void uEmail(String emails)
	{
		logName.sendKeys(emails);
		
		
	}
	public void Upaswd(String Passs)
	{
		logpas.sendKeys(Passs);
	}
	public void logbtnClick()
	{
		logbtn.click();
		
	}
	public void invalid()
	{
		String n=inc.getText();
		Assert.assertEquals(n, "Your email or password is incorrect!");
	}
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

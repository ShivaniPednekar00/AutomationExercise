package Project2_AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Repository {
	WebDriver driver;
	public Repository(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	
	//home
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")WebElement home;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a")WebElement Signup;
	//signup
	@FindBy(xpath="//div[@class='signup-form']/child::h2")WebElement newUserSignup;
	@FindBy(xpath="//form[@action='/signup']/child::input[2]")WebElement name;
	@FindBy(xpath="//form[@action='/signup']/child::input[3]")WebElement  email;
	@FindBy(xpath="//form[@action='/signup']/child::button")WebElement signupbtn;
	
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
	
	@FindBy(xpath="//div[@class='login-form']/child::h2")WebElement login;
	@FindBy(xpath="//form[@action='/login']/child::input[2]")WebElement logName;
	@FindBy(xpath="//form[@action='/login']/child::input[3]")WebElement logpas;
	@FindBy(xpath="//form[@action='/login']/child::button")WebElement logbtn;
	@FindBy(xpath="//form[@action='/login']/child::p")WebElement inc;
	@FindBy(xpath="//div[@class='shop-menu pull-right']/child::ul/child::li[4]/child::a")WebElement logout;
	@FindBy(xpath="//form[@action='/signup']/child::p")WebElement errms;
	@FindBy(xpath="//div[@class='shop-menu pull-right']/child::ul/child::li[9]")WebElement contactus;
	@FindBy(xpath="//div[@class='contact-form']/child::h2")WebElement getinTouch;
	@FindBy(name="name")WebElement cname;
	@FindBy(name="email")WebElement cemail;
	@FindBy(name="subject")WebElement csubject;
	@FindBy(xpath="//form[@action='/contact_us']/child::div[4]/child::textarea")WebElement msg;
	@FindBy(xpath="//form[@action='/contact_us']/child::div[5]/child::input")WebElement file;
	@FindBy(xpath="//form[@action='/contact_us']/child::div[6]/child::input")WebElement submitbtn;
	@FindBy(xpath="//div[@class='status alert alert-success']")WebElement succ;
	@FindBy(xpath="//div[@id='form-section']/chikd::a")WebElement homm;
//	@FindBy(xpath=)WebElement ;
//	@FindBy(xpath=)WebElement ;
//	@FindBy(xpath=)WebElement ;
//	@FindBy(xpath=)WebElement ;
//	@FindBy(xpath=)WebElement ;
//	@FindBy(xpath=)WebElement ;
	

}

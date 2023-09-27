package Automation_ExercisePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Project2_AutomationExercise.Repository;

public class Contactus_page {
	//@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")WebElement home;
	@FindBy(xpath="//div[@class='shop-menu pull-right']/child::ul/child::li[8]/child::a")WebElement contactus;
	@FindBy(xpath="//div[@class='contact-form']/child::h2")WebElement getinTouch;
	@FindBy(name="name")WebElement cname;
	@FindBy(name="email")WebElement cemail;
	@FindBy(name="subject")WebElement csubject;
	@FindBy(xpath="//form[@action='/contact_us']/child::div[4]/child::textarea")WebElement msg;
	@FindBy(xpath="//form[@action='/contact_us']/child::div[5]/child::input")WebElement file;
	@FindBy(xpath="//form[@action='/contact_us']/child::div[6]/child::input")WebElement submitbtn;
	@FindBy(xpath="//div[@class='status alert alert-success']")WebElement succ;
	@FindBy(xpath="//div[@id='form-section']/child::a/child::span/child::i")WebElement home;
	WebDriver driver;
	public Contactus_page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void home()
	{
		String a=home.getText();
		Assert.assertEquals(a, "Home");
	}
	public void ClickConta() throws InterruptedException
	{
		contactus.click();
		String a=getinTouch.getText();
		Assert.assertEquals(a, "GET IN TOUCH");
		cname.sendKeys("shi");
		cemail.sendKeys("fgh@fgh");
		csubject.sendKeys("ghhh");
		msg.sendKeys("vvbb");
		Thread.sleep(3000);
		file.sendKeys("C:\\Users\\admin\\Desktop\\Data.xlsx");
		submitbtn.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String b=succ.getText();
		Assert.assertEquals(b, "Success! Your details have been submitted successfully.");
		Thread.sleep(3000);	
		home.click();
		
	}
	
	
	
	
}

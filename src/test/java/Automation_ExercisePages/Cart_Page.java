package Automation_ExercisePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart_Page {
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[3]/child::a")public WebElement card;
	@FindBy(xpath="//ol[@class='breadcrumb']/child::li[2]")public WebElement verCart;
	@FindBy(xpath="//div[@class='col-sm-6']/child::a")public WebElement procChek;
	@FindBy(xpath="//div[@class='modal-footer']/child::button")public WebElement cont;
	@FindBy(xpath="//textarea[@name='message']")public WebElement com;
	@FindBy(xpath="//a[text()=\"Place Order\"]")public WebElement click;
	@FindBy(xpath="//input[@name='name_on_card']")public WebElement name;
	@FindBy(xpath="//input[@name='card_number']")public WebElement contact;
	@FindBy(xpath="//input[@name='cvc']")public WebElement cvv;
	@FindBy(xpath="//input[@name='expiry_month']")public WebElement month;
	@FindBy(xpath="//input[@name='expiry_year']")public WebElement year;
	@FindBy(xpath="//button[@id=\"submit\"]")public WebElement submit;
	@FindBy(xpath="//div[@class='form-row'][4]/child::div/child::div")public WebElement verif;
	@FindBy(xpath="//button[@id='submit']")public WebElement btn;
	@FindBy(xpath="//div[@class='pull-right']/child::a")public WebElement Conti;
	@FindBy(xpath="//td[@class='cart_delete']/child::a")public WebElement cross;
	@FindBy(xpath="//span[@id='empty_cart']/child::p")public WebElement emptymsg;
	@FindBy(xpath="//a[@class='btn btn-default check_out']")public WebElement invoice;
	WebDriver driver;
	public Cart_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void addtoCarts() throws InterruptedException
	{
		card.click();
		String cart=verCart.getText();
		Assert.assertEquals(cart, "Shopping Cart");
		Thread.sleep(3000);		
		procChek.click();
	    
//		Thread.sleep(3000);
	}
	public void cart()
	{
		card.click();
		String cart=verCart.getText();
		Assert.assertEquals(cart, "Shopping Cart");
		
//		String act=emptymsg.getText();
//		Assert.assertEquals(act, "Cart is empty! Click");
	}
	public void cros()
	{
		cross.click();
	}
	
	public void com()
	{
		cont.click();
	}
	public void comment() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,9000)");
		Thread.sleep(6000);
		com.sendKeys("shivani");
		click.click();
		name.sendKeys("sdfghjkk");
		contact.sendKeys("987654210");
		cvv.sendKeys("123");
		month.sendKeys("11");
		year.sendKeys("2000");
		submit.click();
		Thread.sleep(3000);
//		String a=verif.getText();
//		Assert.assertEquals(a,"Your order has been placed successfully!");
//		Thread.sleep(3000);
//		btn.click();
	}
	public void contu()
	{
		Conti.click();
	}
	public void invoice()
	{
		invoice.click();
	}

}

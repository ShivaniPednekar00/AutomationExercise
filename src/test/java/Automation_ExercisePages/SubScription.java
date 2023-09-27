package Automation_ExercisePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SubScription {

	@FindBy(xpath="//div[@class='single-widget']/child::h2")WebElement subscriptio;
	@FindBy(xpath="//form[@class='searchform']/child::input[2]")WebElement email;
	@FindBy(xpath="//form[@class='searchform']/child::button")WebElement btn;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[3]/child::a")WebElement cart;
	
	
	WebDriver driver;
	public SubScription(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	public void subscriptionhome() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,9000)");
		Thread.sleep(6000);
		String a=subscriptio.getText();
		Assert.assertEquals(a,"SUBSCRIPTION");
		email.sendKeys("a@gmail.com");
		 btn.click();
	}
	public void cart()
	{
		cart.click();
	}
	//CALL ABOVE FOR CART SUBSCRIPTION

}

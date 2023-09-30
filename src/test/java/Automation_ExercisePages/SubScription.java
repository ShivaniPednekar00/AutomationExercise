package Automation_ExercisePages;

import java.util.List;

import org.openqa.selenium.By;
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
	@FindBy(xpath="//a[@id='scrollUp']")WebElement arrow;
	@FindBy(xpath="//div[@id='slider-carousel']/descendant::h2")WebElement fledge;
	
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
	//SCROLL UP
	public void su() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,9000)");
		String a=subscriptio.getText();
		Assert.assertEquals(a,"SUBSCRIPTION");
	}
	public void arrow() throws InterruptedException {
		arrow.click();
		Thread.sleep(3000);
	}
	public void j() throws InterruptedException
	{
		String l=fledge.getText();
		Assert.assertEquals(l,"Full-Fledged practice website for Automation Engineers");
		
	}
	public void up() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,0)");
	    Thread.sleep(3000);
	}

}

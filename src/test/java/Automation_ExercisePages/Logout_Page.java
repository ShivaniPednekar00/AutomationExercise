package Automation_ExercisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logout_Page {
	@FindBy(xpath="//div[@class='shop-menu pull-right']/child::ul/child::li[4]/child::a")WebElement logout;
	@FindBy(xpath="//div[@class='col-sm-4 col-sm-offset-1']/child::div/child::h2")WebElement loginpg;
	@FindBy(xpath="//form[@action='/signup']/child::p")WebElement errms;
	
	WebDriver driver;
	public Logout_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		logout.click();
		String a=loginpg.getText();
		Assert.assertEquals(a, "Login to your account");
	}

}

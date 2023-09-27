package Automation_ExercisePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCases {
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")WebElement home;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[5]/child::a")WebElement TestClick;
	@FindBy(xpath="//div[@class='col-sm-9 col-sm-offset-1']/child::h2")WebElement Testcases;
	WebDriver driver;
	public TestCases(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	public void testcasess()
	{
		String a=home.getText();
		Assert.assertEquals(a, "Home");
		TestClick.click();
		String b=Testcases.getText();
		Assert.assertEquals(b, "TEST CASES");
		
	}

}

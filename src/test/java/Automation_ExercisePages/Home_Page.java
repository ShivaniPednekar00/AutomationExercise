package Automation_ExercisePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home_Page {
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")public WebElement home;
	@FindBy(xpath="//div[@class='col-sm-4'][2]/child::div/child::div[2]/child::ul/child::li/child::a")public WebElement viewProdct;
	@FindBy(xpath="//input[@id=\"quantity\"]")public WebElement quantity;
	@FindBy(xpath="//button[@type=\"button\"]")public WebElement addToCart;
	@FindBy(xpath="//p[@class='text-center']/child::a")public WebElement ViewDetails;
	@FindBy(xpath="//tr[@id='product-2']/child::td[4]/child::button")public WebElement qty;
	@FindBy(xpath="//div[@class='left-sidebar']/child::h2")public WebElement categ;
	@FindBy(xpath="//div[@class='panel-group category-products']/child::div[1]/child::div[1]/child::h4/child::a")public WebElement cat;
	@FindBy(xpath="//div[@id='Women'][1]/child::div/child::ul[1]/child::li[1]/child::a[1]")public WebElement dress;
	@FindBy(xpath="//h2[@class='title text-center']")public WebElement tex;
	@FindBy(xpath="//div[@id='accordian']/child::div[2]/child::div/child::h4/child::a")public WebElement men;
	@FindBy(xpath="//div[@id='Men']/child::div/child::ul/child::li[1]/child::a[1]")public WebElement tshirt;
	@FindBy(xpath="//div[@class='features_items']/child::h2")public WebElement ms;
	@FindBy(xpath="//div[@class='recommended_items']/child::h2")WebElement recom;
	@FindBy(xpath="//div[@id='recommended-item-carousel']/child::div/child::div/child::div/child::div/child::div/child::div/child::a")WebElement car;
	@FindBy(xpath="//p[@class='text-center'][2]/child::a")WebElement ca;
	WebDriver driver;
	public Home_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	public void home()
	{
		home.click();
	}
	public void viewProduct() throws InterruptedException
	{
			//home.click();
			viewProdct.click();
			quantity.clear();
			quantity.sendKeys("4");
			addToCart.click();
			Thread.sleep(3000);
			ViewDetails.click();
			String a=qty.getText();
			Assert.assertEquals(a, "4");
		}
	public void category()
	{
		String ll=categ.getText();
		Assert.assertEquals(ll, "CATEGORY");
		cat.click();
		dress.click();
		String tt=tex.getText();
		Assert.assertEquals(tt, "WOMEN - DRESS PRODUCTS");
		men.click();
		tshirt.click();
		String kk=ms.getText();
		Assert.assertEquals(kk, "MEN - TSHIRTS PRODUCTS");
		
	}
	public void recommended() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,8000)");
			Thread.sleep(6000);
			String tt=recom.getText();
			Assert.assertEquals(tt, "RECOMMENDED ITEMS");
		
			car.click();
			Thread.sleep(3000);
			ca.click();
	}
}

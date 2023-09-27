package Automation_ExercisePages;

import java.util.List;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Product_Page {
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[2]/child::a")WebElement product;
	@FindBy(xpath="//div[@class='features_items']/child::h2")WebElement Allproduct;
	@FindBy(xpath="//div[@class='features_items']/child::div[2]/child::div/child::div[2]/child::ul/child::li/child::a")WebElement viewDetails;
	@FindBy(xpath="//div[@class='product-information']/child::h2")WebElement Tname;
	@FindBy(xpath="//div[@class='product-information']/child::p[1]")WebElement catagery;
	@FindBy(xpath="//div[@class='product-information']/child::span/child::span")WebElement price;
	@FindBy(xpath="//div[@class='product-information']/child::p[2]")WebElement available;
	@FindBy(xpath="//div[@class='product-information']/child::p[3]")WebElement condition;
	@FindBy(xpath="//div[@class='product-information']/child::p[4]")WebElement brand;
	@FindBy(xpath="//div[@class='container']/child::input[1]")WebElement serachbox;
	@FindBy(xpath="//div[@class='container']/child::button")WebElement btn;
	@FindBy(xpath="//div[@class='features_items']/child::h2")WebElement Searched;
	@FindBy(xpath="//div[@class='features_items']/child::div[2]/child::div[1]/child::div[1]/child::div[1]/child::a")WebElement AddCart;
	@FindBy(xpath="//div[@class='modal-footer']/child::button")WebElement continueShop;
	@FindBy(xpath="//div[@class='features_items']/child::div[3]/child::div[1]/child::div[1]/child::div[1]/child::a")WebElement AddCart2;
	@FindBy(xpath="//div[@class='modal-body']/child::p[2]/child::a")WebElement Vc;
	
	@FindBy(xpath="//div[@class='features_items']/child::div[4]/child::div/child::div[2]/child::ul/child::li[1]/child::a")WebElement view;
	
	
	
	@FindBy(xpath="//div[@class='table-responsive cart_info']/child::table/child::tbody/child::tr[1]/child::td[2]/child::h4/a")WebElement Fproduct;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/child::table/child::tbody/child::tr[2]/child::td[2]/child::h4/a")WebElement Sproduct;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/child::table/child::tbody/child::tr[1]/child::td[3]/child::p")WebElement p1;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/child::table/child::tbody/child::tr[2]/child::td[3]/child::p")WebElement p2;
	
	
	@FindBy(xpath="//div[@class='table-responsive cart_info']/child::table/child::tbody/child::tr[2]/child::td[4]/child::button")WebElement q1;
	@FindBy(xpath="//div[@class='table-responsive cart_info']/child::table/child::tbody/child::tr[1]/child::td[4]/child::button")WebElement q2;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a")public WebElement home;
	@FindBy(xpath="//div[@class='brands_products']/child::h2")public WebElement brands;
	@FindBy(xpath="//ul[@class='nav nav-pills nav-stacked']/child::li[2]/child::a")public WebElement hm;

	@FindBy(xpath="//div[@class='features_items']/child::h2")public WebElement nl;
	@FindBy(xpath="//ul[@class='nav nav-pills nav-stacked']/child::li[5]/child::a")public WebElement baby;
	@FindBy(xpath="//div[@class='features_items']/child::h2")public WebElement bb;
	@FindBy(xpath="//td[@class='cart_description']/child::h4/child::a")public WebElement top;
	@FindBy(xpath="//div[@class='features_items']/child::div[3]/child::div/child::div[2]/child::ul/child::li/child::a")public WebElement viewprodct;
	@FindBy(xpath="//ul[@class='nav nav-tabs']/child::li/child::a")public WebElement review;
	@FindBy(xpath="//input[@id='name']")WebElement name;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@id='review']")WebElement rev;
	@FindBy(xpath="//button[@id='button-review']")WebElement butt;
	WebDriver driver;
	public Product_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);

	}
	public void top()
	{
		String g=top.getText();
		Assert.assertEquals(g, "Blue Top");
	}
	public void product()
	{
		product.click();
		String a=Allproduct.getText();
		Assert.assertEquals(a, "ALL PRODUCTS");
		
	}
	//1
	public void viewDetails() {
		viewDetails.click();
		String b=Tname.getText();
		Assert.assertEquals(b, "Blue Top");
		String c=catagery.getText();
		Assert.assertEquals(c, "Category: Women > Tops");
		String d=price.getText();
		Assert.assertEquals(d, "Rs. 500");
		String e=available.getText();
		Assert.assertEquals(e, "Availability: In Stock");
		String f=condition.getText();
		Assert.assertEquals(f, "Condition: New");
		String g=brand.getText();
		Assert.assertEquals(g, "Brand: Polo");
	}
	//2
	public void Searchbox()
	{
		serachbox.sendKeys("blue top");
		btn.click();
		String v=Searched.getText();
		Assert.assertEquals(v, "SEARCHED PRODUCTS");
	}
	//3
	public void AddtoCart() throws InterruptedException
	{
		AddCart.click();
		Thread.sleep(3000);
		continueShop.click();
	}
	public void AddCart2() throws InterruptedException {
		AddCart2.click();
		Thread.sleep(3000);
		Vc.click();
		String a=Fproduct.getText();
		Assert.assertEquals(a,"Blue Top");
		
		String b=Sproduct.getText();
		Assert.assertEquals(b,"Men Tshirt");
		String c=p1.getText();
		Assert.assertEquals(c,"Rs. 500");
		String d=p2.getText();
		Assert.assertEquals(d,"Rs. 400");
		String e=q1.getText();
		Assert.assertEquals(e,"1");
		String f=q2.getText();
		Assert.assertEquals(f,"1");
		}
	public void brand()
	{
		String as=brands.getText();
		Assert.assertEquals(as, "BRANDS");
		hm.click();
		String hmm=nl.getText();
		Assert.assertEquals(hmm, "BRAND - H&M PRODUCTS");
		baby.click();
		String j=bb.getText();
		Assert.assertEquals(j, "BRAND - BABYHUG PRODUCTS");
	}
	public void viewProduct()
	{
		viewprodct.click();
		String ff=review.getText();
		Assert.assertEquals(ff, "WRITE YOUR REVIEW");
		name.sendKeys("shivani");
		email.sendKeys("asd@fna");
		rev.sendKeys("GOOD PRODUCT");
		butt.click();
		
		
	}
	
	
	

}

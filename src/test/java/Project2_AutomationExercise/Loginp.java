package Project2_AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginp {
	WebDriver driver;
	Repository rp;
	@Test(priority=2)
	public void Login()
	{
		rp=new Repository(driver);
		String h=rp.home.getText();
		Assert.assertEquals(h, "Home");
		System.out.println(h);
		rp.Signup.click();
		String g=rp.login.getText();
		Assert.assertEquals(g, "Login to your account");
		System.out.println(g);
		rp.logName.sendKeys("zhmvmnzbcmcmbjzng@gmail.com");
		rp.logpas.sendKeys("fgg");
		rp.logbtn.click();
		
		
		
	}

}

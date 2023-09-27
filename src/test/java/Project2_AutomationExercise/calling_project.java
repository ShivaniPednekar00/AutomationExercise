package Project2_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class calling_project {
	@Test
	public void calling() throws InterruptedException
	{
		WebDriver driver;
		Main_code_Automation c=new Main_code_Automation();
		
		Loginp l=new Loginp();
		//REGISTER
		c.LaunchChrome();
		c.register();
		c.form();
		//DELETE
		c.delete();
		//REGISTER
		c.register();
		c.form();
		Thread.sleep(3000);
		//LOGIN
		c.lo();;
		c.Login();
		//DELETE
		c.delete();
		Thread.sleep(3000);	
		//INVALID
		c.lo();
		c.incorrectCred();
		//LOGIN
		c.register();
		c.form();
		c.lo();
		c.Login();
		c.logout();
		
		
		//REGISTER WITH EXISTING EMAIL
		c.register();
		c.incEmail();
		
		//CONTACT US
		c.contactus();
		
		
		
		
		
	}

}

package qaWingify;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG_BaseClass_UtilityClass.Guru99_insurance_BrokerInsuranceWebPage;
import POM_DDF_TestNG_BaseClass_UtilityClass.Guru99_insurance_Login;
import POM_DDF_TestNG_BaseClass_UtilityClass.UtilityClass;

public class TestNG_Class extends Base_Class
{
	Login_Page Login;
	Home_Page login1;
	

	  @BeforeClass
	    public void OpenBrowser()
	    {
		  initialize_browser();
	    
	    //create object of POM-I
	    Login=new Login_Page(driver);
	    
	    //create object of POM-II
	    login1=new Home_Page(driver);
	    
	    }
		
		
	  @BeforeMethod
	    public void Login() throws IOException, InterruptedException
	    {
		  Login.enterUsername(UtilityClass.getDatafromPF("EM"));
		  Thread.sleep(1000);
		  
		  Login.enterPassword(UtilityClass.getDatafromPF("PW"));
		  Thread.sleep(1000);
		  
		  Login.clickLoginBtn();
		 
	    }
	  
	  @Test(priority=1)
	    public void ClickAmount()
	    {
		  login1.clickAmountBtn();
		  //check the table is sorted after clicking
		  
		  for(i=1; i<=5; i++)
		  {
			  List<WebElement> values=driver.findElements(By.xpath("//div[@class='element-wrapper']//tr[i]/td[j]"));
			  
		  }
		    
	    }

	

}

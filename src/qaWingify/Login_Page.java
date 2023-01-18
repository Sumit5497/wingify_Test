package qaWingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	//POM
	
		//1. Data members/Global variables should be declared globally with access level private by using @findby Annotation
	
	@FindBy(xpath="//input[@id='username']")private WebElement Username;  
	@FindBy(xpath="//input[@id='password']")private WebElement Password;  
    @FindBy(xpath="//button[@id='log-in']")private WebElement Login;
    @FindBy(xpath="//input[@class='form-check-input']")private WebElement Checkbox;
    
  //2. Initialize within a constructor with access level public using pagefactory
	
  	public Login_Page(WebDriver driver)
  	{
  		PageFactory.initElements(driver,this);
  	}
  	
  	public void enterUsername(String Email)
	{
	Username.sendKeys(Email);	
	}
  	
  	public void enterPassword(String Pass)
	{
	Password.sendKeys(Pass);	
	}
  	
  	public void clickLoginBtn()
	{
		Checkbox.click();
	}



}

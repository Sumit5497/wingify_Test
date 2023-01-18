package qaWingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	@FindBy(xpath="//th[@id='amount']")private WebElement Amount;
	@FindBy(xpath="//div[@class='element-wrapper']//tr[i]/td[j]")private WebElement AmountValue;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickAmountBtn()
	{
		Amount.click();
	}
	
}

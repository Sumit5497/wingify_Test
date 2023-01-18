package qaWingify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	public WebDriver driver;

	public void initialize_browser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\aug 6\\eclipse-dsl-2020-09-R-win32-x86_64\\eclipse\\Browser\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

}

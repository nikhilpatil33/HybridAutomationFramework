package baseutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
static WebDriver driver;

	public  static WebDriver open(String browser,String url)
	{
		if(browser=="chrome")
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser=="firefox")
		{
			driver=new FirefoxDriver();
		}
		else if(browser=="ie")
		{
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}

	public static void kill() {
		driver.quit();
		
	}
}


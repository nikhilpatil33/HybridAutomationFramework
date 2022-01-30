package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	 WebDriver driver;
	@FindBy(xpath="/html/body/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div/div/h1") WebElement banner;
	@FindBy(xpath="/html/body/div[3]/div[1]/div[1]/div/div/div/div/div[4]/div[3]/div/div/div[2]/a") WebElement btn1;
	@FindBy(xpath="/html/body/div[3]/div[1]/div[1]/div/div/div/div/div[5]/div[1]/div/div/div[2]/a") WebElement btn2;
	
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String verifytext()
	{
		String str=banner.getText();
		return str;
	}
	
	public Boolean verifybtn1()
	{
		Boolean p=btn1.isEnabled();
		return p;
	}
	public Boolean verifybtn2()
	{
		Boolean p=btn2.isEnabled();
		return p;
	}
	
}

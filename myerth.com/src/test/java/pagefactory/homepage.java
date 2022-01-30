package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	 WebDriver driver;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5") WebElement banner;
	@FindBy(xpath="//*[@id=\"app\"]/header/a/img") WebElement title;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div") WebElement div1;
	
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
		Boolean p=title.isDisplayed();
		return p;
	}
	public Boolean verifybtn2()
	{
		Boolean p=div1.isDisplayed();
		return p;
	}
	
}

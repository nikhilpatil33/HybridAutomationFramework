package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookspage {
	 WebDriver driver;
		@FindBy(id="userName") WebElement fullname;
		@FindBy(id="userEmail") WebElement userEmail;
		@FindBy(id="currentAddress") WebElement currentAddress;
		@FindBy(id="permanentAddress") WebElement permanentAddress;
		@FindBy(id="submit") WebElement submit;
		
		@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]") WebElement elements;
		@FindBy(xpath="//*[@id=\"item-0\"]/span") WebElement textbox;
		public bookspage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void set(String name,String email,String CA,String PA)
		{
			fullname.sendKeys(name);
			userEmail.sendKeys(email);
			currentAddress.sendKeys(CA);
			permanentAddress.sendKeys(PA);
			submit.click();
		}

		public void clickme() {
			//just a msg me
			elements.click();
			textbox.click();
			
		}
		
}

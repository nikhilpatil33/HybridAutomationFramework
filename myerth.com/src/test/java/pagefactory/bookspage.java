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
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div/button") WebElement submit;
		@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div") WebElement navi;
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


			//just a msg me 01



			//02

			elements.click();
			textbox.click();
			
		}

		public void clearall() {
			fullname.clear();
			userEmail.clear();
			currentAddress.clear();
			permanentAddress.clear();
			
		}
		
}

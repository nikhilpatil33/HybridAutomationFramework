package tests;

import org.testng.annotations.Test;

import baseutility.ReadExcel;
import baseutility.base;
import pagefactory.bookspage;
import pagefactory.homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class books {
	WebDriver driver;
	bookspage page;
	
  @Test(dataProvider="testdata")
  public void f(String name,String email,String CA,String PA) {
	  /*String name1=name;
	  String email1=email;
	  String CA1=CA;
	  String PA1=PA; */
	  page.set(name, email, CA, PA);
	  
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  String br="chrome";
	  String url="https://demoqa.com";
	   driver=base.open(br,url);
	   page=new bookspage(driver);
  }

  @AfterTest
  public void afterTest() {
  }

  @DataProvider(name="testdata")
  public Object[][] testDataExample() throws IOException
  {
  ReadExcel config = new ReadExcel(".\\drivers\\data.xlsx");
  int rows = config.getRowCount(0);
  Object[][]signin_credentials = new Object[rows][4];

  for(int i=0;i<rows;i++)
  {
  signin_credentials[i][0] = config.getData(0, i, 0);
  signin_credentials[i][1] = config.getData(0, i, 1);
  signin_credentials[i][2] = config.getData(0, i, 2);
  signin_credentials[i][3] = config.getData(0, i, 3);
  }
  return signin_credentials;
  }
}

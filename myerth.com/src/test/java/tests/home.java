package tests;

import org.testng.annotations.Test;

import baseutility.base;
import pagefactory.homepage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class home {
	WebDriver driver;
	homepage page;
  @Test()
  public void f() {
	  String s1=page.verifytext();
	  assertEquals(s1,"Book Store Application");
	  Boolean p=page.verifybtn1();
	  assertTrue(p);
	  Boolean q=page.verifybtn2();
	  assertTrue(q);
	  System.out.println("done");
	  
  }

  /* @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    }; 
  }*/
  @BeforeTest
  public void beforeTest() {
	  String br="chrome";
	  String url="https://demoqa.com";
	   driver=base.open(br,url);
	   page=new homepage(driver);
  }

  @AfterTest
  public void afterTest() {
	  base.kill();
  }

}

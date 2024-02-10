package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  String Url= "https://github.com/";
	  
	  System.out.println("Opening the Browser");
	  driver = new ChromeDriver();
	  driver.get(Url);
	  String CheckingTitle = "Let's build from here";
	  String Github_original_title= driver.getTitle();
	  
	  Assert.assertEquals(CheckingTitle, Github_original_title);
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Starting/Running test on Browser");
  }

  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  System.out.println("Testing is Finished");
  }

}

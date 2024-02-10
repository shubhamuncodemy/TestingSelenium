package day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Classes {
	
	WebDriver driver;
	
  @Test(description="In this test we automate the login page")
  public void loginPage() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	
  }
  
  
  @BeforeMethod(description="Here we open the google first in chrome")
  public void openTheBrowser() throws InterruptedException {
	  
	  driver.get("https://google.com");
	  Thread.sleep(2000);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  System.out.println("Current URL id -" +driver.getCurrentUrl());
	  
  }
  

  @AfterMethod(description="After the test is complete we fetching the current url")
  public void afterMethod() {
	  
	  System.out.println("The Current Url where the user is - "+driver.getCurrentUrl());
  
  }
  
  
  

  @BeforeClass
  public void browserTestSetup() {
	  
	  System.out.println("Opening the Browser");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	 
  }
  

  @AfterClass(description="After all the test is completed we close the browser")
  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.close();
  
  }

}

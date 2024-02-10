package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver object_name = new ChromeDriver();
		
		object_name.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		Thread.sleep(3000);
		object_name.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		object_name.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		object_name.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		
		object_name.findElement(By.xpath("(//a)[2]")).click();
	}

}

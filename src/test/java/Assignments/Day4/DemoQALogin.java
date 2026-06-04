package Assignments.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQALogin {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		try
		{
			WebDriver driver= new EdgeDriver();
			driver.get("https://demoqa.com/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("userName")).sendKeys("testuser");
			driver.findElement(By.id("password")).sendKeys("Test@123");
			driver.findElement(By.id("login")).click();		
			System.out.println("Login button clicked successfully");
		}catch (Exception e) {
		
			e.printStackTrace();
		
		}
		
		
	}

	}


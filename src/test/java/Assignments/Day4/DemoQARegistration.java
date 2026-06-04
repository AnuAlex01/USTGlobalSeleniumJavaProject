package Assignments.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQARegistration {

	public static void main(String[] args) {
			WebDriverManager.edgedriver().setup();
		
		try
		{
			WebDriver driver= new EdgeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("firstName")).sendKeys("Anu");
			driver.findElement(By.id("lastName")).sendKeys("Alex");
			driver.findElement(By.id("userEmail")).sendKeys("anu@gmail.com");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//label[text()='Female']")).click();
			System.out.println("Gender selected");
			Thread.sleep(1000);
			driver.findElement(By.id("userNumber")).sendKeys("9876543210");
			System.out.println("Mobile Number entered");
			System.out.println("Registration Successfull");
		}catch (Exception e) {
		
			e.printStackTrace();
		
		}
		
		
	}

}

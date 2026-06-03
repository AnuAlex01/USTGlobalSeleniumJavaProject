package Assignments.Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoLogin {

	public static void main(String[] args) {
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			WebDriverManager.chromedriver().setup();
		
			driver.close();
		}catch (Exception e) {
		
			e.printStackTrace();
		
		
	}

}
}

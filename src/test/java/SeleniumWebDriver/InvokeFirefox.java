package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFirefox {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		
		try
		{
			driver= new FirefoxDriver();
			driver.get("https://orangehrm.com/");
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
		}catch (Exception e) {
		
			e.printStackTrace();
		
		}

	}

}

package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdge {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		try
		{
			driver= new EdgeDriver();
			driver.get("https://orangehrm.com/");
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			//driver.close();
		}catch (Exception e) {
		
			e.printStackTrace();
		
		}
}

	}

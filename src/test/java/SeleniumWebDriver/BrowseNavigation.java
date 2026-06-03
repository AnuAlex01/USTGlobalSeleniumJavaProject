package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowseNavigation {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		try
		{
			driver= new ChromeDriver();
			driver.get("https://orangehrm.com/");
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			String currentURL =driver.getCurrentUrl();
			String ExpectedURL="https://orangehrm.com/";
			System.out.println(currentURL);
			if(currentURL.equals(ExpectedURL)) {
				System.out.println("This is correct URL");
			}else
			{
				System.out.println("This is incorrect URL");
			}
			driver.close();
		}catch (Exception e) {
		
			e.printStackTrace();
		

	}

}
}

package SeleniumWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class InvokeChrome {
	
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
				driver.close();
			}catch (Exception e) {
			
				e.printStackTrace();
			
			}
	}

}

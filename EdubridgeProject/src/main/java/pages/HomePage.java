package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	public WebDriver driver = new ChromeDriver();
	
	
	public void navigateToRegister()
	{
		driver.get("https://swayam.gov.in/");
		driver.manage().window().maximize();
		
	
	}
			
}


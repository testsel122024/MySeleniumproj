package Myselenium;

import java.sql.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Timespan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChrome {	
	public static void main(String[] args)
	{
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://toolsqa.com/");
			
		//driver.close();
		
	}

}

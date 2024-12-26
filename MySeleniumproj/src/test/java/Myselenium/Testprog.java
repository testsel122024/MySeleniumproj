package Myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testprog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Sriproj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("the Title of the webpage is :"+driver.getTitle());
		
	}

}

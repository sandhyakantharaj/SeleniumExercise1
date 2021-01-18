package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//Chrome 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smanoj\\Desktop\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");

		
		/*
		 * //firefox 
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\smanoj\\Desktop\\Selenium\\geckodriver.exe"); WebDriver
		 * driver=new FirefoxDriver(); driver.get("https://www.google.com");
		 * System.out.println(driver.getCurrentUrl()); driver.close();
		 */
		
		//ie
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\smanoj\\Desktop\\Selenium\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}

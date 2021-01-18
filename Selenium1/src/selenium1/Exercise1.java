package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Create a testcase that performs the following Opens jupitor toys Click Login
		 * Login with user 
		 * Username: test 
		 * Password: letmein
		 *  Validate the name of the
		 * user logged in
		 */

		
		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\smanoj\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#");
		driver.findElement(By.id("nav-login")).click();
		
		driver.findElement(By.id("loginUserName")).sendKeys("test");
		driver.findElement (By.id("loginPassword")).sendKeys("letmein");
		driver.findElement (By.xpath("//button[1]")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.id("nav-user"));
		String Un=e.getText();
		System.out.println(Un);
		
		if(Un.contentEquals("test")) {
			System.out.println("Validation Success message:Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.quit();

	}

}

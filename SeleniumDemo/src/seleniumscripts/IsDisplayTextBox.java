package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		try
		{
			boolean IsDisplayTextBox =driver.findElement(By.id("APjFqb")).isDisplayed();
			System.out.println("Given element is exit");
		}
		 catch(Exception e)
		 
		 {
			 System.out.println("Given element is not exit");
			 
		 }
		driver.close();
		

	}

}

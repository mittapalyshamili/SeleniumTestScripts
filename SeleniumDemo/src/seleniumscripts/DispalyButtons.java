package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DispalyButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		try
		{
		boolean DispalyButtons=driver.findElement(By.id("Normal Alert")).isDisplayed();
		System.out.println("given element is dispalyed");
	   }
		catch(Exception e)
		{
			System.out.println("Given eement is not dispalyed");
		}
	    }
		}



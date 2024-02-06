package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
// Multiline textbox Is displayed or not displayed method.
public class MultilineTextDisplay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		try
		{
		boolean MultilineText=driver.findElement(By.id("Comments")).isDisplayed();
		System.out.println("given element is displayed");
		}
		catch(Exception e)
		{
			System.out.println("given element is not displayed");
		
		}
		Thread.sleep(3000);
		driver.close();
		
		}
	}



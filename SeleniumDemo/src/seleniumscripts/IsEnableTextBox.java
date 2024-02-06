package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableTextBox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// first name
		driver.get("file:///D:/Selenium/sample%20html.html");
		boolean IsEnableTextBox=driver.findElement(By.id("fname")).isEnabled();
		if(IsEnableTextBox==true)
			System.out.println("Given element firstname is enable");
		  else
			System.out.println("Given element firstname is Disable");
		//last name
	IsEnableTextBox=driver.findElement(By.id("lname")).isEnabled();
		if(IsEnableTextBox==true)
			System.out.println("Given element lastname is enable");
		else
			System.out.println("given element lastname is disable");
	Thread.sleep(3000);
		driver.close();
	}
}
		
	
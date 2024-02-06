package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultilineEnable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		boolean   MultilineEnable = driver.findElement(By.id("Comments")).isEnabled();
		if( MultilineEnable==true)
			System.out.println(" Given element is enable");
		else
			System.out.println(" Given element is disable");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}

package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		driver.findElement(By.id("fname")).sendKeys("Shamili");
		Thread.sleep(3000);
		driver.findElement(By.id("fname")).clear();
		Thread.sleep(3000);
		driver.close();
	}
	

}

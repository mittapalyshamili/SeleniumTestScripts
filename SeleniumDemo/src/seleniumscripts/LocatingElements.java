package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
 
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");	
		WebDriver elements=new ChromeDriver();
		elements.get("http://www.google.com");
		elements.findElement(By.id("APjFqb")).sendKeys("Sankranthi rangoli");
		elements.findElement(By.name("btnK")).click();
		Thread.sleep (3000);
		elements.close();
		
}
}

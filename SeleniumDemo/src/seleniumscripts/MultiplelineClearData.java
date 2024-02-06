package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplelineClearData {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		driver.findElement(By.id("Comments")).sendKeys("greedy dog");
		driver.findElement(By.id("Comments")).sendKeys("\n fox and crow");
		driver.findElement(By.id("Comments")).sendKeys("\n mousi and mounkey");
		driver.findElement(By.id("Comments")).sendKeys("\n Ant and grasshopper");
		
		Thread.sleep(3000);
		driver.findElement(By.id("Comments")).clear();
		
		driver.findElement(By.id("Comments")).clear();
		
		driver.findElement(By.id("Comments")).clear();
		
		driver.findElement(By.id("Comments")).clear();
		
		driver.close();
		
	}	

}

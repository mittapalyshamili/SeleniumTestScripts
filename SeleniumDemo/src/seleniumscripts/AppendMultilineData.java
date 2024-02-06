package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppendMultilineData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		driver.findElement(By.id("Comments")).sendKeys("greedy dog/");
        driver.findElement(By.id("Comments")).sendKeys("fox And crow");
        Thread.sleep(3000);
        driver.close();
        
	}

}

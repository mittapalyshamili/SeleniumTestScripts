package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe" );
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/");
	    driver.findElement(By.linkText("Autocomplete")).click();
	    driver.findElement(By.id("tags")).sendKeys("Automation Testing");
	    driver.close();
	}
	}

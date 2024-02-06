package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveTextBoxValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		String text=driver.findElement(By.id("cloanterm")).getAttribute("value");
		System.out.println(text);
		driver.close();
		
	}
}

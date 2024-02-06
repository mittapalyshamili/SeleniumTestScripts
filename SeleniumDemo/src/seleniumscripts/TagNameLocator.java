package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
         int size=links.size();
		for(int i=0;i<size;i++)
		System.out.println(links.get(i).getText());
		driver.close();
				
	}

}

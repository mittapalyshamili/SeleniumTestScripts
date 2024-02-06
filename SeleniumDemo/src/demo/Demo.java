package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
	 driver.get("http://www.google.com");
	 driver.close();
		}

}

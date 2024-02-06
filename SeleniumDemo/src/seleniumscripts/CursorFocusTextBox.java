package seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CursorFocusTextBox  {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.id("APjFqb")).sendKeys("calculator.net");
	    driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.className("VuuXrf")).click();
	    driver.findElement(By.id("calcSearchTerm")).sendKeys("calculator");
	    driver.findElement(By.linkText("Loan Calculator")).click();
	    Thread.sleep(3000);
	     driver.close();
		}

}


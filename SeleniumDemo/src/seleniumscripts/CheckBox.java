package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/sample%20html.html");
		// is Displayed 
		
		try
		{
			boolean element=driver.findElement(By.id("vehicle1")).isDisplayed();
				System.out.println("Given element exist  ");
		}
		catch (Exception e)
		{
			System.out.println("given element not exit");
		}
		// is enable 
		boolean element = driver.findElement(By.id("vehicle1")).isEnabled();
		if(element==true)
			System.out.println("given element is enable");
		else
			System.out.println(" given element is not enable");
		
	//	identify I have a bike check box is selected or not
		
		boolean b = driver.findElement(By.id("vehicle1")).isSelected();
              if( b==true)
            	  System.out.println(" Given element is selected");
              else
            	  System.out.println(" given element not selected");
              // to select the checkbox
            boolean a=driver.findElement(By.id("vehicle1")).isSelected();
            if(a==false)
            	driver.findElement(By.id("vehicle1")).click();
            System.out.println(" now it is selected");
            Thread.sleep(3000);
            driver.close();
            	
	}

}

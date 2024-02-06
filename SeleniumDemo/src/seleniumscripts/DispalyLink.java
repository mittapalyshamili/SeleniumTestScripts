package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DispalyLink {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe" );
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/");
	    // dispaly link 
	    try
	    {
	    boolean DispalyLink =driver.findElement(By.linkText("Autocomplete")).isDisplayed();
	    System.out.println(" given element is dispalyed");
	    }
	    catch(Exception e)
	    {
	    	System.out.println("given element is not dispalyed");
	    	
	    }
	    // enable or disable link
	    boolean Dispalylink =driver.findElement(By.linkText("Autocomplete")).isEnabled();
	    if( Dispalylink==true) 
	    System.out.println(" Given element is enable");
	    else
	    	System.out.println("given element is disable");
	 // click on link 
        driver.findElement(By.linkText("Autocomplete")).click();
        Thread.sleep(3000);
	    driver.close();
	    
}
	
}

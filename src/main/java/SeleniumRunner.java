import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumRunner {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		 System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(options);
	     
	    // Enter url.
	    driver.get("http://www.linkedin.com/");
	    driver.manage().window().maximize();
	     
	   WebDriverWait wait = new WebDriverWait(driver,30);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement ee=driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
	    if(ee.isDisplayed())
	    	System.out.print("Element_Found");
	    else
	    	System.out.print("Element_not_Found");
	System.out.println("\nSUCCESS");
	System.exit(0);
	}

}

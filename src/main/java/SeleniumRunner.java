import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumRunner {

	public String Runner() {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\egaut\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	     
	    // Enter url.
	    driver.get("http://www.linkedin.com/");
	    driver.manage().window().maximize();
	     
	   WebDriverWait wait = new WebDriverWait(driver,30);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement ee=driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
	    if(ee.isDisplayed())
	    	return("Element_Found");
	    else
	    	return("Element_not_Found");

	}

}

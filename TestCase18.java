/*package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Core.WebConnector;
import cucumber.api.java.en.Given;

public class TestCase18 extends WebConnector{
	
	
	 @Given("^user click on MyPortfolio$")
	    public void user_click_on_myportfolio() throws Throwable {
	       
		 driver.findElement(By.xpath(object.getProperty("MyPortfolio"))).click();
		 isElementPresent(object.getProperty("MyPortfolio"));
		 
		 
		 
	      driver.findElement(By.xpath(object.getProperty("MyPortfolio1")));
	      WebElement MyPortfolio1=driver.findElement(By.xpath(object.getProperty("MyPortfolio1")));
		  //app_log.debug("Web page Search box is presenet");
	      JavascriptExecutor jsExecutorm = (JavascriptExecutor) driver;
	      jsExecutorm.executeScript("arguments[0].style.border='2px solid red'",MyPortfolio1);
	      
	      isElementPresent(object.getProperty("MyPortfolio1"));

		 
	      driver.findElement(By.xpath(object.getProperty("tab")));
	      WebElement tab=driver.findElement(By.xpath(object.getProperty("tab")));
		  //app_log.debug("Web page Search box is presenet");
	      JavascriptExecutor jsExecutorn = (JavascriptExecutor) driver;
	      jsExecutorn.executeScript("arguments[0].style.border='2px solid red'",tab);
	      
	      isElementPresent(object.getProperty("tab"));

		 
	      

			 driver.findElement(By.xpath(object.getProperty("Close"))).click();
	      
	      
		 
		 	    }

	
	
	
	
	
}
*/
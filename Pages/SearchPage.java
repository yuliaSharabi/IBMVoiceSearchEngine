package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class SearchPage extends BasePage{
	 
		public SearchPage(WebDriver driver) {
		super(driver);
	}
		By serach = By.cssSelector("#lst-ib");
		By submit = By.cssSelector("input[type='submit'][name='btnK']");
		 
		/**
		 * typeText - type the given page in the text box
		 * @param searchTxt - text to be typed
		 */
		public void typeText(String searchTxt){
         
			driver.findElement(serach).sendKeys(searchTxt);
			Reporter.log("==========On Main page=========", true);
			Reporter.log("==========Entring Searching keybword=========", true);
 
         }
		/**
		 * clickOnSerachBtn - Click on the "go"/search button
		 */
		public void clickOnSerachBtn(){
			 
	        driver.findElement(submit).click();
	         Reporter.log("==========Hit Search=========", true);
	 
	         }
	      
}

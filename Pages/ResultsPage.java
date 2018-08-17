package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ResultsPage extends BasePage{

	//h2.hd ,div.srg>span UDTmsh28
	By results = By.cssSelector("");//old value by xpath://span[@id='s-result-count']
	By result = By.cssSelector(""); 
	
	public ResultsPage(WebDriver driver) {
	
		super(driver);
	}
	 
		/**
		 * clickOnresultLnk - Click on the results link locator
		 */
		public void getPageSource(){
		
         String  pageSource = driver.getPageSource();
         Reporter.log("==========On Results page=========", true);
         Reporter.log("==========Page Source=========" + pageSource, true);
         }
		/**
		 * titlePresent - Check for given title , if it presents
		 * @param title - title of the page
		 * @return - true if title presents
		 */
		public boolean isTitlePresent(String title){
			 boolean pageRedirected = false;
	         pageRedirected = driver.getTitle().equals(title);
	         Reporter.log("==========txtSearch find element=========" + driver.getTitle() +"=========", true);
	   
	         return pageRedirected;
	         }
		public void clickOnFirstResult(){
			 driver.findElement(result).click();
	         Reporter.log("==========Hit Search=========", true);
	         }
		

}

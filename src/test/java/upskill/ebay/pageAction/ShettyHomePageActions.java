package upskill.ebay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyHomePageLocators;
import upskill.utilities.SetupDrivers;

public class ShettyHomePageActions {
	

	ShettyHomePageLocators ShettyHomePageLocatorsObj;
	

			
	public ShettyHomePageActions(){
		ShettyHomePageLocatorsObj = new ShettyHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyHomePageLocatorsObj);
	}
	
	public void loadShettyHomepage() throws Exception {
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
	}
	
	public void clickIframeHome() {
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i = 0; i<framelist.size(); i++) {
			SetupDrivers.driver.switchTo().frame(i);
			
			try {
				ShettyHomePageLocatorsObj.btnHome.click();
			} catch (Exception e) {
				System.out.println("Element not found in iframe");
			}
			
		}
	
		SetupDrivers.driver.switchTo().frame("courses-iframe");
		
		ShettyHomePageLocatorsObj.btnHome.click();
	}
	
	public void verifyShettyHome() throws Exception {
		Thread.sleep(3000);
		ShettyHomePageLocatorsObj.btnHome.isDisplayed();
		
	}
	public void handleIframe(){
		
		//i find iframe using iframe tag in DOM or HTML
		//i use switchTo().frame() to switch iframes
		
		//Switch iframe by Index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		//Switch iframe by Name or ID
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		SetupDrivers.driver.switchTo().frame("parent");
		
		//nested iframe
		SetupDrivers.driver.switchTo().frame("inner");
		SetupDrivers.driver.switchTo().frame("child");
	
	}
}

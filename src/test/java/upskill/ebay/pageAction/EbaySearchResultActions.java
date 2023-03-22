package upskill.ebay.pageAction;

import org.junit.Assert;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
	
	public void verifyShirtsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
	}
	
	public void verifyPantsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtPants.isDisplayed();
	}
	public void filterBrand(String brand) {
		if(brand.equals("Adidas")) {
		EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
	}else if(brand.equals("Nike")) {
		EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
	}else if(brand.equals("Unbranded")) {
		EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
	}else {
		System.out.println("Brand not found");
	}
  }
	
	public void verifyBrandItems(String brand) {
		if(brand.equals("Adidas")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	}else if(brand.equals("Nike")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}else if(brand.equals("Unbranded")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}else {
		System.out.println("Brand not found");
	}
}

	
}

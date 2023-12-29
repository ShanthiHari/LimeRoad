package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class POMClass extends BaseClass {
	
	public POMClass() {
		PageFactory.initElements(driver, this);
	}
	

	//Scenario 1
		@FindBy(xpath="//span[text()='SHOP MEN']")
		private WebElement shopmen;

		public WebElement getShopmen() {
			return shopmen;
		}
		
	//Scenario 2
		@FindBy(xpath="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[3]")
		private WebElement kidswear;

		public WebElement getKidswear() {
			return kidswear;
		}
		
		@FindBy(xpath="(//a[text()='shirts'])[2]")
		private WebElement shirts;

		public WebElement getShirts() {
			return shirts;
		}
		
		
		//Scenario 3
		@FindBy(xpath="(//img[@loading='eager']//parent::a)[2]")
		private WebElement anyshirts;

		public WebElement getAnyshirts() {
			return anyshirts;
		}
		
		@FindBy(xpath="(//span[@class='br10  bd3  p410 hcP hbxs bxs bs size'])[2]")
		private WebElement size;

		public WebElement getSize() {
			return size;
		}
		
		@FindBy(xpath="//div[text()='ADD TO CART']")
		private WebElement addtocard;

		public WebElement getAddtocard() {
			return addtocard;
		}
		
		
}

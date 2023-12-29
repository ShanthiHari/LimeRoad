package com.stepdefinition;

import com.base.BaseClass;
import com.pom.POMClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class limestepdefinition extends BaseClass{
	
	POMClass pc = new POMClass();

//	Scenario 1
	@Given("User launch the url {string}")
	public void user_launch_the_url(String string) {
		  launchUrl(string);
		
	    
	}
	
	@And("User clicks on shop men")
	public void user_clicks_on_shop_men() throws InterruptedException {
		Thread.sleep(5000);
		pc.getShopmen().click();
	   
	}
	
	
//    Scenario 2
	@Given("user click the kids wear")
	public void user_click_the_kids_wear() throws InterruptedException {
	    
		Thread.sleep(3000);
		moveCursorActions(pc.getKidswear());
	}
	
	@And("user click the shirts")
	public void user_click_the_shirts() throws InterruptedException {
	    
		Thread.sleep(3000);
		pc.getShirts().click();
	}
	
//	Scenario 3
	
	@Given("user click the any shirts")
	public void user_click_the_any_shirts() throws InterruptedException {
		Thread.sleep(3000);
		pc.getAnyshirts().click();
	    
	}
	
	
	@And("user select the size")
	public void user_select_the_size() throws InterruptedException {
		Thread.sleep(3000);
		pc.getSize().click();
		
	    
	}
	@And("user click the add to cart")
	public void user_click_the_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		pc.getAddtocard().click();
		
	    
	}
}

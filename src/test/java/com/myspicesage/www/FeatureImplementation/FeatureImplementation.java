package com.myspicesage.www.FeatureImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.myspicesage.www.pages.HomePage;
import com.myspicesage.www.pages.TrackYourOrderPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureImplementation {

	WebDriver oBrowser;
	
	@Given("^Browser Opened and Application launched$")
	public void browser_Opened_and_Application_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		oBrowser = new ChromeDriver();		
		oBrowser.get("https://www.myspicesage.com/");		
		oBrowser.manage().window().maximize();
	}

	@When("^click on Track Order Link$")
	public void click_on_Track_Order_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		HomePage oHomePg = PageFactory.initElements(oBrowser, HomePage.class);	
		oHomePg.clickTrackOrder();
		
	}

	@When("^Enter Order ID, Email Id and click on Search$")
	public void enter_Order_ID_Email_Id_and_click_on_Search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		TrackYourOrderPage oTrackOrdPg= PageFactory.initElements(oBrowser, TrackYourOrderPage.class);
		oTrackOrdPg.trackOrderWithoutSignIn();
		
	}
	

	@When("^Enter \"([^\"]*)\", \"([^\"]*)\" and click on Search$")
	public void enter_and_click_on_Search(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		TrackYourOrderPage oTrackOrdPg= PageFactory.initElements(oBrowser, TrackYourOrderPage.class);
		oTrackOrdPg.trackOrderWithoutSignIn(arg1,arg2);
		
	}

	public void enter_orderID_as_and_EmailID_as_businessanalyst_abc_com_and_click_on_Search(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TrackYourOrderPage oTrackOrdPg= PageFactory.initElements(oBrowser, TrackYourOrderPage.class);
		oTrackOrdPg.trackOrderWithoutSignIn(arg1,arg2);
	}
	
	@Then("^Error should be displayed$")
	public void error_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		TrackYourOrderPage oTrackOrdPg= PageFactory.initElements(oBrowser, TrackYourOrderPage.class);
		
		oTrackOrdPg.verifyTrackOrderErrorMessage();		
	}

	@Then("^Order details should be displayed$")
	public void order_details_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		TrackYourOrderPage oTrackOrdPg= PageFactory.initElements(oBrowser, TrackYourOrderPage.class);
		
		oTrackOrdPg.verifyTrackOrderDetailsDisplayed();		
	
	}
	
}

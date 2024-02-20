package com.qa.adactin.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.adactin.base.TestBase;

public class SearchHotelPage extends TestBase {
//	Object Repository
	@FindBy(xpath = "//select[@id='location']")
	WebElement locationDropDown;
	@FindBy(xpath = "//select[@id='hotels']")
	WebElement hotelsDropDown;
	@FindBy(xpath = "//select[@id='room_type']")
	WebElement roomTypeDropDown;
	@FindBy(xpath = "//select[@id='room_nos']")
	WebElement numberOfRoomsDropDown;
	@FindBy(xpath = "//input[@id='datepick_in']")
	WebElement checkinDate;
	@FindBy(xpath = "//input[@id='datepick_out']")
	WebElement checkoutDate;
	@FindBy(xpath = "//input[@id='Submit']")
	WebElement searchButton;
	@FindBy(xpath = "//input[@id='Reset']")
	WebElement resetButton;
	@FindBy(xpath = "//td[@class='login_title']")
	WebElement searchHotelHeading;
	@FindBy(xpath = "//input[@id='username_show']")
	WebElement helloUserMsg;
	
//	2.initialize the page factory
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
//	3.Actions/methods/functions
	
	
	public String validateSearchHotelPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateWelcomeGreetingMsg() {
		return helloUserMsg.isDisplayed();
	}
	
	
	//gpt validation for dropdown
	 public List<String> getLocationDropdownOptions() {
	        Select dropdown = new Select(locationDropDown);
	        List<WebElement> optionElements = dropdown.getOptions();
	        List<String> options = new ArrayList<>();
	        for (WebElement element : optionElements) {
	            options.add(element.getText());
	        }
	        return options;
	    }
	 public List<String> getHotelsDropdownOptions() {
	        Select dropdown = new Select(hotelsDropDown);
	        List<WebElement> optionElements = dropdown.getOptions();
	        List<String> options = new ArrayList<>();
	        for (WebElement element : optionElements) {
	            options.add(element.getText());
	        }
	        return options;
	    }
	 public List<String> getRoomTypeDropdownOptions() {
	        Select dropdown = new Select(roomTypeDropDown);
	        List<WebElement> optionElements = dropdown.getOptions();
	        List<String> options = new ArrayList<>();
	        for (WebElement element : optionElements) {
	            options.add(element.getText());
	        }
	        return options;
	    }
	 public List<String> getNumOfRoomsDropdownOptions() {
	        Select dropdown = new Select(numberOfRoomsDropDown);
	        List<WebElement> optionElements = dropdown.getOptions();
	        List<String> options = new ArrayList<>();
	        for (WebElement element : optionElements) {
	            options.add(element.getText());
	        }
	        return options;
	    }
	
	

}

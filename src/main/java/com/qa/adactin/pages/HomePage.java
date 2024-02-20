package com.qa.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.adactin.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//td[@class='login_title']")
	WebElement searchHotelHeading;
	@FindBy(xpath = "//input[@id='Submit']")
	WebElement searchHotelButton;
	@FindBy(xpath = "//input[@id='Reset']")
	WebElement searchHotelResetButton;
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logoutLink;
	@FindBy(xpath = "//select[@id='location']")
	WebElement locationDropDown;
	
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

//	Actions
	public boolean validateSearchHotelHeading() {
		return searchHotelHeading.isDisplayed();

	}

	public SelectHotelPage validateSearchHotelButton() {
		searchHotelButton.click();
		return new SelectHotelPage();
		

	}

	public void validateSearchHotelResetButton() {
		searchHotelResetButton.click();
		Select select=new Select(locationDropDown);
		select.getFirstSelectedOption();                    //work on this validation
		

	}

	public LoggedOutPage validateLogoutLink() {
		logoutLink.click();
		return new LoggedOutPage();

	}

}

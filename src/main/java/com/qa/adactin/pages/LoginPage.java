package com.qa.adactin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.adactin.base.TestBase;

public class LoginPage extends TestBase {
//	Page/Object  factory
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='login']")
	WebElement loginBtn;
	@FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
	WebElement forgotPasswordLink;
	@FindBy(xpath = "//a[normalize-space()='New User Register Here']")
	WebElement newUserRegistrationLink;
	@FindBy(xpath = "//img[@alt='AdactIn Group']")
	WebElement adactinLogo;
	@FindBy(xpath = "//strong[normalize-space()='Go to Build 2']")
	WebElement gotoBuild2;

//	Page Factory initialization()

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	Actions/Functions/Metods
	public boolean validateAdactinLogo() {
		return adactinLogo.isDisplayed();

	}

	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public ForgotPasswordPage validateForgotPasswordLink() {
		forgotPasswordLink.click();
		return new ForgotPasswordPage();

	}

	public RegistrationPage newUserRegHereLink() {
		newUserRegistrationLink.click();
		return new RegistrationPage();

	}
	public SearchHotelPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("arguments[0].click();", loginBtn);

		return new SearchHotelPage();
		
		
	}
	

}

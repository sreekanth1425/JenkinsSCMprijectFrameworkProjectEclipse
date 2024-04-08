// comment1
package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.adactin.base.TestBase;
import com.qa.adactin.pages.ForgotPasswordPage;
import com.qa.adactin.pages.LoginPage;
import com.qa.adactin.pages.RegistrationPage;
import com.qa.adactin.pages.SearchHotelPage;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	ForgotPasswordPage forgotPasswordPage;
	RegistrationPage registrationPage;
	SearchHotelPage searchHotelPage;

	public LoginPageTest() {
		super();

	}
//     Adactin Application
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test
	public void adactinLogoTest() {
		Boolean flag = loginPage.validateAdactinLogo();
		Assert.assertTrue(flag);
	}

	@Test
	public SearchHotelPage LoginBtnTest() {
		searchHotelPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("got search hotel page successfully");
		return new SearchHotelPage();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}

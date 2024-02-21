package com.qa.tests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.adactin.base.TestBase;
import com.qa.adactin.pages.LoginPage;
import com.qa.adactin.pages.SearchHotelPage;

public class SearchHotelPageTest extends TestBase {
	SearchHotelPage searchHotelPage;
	LoginPage loginPage;

	public SearchHotelPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		searchHotelPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void searchHotelTest() {
		System.out.println("search hotel test");
	}

	// gpt test methods
	@Test
	public void testLocDropdownOptions() {
//        List<String> expectedOptions = List.of("Option 1", "Option 2", "Option 3");
		List<String> expectedOptions = Arrays.asList("- Select Location -", "Sydney", "Melbourne", "Brisbane",
				"Adelaide", "London", "New York", "Los Angeles", "Paris");

		List<String> actualOptions = searchHotelPage.getLocationDropdownOptions();
		Assert.assertEquals(expectedOptions, actualOptions);
		System.out.println(actualOptions);

	}

	@Test
	public void testHotelsDropdownOptions() {
//      List<String> expectedOptions = List.of("Option 1", "Option 2", "Option 3");
		List<String> expectedOptions = Arrays.asList("- Select Hotel -", "Hotel Creek", "Hotel Sunshine",
				"Hotel Hervey", "Hotel Cornice");

		List<String> actualOptions = searchHotelPage.getHotelsDropdownOptions();
		Assert.assertEquals(expectedOptions, actualOptions);
		System.out.println(actualOptions);
	}

	@Test
	public void testRoomTypeDropdownOptions() {
//      List<String> expectedOptions = List.of("Option 1", "Option 2", "Option 3");
		List<String> expectedOptions = Arrays.asList("- Select Room Type -", "Standard", "Double", "Deluxe",
				"Super Deluxe");

		List<String> actualOptions = searchHotelPage.getRoomTypeDropdownOptions();
		Assert.assertEquals(expectedOptions, actualOptions);
		System.out.println(actualOptions);
	}

//	@Test
//	public void testNumOfRoomsDropdownOptions() {
////      List<String> expectedOptions = List.of("Option 1", "Option 2", "Option 3");
//		List<String> expectedOptions = Arrays.asList("- Select Number of Rooms -", "1 - One", "2 - Two", "3 - Three",
//				"4 - Four", "5 - Five", "6 - Six", "7 - Seven", "8 - Eight", "9 - Nine", "10 - Ten");
//
//		List<String> actualOptions = searchHotelPage.getNumOfRoomsDropdownOptions();
//		Assert.assertEquals(expectedOptions, actualOptions);
//		System.out.println(actualOptions);
//	}

	@Test
	public void testDropdownSelection() throws InterruptedException {
		Thread.sleep(10000);
		String expectedOptionValue = "2 - Two"; // Selecting Option 2
		searchHotelPage.selectOptionByVisibleText(expectedOptionValue);
		String selectedOptionText = searchHotelPage.getSelectedOptionText();
		Assert.assertEquals("2 - Two", selectedOptionText);
		System.out.println(selectedOptionText);
		List<WebElement> list=searchHotelPage.getDropdownOptions();
		System.out.println(list);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}

package com.qa.adactin.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream(
					"C:\\\\1\\\\PrijectFramework\\\\src\\\\main\\\\java\\\\com\\\\qa\\\\config\\\\config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("FF")) {
			driver = new FirefoxDriver();

		} else {
			driver = new ChromeDriver();

		}
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}

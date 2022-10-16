package com.demoGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void openUrl() {
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}

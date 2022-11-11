package com.timeTracking.actitime.TestYantra.ModualName;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseNameTest {
	
	@Test
	public void testCaseNameTest() {
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		
	}
}

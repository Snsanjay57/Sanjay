package basicTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMClass.CreateNewCustomerPage;
import POMClass.CustomerDetailsPage;
import POMClass.HomePage;
import POMClass.LoginPage;

public class CreateCustomer {
	
	@Test
	private void createCustomerAndVerifyCustomerName() {
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
	
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.LoginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String actualHomePageTitle = driver.getTitle();
		
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
		System.out.println("Pass: Home Page has been verified");
		
		HomePage home = new HomePage(driver);
		home.clickOnTaskButton();
		
		String expectedCustomerName = "TestYantra";
		
		CreateNewCustomerPage newCustomer = new CreateNewCustomerPage(driver);
		newCustomer.createNewCustomer(expectedCustomerName, "Banglore");
		
		CustomerDetailsPage customerDetails = new CustomerDetailsPage(driver);
		String actualCustomerName = customerDetails.verifyCustomerName(expectedCustomerName);
		
		Assert.assertEquals(actualCustomerName, expectedCustomerName);
		System.out.println("Pass: The Customer name has been varified");
		driver.quit();
	
	}

}

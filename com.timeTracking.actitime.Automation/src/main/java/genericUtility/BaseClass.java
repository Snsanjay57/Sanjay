package genericUtility;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database Connection has been established");
	}
	
	@BeforeClass
	public void bcConfig() throws IOException {
		
		System.out.println("Launched the Browser");
		System.out.println("Nevigate to the url");
	}
	
	@BeforeMethod
	public void bmConfig() {
		System.out.println("Logged in to the application");
		System.out.println("This is test for GitHub");
	}
	
	@AfterMethod
	public void amConfig() {
		System.out.println("Logged out from the application");
	}
	
	@AfterClass
	public void acConfig() {
		System.out.println("Broser has been closed");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("database connection has been closed");
	}
}

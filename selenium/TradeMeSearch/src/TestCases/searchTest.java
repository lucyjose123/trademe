package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import PageObject.SearchPage;

public class searchTest {
	
	

	// Test to check there is at least one listing in the TradeMe UsedCars category.

	@Test
	public  void searchTest()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
		 ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.tmsandbox.co.nz");
		 
		SearchPage searchpage=new SearchPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,90);
		
		searchpage.MotorsLink().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SiteHeader_SiteTabs_SubNavMotors_LinkUsedCars")));
		searchpage.usedCarLink().click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-category='Cars']")));
Assert.assertEquals(true, searchpage.carListing().isDisplayed());
	
driver.quit();
	
	
	
		
	}
	



}

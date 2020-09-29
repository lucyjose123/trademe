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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.DetailsPage;
import PageObject.SearchPage;

	public class carDetailsTest {
	//Test to Query any existing Used Car listing and confirm that all the details are shown for that car:
	@Test
	public  void searchTest()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.tmsandbox.co.nz");
		 
		SearchPage searchpage=new SearchPage(driver);
		DetailsPage detailspage=new DetailsPage(driver);

	searchpage.searchField().sendKeys("Cars");
	searchpage.searchField().sendKeys(Keys.ENTER);
WebDriverWait wait = new WebDriverWait(driver,90);
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-category='Cars']")));
searchpage.carListing().click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='listing-attribute-header']")));

	Assert.assertEquals(detailspage.detailsLabels().get(0).getText(), "Number plate");
	Assert.assertEquals(detailspage.detailsLabels().get(1).getText(), "Kilometres");
	Assert.assertEquals(detailspage.detailsLabels().get(2).getText(), "Body");
    Assert.assertEquals(detailspage.detailsLabels().get(3).getText(), "Seats");
	Assert.assertEquals(detailspage.detailsLabels().get(4).getText(), "Fuel type");
	Assert.assertEquals(detailspage.detailsLabels().get(5).getText(), "Engine");
	Assert.assertEquals(detailspage.detailsLabels().get(6).getText(), "Transmission");
	Assert.assertEquals(detailspage.detailsLabels().get(7).getText(), "History");
	Assert.assertEquals(detailspage.detailsLabels().get(8).getText(), "Registration expires");
	Assert.assertEquals(detailspage.detailsLabels().get(9).getText(), "WoF expires");
	Assert.assertEquals(detailspage.detailsLabels().get(10).getText(), "Stereo description");
Assert.assertEquals(detailspage.detailsLabels().get(11).getText(), "Model detail");

for(int i=0;i<detailspage.detailsValue().size();i++)
{Assert.assertNotEquals(detailspage.detailsValue().get(i).getText(), null);
}

	
	


	driver.quit();
	

	}

}

//<div class="key-details-attribute-label"><label class="motors-attribute-label">Number plate</label></div>

//<span class="motors-attribute-value">163,794<font size="1">km</font></span>

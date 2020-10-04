package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	WebDriver driver;
	
	public  SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By searchField =By.id("searchString");
	 By links=By.id("ListView_listingTableHeader_headerColumnListView");
	 By brandSection=By.id("makes");
	 By carListing=By.cssSelector("div[data-category='Cars']");
	 By MotorsLink=By.id("SearchTabs1_MotorsLink");
	 By usedCarLink=By.id("SiteHeader_SiteTabs_SubNavMotors_LinkUsedCars");

	 
		public WebElement links()
				{
						return driver.findElement(links);
				}
	 
	 public WebElement brandsection()
		{
				return driver.findElement(brandSection);
		}


	
	public WebElement  searchField()
	{
		 return driver.findElement(searchField);
	}
	public WebElement  carListing()
	{
		 return driver.findElement(carListing);
	}
	public WebElement  MotorsLink()
	{
		 return driver.findElement(MotorsLink);
	}
	public WebElement  usedCarLink()
	{
		 return driver.findElement(usedCarLink);
	}
	 
	 
	


}

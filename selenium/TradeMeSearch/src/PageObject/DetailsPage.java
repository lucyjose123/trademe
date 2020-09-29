package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class DetailsPage {
	private static final String cssSelector = null;

	WebDriver driver;

By keyDetails=By.cssSelector("span[class='listing-attribute-header']");



By detailsLabels=By.cssSelector("label[class='motors-attribute-label']");
By detailsValue=By.cssSelector("span[class='motors-attribute-value']");


//<label class="motors-attribute-label">Number plate</label>

public  DetailsPage(WebDriver driver)
{
	this.driver=driver;
}

public WebElement keyDetails()
{
		return driver.findElement(keyDetails);
}

public List<WebElement> detailsLabels()
{
		return driver.findElements(detailsLabels);
}
public List<WebElement> detailsValue()
{
		return driver.findElements(detailsValue);
}




}

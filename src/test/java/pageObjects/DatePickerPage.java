package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickerPage extends BasePage
{
public DatePickerPage(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//input[@id='departon']")
WebElement dt;
@FindBy(xpath="//Select[@class='ui-datepicker-month']")
WebElement selct;
@FindBy(xpath="//Select[@class='ui-datepicker-year']")
WebElement slct;
@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr//td")
List<WebElement> dat;

public void dat()
{
	
	//dt.sendKeys("22/07/2023");
	dt.click();
}

public WebElement month()
{
	return selct;
}

public WebElement year()
{
	return slct;
}
public List<WebElement> date()
{
	return dat;
}
}

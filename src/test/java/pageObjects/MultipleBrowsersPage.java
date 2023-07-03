package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleBrowsersPage extends BasePage
{
public	MultipleBrowsersPage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement sr;

public void search()
{
	sr.click();
	sr.sendKeys("tees");
}
}

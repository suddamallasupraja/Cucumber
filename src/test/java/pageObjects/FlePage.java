package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlePage extends BasePage
{
public FlePage(WebDriver driver)
{
	super(driver);
}
	@FindBy(xpath="//input[@id='file-upload']")
	WebElement we;
	
	public void fl()
	{
		we.sendKeys("C:\\Users\\Kishore kumar Reddy\\OneDrive\\Desktop\\automation_practice_link.txt");
	}
}

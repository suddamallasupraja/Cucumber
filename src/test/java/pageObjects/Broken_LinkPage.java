package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Broken_LinkPage extends BasePage
{
public Broken_LinkPage(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//div//ul//li//a")
List<WebElement> links;

public List<WebElement> link()
{
	return links;
}
}

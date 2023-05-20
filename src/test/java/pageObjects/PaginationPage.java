package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginationPage extends BasePage
{
public PaginationPage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//span[@class='s-pagination-strip']//a")
List<WebElement> we;

@FindBy(xpath="//span[@class='s-pagination-strip']//a[text()='Next']")
WebElement nxt;

@FindBy(xpath="//span[@class='s-pagination-strip']//span[@class='s-pagination-item s-pagination-disabled']")
WebElement si;
////span[@class='s-pagination-strip']//a[text()='Next']
public List<WebElement> page()
{
	return we;
}

public WebElement next()
{
	return nxt;
}

public String siz()
{
String value=si.getText();
return value;
}
}

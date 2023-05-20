package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaticTablePage extends BasePage
{

public StaticTablePage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//tbody//tr")
List<WebElement> col;
@FindBy(xpath="//tbody//tr['+i+']//td[6]")
WebElement row;
@FindBy(xpath="//tbody//tr['+i+']//td[1]")
WebElement flight;

public int colmn()
{
	int siz=col.size();
	return siz;
}
public WebElement row(int i)
{
	WebElement ss=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]"));
	return ss;
}
public WebElement fl(int i)
{
	WebElement sq=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[1]//input"));
	return sq;
}
}

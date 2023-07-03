package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Entire_Practise extends BasePage
{
public Entire_Practise(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//a[text()='destination of the week! The Beach!']")
WebElement beach;

@FindBy(xpath="//select[@name='fromPort']")
WebElement departure;

@FindBy(xpath="//select[@name='toPort']")
WebElement arrival;

@FindBy(xpath="//input[@type='submit']")
WebElement find;

@FindBy(xpath="//tbody//tr")
List<WebElement> siz;

@FindBy(xpath="//tbody//tr['+i+']//td[6]")
WebElement price;

@FindBy(xpath="//tbody//tr[1]//td[1]//input")
WebElement choose;

public void beach()
{
	beach.click();
}

public void from(String depart)
{
	departure.sendKeys(depart);
}

public void to(String arival) 
{
	arrival.sendKeys(arival);
}

public void submit()
{
	find.click();
}

public WebElement lowestprice(int i)
{
	WebElement prise=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]"));
	return prise;
}

public WebElement chose(int i)
{
	WebElement flight=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[1]//input"));
	return flight;
}

public int sizz()
{
	int value=siz.size();
	return value;
}

//
//@FindBy(xpath="")
//WebElement
//
//@FindBy(xpath="")
//WebElement
//
//@FindBy(xpath="")
//WebElement
//
//@FindBy(xpath="")
//WebElement
//
//@FindBy(xpath="")
//WebElement


}

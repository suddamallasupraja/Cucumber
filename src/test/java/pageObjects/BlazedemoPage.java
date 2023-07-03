package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BlazedemoPage extends BasePage
{
public BlazedemoPage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//select[@name='fromPort']")
WebElement depart;

@FindBy(xpath="//select[@name='toPort']")
WebElement dest;

@FindBy(xpath="//input[@type='submit']")
WebElement flight;

@FindBy(xpath="//h3[text()='Flights from Mexico City to London: ']")
WebElement page;

@FindBy(xpath="//tbody//tr['+i+']//td[6]")
WebElement pagi;

@FindBy(xpath="//tbody//tr")
List<WebElement> siz;

@FindBy(xpath="//tr['+i+']//td//input[@type='submit']")
WebElement fligt;

@FindBy(xpath="//p//em")
WebElement cost;

public void departure(String city)
{
	Select sc=new Select(depart);
	sc.selectByVisibleText(city);
}

public void destination(String citi)
{
	Select s=new Select(dest);
	s.selectByVisibleText(citi);
}

public void find()
{
	flight.click();
}

public String ppage()
{
	String txt=page.getText();
	return txt;
}

public WebElement sort(int i)
{
	WebElement we=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]"));
	return we;
}

public int sizz()
{
	int value=siz.size();
	return value;
}

public WebElement fli(int i)
{
	WebElement clk=driver.findElement(By.xpath("//tr["+i+"]//td//input[@type='submit']"));
	return clk;
}

public String text()
{
	String cst=cost.getText();
	return cst;
}
}

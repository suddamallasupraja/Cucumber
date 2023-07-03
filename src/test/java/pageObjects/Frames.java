package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frames extends BasePage
{
public Frames(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//li//a[text()='org.openqa.selenium']")
WebElement pack;
@FindBy(xpath="//a//span[text()='SearchContext']")
WebElement clas;
@FindBy(xpath="//input[@id='search']")
WebElement sea;

public void packs()
{
	pack.click();
}
public void clay()
{
	clas.click();
}
public void srch()
{
	sea.sendKeys("org");
}
}

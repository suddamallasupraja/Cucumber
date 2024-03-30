package pageObjects;

import java.util.List;

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

@FindBy(xpath="//frame[@src=\"frame_3.html\"]")
WebElement frame;
@FindBy(xpath="//iframe[@src=\"https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]")
WebElement iframe;
@FindBy(xpath="//div[@id=\"i8\"]")
WebElement radio;
@FindBy(xpath="//input[@name=\"mytext3\"]")
WebElement keys;

public WebElement frames()
{
	return frame;
}

public WebElement iframes()
{
	return iframe;
}
public void radi()
{
	radio.click();
}
public void sendkey()
{
	keys.sendKeys("supraja");
}

@FindBy(xpath="//label[@class=\"ui-checkboxradio-label ui-corner-all ui-button ui-widget\"]")
List<WebElement> index;

public List<WebElement> indexes()
{
	return index;
}
}

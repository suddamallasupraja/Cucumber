package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends BasePage
{
	Actions as=new Actions(driver);
 public MouseOverPage(WebDriver driver)
 {
	 super(driver);
 }
 
 @FindBy(xpath="//button[text()='Copy Text']")
 WebElement clik;
 @FindBy(xpath="//input[@id='field2']")
 WebElement sclk;
 public void dclick()
 {
	 
	 as.doubleClick(clik).build().perform();
 }
 public void sclick()
 {
	 as.contextClick(sclk).build().perform();
	 as.moveToElement(sclk).click().build().perform();
 }
 
}

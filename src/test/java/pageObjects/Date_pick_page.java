package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Date_pick_page extends BasePage
{
public Date_pick_page(WebDriver driver) 
{
	super(driver);
}


 @FindBy(xpath="//input[@id='datepicker']")
 WebElement field;
 
 public void clic()
 {
	 field.click();
 }
	
 @FindBy(xpath="//a[@title='Prev']")
 WebElement prev;
 
 @FindBy(xpath="//a[@title='Next']")
 WebElement next;
 
 @FindBy(xpath="//span[@class='ui-datepicker-month']")
 WebElement month;
 
 @FindBy(xpath="//span[@class='ui-datepicker-year']")
 WebElement year;
 
 @FindBy(xpath="//tr['+i+']//td//a")
 WebElement size;
 
 @FindBy(xpath="//tr['+i+']//td//a['+j+']")
 WebElement days;
 
 public void previous()
 {
	 prev.click();
 }
 
 public void nextt()
 {
	 next.click();
 }
 
 public String mont()
 {
	String mont= month.getText();
	return mont;
 }
 
 public String yea()
 {
	 String yer=year.getText();
	 return yer;
 }
 
 public WebElement siz(int i)
 {
	 WebElement abc=driver.findElement(By.xpath("//tr["+i+"]//td//a"));
	 return abc;
 }
 
 public WebElement sooz(int i, int j)
 {
	 WebElement abcd=driver.findElement(By.xpath("//tr["+i+"]//td//a["+j+"]"));
	 return abcd;
 }
}

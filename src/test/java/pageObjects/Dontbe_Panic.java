package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Dontbe_Panic extends BasePage
{
  public Dontbe_Panic(WebDriver driver)
  {
	  super(driver);
  }
	
  @FindBy(xpath="//a[text()='destination of the week! The Beach!']")
  WebElement beach;
  
  @FindBy(xpath="//select[@name='fromPort']")
  WebElement depart;
  
  @FindBy(xpath="//select[@name='toPort']")
  WebElement destinat;
  
  @FindBy(xpath="//input[@type='submit']")
  WebElement findflit;
  
  @FindBy(xpath="//tr//td[6]")
  List<WebElement> siz;
  
  @FindBy(xpath="//tr['+r+']//td[6]")
  WebElement price;
  
  @FindBy(xpath="//td['+r+']//input[@type='submit']")
  WebElement choosingflit;
  
  @FindBy(xpath="//input[@class='btn btn-primary']")
  WebElement purchas;
  
  public void beaches()
  {
	  beach.click();
  }
  
  public void departure(String value)
  {
	  Select sc=new Select(depart); 
	  sc.selectByVisibleText(value);
	  
  }
  
  public void destination(String value1)
  {
	  Select sc=new Select(destinat); 
	  sc.selectByVisibleText(value1);
  }
  
  public void flight()
  {
	  findflit.click();
  }
  
  public int siiz()
  {
	 int ssi= siz.size();
	 return ssi;
  }
  
  public WebElement prise(int i)
  {
	  WebElement pric=driver.findElement(By.xpath("//tr["+i+"]//td[6]"));
	  return pric;
  }
  
  public WebElement choosefl(int i)
  {
	  WebElement fligh=driver.findElement(By.xpath("//tr["+i+"]//input[@type='submit']"));
	  return fligh;
  }
  
  public void pflit()
  {
	  purchas.click();
  }
}

package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntireAutomationPage extends BasePage
{
public	EntireAutomationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='RESULT_TextField-1']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='RESULT_TextField-2']")
	WebElement lname;
	
	@FindBy(xpath="//input[@name='RESULT_TextField-3']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='RESULT_TextField-4']")
	WebElement country;
	
	@FindBy(xpath="//input[@name='RESULT_TextField-5']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='RESULT_TextField-6']")
	WebElement emailaddress;
	
	@FindBy(xpath="//label[text()='Female']")
	WebElement gender;
	
	@FindBy(xpath="//div[@id='q15']//label")
	List<WebElement> chckboxes;
	
	@FindBy(xpath="//select[@id='RESULT_RadioButton-9']")
	WebElement drp;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement fli;
	
	@FindBy(xpath="//button[text()='Click Me']")
	WebElement alrt;
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement dat;
	
	@FindBy(xpath="//select[@id='speed']")
	WebElement speed;
	
	@FindBy(xpath="//select[@id='files']")
	WebElement fil;
	
	@FindBy(xpath="//select[@id='number']")
	WebElement number;
	
	@FindBy(xpath="//select[@id='products']")
	WebElement product;
	
	@FindBy(xpath="//select[@id='animals']")
	WebElement animal;
	
	
public void uname(String nm, String lm)
{
	name.sendKeys(nm);
	lname.sendKeys(lm);
}
public void ph(String ph,String cn)
{
	phone.sendKeys(ph);
	country.sendKeys(cn);
}
public void ciem(String cit, String em)
{
	city.sendKeys(cit);
	emailaddress.sendKeys(em);
}
public void gndr()
{
	gender.click();
}
public List<WebElement> cboxes()
{
	return chckboxes;
}
public WebElement drpdown()
{
	return drp;
}
public void fill()
{
	//fli.click();
	fli.sendKeys(".\\automation_practice_link.txt");
}
public void aler()
{
	alrt.click();
}
public void dt()
{
	dat.sendKeys("07/22/2016");
}
public WebElement spd()
{
	return speed;
}
public WebElement fl()
{
	return fil;
}
public WebElement nm()
{
	return number;
}
public WebElement pd()
{
	return product;
}
public WebElement animl()
{
	return animal;
}
}

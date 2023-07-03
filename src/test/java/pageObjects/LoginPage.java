package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage extends BasePage
	{
		public LoginPage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="//input[@name='email']")
		WebElement em;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement ps;
		
		@FindBy(xpath="//button[text()='Login']")
		WebElement ln;
		
		@FindBy(xpath="//a//span[text()='My Account']")
		WebElement acc;
		
		@FindBy(xpath="//li//a[@class='dropdown-item' and text()='Login']")
		WebElement lg;
		
		public void mail(String ml)
		{
			em.sendKeys(ml);
		}
		
		public void paswrd(String pw)
		{
			ps.sendKeys(pw);
		}
		
		public void lg()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ln);
		}
		
		public void clickaccount()
		{
			acc.click();
		}
		
		public void hlogin()
		{
			lg.click();
		}

	}

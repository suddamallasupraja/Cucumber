package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mock_Page extends BasePage
   {
	
     public Mock_Page(WebDriver driver)
        {
	      super(driver);
         }
    
     @FindBy(xpath="//input[@placeholder='Username']")
     WebElement user;
     @FindBy(xpath="//input[@placeholder='Password']")
     WebElement pass;
     @FindBy(xpath="//button[@type='submit']")
     WebElement lg;
     @FindBy(xpath="//h6[text()='Dashboard']")
     WebElement hp;
     
     public void username(String name)
     {
    	 user.sendKeys(name);
     }
     
     public void password (String pword)
     {
    	 pass.sendKeys(pword);
     }
     public void login()
     {
    	 lg.click();
     }
     public String home()
     {
    	String txt= hp.getText();
    	return txt;
     }
}


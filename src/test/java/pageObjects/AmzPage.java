package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmzPage extends BasePage{

	
		public AmzPage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="//input[@id='twotabsearchtextbox']")
		WebElement searchbox;
		
		public void searchitem()
		{
			searchbox.click();
			searchbox.sendKeys("face wash");
		}
		
		@FindBy(xpath="//input[@id='nav-search-submit-button']")
		WebElement search;
		
		public void searchbotton()
		{
			search.click();
		}
		
		@FindBy(xpath="//li[@id='p_123/236065']//input")
		WebElement checkbox;
		
		public void cbox()
		{
			checkbox.click();
		}
		
		@FindBy(xpath="//span[text()='Cetaphil Face Wash Gentle Skin Cleanser for Dry to Normal, Sensitive Skin, 125 ml Hydrating Face Wash with Niacinamide, Vitamin B5']")
		WebElement facewash;
		@FindBy(xpath="//span[text()='Mamaearth Rice Face Wash With Rice Water & Niacinamide For Glass Skin - 100 Ml']")
		WebElement facewas;
		@FindBy(xpath="//input[@id='buy-now-button']")
		WebElement bnow;
		public void choose()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", facewash);
			facewash.click();
			facewas.click();
			
		}
		public void buy()
		{
			bnow.click();
		}
		
		@FindBy(xpath="//span[@id='productTitle']")
		WebElement clicku;
		
		public void title()
		{
			clicku.getText();
		}
		
		@FindBy(xpath="//select[@name='quantity']")
		WebElement quantity;
		
		
		
		@FindBy(xpath="//input[@id='buy-now-button']")
		WebElement buynow;
		@FindBy(xpath="//input[@id='pp-yC7atK-148']")
		WebElement radiobutton;
		@FindBy(xpath="//input[@id='pp-yC7atK-136']")
		WebElement upiid;
		@FindBy(xpath="//span[text()='Verify']")
		WebElement verify;
		@FindBy(xpath="//span//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")
		WebElement submit;
		
		
	}



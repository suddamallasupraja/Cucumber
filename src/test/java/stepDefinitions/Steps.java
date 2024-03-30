package stepDefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.BlazedemoPage;
import pageObjects.Broken_LinkPage;
import pageObjects.DatePickerPage;
import pageObjects.Date_pick_page;
import pageObjects.Dontbe_Panic;
import pageObjects.EntireAutomationPage;
import pageObjects.Entire_Practise;
import pageObjects.FlePage;
import pageObjects.Frames;
import pageObjects.LoginPage;
import pageObjects.Mock_Page;
import pageObjects.MouseOverPage;
import pageObjects.MultipleBrowsersPage;
import pageObjects.PaginationPage;
import pageObjects.StaticTablePage;

public class Steps 
{
	WebDriver driver;
	Logger logger;
	ResourceBundle rb;
	Mock_Page mp;
	String bws;
	String uname;
	String passw;
	LoginPage Lp;
	EntireAutomationPage Ep;
	FlePage fp;
	DatePickerPage dp;
	StaticTablePage st;
	Broken_LinkPage bp;
	PaginationPage pp;
	MouseOverPage mo;
	Frames fm;
	MultipleBrowsersPage mb;
	BlazedemoPage bl;
	Entire_Practise ep;
	Dontbe_Panic dbp;
	Date_pick_page dpp;
@Before	
public void setup()
{
	rb=ResourceBundle.getBundle("config");
	logger=LogManager.getLogger(this.getClass());
}
@After
public void teardown(Scenario scenario)
{
	if(scenario.isFailed())
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		byte[] screenshot=screen.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		
	}
	//driver.quit();
}

@Given("user launches the browser")
public void user_launches_the_browser() 
{
	//ChromeOptions co=new ChromeOptions();
	//co.setHeadless(true);
bws=rb.getString("browser");
	if(bws.equals("chrome"))
	{
		 driver=new ChromeDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	logger.info("successfully launched the browser");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Given("navigate to {string}")
public void navigate_to(String string) 
{
	driver.get(string);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@When("user enters user name and password")
public void user_enters_user_name_and_password() 
{
	mp=new Mock_Page(driver);
	uname=rb.getString("username");
//	System.out.println(uname);
//	//String us="Admin";
	mp.username(uname);
	 passw=rb.getString("password");
//	 System.out.println(passw); 
	// String bs="admin123";
	mp.password(passw);	  
	logger.info("Entered username and password");
//	String nm=RandomStringUtils.randomAlphabetic(5);
//	System.out.println(nm);
//	mp.username(nm);
//	String ps=RandomStringUtils.randomAlphanumeric(8);
//	System.out.println(ps);
//	mp.password(ps);	
}

@When("user enters {string} and {string}")
public void user_enters_and(String string, String string2) 
{
   mp=new Mock_Page(driver);
   mp.username(string);
   mp.password(string2);
   
}

//@When("user enters user name as {string} and password as {string}")
//public void user_enters_user_name_as_and_password_as(String una, String pp) throws InterruptedException 
//{
//	mp=new Mock_Page(driver);
//	Thread.sleep(4000);
//	mp.username(una);
//	mp.password(pp);	
//}

@When("click on login")
public void click_on_login() {
	mp=new Mock_Page(driver); 
	mp.login();
	logger.info("clicked on login");
}

@Then("user navigates to homepage")
public void user_navigates_to_homepage() 
{
	mp=new Mock_Page(driver);
	String db=mp.home();
	if(db.equals("Dashboard"))
	{
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	}
	logger.info("navigated to home page");
}

@Given("open URL {string}")
public void open_url(String URL) throws InterruptedException {
	driver.get(URL);
	driver.manage().window().maximize();
	Thread.sleep(4000);
}

@When("navigates to MyAccount menu")
public void navigates_to_my_account_menu() 
{
	Lp=new LoginPage(driver);
	Lp.clickaccount();
}

//@When("click on login")
//public void click_on_login() 
//{
//	
//	Lp.hlogin();
//}

@When("user enters Email as {string} and Password as {string}")
public void user_enters_email_as_and_password_as(String maile, String pwrd) 
{
	Lp=new LoginPage(driver);
   Lp.mail(maile);
   Lp.paswrd(pwrd);
}

@When("click on Login button")
public void click_on_login_button() 
{
   Lp.lg();
}

//EntireAutomation

@When("user enters the first name as {string} and last name {string}")
public void user_enters_the_first_name_as_and_last_name(String string, String string2) throws InterruptedException 
{
	Thread.sleep(4000);
	Ep=new EntireAutomationPage(driver);
	Ep.uname(string, string2);
}

@When("user enters the phone as {string} and country as {string}")
public void user_enters_the_phone_as_and_country_as(String string, String string2) throws InterruptedException 
{
	Thread.sleep(4000);
  Ep=new EntireAutomationPage(driver);
  Ep.ph(string, string2);
}

@When("user enters the city as {string} and email address as {string}")
public void user_enters_the_city_as_and_email_address_as(String string, String string2) 
{
	Ep=new EntireAutomationPage(driver);
	Ep.ciem(string, string2);
}

@When("user enters the gender as female")
public void user_enters_the_gender_as_female() 
{
	Ep=new EntireAutomationPage(driver);
	Ep.gndr();
}

@When("select the days of the week from monday to saturday")
public void select_the_days_of_the_week_from_monday_to_saturday() 
{
	Ep=new EntireAutomationPage(driver);
	List<WebElement> boxes=Ep.cboxes();
	int siz=boxes.size();
	for(int i=0;i<siz;i++)
	{
		String txt=boxes.get(i).getText();
		if(txt.equals("Sunday"))
		{
			continue;
		}
		boxes.get(i).click();
	}
}

@When("user slects the morning from the dropdown")
public void user_slects_the_morning_from_the_dropdown() 
{
	Ep=new EntireAutomationPage(driver);
	WebElement dp=Ep.drpdown();
	Select sc =new Select(dp);
	sc.selectByVisibleText("Morning");
}

@When("choose the file")
public void choose_the_file() 
{
	Ep=new EntireAutomationPage(driver);
	Ep.fill();
	
}

@When("click on Click me under Alert")
public void click_on_click_me_under_alert() 
{
	Ep=new EntireAutomationPage(driver);
	Ep.aler();
	Alert nw=driver.switchTo().alert();
	nw.accept();
}

@When("choose the date")
public void choose_the_date() 
{
	Ep=new EntireAutomationPage(driver);
	Ep.dt();
}

@When("select the speed as faster")
public void select_the_speed_as_faster() 
{
	Ep=new EntireAutomationPage(driver);
	WebElement ws=Ep.spd();
	Select ss=new Select(ws);
	ss.selectByValue("2");
	
}

@When("select the file as other file")
public void select_the_file_as_other_file() 
{
	Ep=new EntireAutomationPage(driver);
	WebElement ff=Ep.fl();
	Select sp=new Select(ff);
	sp.selectByIndex(1);
}

@When("select the number as one")
public void select_the_number_as_one() 
{
	Ep=new EntireAutomationPage(driver);
	WebElement pp=Ep.nm();
	Select ps=new Select(pp);
	ps.selectByVisibleText("3");
}

@When("select the product iphone")
public void select_the_product_iphone() 
{
	Ep=new EntireAutomationPage(driver);
	WebElement ip=Ep.pd();
	Select ips=new Select(ip);
	ips.selectByValue("1");
}

@When("select the animal as avatar")
public void select_the_animal_as_avatar() 
{
	Ep=new EntireAutomationPage(driver);
	WebElement an=Ep.animl();
	Select anm=new Select(an);
	anm.selectByIndex(2);
}

//file upload

@When("user uploads a file")
public void user_uploads_a_file() 
{
    fp=new FlePage(driver);
    fp.fl();
}


//date picker

@When("user enters the date")
public void user_enters_the_date() throws InterruptedException 
{
	//Thread.sleep(4000);
   dp=new DatePickerPage(driver);
   dp.dat();
   WebElement year= dp.year();
   Select yr =new Select(year);
   yr.selectByValue("2024");
  WebElement month= dp.month();
  Select mon=new Select(month);
  mon.selectByVisibleText("Apr");
  
}

@Then("data entered into field")
public void data_entered_into_field()
{
	String dq="22";
	dp=new DatePickerPage(driver);
	List<WebElement> dats=dp.date();
	for(WebElement dates:dats)
	{
	String de=	dates.getText();
	if(de.equals(dq))
	{
		dates.click();
		break;
	}
	}
}

//static table

@When("user find the lowest price")
public void user_find_the_lowest_price() 
{
   st=new StaticTablePage(driver);
   int rows=st.colmn();
   System.out.println(rows);
   
   String arr[]=new String[rows];
   for(int i=1;i<=rows;i++)
   {
	  String txt= st.row(i).getText();
	  arr[i-1]=txt;
   }
   Arrays.sort(arr);
   String Lower_price=arr[0];
   for(int i=1;i<=rows;i++)
   {
	  String price=st.row(i).getText();
	  if(Lower_price.equals(price))
	  {
		  st.fl(i).click();
		  break;
	  }
   }
  
}

//Broken links

@When("user clicks on links")
public void user_clicks_on_links() throws IOException 
{
	try
	{
	bp=new Broken_LinkPage(driver);
	int broken=0;
	 int nonbroken=0;
   List<WebElement> links= bp.link();
   for(WebElement lk:links)
   {
	 String att=  lk.getAttribute("href");
	 System.out.println(att);
	 if(att.isEmpty() || att==null)
	 {
		 continue;
	 }
	 URL lks=new URL(att);
	 HttpURLConnection conn = null;
	 
	 conn=(HttpURLConnection) lks.openConnection();
	 
	 conn.connect();
	 
try {
	 
	 if(conn.getResponseCode()>=400)

	 {
		 broken++;
		System.out.println("broken");
	 }
	 else
	 {
		 nonbroken++;
		 System.out.println(" non broken");
	 }
}
catch(Exception  e)
{
	 System.out.println("unableto connect");
}

	
   }
   System.out.println(broken+"  "+nonbroken);
	}
	
		 catch(Exception unabletoconnect)
		 {
			 System.out.println("unable to connect");
		 }
	
	
}

//pagination

@When("user clicks on all pages")
public void user_clicks_on_all_pages() 
{
    pp=new PaginationPage(driver);
 //  List<WebElement> pagi= pp.page();
//   for(WebElement pag:pagi)
//   {
//	   pag.click();
//   }
  String val=  pp.siz();
  int size=Integer.parseInt(val);
   
   for(int i=1;i<size;i++)
   {
	   pp.next().click();
   }
}

//mouse over operations

@When("user switch to innerframe")
public void user_switch_to_innerframe() 
{
driver.switchTo().frame("iframeResult");
}

@Then("double click on copy text")
public void double_click_on_copy_text() 
{
    mo=new MouseOverPage(driver);
    mo.sclick();
    mo.dclick();
}

//frames

@When("user switch to frame and clicks on package")
public void user_switch_to_frame_and_clicks_on_package() 
{
	fm=new Frames(driver);
    driver.switchTo().frame("packageListFrame");
    fm.packs();
}

@When("switch back from the frame")
public void switch_back_from_the_frame() 
{
   driver.switchTo().defaultContent();
}

@When("switch to another frame and clicks on class")
public void switch_to_another_frame_and_clicks_on_class() 
{
	fm=new Frames(driver);
	driver.switchTo().frame("packageFrame");
	fm.clay();
	driver.switchTo().defaultContent();
}

@When("switch to another frame and clicks on search button")
public void switch_to_another_frame_and_clicks_on_search_button() 
{
	fm=new Frames(driver);
	driver.switchTo().frame("classFrame");
	
}

@When("enter the data")
public void enter_the_data() 
{
	fm=new Frames(driver);
	fm.srch();
}

@Then("user able to see the data accordingly which he entered")
public void user_able_to_see_the_data_accordingly_which_he_entered() 
{
	fm=new Frames(driver);
	Actions as=new Actions(driver);
	as.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	//as.sendKeys(Keys.ENTER).perform();
	System.out.println("completed");
}

//multiple browsers

@When("switch to another tab and open URL {string}")
public void switch_to_another_tab_and_open_url(String string) 
{
   driver.switchTo().newWindow(WindowType.TAB);
   driver.get(string);
}
@Then("capture all windowsids and switch back to amazon")
public void capture_all_windowsids_and_switch_back_to_amazon()
{
	mb=new MultipleBrowsersPage(driver);
   Set<String> webels= driver.getWindowHandles();
   for(String id:webels)
   {
	 String title=driver.switchTo().window(id).getTitle();
	   if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	   {
		   mb.search();
	   }
   }
}

//Blazedemo 

/*	@When("user chooses the departure city as {string}")
public void user_chooses_the_departure_city_as(String string)
{
   bl=new BlazedemoPage(driver); 
   bl.departure(string);
}

@When("user chooses the destination city as {string}")
public void user_chooses_the_destination_city_as(String string) 
{
	bl=new BlazedemoPage(driver); 
	bl.destination(string);
}

@When("clicks on find flights")
public void clicks_on_find_flights() 
{
	bl=new BlazedemoPage(driver); 
	bl.find();
}

@When("user navigates to particular page")
public void user_navigates_to_particular_page() 
{
	bl=new BlazedemoPage(driver);
	String text=bl.ppage();
	System.out.println(text);
	if(text.equals("Flights from Mexico City to London:"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
}

@When("user navigates to back page and to front page")
public void user_navigates_to_back_page_and_to_front_page() 
{
	
	driver.navigate().back();
	driver.navigate().forward();
}

@When("choose the flight which has lowest price")
public void choose_the_flight_which_has_lowest_price() 
{
	bl=new BlazedemoPage(driver); 
	int size=bl.sizz();
	String[] ab=new String[5];
	for(int i=1;i<=size;i++)
	{
		ab[i-1]=bl.sort(i).getText();
	}
	System.out.println(Arrays.toString(ab));
	Arrays.sort(ab);
	System.out.println(Arrays.toString(ab));
	
	for(int i=1;i<=size;i++)
	{
		if(ab[i].equals(bl.sort(i).getText()))
		{
			bl.fli(i).click();
			break;
		}
	}
}

@When("check the field total cost")
public void check_the_field_total_cost() 
{
	bl=new BlazedemoPage(driver); 
	String txt=bl.text();
	
}

@When("clicks on purchase flight button")
public void clicks_on_purchase_flight_button() 
{
	bl=new BlazedemoPage(driver);  
}

@Then("user should navigate to purchase conformation page")
public void user_should_navigate_to_purchase_conformation_page() 
{
	bl=new BlazedemoPage(driver); 
}

@Then("store the id")
public void store_the_id() 
{
	bl=new BlazedemoPage(driver); 
}	*/

//Entire Practise

@When("user clicks on destination of the week")
public void user_clicks_on_destination_of_the_week() 
{
    ep=new Entire_Practise(driver);
	ep.beach();
}

@When("user navigate to previous page")
public void user_navigate_to_previous_page() 
{
	ep=new Entire_Practise(driver);
	driver.navigate().back();
	
}

@When("user chooses the departure city as {string}")
public void user_chooses_the_departure_city_as(String string) 
{
	ep=new Entire_Practise(driver);
	ep.from(string);
}

@When("user chooses the destination city as {string}")
public void user_chooses_the_destination_city_as(String string) 
{
	ep=new Entire_Practise(driver);
	ep.to(string);
}
												
@When("clicks on find flights")
public void clicks_on_find_flights() 
{
	ep=new Entire_Practise(driver);
	ep.submit();
}

@When("choose the flight which has lowest price")
public void choose_the_flight_which_has_lowest_price()
{
	ep=new Entire_Practise(driver);
	String[] arr=new String[5];
	for(int i=1;i<=ep.sizz();i++)
	{
	WebElement pric=ep.lowestprice(i);
	String number=pric.getText();
	arr[i-1]=number;
	}
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	for(int i=1;i<=ep.sizz();i++)
	{
		String pri=ep.lowestprice(i).getText();
		if(arr[0].equals(pri))
		{
			ep.chose(i).click();
			break;
		}
	}
}

//Don't panic feature file

@When("user clicks on destination page")
public void user_clicks_on_destination_page() 
{
    dbp= new Dontbe_Panic(driver);
    dbp.beaches();
}

@When("user naviagtes to respective page")
public void user_naviagtes_to_respective_page() 
{
	String title=driver.getTitle();
	System.out.println(title);
}

@When("revert back from that page")
public void revert_back_from_that_page() 
{
	driver.navigate().back();
	
}

@When("user choose the departure city as paris")
public void user_choose_the_departure_city_as_paris() 
{
	dbp= new Dontbe_Panic(driver);
	dbp.departure("Paris");
}

@When("user choose the destination city as london")
public void user_choose_the_destination_city_as_london() 
{
	dbp= new Dontbe_Panic(driver);
	dbp.destination("London");
}

@When("click on find flights")
public void click_on_find_flights() 
{
	dbp= new Dontbe_Panic(driver);
	dbp.flight();
}

@When("click on choose the flight which has lowest price")
public void click_on_choose_the_flight_which_has_lowest_price() 
{
	dbp= new Dontbe_Panic(driver);
	int siz=dbp.siiz();
	System.out.println(siz);
	
	String[] ab=new String[5];
	for(int i=1;i<=siz;i++)
	{
		String value=dbp.prise(i).getText();
		ab[i-1]=value;
	}
	System.out.println(Arrays.toString(ab));
	Arrays.sort(ab);
	System.out.println(Arrays.toString(ab));
	
	for(int i=1;i<=siz;i++)
	{
	String value1=dbp.prise(i).getText();
	System.out.println(value1);
	if(ab[0].equals(value1))
	//System.out.println(ab[0]);
	{
		System.out.println(ab[0]);
		dbp.choosefl(i).click();
		break;	
	}
	}
}

@When("click on purchase flight")
public void click_on_purchase_flight()
{
	dbp= new Dontbe_Panic(driver);
	dbp.pflit();
}

@Then("user should navigate to purchase confirmation page")
public void user_should_navigate_to_purchase_confirmation_page() 
{
	String sucs=driver.getTitle();
	System.out.println(sucs);
	
	
}

@Then("store the id")
public void store_the_id() 
{
	dbp= new Dontbe_Panic(driver);
	
}

//Pagination page

@When("user clicks on all available pages")
public void user_clicks_on_all_available_pages() throws InterruptedException 
{
  pp=new PaginationPage(driver);
 
  pp.iz();
  
  for(int i=1;i<pp.iz();i++)
  {
	  pp.pagepage().click();
	  Thread.sleep(15000);
  }
}

//date_pick

@When("user clicks on datefield")
public void user_clicks_on_datefield()
{
	dpp=new Date_pick_page(driver);
	dpp.clic();
    
}

//@When("choose the {string} and {string} and {string}")
//public void choose_the_and_and(String string, String string2, String string3) 
//{
//   dpp=new Date_pick_page(driver);
//   
//   for()
//   {
//	   for()
//	   {
//		   
//	   }
//   }
//}

@When("user switch to frame3")
public void user_switch_to_frame3() {
  fm=new Frames(driver);
  WebElement we=fm.frames();
  driver.switchTo().frame(we);
  
}

@When("switch to inside frame")
public void switch_to_inside_frame() throws InterruptedException {
	fm=new Frames(driver);
	WebElement wes=fm.iframes();
	Thread.sleep(5000);
	driver.switchTo().frame(wes);
	
	
}

@When("clicks on i am a human radio button")
public void clicks_on_i_am_a_human_radio_button() {
	fm=new Frames(driver);
	fm.radi();
	driver.switchTo().defaultContent();
	WebElement we=fm.frames();
	driver.switchTo().frame(we);
	fm.sendkey();
}

@When("user clicks on all checkboxes")
public void user_clicks_on_all_checkboxes() 
{
	fm=new Frames(driver);
	List<WebElement> sel=fm.indexes();
	for(WebElement sels:sel)
	{
		String val=sels.getText();
		System.out.println(val);
	}
}

@When("user choose the departure city as {string}")
public void user_choose_the_departure_city_as(String string) 
	{
		ep=new Entire_Practise(driver);
		ep.with();
		List<WebElement> value=ep.withs();
		for(WebElement v:value)
		{
			System.out.println(v.getText());
			if(v.getText().equals("Mexico City"))
			{
				v.click();
				break;
			}
		}
		ep.withss();
	}
}

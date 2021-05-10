package stepDefinition;

import java.util.Iterator;
import java.util.Set;

//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.AppstorePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AppstoreSD {
	
	WebDriver driver;	
	@Test(priority=1)
	@Given("^User on the Home Page$")
	public void user_on_the_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Selinium Software\\chromedriver_win32\\chromedriver.exe");
	    this.driver=new ChromeDriver();
  	    driver.get("http://www.mcdelivery.co.in/home/trending");
  	    driver.manage().window().maximize();
  	    AppstorePOM appstore=PageFactory.initElements(driver, AppstorePOM.class);
  	    Thread.sleep(1000);
  	    appstore.Loginsignup();
  	    Thread.sleep(1000);
  	    appstore.loginviapass();
  	    Thread.sleep(1000);
  	    appstore.enternumber("8143039599");
  	    Thread.sleep(1000);
  	    appstore.enterpassword("Basha@146");
  	    Thread.sleep(1000);
  	    appstore.loginclick();
  	    Thread.sleep(1000);
	}
	
    @Test(priority=2)
    @Then("^User clicks on the Appstore icon and New window should be open, User will download the app from Appstore$")
    public void user_clicks_on_the_Appstore_icon_and_New_window_should_be_open_User_will_download_the_app_from_Appstore() throws Throwable {
    	AppstorePOM Appstore=PageFactory.initElements(driver, AppstorePOM.class);
    	Appstore.appstore();
    	driver.quit();
    }
    /*System.setProperty("webdriver.chrome.driver", "E:\\Selinium Software\\chromedriver_win32\\chromedriver.exe");
	    this.driver=new ChromeDriver();
  	    driver.get("http://www.mcdelivery.co.in/home/trending");
  	    driver.manage().window().maximize();
  	    AppstorePOM appstore=PageFactory.initElements(driver, AppstorePOM.class);
  	    Thread.sleep(1000);
  	    appstore.Loginsignup();
  	    Thread.sleep(1000);
  	    appstore.loginviapass();
  	    Thread.sleep(1000);
  	    appstore.enternumber("8143039599");
  	    Thread.sleep(1000);
  	    appstore.enterpassword("Basha@146");
  	    Thread.sleep(1000);
  	    appstore.loginclick();
  	    Thread.sleep(1000);*/
}

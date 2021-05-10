package stepDefinition;

import java.util.Iterator;
import java.util.Set;

//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.AppstorePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaystoreSD {
	public static WebDriver driver;
	@Test(priority=1)	
	@Given("^User on the Mcdonalds Page$")
	public void user_logs_into_his_account() throws Throwable {
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
	    System.out.println("The Title of Main Page:"+driver.getTitle());
	}
	@Test(priority=2)
	@When("^User clicks on the Playstore icon and New window should be open, User will download the app from Playstore$")
	public void user_clicks_on_the_Playstore_icon() throws Throwable {
		AppstorePOM Playstore=PageFactory.initElements(driver, AppstorePOM.class);
    	Playstore.playstore();
        System.out.println("The Title of main Page:"+driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
	}
}

package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefectSD {
	public static WebDriver driver;
	@Test(priority=1)
	@Given("^User in the Home page$")
	public void user_in_the_Home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Selinium Software\\chromedriver_win32\\chromedriver.exe");
	    this.driver=new ChromeDriver();
 	    driver.get("http://www.mcdelivery.co.in/home/trending");
 	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[text()=' Login / Sign Up ']")).click();
	    driver.findElement(By.xpath("//*[text()=' Login Via Password ']")).click();
	    driver.findElement(By.name("email")).sendKeys("8143039599");
	    driver.findElement(By.id("password")).sendKeys("Basha@146");
	    driver.findElement(By.cssSelector(".button")).click(); 
	}
	@Test(priority=2)
	@When("^User click on Cart button$")
	public void user_click_on_Cart_button() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver, 60); 	  
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"View Cart\")]")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e); 
	}
	@Test(priority=3)
	@When("^User click on Pay button$")
	public void user_click_on_Pay_button() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver, 80); 	  
	    WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-footer']")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}
	@Test(priority=4)
	@Then("^Payment Page is be visible$")
	public void payment_Page_is_be_visible() throws Throwable {
		Thread.sleep(8000);
	    String actual=driver.getCurrentUrl();
		String Expected="https://www.mcdelivery.co.in/payment";
		Assert.assertEquals(Expected, actual); 
	}
	@Test(priority=5)
	@When("^User click on cards$")
	public void user_click_on_cards() throws Throwable {
		Thread.sleep(3000);
		WebElement actual=driver.findElement(By.xpath("//*[contains(text(),\" Credit/Debit Cards\")]"));
		String Expected="Credit/Debit Cards";
		Assert.assertEquals(Expected, actual.getText());
		driver.findElement(By.xpath("//*[contains(text(),\" Credit/Debit Cards\")]")).click(); 
	}
	@Test(priority=6)
	@Then("^User enters the card data$")
	public void user_enters_the_card_data() throws Throwable {
		Thread.sleep(3000);
		WebElement actual=driver.findElement(By.xpath("//*[contains(text(),'Pay with Credit/Debit Card')]"));
		String Expected="Pay with Credit/Debit Card";
		Assert.assertEquals(Expected, actual.getText());
		driver.findElement(By.xpath("//*[contains(text(),'Pay with Credit/Debit Card')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567893216547");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='new-card-expire input-conatiner']//input[@type='text']")).sendKeys("99/1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[4]//input[1]")).sendKeys("shabbeer");
		Thread.sleep(2000);
		boolean Expected1=false;
		WebElement continuebtn=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		boolean Actual=continuebtn.isEnabled();
		Assert.assertEquals(Expected1, Actual);
	}

}

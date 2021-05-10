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

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentPageSD {
   public static WebDriver driver;
   @Test(priority=1)
   @Given("^User on the Home page$")
   public void user_on_the_Home_page() throws Throwable {
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
   @When("^User clicks Cart button$")
   public void user_clicks_Cart_button() throws Throwable {
	   WebDriverWait wait=new WebDriverWait(driver, 60); 	  
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"View Cart\")]")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e); 
   }
   @Test(priority=3)
   @When("^User clicks on Pay button$")
   public void user_clicks_on_Pay_button() throws Throwable {
	   WebDriverWait wait=new WebDriverWait(driver, 80); 	  
	    WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-footer']")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
   }
   @Test(priority=4)
   @Then("^Payment Page must be visible$")
   public void payment_Page_must_be_visible() throws Throwable {
	   Thread.sleep(8000);
	    String actual=driver.getCurrentUrl();
		String Expected="https://www.mcdelivery.co.in/payment";
		Assert.assertEquals(Expected, actual);
		Thread.sleep(5000);
		WebElement actual1=driver.findElement(By.xpath("//*[contains(text(),\" UPI \")]"));
        String Expected1="UPI";
        Assert.assertEquals(Expected1, actual1.getText());
        driver.findElement(By.xpath("//*[contains(text(),\" UPI \")]")).isDisplayed();
        Thread.sleep(5000);
        WebElement actual2=driver.findElement(By.xpath("//span[contains(text(),'Paytm UPI')]"));
        String Expected2="Paytm UPI";
        Assert.assertEquals(Expected2, actual2.getText());
        driver.findElement(By.xpath("//*[contains(text(),'Paytm UPI')]")).isDisplayed();
        
   }
   @Test(priority=5)
   @When("^User clicks on the Wallets$")
   public void user_clicks_on_the_Wallets() throws Throwable {
	   Thread.sleep(3000);
		  WebElement e=driver.findElement(By.xpath("//*[contains(text(),\" Wallets \")]"));
		  e.click();
   }
   @Test(priority=6)
   @Then("^User should be able to pay using one of the Wallets$")
   public void user_should_be_able_to_pay_using_one_of_the_Wallets() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//span[contains(text(),'AmazonPay')]"));
	    String Expected="AmazonPay";
	    Assert.assertEquals(Expected, actual.getText());
	    driver.findElement(By.xpath("//span[contains(text(),'AmazonPay')]")).isDisplayed();
	    Thread.sleep(3000); 
	    WebElement actual1=driver.findElement(By.xpath("//span[contains(text(),'Paytm')]"));
	    String Expected1="Paytm";
	    Assert.assertEquals(Expected1, actual1.getText());
	    driver.findElement(By.xpath("//span[contains(text(),'Paytm')]")).isDisplayed();
	    Thread.sleep(3000);
	    WebElement actual2=driver.findElement(By.xpath("//span[contains(text(),'FreeCharge')]"));
	    String Expected2="FreeCharge";
	    Assert.assertEquals(Expected2, actual2.getText());
	    driver.findElement(By.xpath("//span[contains(text(),'FreeCharge')]")).isDisplayed();
   }
   @Test(priority=7)
   @When("^User clicks on the Food Card$")
   public void user_clicks_on_the_Food_Card() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//*[contains(text(),\" Food Card \")]"));
	    String Expected="Food Card";
	    Assert.assertEquals(Expected, actual.getText());
	    driver.findElement(By.xpath("//*[contains(text(),\" Food Card \")]")).click();
   }
   @Test(priority=8)
   @Then("^User should be able to pay using Card$")
   public void user_should_be_able_to_pay_using_Card() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//*[contains(text(),'Sodexo Card')]"));
	    String Expected="Sodexo Card";
	    Assert.assertEquals(Expected, actual.getText());
	    driver.findElement(By.xpath("//*[contains(text(),'Sodexo Card')]")).isDisplayed();
   }
   @Test(priority=9)
   @When("^User clicks on the Credit or Debit Cards$")
   public void user_clicks_on_the_Credit_or_Debit_Cards() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//*[contains(text(),\" Credit/Debit Cards\")]"));
	   String Expected="Credit/Debit Cards";
	   Assert.assertEquals(Expected, actual.getText());
	   driver.findElement(By.xpath("//*[contains(text(),\" Credit/Debit Cards\")]")).click();
   }
   @Test(priority=10)
   @Then("^User Should be able to pay using Credit or Debit Cards after entering the card details$")
   public void user_Should_be_able_to_pay_using_Credit_or_Debit_Cards_after_entering_the_card_details() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//*[contains(text(),'Pay with Credit/Debit Card')]"));
	    String Expected="Pay with Credit/Debit Card";
	    Assert.assertEquals(Expected, actual.getText());
	    driver.findElement(By.xpath("//*[contains(text(),'Pay with Credit/Debit Card')]")).isDisplayed();
   }
   @Test(priority=11)
   @When("^User clicks on the Net Banking$")
   public void user_clicks_on_the_Net_Banking() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//*[contains(text(),\" Net Banking \")]"));
	    String Expected="Net Banking";
	    Assert.assertEquals(Expected, actual.getText());
	    driver.findElement(By.xpath("//*[contains(text(),\" Net Banking \")]")).click();
   }
   @Test(priority=12)
   @Then("^User selects the bank by which user want to pay amount$")
   public void user_selects_the_bank_by_which_user_want_to_pay_amount() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//span[contains(text(),'Axis Bank')]"));
	    String Expected="Axis Bank";
	    Assert.assertEquals(Expected, actual.getText());
	    driver.findElement(By.xpath("//span[contains(text(),'Axis Bank')]")).isDisplayed();
	    Thread.sleep(3000);
	    WebElement actual1=driver.findElement(By.xpath("//span[contains(text(),'ICICI Bank')]"));
	    String Expected1="ICICI Bank";
	    Assert.assertEquals(Expected1, actual1.getText());
	    driver.findElement(By.xpath("//span[contains(text(),'ICICI Bank')]")).isDisplayed(); 
	    Thread.sleep(3000);
	    WebElement actual2=driver.findElement(By.xpath("//span[contains(text(),'HDFC Bank')]"));
	    String Expected2="HDFC Bank";
	    Assert.assertEquals(Expected2, actual2.getText());
	    driver.findElement(By.xpath("//span[contains(text(),'HDFC Bank')]")).isDisplayed();
   }
   @Test(priority=13)
   @When("^User clicks on the more$")
   public void user_clicks_on_the_more() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//*[contains(text(),\" More \")]"));
		 String Expected="More";
		 Assert.assertEquals(Expected, actual.getText());
		 driver.findElement(By.xpath("//*[contains(text(),\" More \")]")).click();
   }
   @Test(priority=14)
   @Then("^User clicks on the Cash On Delivery Option and will place the order$")
   public void user_clicks_on_the_Cash_On_Delivery_Option_and_will_place_the_order() throws Throwable {
	   Thread.sleep(3000);
	   WebElement actual=driver.findElement(By.xpath("//span[contains(text(),'Cash On Delivery')]"));
		String Expected="Cash On Delivery";
		Assert.assertEquals(Expected, actual.getText());
		driver.findElement(By.xpath("//span[contains(text(),'Cash On Delivery')]")).isDisplayed();
		driver.close();
   }
}

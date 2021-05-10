package PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPOM {
     WebDriver driver;
     By loginsignup=By.xpath("//*[text()=' Login / Sign Up ']");
     By Login_via_pass=By.xpath("//*[text()=' Login Via Password ']");
     By mobileno=By.name("email");
     By password=By.id("password");
     By login=By.cssSelector(".button");
     By Cartbutton=By.cssSelector(".btn:nth-child(2)");
     By PayButton=By.xpath("//div[@class='cart-footer']");
     By Wallets=By.xpath("//*[contains(text(),\" Wallets \")]");
     By Foodcard=By.xpath("//*[contains(text(),\" Food Card \")]");
     By CreditorDebit=By.xpath("//*[contains(text(),\" Credit/Debit Cards\")]");
     By Net_Banking=By.xpath("//*[contains(text(),\" Net Banking \")]");
     By Other=By.xpath("//*[contains(text(),\" More \")]");
     
    public PaymentPOM(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
    public void Loginsignup() {
    	driver.findElement(this.loginsignup).click();
    }
    public void loginviapass() {
    	driver.findElement(this.Login_via_pass).click();
    }
    public void enternumber(String no) {
    	driver.findElement(this.mobileno).sendKeys(no);
    }
    public void enterpassword(String pass) {
    	driver.findElement(this.password).sendKeys(pass);
    }
    public void loginclick() {
    	driver.findElement(this.login).click();
    }
     public void cartbutton() throws Throwable {
    	 
    	 //WebDriverWait wait=new WebDriverWait(driver, 30); 	  
		 //WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(this.Cartbutton));
		 //JavascriptExecutor js=(JavascriptExecutor) driver;
		 //js.executeScript("arguments[0].click();", e);
    	   Thread.sleep(5000);
    	   JavascriptExecutor js=(JavascriptExecutor) driver;
    	   js.executeScript("window.scrollBy(0,200)");
    	   WebDriverWait wait=new WebDriverWait(driver, 60); 	  
		   WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(Cartbutton));
		   e.click();
		   Thread.sleep(5000);    	    	     	
    }
     /*public void paybutton() {
    	 //WebDriverWait wait=new WebDriverWait(driver, 30);
      	 //WebElement d=wait.until(ExpectedConditions.visibilityOfElementLocated(this.PayButton));
      	 //JavascriptExecutor js=(JavascriptExecutor) driver;
     	 //js.executeScript("arguments[0].click();", d);
    	//driver.findElement(this.PayButton).click();
    	 
    	 WebDriverWait wait=new WebDriverWait(driver, 60);
    	 WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(PayButton));
    	 JavascriptExecutor js=(JavascriptExecutor) driver;
     	js.executeScript("arguments[0].click();", e);
     }
     public void wallets() throws Throwable {
    	 Thread.sleep(3000);
   	  WebElement e=driver.findElement(By.xpath("//*[contains(text(),\" Wallets \")]"));
   	  e.click();
   	  System.out.println("The Element present is:"+e.getText());
    	 
    	 
    	 WebElement actual1=driver.findElement(By.xpath("//*[contains(text(),'Paytm')]"));
   	     System.out.println(actual1.getText());
   	    String Expected1="Paytm";
   	    Assert.assertEquals(Expected1, actual1.getText());
   	    driver.findElement(By.xpath("//*[contains(text(),'Paytm')]")).isDisplayed(); 
   	  
   	  
   	  WebElement actual=driver.findElement(By.xpath("//*[contains(text(),'AmazonPay')]"));
   	    String Expected="AmazonPay";
   	    Assert.assertEquals(Expected, actual.getText());
   	    driver.findElement(By.xpath("//*[contains(text(),'AmazonPay')]")).isDisplayed();
   	    
   	    
   	    
   	    WebElement actual2=driver.findElement(By.xpath("//*[contains(text(),'FreeCharge')]"));
   	    String Expected2="FreeCharge";
   	    Assert.assertEquals(Expected2, actual2.getText());
   	    driver.findElement(By.xpath("//*[contains(text(),'FreeCharge')]")).isDisplayed();
     }
     public void foodcard() throws Throwable {
    	 Thread.sleep(3000);
		  WebElement e=driver.findElement(By.xpath("//*[contains(text(),\" Food Card \")]"));
		  e.click();
		  System.out.println("The Element present is:"+e.getText()); 
		  
		  WebElement actual=driver.findElement(By.xpath("//*[contains(text(),'Sodexo Card')]"));
		    String Expected="Sodexo Card";
		    Assert.assertEquals(Expected, actual.getText());
		    driver.findElement(By.xpath("//*[contains(text(),'Sodexo Card')]")).isDisplayed();
     }
     public void credit_or_debit() {
    	 driver.findElement(this.CreditorDebit).isDisplayed();
     }
     public void net_banking() {
    	 driver.findElement(this.Net_Banking).isDisplayed();
     }
     public void other() {
    	 driver.findElement(this.Other).isDisplayed();
     }*/
}

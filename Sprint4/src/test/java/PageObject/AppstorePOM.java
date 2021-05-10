package PageObject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppstorePOM {
    WebDriver driver;
    By loginsignup=By.xpath("//*[text()=' Login / Sign Up ']");
    By Login_via_pass=By.xpath("//*[text()=' Login Via Password ']");
    By mobileno=By.name("email");
    By password=By.id("password");
    By login=By.cssSelector(".button");
    By Appstore=By.xpath("//img[@class='w-50 h-50']");
    By Playstore=By.xpath("//img[@class='w-50 h-50 pl-2']");
    By install=By.xpath("//button[normalize-space()='Install']");
    
    public AppstorePOM(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    public void Loginsignup() {
    	driver.findElement(loginsignup).click();
    }
    public void loginviapass() {
    	driver.findElement(Login_via_pass).click();
    }
    public void enternumber(String no) {
    	driver.findElement(mobileno).sendKeys(no);
    }
    public void enterpassword(String pass) {
    	driver.findElement(password).sendKeys(pass);
    }
    public void loginclick() {
    	driver.findElement(login).click();
    	
    	
    }
    public void appstore() throws Throwable{
    	System.out.println("The Title of Main Page is: "+driver.getTitle());
    	WebDriverWait wait=new WebDriverWait(driver, 10);
    	WebElement e=driver.findElement(Appstore);
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", e);
        Set<String>windowIds=driver.getWindowHandles();
        	
        Iterator<String>iter=windowIds.iterator();
            
        String mainWindow = iter.next();
        String childWindow= iter.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        System.out.println("The Title of child Page is: "+driver.getTitle());
        Thread.sleep(3000);
        WebElement E=driver.findElement(By.xpath("//p[@class='we-banner__copy']"));
        System.out.println("The Text of the Message is: "+E.getText());
        Thread.sleep(3000);
        driver.switchTo().window(mainWindow);
        System.out.println("The Title of Main Page is: "+driver.getTitle());
    }
    public void playstore() throws Throwable {
    	
    	WebDriverWait wait=new WebDriverWait(driver, 3);
    	WebElement e=driver.findElement(this.Playstore);
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", e);
        Set<String>windowIds=driver.getWindowHandles();
    	
    	Iterator<String>iter=windowIds.iterator();
        
        String mainWindow = iter.next();
        String childWindow= iter.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(3000);
        System.out.println("The Title of child Page is: "+driver.getTitle());
        WebElement i=driver.findElement(By.xpath("//button[contains(text(),\"Install\")]"));       
        System.out.println("The Text of the Button is: "+i.getText());
        i.click();
        driver.findElement(By.xpath("//div[contains(@class,'XfpsVe J9fJmf')]//button[contains(@class,'')][normalize-space()='Cancel']")).click();
        Thread.sleep(3000);
        driver.switchTo().window(mainWindow);
    }
}

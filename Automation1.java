package amazon_selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation1 extends Library {
static 
{
	System.setProperty(key,value );
}
public static WebDriver driver;
public static void main(String [] args) throws InterruptedException
{
	
	 driver=new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(ito ,TimeUnit.SECONDS);
	 driver.get(url);
	 
	 //getting title
	
	 String title=driver.getTitle();
	 System.out.println(" title of page :"+title);
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	 driver.findElement(By.id("nav-search-submit-button")).click();
	
	 //filter on mi phone
	 
	 driver.findElement(By.xpath("//li[@id='p_89/MI']//i[@class='a-icon a-icon-checkbox']")).click();
	 
	 //filter on oneplus phone
	 
	 WebDriverWait wait=new WebDriverWait(driver,100);
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='p_89/OnePlus']//i[@class='a-icon a-icon-checkbox']"))).click();
	
	 //driver.findElement(By.xpath("//li[@id='p_89/OnePlus']//i[@class='a-icon a-icon-checkbox']")).click();
	
	
	 //filter apply over 20000
	
	 driver.findElement(By.xpath("//li[@id='p_36/1318507031']/span/a/span")).click();
	 Thread.sleep(2000);
	
	//selecting first phone with price
	
	 String phone_name = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).getText();
	 System.out.println("phone name is  : "+phone_name);
	 String phone_price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	 System.out.println("phone price is  : "+phone_price);
	 driver.close();
	 
 }
}

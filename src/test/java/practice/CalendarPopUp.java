package practice;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CalendarPopUp{
@Test
public void SelectCurrentDate() throws InterruptedException
{
	Date d = new Date();
	String dArr=d.toString();      
	System.out.println(dArr);
	String arr[]=dArr.split(" ");
	String day = arr[0];
	String month = arr[1];
	String date = arr[2];
	String year = arr[5];
	String travelDate = day+" "+month+" "+date+" "+year;
	System.out.println(travelDate);
	
	//Set the web driver manager to chrome
	WebDriverManager.chromedriver().setup();
	
	//Launch the browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	
	Thread.sleep(1000);
	
	//Actions act = new Actions(driver);
	//act.moveByOffset(10, 10).click().perform();
	
	
	//Navigate to From and To Elements
			WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
			WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
			
			
			src.sendKeys("mumbai");
			driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
			
			Thread.sleep(2000);
			
			dst.sendKeys("tirupati");
			driver.findElement(By.xpath("//P[text()='Tirupati, India']")).click();
			
			Thread.sleep(2000);
			
			//navigate to departure
			driver.findElement(By.xpath("//label[@for='departure']")).click();
			
			
			//navigate to desired date in calender
			Thread.sleep(1000);
			driver.findElement(By.xpath("//p[@class='blackText font20 code'][1]")).click();
			driver.quit();
		}
}


	
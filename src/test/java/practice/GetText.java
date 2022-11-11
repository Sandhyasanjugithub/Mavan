package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	String s=	driver.findElement(By.xpath("//div[text()='Missing Cart items?']")).getText();
		
		System.out.println(s);
		
		 	driver.close();
		
		
	}

}
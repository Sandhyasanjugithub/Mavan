package practice;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class ScrollBar {	
		public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//typcasting
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,5000)");
Thread.sleep(3000);


	js.executeScript("window.scrollBy(0,-5000)");

		}

	
}




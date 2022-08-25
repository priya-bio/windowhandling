package org.windowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		//configuire the broeser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhay\\eclipse-workspace\\LocatorSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//launch the url
	driver.get("http://greenstech.in/selenium-course-content.html");
	//maximise
	driver.manage().window().maximize();
	
	
	//to synchronisation
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//title of my page
	String title=driver.getTitle();
	System.out.println(title);
	//current url
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	
	Actions a =new Actions(driver);
	WebElement selenium=driver.findElement(By.xpath("//div[@id='heading304']"));
	a.click(selenium).perform();
	
	WebElement dayten=driver.findElement(By.xpath("//a[contains(text(),'Test papers training in chennai')]"));
	a.click(dayten).perform();
	
	
	
	Thread.sleep(3000);
	
	
	

	
	
	
	
	
	//get parent window id
	String parentId=driver.getWindowHandle();
	System.out.println(parentId);
	//get all window id 
	Set<String> allwindowid=driver.getWindowHandles();
	
	
	for (String each : allwindowid) {
		if(!parentId.equals(each)) {
			driver.switchTo().window(each);
			System.out.println(each);
			
		}
		
	}
	
	
	
	

	
	}}















package org.windowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) throws InterruptedException  {
		//configuire the broeser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhay\\eclipse-workspace\\LocatorSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//launch the url
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	//maximise
	driver.manage().window().maximize();
	//title of my page
	String title=driver.getTitle();
	System.out.println(title);
	//current url
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//locate the table
	WebElement table=driver.findElement(By.xpath("//table[@border='l']"));
	
	List <WebElement> rows=table.findElements(By.tagName("tr"));
	for(int i=0;i<rows.size();i++) {
		System.out.println(rows.size());
		
		WebElement row=rows.get(1);
		System.out.println(row.getText());
	
	
	List <WebElement> datas=row.findElements(By.tagName("td"));
	for(int j=0;j<datas.size();j++) {
		
		
		
		WebElement data=datas.get(1);	
		System.out.println(data.getText());
		
	
	
	
	}
}}}








package com.qa.shopping;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {
	
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Dress&submit_search=");
	}
	
	@Test
	public void LayoutTest() {
	
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
			assertEquals("Printed Dress",checkElement.getText());			
		
	}

}

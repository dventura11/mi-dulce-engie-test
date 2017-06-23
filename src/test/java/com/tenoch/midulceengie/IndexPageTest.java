package com.tenoch.midulceengie;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.TestCase;

public class IndexPageTest extends TestCase {

	private WebDriver browser;

	@Override
	protected void setUp() throws Exception {
		System.setProperty ("webdriver.chrome.driver", "/home/danya07/Documents/chromedriver");
		//browser = new ChromeDriver();
		browser = new HtmlUnitDriver();

		browser.get("http://localhost:8085");
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		browser.quit();
	}
	
	public void testTitulo(){
		String esperado ="Mi dulce Engie";
		String actual = browser.getTitle();
		assertEquals(esperado, actual);
	}
	public void testVideo(){
		WebElement videoFrame = browser.findElement(By.xpath("//*[@id=\"video\"]/p/iframe"));
		assertNotNull(videoFrame);
		videoFrame.click();
		String urlActual = videoFrame.getAttribute("src");
		assertNotNull(urlActual);
		String esperado = "https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2Fmydulceengie%2Fvideos%2F881827315271578%2F&show_text=0&width=560";
		assertEquals(esperado, urlActual);
	}
	
}

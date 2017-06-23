package com.tenoch.midulceengie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.TestCase;

public class IndexPageTest extends TestCase {

	private WebDriver browser;

	@Override
	protected void setUp() throws Exception {
	
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
}

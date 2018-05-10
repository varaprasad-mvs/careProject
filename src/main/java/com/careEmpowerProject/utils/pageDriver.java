package com.careEmpowerProject.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pageDriver {
	
	private WebDriver driver;
	
	
	
	public WebDriver setDriver() {
		
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");
		 this.driver = new ChromeDriver();
		 
		 return this.driver;
		 
	}
	
	/* opens particular URL
	*/
	public void openUrl(String URL) {
		this.driver.get(URL);
	}
	
	/* closes the Browser*/
	
	public void close() {
		this.driver.close();
	}
	
	
	/* get the Title of the particular page*/
	
	public String getTittle() {
		String t=this.driver.getCurrentUrl();
		
		return t;
		
	}
	
	/* select the dropdow with the particular Text
	 * 
	 * text value
	 */
	
	public void selectDropDown(WebElement we,String text) {
		
		Select s = new Select(we);
		s.selectByVisibleText(text);
	}
	
	
	/* select the dropdow with the particular index
	 * 
	 * index value, Index starts from 1
	 */
	
public void selectDropDown(WebElement we,int  index) {
		
		Select s = new Select(we);
		s.selectByIndex(index);
	}
	
	/*
	 * Check whether the particular element is present in the 
	 * page or not
	 * 
	 */
	
	public boolean isDisplayed(WebElement we) {
		
		return we.isDisplayed();
	}
	
	
	/*
	 * It will return the text of the webElement 
	 * page or not
	 * 
	 */
	
public String getText(WebElement we) {
		
		String t= we.getText();
		return t;
	}


/*
 * It Clicks on that particular webelement
 * page or not
 * 
 */
public void Click(WebElement we) {
	
	we.click();
}

/*
 * It will move the mouse to that particular webElement
 * page or not
 * 
 */
public void moveMouse(WebElement we) {
	
	Actions builder = new Actions(driver);
	Action hover = builder.moveToElement(we).build();
	hover.perform();
	

}
/*
 * for logging errors
 */
private void logMessage(Exception e, String className) {
	for (StackTraceElement element : e.getStackTrace()) {
		if (element.getClassName().equals(className)) {
			element.getMethodName();
		}
	}


}
}

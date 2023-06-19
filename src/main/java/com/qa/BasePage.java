package com.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.qa.reports.ExtentReport;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.bytebuddy.utility.RandomString;

public class BasePage {
	protected AndroidDriver driver;
	protected WebDriverWait wait;
	public static JSONObject dataJson;
	static InputStream datais = null;
	BaseTest basetest=new BaseTest();
	public BasePage (AndroidDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	protected void waitAndClick (By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by)).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
		
	}

	protected void click (By by) {
		waitVisibility(by);
		driver.findElement(by).click();
		ExtentReport.getTest().log(Status.INFO, "Click with successful");
	}

	protected void hideKeyboard(){
		driver.navigate().back();
	}

	protected boolean isElementPresent(By by) {
		try {
			waitAndFindElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	protected boolean verifyElementNotEnabled(By by) {
		try {
			waitAndFindElement(by).isEnabled();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}
	}
	protected boolean verifyElementEnabled(By by) {
		try {
			waitAndFindElement(by).isEnabled();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	protected boolean elementNotPresent(By by) {
		int x=0;
		if(driver.findElements(by).size()>x) {
			return false;
		}
		else {
			System.out.println("Element not displayed >  Test Verify OK ");
			return true;
		}
	}
	protected List<WebElement> waitAndFindElements (By by) {
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	protected WebElement waitAndFindElement (By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected String getText(By by) {
		return waitAndFindElement(by).getText();
	}

	protected void sendText (By by, String text) {
		waitAndFindElement(by).sendKeys(text);

	}
	protected void waitAndClear (By by) {
		waitAndFindElement(by).clear();

	}
	protected void clearAndSendText (By by, String text) {
		waitAndFindElement(by).clear();
		waitAndFindElement(by).sendKeys(text);
	}
	protected void assertEquals (String actual, String expected) {
		Assert.assertEquals(actual,expected, "Two texts are equal!" + "Actual: " + actual + " Expected: " + expected);
	}
	protected void assertEqualsContains (String actual, String expected) {
		Assert.assertEquals(actual, expected);;
	}
	protected void assertNotEquals (String actual, String expected) {
		Assert.assertNotEquals(actual,expected, "Two texts are not equal!" + "Actual: " + actual + " Expected: " + expected);
	}
	protected void waitVisibility (By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void scrollToElementAndClick(String visibleText) {	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	}
	
	public void scrollToElementAndSendkeys(String visibleText, String value) {	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").sendKeys(value);
	}
	
	public void scrollToElement(String by) {	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+by+"\").instance(0))");
		
}
	public void scrollToElementById(By by) {	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceIdMatches(\""+by+"\").instance(0))");
			
	}
	public static String generateRandomEmail() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString()+"@gmail.com";
		return generatedString;
	}
	public static String generateRandomString() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
		return generatedString;
	}
	protected void sleep (long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void readData(String pathData) {
		String dataFileName = pathData;
		datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
		JSONTokener tokener = new JSONTokener(datais);
		dataJson = new JSONObject(tokener);
	}
	public void tapByCordinates(int x, int y) {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(x, y)).perform();
	}
	public void tapByCordinatesForMap(int x, int y) {
		sleep(5000);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(x, y)).perform();
	}
	public void swipByCordinates(int w, int x,int y, int z ) {
		(new TouchAction(driver)).press(new PointOption().withCoordinates(w, x)).moveTo(new PointOption().withCoordinates(y, z)).release().perform();
	}
	public static String readProperties(String by) {
		Properties props = new Properties();
		String propFileName = "data.properties";
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(propFileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			props.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props.getProperty(by);
	}
	public static String getPropertryFromPom(String porpertyName) {
		String propname=System.getProperty(porpertyName);
		return propname;
	}
	
}

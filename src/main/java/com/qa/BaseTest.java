package com.qa;


import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.ThreadContext;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class BaseTest {
	//public static String userName = "maherchibani1";
	//public static String accessKey = "BnJyHoxDpCj9PQkp5wBf";
	public static String userName = "androidautomate1";
	public static String accessKey = "6iotxyTsyPhEyKqzsYfp";
	protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<AppiumDriver>();
	protected static ThreadLocal <Properties> props = new ThreadLocal<Properties>();
	protected static ThreadLocal <HashMap<String, String>> strings = new ThreadLocal<HashMap<String, String>>();
	protected static ThreadLocal <String> platform = new ThreadLocal<String>();
	protected static ThreadLocal <String> dateTime = new ThreadLocal<String>();
	protected static ThreadLocal <String> deviceName = new ThreadLocal<String>();
	private static AppiumDriverLocalService server;
	TestUtils utils = new TestUtils();
	
	  public AppiumDriver getDriver() {
		  return driver.get();
	  }
	  
	  public void setDriver(AppiumDriver driver2) {
		  driver.set(driver2);
	  }
	  
	  public Properties getProps() {
		  return props.get();
	  }
	  
	  public void setProps(Properties props2) {
		  props.set(props2);
	  }
	  
	  public HashMap<String, String> getStrings() {
		  return strings.get();
	  }
	  
	  public void setStrings(HashMap<String, String> strings2) {
		  strings.set(strings2);
	  }
	  
	  public String getPlatform() {
		  return platform.get();
	  }
	  
	  public void setPlatform(String platform2) {
		  platform.set(platform2);
	  }
	  
	  public String getDateTime() {
		  return dateTime.get();
	  }
	  
	  public void setDateTime(String dateTime2) {
		  dateTime.set(dateTime2);
	  }
	  
	  public String getDeviceName() {
		  return deviceName.get();
	  }
	  
	  public void setDeviceName(String deviceName2) {
		  deviceName.set(deviceName2);
	  }
	
	public BaseTest() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	@BeforeMethod
	public void beforeMethod() {
	//	((CanRecordScreen) getDriver()).startRecordingScreen();
	}
	
	//stop video capturing and create *.mp4 file
	@AfterMethod
	public synchronized void afterMethod(ITestResult result) throws Exception {
		String media = ((CanRecordScreen) getDriver()).stopRecordingScreen();
		
		Map <String, String> params = result.getTestContext().getCurrentXmlTest().getAllParameters();		
		String dirPath = "videos" + File.separator + params.get("platformName") + "_" + params.get("deviceName") 
		+ File.separator + getDateTime() + File.separator + result.getTestClass().getRealClass().getSimpleName();
	}
	
	@BeforeSuite
	public void beforeSuite() throws Exception, Exception {
		ThreadContext.put("traceLogs", "ServerLogs");
     	server = getAppiumService(); // -> If using Mac, uncomment this statement and comment below statement
		//server = getAppiumServerDefault(); // -> If using Windows, uncomment this statement and comment above statement
		if(!checkIfAppiumServerIsRunnning(4723)) {
			server.start();
			server.clearOutPutStreams(); // -> Comment this if you don't want to see server logs in the console
			utils.log().info("Appium server started");
		} else {
			utils.log().info("Appium server already running");
		}	
	}
	
	public boolean checkIfAppiumServerIsRunnning(int port) throws Exception {
	    boolean isAppiumServerRunning = false;
	    ServerSocket socket;
	    try {
	        socket = new ServerSocket(port);
	        socket.close();
	    } catch (IOException e) {
	    	System.out.println("1");
	        isAppiumServerRunning = true;
	    } finally {
	        socket = null;
	    }
	    return isAppiumServerRunning;
	}
	
	@AfterSuite (alwaysRun = true)
	public void afterSuite() {
		  if(server.isRunning()){
			  server.stop();
			  utils.log().info("Appium server stopped");
		  }
	}

	// for Windows
	public AppiumDriverLocalService getAppiumServerDefault() {
		return AppiumDriverLocalService.buildDefaultService();
	}

	// for Mac. Update the paths as per your Mac setup
	public AppiumDriverLocalService getAppiumService() {
		HashMap<String, String> environment = new HashMap<String, String>();
		return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("/usr/local/bin/node"))
				.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
				.usingPort(4723)
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//				.withArgument(() -> "--allow-insecure","chromedriver_autodownload")
				.withEnvironment(environment)
				.withLogFile(new File("ServerLogs/server.log")));
	}
	
  @Parameters({"build", "platformName", "os_version", "device", "systemPort", 
	  "chromeDriverPort", "wdaLocalPort", "webkitDebugProxyPort", "project", "name"})
  @BeforeTest
  public void beforeTest(String build, String platformName, String os_version, String device, String project, String name, 
		  @Optional("androidOnly")String systemPort, @Optional("androidOnly")String chromeDriverPort,
		  @Optional("iOSOnly")String wdaLocalPort, @Optional("iOSOnly")String webkitDebugProxyPort) throws Exception {
	  setDateTime(utils.dateTime());
	  setPlatform(platformName);
	  setDeviceName(device);
	  URL url;
		InputStream inputStream = null;
		InputStream stringsis = null;
		Properties props = new Properties();
		AppiumDriver driver;
		
		String strFile = "logs" + File.separator + platformName + "_" + device;
		File logFile = new File(strFile);
		if (!logFile.exists()) {
			logFile.mkdirs();
		}
		//route logs to separate file for each thread
		ThreadContext.put("ROUTINGKEY", strFile);
		utils.log().info("log path: " + strFile);
		
	  try {
		  props = new Properties();
		  String propFileName = "config.properties";
		  String xmlFileName = "strings/strings.xml";
		  
		  utils.log().info("load " + propFileName);
		  inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		  props.load(inputStream);
		  setProps(props);
		  
		  utils.log().info("load " + xmlFileName);
		  stringsis = getClass().getClassLoader().getResourceAsStream(xmlFileName);
		  setStrings(utils.parseStringXML(stringsis));
		  
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("browserstack.networkLogs", "true");
			desiredCapabilities.setCapability("browserstack.local", "true");
			desiredCapabilities.setCapability("browserstack.video", "true");
			desiredCapabilities.setCapability("disable_usage_reporting", "true");
			desiredCapabilities.setCapability("platformName", platformName);
			desiredCapabilities.setCapability("deviceName", device);
			desiredCapabilities.setCapability("os_version", os_version);
			url = new URL(props.getProperty("appiumURL"));
			switch(platformName) {
			case "Android":
				desiredCapabilities.setCapability("device", device);
				desiredCapabilities.setCapability("os_version", os_version);
				desiredCapabilities.setCapability("project", project);
				desiredCapabilities.setCapability("build", build);
				desiredCapabilities.setCapability("name", name);
				desiredCapabilities.setCapability("app", props.getProperty("appurl"));

			    driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);

				break;
			case "iOS":
				desiredCapabilities.setCapability("automationName", props.getProperty("iOSAutomationName"));
				String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
						+ File.separator + "resources" + File.separator + "app" + File.separator + "AccorHotelsApp.app";
			//	String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
				utils.log().info("appUrl is" + iOSAppUrl);
				desiredCapabilities.setCapability("bundleId", props.getProperty("iOSBundleId"));
				desiredCapabilities.setCapability("wdaLocalPort", wdaLocalPort);
				desiredCapabilities.setCapability("webkitDebugProxyPort", webkitDebugProxyPort);
				desiredCapabilities.setCapability("app", iOSAppUrl);

				driver = new IOSDriver(url, desiredCapabilities);
				break;
			default:
				throw new Exception("Invalid platform! - " + platformName);
			}
			setDriver(driver);
			utils.log().info("driver initialized: " + driver);
	  } catch (Exception e) {
		  utils.log().fatal("driver initialization failure. ABORT!!!\n" + e.toString());
		  throw e;
	  } finally {
		  if(inputStream != null) {
			  inputStream.close();
		  }
		  if(stringsis != null) {
			  stringsis.close();
		  }
	  }
  }
  public void closeApp() {
	  ((InteractsWithApps) getDriver()).closeApp();
  }
  
  public void launchApp() {
	  ((InteractsWithApps) getDriver()).launchApp();
  }
  public void backgroundLaunchApp() {
	  ((InteractsWithApps) getDriver()).runAppInBackground(Duration.ofMillis(3000));
  }
 
  @AfterTest (alwaysRun = true)
  public void afterTest() {
		  if(getDriver() != null){
			  getDriver().quit();
			  
		  }
  }
}

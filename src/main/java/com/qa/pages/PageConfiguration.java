package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.BasePage;
import com.qa.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageConfiguration extends BasePage{
	public PageConfiguration(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final By choosConfPagePayment=By.id("com.accor.appli.hybrid.inhouse:id/newPaymentPageSwitch");
	public static final By EnvRec1Element=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	public static final By EnvRec2Element=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
	public static final By EnvRec3Element=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	public static final By EnvMockElement=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
	public static final By loginButton =By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By close=By.id("com.accor.appli.hybrid.inhouse:id/closeFrameLayout");
	public static final By  cookies=By.id("com.accor.appli.hybrid.inhouse:id/btn_accept_cookies");
	public static final By envSpinner=By.id("com.accor.appli.hybrid.inhouse:id/envSpinner");
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final String logout="LOG OUT";
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public void acessApplication () {
//		try {
//			waitAndClick(loginButton);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		try {
			waitAndClick(cookies);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			waitAndClick(close);
		} catch (Exception e) {
			
		}

	}
	public void choosePageConfPayment () {
		waitAndClick(choosConfPagePayment);
	}
	public void setEnv(String envName) {
		waitAndClick(envSpinner);
		switch (envName) {
		case "mock":
			waitAndClick(EnvMockElement);
			break;
		case "rec1":
			waitAndClick(EnvRec1Element);
			break;
		case "rec2":
			waitAndClick(EnvRec2Element);
			break;
		case "rec3":
			waitAndClick(EnvRec3Element);
			break;
		default:
			waitAndClick(EnvRec2Element);
			break;
		}
	}
	public void connexionOrDeconnexion () {
		if(isElementPresent(logon)) {
			System.out.println("is not connected you can choose your hotel");
		}
		else {
			waitAndClick(account);
			scrollToElementAndClick(logout);
			waitAndClick(okButton);
		}

	}
	public  void accessEnvWithoutToggle(){
		acessApplication();
	}	
	public  void accessEnvWithToggle(){
		choosePageConfPayment();
		acessApplication();
	}	
}

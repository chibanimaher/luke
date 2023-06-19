package com.qa.pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.BasePage;
import com.qa.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageTestRoomSelection extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	public PageTestRoomSelection(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final By removeAdulte=By.xpath("//android.widget.ImageButton[@content-desc=\"− remove one adult per room\"]");
	public static final By removeChildreen=By.xpath("//android.widget.ImageButton[@content-desc=\"− remove one child per room\"]");
	public static final By messagemaxChildreen=By.id("com.accor.appli.hybrid.inhouse:id/mSnackBarMessage");
	public static final By numberchildren=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add one child per room\"]");
	public static final By numberAdulte=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add one adult per room\"]");
	public static final By roomOption=By.id("com.accor.appli.hybrid.inhouse:id/paxTextField");
	public static final By closeHotel=By.xpath("//android.widget.ImageButton[@content-desc=\"go up a level\" or @content-desc=\"Navigate up\"]");
	public static final By publicPrice=By.id("com.accor.appli.hybrid.inhouse:id/referencePriceTextView");
	public static final By book=By.id("com.accor.appli.hybrid.inhouse:id/bookingButton");
	public static final String checkbox="I accept the terms and conditions of service and the booking rate terms and conditions";
	public static final String CSC="CSC";
	public static final String walletCard="wallet";
	public static final String submit="SUBMIT";	
	public static final String legalNotice="LEGAL NOTICES";
	public static final String acceptConditions="I agree to receive news and marketing communications from Accor group brands and the Accor loyalty programme via email.";
	public static final By fromPrice=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By seeRoom=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By selectedTitle=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By loginButton=By.id("com.accor.appli.hybrid.inhouse:id/logInButton");
	public static final By loginToAccount=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button");
	public static final By title=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.Spinner");
	public static final By firstname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	public static final By surname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final String continueAsGuest="CONTINUE AS A GUEST";
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By password=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By logOnButton=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By confirmDestination=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	public static final By villeDestination=By.id("com.accor.appli.hybrid.inhouse:id/locationEditText");
	public static final By destination=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final By summuryPage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	public static final By labelStay=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By stayPlusswitch=By.id("com.accor.appli.hybrid.inhouse:id/stayPlusSwitch");
	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */

	public void labelInsertUserPriceStayPlus() {
		readData("data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(stayPlusswitch);
		try {
			scrollToElement(dataJson.getJSONObject("en").getString("hotelName"));
			isElementPresent(labelStay);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void labelInsertUserPriceNoStayPlus() {
		readData("data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulteAndRoom();
		waitAndClick(search);
		waitAndClick(firstHotel);
		homepage.SeeRoom();
		try {
			if(isElementPresent(labelStay)) {
				System.out.println("Test KO > label stays it be not displayed");
			}
			else {
				System.out.println("Test OK >label stays is not displayed");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void labelInsertUserPriceStandard() {
		readData("data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulteAndRoom();
		waitAndClick(search);
		waitAndClick(firstHotel);
		homepage.SeeRoom();
		if(isElementPresent(fromPrice)) {
			String text=getText(fromPrice).substring(0, 4);
			System.out.println(text);
			String expectedtext=dataJson.getJSONObject("en").getString("from");
			assertEquals(text, expectedtext);
		}
	}

	public void affichageTarifAccorPlus() {
		readData("data/roomselection/RoomPricePublicAccorPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		scrollToElement(legalNotice);
		readData("data/roomselection/RoomPricePublicAccorPlus.json");
		scrollToElementAndClick(walletCard);
		scrollToElementAndSendkeys(CSC,dataJson.getJSONObject("en").getString("cardCVC"));
		scrollToElementAndClick(checkbox);
		waitAndClick(book);
		payement.verifyReservation();
	}
	public void affichagePrixPublic() {
		readData("data/roomselection/PricePublicFigmaGuest.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(firstHotel);
		try {
			waitAndClick(closeHotel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			homepage.SeeRoom();
			isElementPresent(publicPrice);
			String publicprice=getText(publicPrice);
			System.out.println("the public price is displayed and this value is " +publicprice);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * verify if message is dsplayed for max number of chihldreen
	 */
	public void engineAddChildreen() {
		waitAndClick(roomOption);
		for(int i=0;i<4;i++) {
			waitAndClick(numberchildren);	
		}
		if(isElementPresent(messagemaxChildreen)) {
			String message=getText(messagemaxChildreen);
			System.out.println("the message is displayed  > " + message);
		}
		for(int i=0;i<3;i++) {
			waitAndClick(removeChildreen);
		}
		elementNotPresent(messagemaxChildreen);
	}
	public void engineMaxAdultes() {
		waitAndClick(roomOption);
		for(int i=0;i<7;i++) {
			waitAndClick(numberAdulte);	
		}
		if(isElementPresent(messagemaxChildreen)) {
			String message=getText(messagemaxChildreen);
			System.out.println("the message is displayed  > " + message);
		}
		for(int i=0;i<7;i++) {
			waitAndClick(removeAdulte);
		}
		elementNotPresent(messagemaxChildreen);
	}
}

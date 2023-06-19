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

public class PageTestSummury extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	PageConfiguration pageConf= new PageConfiguration(driver);
	public PageTestSummury(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final By capaciteText=By.id("com.accor.appli.hybrid.inhouse:id/textinput_error");
	public static final By choosecard=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By backButton=By.xpath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]");
	public static final String submit="SUBMIT";	
	public static final String acceptConditions="I agree to receive news and marketing communications from Accor group brands and the Accor loyalty programme via email.";
	public static final By numberCaractere=By.id("com.accor.appli.hybrid.inhouse:id/textinput_counter");
	public static final String englisComment="Please enter your message in English.";
	public static final By blocComment=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final String commentBloc="Message to the hotel";
	public static final String legalNotice="Legal notices";
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
	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */

	public void affichagePageSummury() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		homepage.searchHotels();
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		scrollToElementAndClick(continueAsGuest);
		if(isElementPresent(summuryPage)) {
			System.out.println("we are in the summury page");
		}
	}
	public void verifyTitlePageSummury() {
		pageConf.accessEnvWithoutToggle();
		readData("data/payment/PaymentConnectedUserBookingRejectedInvalidInput.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		String title=getText(selectedTitle);
		if(title.isEmpty()) {
			System.out.println("the champ title is not set");
		}
		else {
			System.out.println("the champ title is selected");
		}
	}
	public void commentPageSummury() {
		pageConf.accessEnvWithoutToggle();
		readData("data/payment/CommentSummury.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		readData("data/payment/CommentSummury.json");
		scrollToElement(legalNotice);
		scrollToElementAndClick(commentBloc);
		String actualMessage=getText(blocComment);
		String expectedMessage=dataJson.getJSONObject("en").getString("message");
		assertEquals(actualMessage, expectedMessage);
		String expectedCaracter=dataJson.getJSONObject("en").getString("caracter");
		sendText(blocComment, expectedMessage);
		String actualCaracter=getText(numberCaractere);
		assertNotEquals(actualCaracter, expectedCaracter);
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		isElementPresent(choosecard);
		waitAndClick(backButton);
		String title=getText(blocComment);
		if(title.isEmpty()) {
			System.out.println("the champ title is not set");
		}
		else {
			System.out.println("Test Ok > the champ title is set");
		}
	}
	public void restrictionCommentPageSummury() {
		pageConf.accessEnvWithoutToggle();
		readData("data/payment/RestrictionCommentSummury.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		readData("data/payment/RestrictionCommentSummury.json");
		scrollToElement(legalNotice);
		sendText(blocComment, dataJson.getJSONObject("en").getString("message"));
		isElementPresent(capaciteText);
		clearAndSendText(blocComment, dataJson.getJSONObject("en").getString("smallmessage"));
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		isElementPresent(choosecard);
	}
	public void adresseFacturationPageSummury() {
		pageConf.accessEnvWithoutToggle();
		readData("data/payment/AdresseFacturationSummury.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		readData("data/payment/AdresseFacturationSummury.json");
		scrollToElement(legalNotice);
		sendText(blocComment, dataJson.getJSONObject("en").getString("message"));
		isElementPresent(capaciteText);
		clearAndSendText(blocComment, dataJson.getJSONObject("en").getString("smallmessage"));
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		isElementPresent(choosecard);
	}
}

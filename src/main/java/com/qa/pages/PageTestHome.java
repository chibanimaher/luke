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

public class PageTestHome extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	PageConfiguration pageConf= new PageConfiguration(driver);
	public PageTestHome(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	static int i=1;
	//Mobile Elements
	public static final By roomOption=By.id("com.accor.appli.hybrid.inhouse:id/paxTextField");
	public static final By validOrCancel=By.id("com.accor.appli.hybrid.inhouse:id/bookingManageButton");
	public static final By daysOut=By.id("com.accor.appli.hybrid.inhouse:id/bookingDateOutDayTextView");
	public static final By checkOut=By.id("com.accor.appli.hybrid.inhouse:id/bookingDateOutMonthTextView");
	public static final By daysIn=By.id("com.accor.appli.hybrid.inhouse:id/bookingDateInDayTextView");
	public static final By checkIn=By.id("com.accor.appli.hybrid.inhouse:id/bookingDateInMonthTextView");
	public static final By logoHotel=By.id("com.accor.appli.hybrid.inhouse:id/bookingLogoImageView");
	public static final String planStays="PLAN YOUR STAY";
	public static final By nextBooking=By.id("com.accor.appli.hybrid.inhouse:id/nextBookingTitleTextView");
	public static final By closeBtn=By.xpath("//android.widget.ImageButton[@content-desc=\"Close\"]");
	public static final By arrondMe=By.id("com.accor.appli.hybrid.inhouse:id/contentTextView");
	public static final By listHotelDisplayed=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout["+i+"]");
	public static final By btnClose=By.id("com.accor.appli.hybrid.inhouse:id/imageViewHeaderClear");
	public static final By expirationDate=By.id("com.accor.appli.hybrid.inhouse:id/cardExpirationDateTextView");
	public static final By close=By.id("com.accor.appli.hybrid.inhouse:id/closeFrameLayout");
	public static final String logOut="LOG OUT";
	public static final By backButton=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	public static final By carteHome=By.id("com.accor.appli.hybrid.inhouse:id/myCardIcon");
	public static final By statusCard =By.id("com.accor.appli.hybrid.inhouse:id/myStatusCardStatusTextView");
	public static final By blocCard =By.id("com.accor.appli.hybrid.inhouse:id/statusCardLayout");
	public static final String appelButton="GIVE US A CALL";
	public static final By searchDestinationButton=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By confirmDestination=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	public static final By villeDestination=By.id("com.accor.appli.hybrid.inhouse:id/locationEditText");
	public static final By destination=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final By searchButtonCurrency =By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.view.ViewGroup/android.widget.TextView");
	public static final By confirmButton=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By loginButton=By.id("com.accor.appli.hybrid.inhouse:id/logInButton");
	public static final By loginToAccount=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button");
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By password=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By logOnButton=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By filterCurrency=By.id("com.accor.appli.hybrid.inhouse:id/filterTextView");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");

	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */

	public void searchEngine() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/SearchDestination.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		if(isElementPresent(search)) {
			System.out.println("the button search is present");
		}
	}

	/**
	 * search and validation pop destination 
	 * @param get data from JSON File and put in the text
	 */

		public void searchEngineValidation() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/SearchDestination.json");
			waitAndClick(destination);
			if(isElementPresent(villeDestination)) {
				System.out.println("the pop up search is present");
			}		
	}
		/**
		 * to refer with verfication qr code
		 */
		public void affichageQrCode() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/ExpirationDateGoldUser.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			waitAndClick(carteHome);
	}
		/**
		 * to refer with verfication qr code
		 */
		public void resetSearchEngine() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
	        homepage.searchHotels();
	        homepage.addNumberAdulteAndRoom();
	        waitAndClick(search);
	        waitAndClick(backButton);
	        waitAndClick(account);
			scrollToElementAndClick(logOut);
			waitAndClick(okButton);
			waitAndClick(close);
			if(isElementPresent(logOnButton)) {
				System.out.println("we are not connected");
			}
	}
		public void expirationDateSilver() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/ExpirationDatesilverUser.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			waitAndClick(carteHome);
			String dateExpiration =getText(expirationDate);
			System.out.println("the date expiration of this card is "  +dateExpiration);
			
			
	}
		public void expirationDateGold() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/ExpirationDateGoldUser.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			waitAndClick(carteHome);
			String dateExpiration =getText(expirationDate);
			System.out.println("the date expiration of this card is "  +dateExpiration);
	}
		public void expirationDatePlatinum() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/ExpirationDatePlatinumUser.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			waitAndClick(carteHome);
			String dateExpiration =getText(expirationDate);
			System.out.println("the date expiration of this card is "  +dateExpiration);
	}
		public void expirationDateClassic() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/ExpirationDateClassicUser.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			waitAndClick(carteHome);
	}
		public void expirationDateDiamond() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/ExpirationDateDiamond.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			waitAndClick(carteHome);
			String dateExpiration =getText(expirationDate);
			System.out.println("the date expiration of this card is "  +dateExpiration);
	}
		public void expirationDateLimitlesss() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/DateLimitlessUser.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			waitAndClick(carteHome);
			String dateExpiration =getText(expirationDate);
			System.out.println("the date expiration of this card is "  +dateExpiration);
	}
		public void ecranDestination() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/SearchDestination.json");
			waitAndClick(destination);
			sendText(villeDestination, dataJson.getJSONObject("en").getString("destinationCaracter"));
			isElementPresent(btnClose);
			isElementPresent(confirmDestination);
			clearAndSendText(villeDestination, dataJson.getJSONObject("en").getString("destinationThreeCaracter"));
			for (i = 1; i < 3; i++) {
				isElementPresent(listHotelDisplayed);
			}	
			waitAndClick(confirmDestination);
			waitAndClick(search);
			waitAndClick(backButton);
			String title=getText(destination);
			if(title.isEmpty()) {
				System.out.println("the champ destination is not set");
			}
			else {
				System.out.println("the champ destination is selected");
			}
			waitAndClick(destination);
			String ArrondMe=dataJson.getJSONObject("en").getString("position");
			String expectedChamp=getText(arrondMe);
			assertEquals(ArrondMe, expectedChamp);
			String champ=getText(villeDestination);
			if(champ.isEmpty()) {
				System.out.println("the champ destination is empty");
			}
			else {
				System.out.println("the champ title is not empty");
			}
			waitAndClick(closeBtn);
			isElementPresent(destination);
	}
		public void headerDestination() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/SearchDestination.json");
			waitAndClick(destination);
			isElementPresent(closeBtn);
			sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
			for (i = 1; i < 3; i++) {
				isElementPresent(listHotelDisplayed);
			}
			waitAndClear(villeDestination);
			String title=getText(villeDestination);
			if(title.isEmpty()) {
				System.out.println("the champ destination is empty");
			}
			else {
				System.out.println("the champ destination is not empty");
			}
			elementNotPresent(listHotelDisplayed);
		}
		public void logosBrands() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/LogosBrands.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			isElementPresent(nextBooking);
			scrollToElementAndClick(planStays);
			isElementPresent(logoHotel);
			isElementPresent(daysIn);
			isElementPresent(checkIn);
			isElementPresent(daysOut);
			isElementPresent(checkOut);
			isElementPresent(validOrCancel);
			
		}
		public void resetMoteurRecherche() {
			pageConf.accessEnvWithoutToggle();
			readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);
			homepage.searchHotels();
			homepage.addNumberAdulteAndRoom();
			waitAndClick(search);
			waitAndClick(backButton);
			String champDestinationOld=getText(destination);
			String compositionRoomOld=getText(roomOption);
			waitAndClick(account);
			scrollToElementAndClick(logOut);
			waitAndClick(okButton);
			waitAndClick(close);
			String champDestinationNew=getText(destination);
			String compositionRoomNew=getText(roomOption);
			assertNotEquals(champDestinationOld, champDestinationNew);
			assertNotEquals(compositionRoomOld, compositionRoomNew);
			
		}
}

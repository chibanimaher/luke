package com.qa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.BasePage;
import com.qa.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageTestBooking extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	PageConfiguration pageConf= new PageConfiguration(driver);
	public PageTestBooking(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final String backHomePage="BACK TO HOME PAGE";
	public static final String cartePro="Ma Carte Pro";
	public static final String confirmButtonCalender="CONFIRM";
	public static final By verifyReservationStays=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.LinearLayout");
	public static final By dateButton=By.id("com.accor.appli.hybrid.inhouse:id/datesTextField");
	public static final By dateIn=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[2]/android.widget.TextView");
	public static final By dateOut=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[5]/android.widget.TextView");
	public static final String logOut="LOG OUT";
	public static final String submit="SUBMIT";	
	public static final String logOn="LOG ON";
	public static final String bankCards="Bank cards";
	public static final String staysButton="Stays";
	public static final By buttonStays=By.id("com.accor.appli.hybrid.inhouse:id/navigation_bar_item_large_label_view");
	public static final String continueAsGuest="CONTINUE AS A GUEST";
	public static final By firstPriceRoom=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By emailSumm=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final By addPoint=By.id("com.accor.appli.hybrid.inhouse:id/addInputNumberButton");
	public static final By telephone=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By messageConfirmation=By.id("com.accor.appli.hybrid.inhouse:id/statusTextView");
	public static final String cvc="12/22";
	public static final String CSCard="CSC";
	public static final By laterButton=By.id("com.accor.appli.hybrid.inhouse:id/rateLaterButton");
	public static final String cardnumber="Card number";
	public static final String cardname="Visa";
	public static final String codenumber="5017679200900505";
	public static final String cardholder="Cardholder";
	public static final String expirationdate="Expiry date";
	public static final By mobilenumber=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By devise=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final String acceptConditions="I agree to receive news and marketing communications from Accor group brands and the Accor loyalty programme via email.";
	public static final String checkbox="I accept the terms and conditions of service and the booking rate terms and conditions";
	public static final By choosecard=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By book=By.id("com.accor.appli.hybrid.inhouse:id/bookingButton");
	public static final By visacard=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/itemSelectorSearchEditText");
	public static final By validSearch=By.id("com.accor.appli.hybrid.inhouse:id/itemSelectorItemTextView");
	public static final By nameOfCard=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]");
	public static final By addThisCard=By.id("com.accor.appli.hybrid.inhouse:id/cardTypeAddButton");
	public static final By cardNumber=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By holderName=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By expiryDate=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	public static final By CSC=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final By cardName=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
	public static final By selectBankCard=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By addBankCard=By.id("com.accor.appli.hybrid.inhouse:id/cardAddBtn");
	public static final By seeMore=By.id("com.accor.appli.hybrid.inhouse:id/bookingSeeDetailsButton");
	public static final By close=By.id("com.accor.appli.hybrid.inhouse:id/closeFrameLayout");
	public static final By pointReward= By.id("com.accor.appli.hybrid.inhouse:id/rewardPointTextView");
	public static final By searchDestinationButton=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By confirmDestination=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	public static final By villeDestination=By.id("com.accor.appli.hybrid.inhouse:id/locationEditText");
	public static final By destination=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final By searchButtonCurrency =By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.view.ViewGroup/android.widget.TextView");
	public static final By confirmButton=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By usDollar=By.id("com.accor.appli.hybrid.inhouse:id/currencySelectorItemTextView");
	public static final By searchButton =By.id("com.accor.appli.hybrid.inhouse:id/currencySelectorSearchEditText");
	public static final By past =By.xpath("//android.widget.LinearLayout[@content-desc='Past']");
	public static final By cancelled =By.xpath("//android.widget.LinearLayout[@content-desc=\"Cancelled\"]");
	public static final By awards =By.id("com.accor.appli.hybrid.inhouse:id/awardsTextView");
	public static final By statusCard =By.id("com.accor.appli.hybrid.inhouse:id/myStatusCardStatusTextView");
	public static final By blocCard =By.id("com.accor.appli.hybrid.inhouse:id/statusCardLayout");
	public static final By typeAccount =By.id("com.accor.appli.hybrid.inhouse:id/statusTextView");
	public static final By loginButton=By.id("com.accor.appli.hybrid.inhouse:id/logInButton");
	public static final By loginToAccount=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button");
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By password=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By logOnButton=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */
	public void authentificationLCAH() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/userlogged/BookingWithPoints.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		
	}
	/**
	 * serach hotel and booking end to end without connexion to ,account
	 */
	public void multiRoom() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		homepage.searchHotels();
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		scrollToElementAndClick(continueAsGuest);
		summury.RemplirFormulaire();
		payement.Payement();
	}
	/**
	 * serach hotel , connexion to account , payement
	 */
	public void loginInFromJoinScreen() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens2WithGold.json");
		homepage.searchHotels();
		homepage.addNumberAdulte();
		homepage.chooseHotel();
		scrollToElementAndClick(logOn);
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens2WithGold.json");
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		waitAndClick(choosecard);
		waitAndClick(visacard);
		scrollToElementAndSendkeys(cardnumber,dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElementAndClick(checkbox);
		waitAndClick(book);
		payement.verifyReservation();
	}
	/**
	 * search hotel, adulte with children , payement
	 */
	public void havingChildrenAndAdultes() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		homepage.searchHotels();
		homepage.addNumberAdulteAndChildren();
		homepage.chooseHotel();
		scrollToElementAndClick(continueAsGuest);
		summury.RemplirFormulaire();
		payement.Payement();
	}
	/**
	 * serach hotel , only adulte , payement 
	 */
	public void onlyAdultes() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		homepage.searchHotels();
		homepage.addNumberAdulte();
		homepage.chooseHotel();
		scrollToElementAndClick(continueAsGuest);
		summury.RemplirFormulaire();
		payement.Payement();
	}
	/**
	 * connexion to account , serach hotel, payement with point
	 */
	public void pointPayementAtHotel() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/userlogged/BookingWithPointsPaymenAtTheHotel.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		String initialprice =getText(firstPriceRoom);
		waitAndClick(addPoint);
		String priceafterreduction =getText(firstPriceRoom);
		assertNotEquals(initialprice, priceafterreduction);
		
	}
	public void checkIfLinkDisplayed() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/userlogged/OnlineCheckinStay.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(dateButton);
		waitAndClick(dateIn);
		waitAndClick(dateOut);
		scrollToElementAndClick(confirmButtonCalender);
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		payement.PayementSpecialSamsung();
		payement.verifyReservation();
		scrollToElementAndClick(backHomePage);
		waitAndClick(laterButton);
		scrollToElementAndClick(staysButton);
		try {
			waitVisibility(verifyReservationStays);
			readData("data/booking/userlogged/OnlineCheckinStay.json");
			scrollToElement(dataJson.getJSONObject("en").getString("hotelName"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}

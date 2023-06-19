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

public class PageTestPayment extends BasePage{

	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	PageConfiguration pageConf= new PageConfiguration(driver);
	public PageTestPayment(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final By dateButton=By.id("com.accor.appli.hybrid.inhouse:id/datesTextField");
	public static final By datein=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[2]/android.widget.TextView");
	public static final By dateOut=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[5]/android.widget.TextView");
	public static final By cgv=By.id("com.accor.appli.hybrid.inhouse:id/cgvAnnulationTextView");
	public static final String HomePageText="BACK TO HOME PAGE";
	public static final By HomePageButton=By.id("com.accor.appli.hybrid.inhouse:id/homeButton");
	public static final By iconConfirmation=By.id("com.accor.appli.hybrid.inhouse:id/statusImageView");
	public static final By statusReservation=By.id("com.accor.appli.hybrid.inhouse:id/statusTextView");
	public static final By choosecard=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By book=By.id("com.accor.appli.hybrid.inhouse:id/bookingButton");
	public static final By visacard=By.id("com.accor.appli.hybrid.inhouse:id/warrantySwitch");
	public static final String cvc="12/22";
	public static final String cardnumber="Card number";
	public static final String cardname="Visa";
	public static final String codenumber="5017679200900505";
	public static final String cardholder="Cardholder";
	public static final String expirationdate="Expiry date";
	public static final String checkbox="I accept the terms and conditions of service and the booking rate terms and conditions";
	public static final By garantieToggle=By.id("com.accor.appli.hybrid.inhouse:id/warrantySwitch");
	public static final By deviseD=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By seeRoom=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By seeRate=By.id("com.accor.appli.hybrid.inhouse:id/roomButtonToRate");
	public static final By selectRate=By.id("com.accor.appli.hybrid.inhouse:id/chooseButton");
	public static final By priceBasketDinar=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By searchButtonCurrency =By.xpath("//android.widget.FrameLayout[@content-desc='Search']/android.view.ViewGroup/android.widget.TextView");
	public static final By confirmButton=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By filterCurrency=By.id("com.accor.appli.hybrid.inhouse:id/filterTextView");
	public static final By closeFilter=By.xpath("//android.widget.ImageButton[@content-desc=\"Close\"]");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By switchCurrency=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.Button");
	public static final By usDinar=By.id("com.accor.appli.hybrid.inhouse:id/currencySelectorItemTextView");
	public static final By searchButton =By.id("com.accor.appli.hybrid.inhouse:id/currencySelectorSearchEditText");
	public static final By deviseDollar=By.id("com.accor.appli.hybrid.inhouse:id/currencyLabelTextView");
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By compositionRoom=By.id("com.accor.appli.hybrid.inhouse:id/basketDescriptionCompositionTextView");
	public static final By dateCheckOut=By.id("com.accor.appli.hybrid.inhouse:id/basketDescriptionDateOutTextView");
	public static final By dateIn=By.id("com.accor.appli.hybrid.inhouse:id/basketDescriptionDateInTextView");
	public static final By dateEntree=By.id("com.accor.appli.hybrid.inhouse:id/dateInTextView");
	public static final By dateSortie=By.id("com.accor.appli.hybrid.inhouse:id/dateOutTextView");
	public static final By compositionreservation=By.id("com.accor.appli.hybrid.inhouse:id/nightsCountTextView");
	public static final By nameHotel=By.id("com.accor.appli.hybrid.inhouse:id/basketDescriptionHotelNameTextView");
	public static final By numberReservation=By.id("com.accor.appli.hybrid.inhouse:id/descriptionTextView");
	public static final By priceresravtion=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final String submit="SUBMIT";	
	public static final String acceptConditions="I agree to receive news and marketing communications from Accor group brands and the Accor loyalty programme via email.";
	public static final By selectThisRate=By.id("com.accor.appli.hybrid.inhouse:id/chooseButton");
	public static final By backPopup=By.id("android:id/button1");
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
	public static final By firstPriceRoom=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By emailSumm=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final By addPoint=By.id("com.accor.appli.hybrid.inhouse:id/addInputNumberButton");
	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */
	public void  PaymentAtHotelAndVerifyInformation() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BookingOK_OptionalWarranty_SwitchON.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		scrollToElementAndClick(continueAsGuest);
		summury.RemplirFormulaire();
		scrollToElement(checkbox);
		waitAndClick(garantieToggle);
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(choosecard);
		waitAndClick(visacard);
		scrollToElementAndSendkeys(cardnumber, dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElementAndClick(checkbox);
		waitAndClick(book);
		//to activate toggle
		String taken=getText(statusReservation);
		System.out.println("the status of reservation is " +taken);
		isElementPresent(iconConfirmation);
		String pricereserv=getText(numberReservation);
		System.out.println("the number of reservation is " +pricereserv);
		String datein=getText(dateEntree);
		System.out.println("the date of check in  is " +datein);
		String dateOut=getText(dateSortie);
		System.out.println("the date of check out  is " +dateOut);
		String informationRoom=getText(compositionreservation);
		System.out.println("the composition of room  is " +informationRoom);
		scrollToElement(HomePageText);
		isElementPresent(HomePageButton);
		isElementPresent(cgv);
	}

	public void manualOnline() {
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
	public void manualOnlineVerifBasket() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/TestPayment.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		String pricereserv=getText(priceresravtion);
		System.out.println("the price of reservation is " +pricereserv);
		String nameHot=getText(nameHotel);
		System.out.println("the name of hotel is " +nameHot);
		String datein=getText(dateIn);
		System.out.println("the date of check in  is " +datein);
		String dateOut=getText(dateCheckOut);
		System.out.println("the date of check out  is " +dateOut);
		String informationRoom=getText(compositionRoom);
		System.out.println("the composition of room  is " +informationRoom);
	}
	public void presenceAndAppearance() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/PresenceElement.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		String pricereserv=getText(priceresravtion);
		System.out.println("the price of reservation is " +pricereserv);
		String nameHot=getText(nameHotel);
		System.out.println("the name of hotel is " +nameHot);
		String datein=getText(dateIn);
		System.out.println("the date of check in  is " +datein);
		String dateOut=getText(dateCheckOut);
		System.out.println("the date of check out  is " +dateOut);
		String informationRoom=getText(compositionRoom);
		System.out.println("the composition of room  is " +informationRoom);
	}
	public void basketDisplayCustomerCurrency() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/BasketDisplayCurrency.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulteAndRoom();
		readData("data/booking/guestuser/BasketDisplayCurrency.json");
		waitAndClick(search);
		waitAndClick(filterCurrency);
		waitAndClick(switchCurrency);
		sendText(searchButton, dataJson.getJSONObject("en").getString("currency"));
		waitAndClick(usDinar);
		waitAndClick(confirmButton);
		String devise =getText(deviseDollar);
		String expectedevise=dataJson.getJSONObject("en").getString("devise");
		assertEquals(devise, expectedevise);
		waitAndClick(closeFilter);
		waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		waitAndClick(selectRate);
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		String dollar =getText(deviseD).substring(0,3);
		System.out.println("the price of reservation is " + dollar );
		String expectedstatus=dataJson.getJSONObject("en").getString("devise");
		assertEqualsContains(dollar, expectedstatus);
		String pricereserv=getText(priceresravtion);
		System.out.println("the price of reservation is " +pricereserv);
		String nameHot=getText(nameHotel);
		System.out.println("the name of hotel is " +nameHot);
		String datein=getText(dateIn);
		System.out.println("the date of check in  is " +datein);
		String dateOut=getText(dateCheckOut);
		System.out.println("the date of check out  is " +dateOut);
		String informationRoom=getText(compositionRoom);
		System.out.println("the composition of room  is " +informationRoom);
	}
	public void basketDisplayCustomerCurrencyEnEuro() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/CustomerCurrencyEuro.json");
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
		waitAndClick(filterCurrency);
		waitAndClick(switchCurrency);
		readData("data/booking/guestuser/CustomerCurrency.json");
		sendText(searchButton, dataJson.getJSONObject("en").getString("currency"));
		waitAndClick(usDinar);
		waitAndClick(confirmButton);
		String devise =getText(deviseDollar);
		String expectedevise=dataJson.getJSONObject("en").getString("devise");
		assertEquals(devise, expectedevise);
		waitAndClick(closeFilter);
		waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		waitAndClick(selectRate);
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		String dollar =getText(deviseD).substring(0,3);
		System.out.println("the price of reservation is " + dollar );
		String expectedstatus=dataJson.getJSONObject("en").getString("devise");
		assertEqualsContains(dollar, expectedstatus);
	}
	public void basketDisplayCustomerDifferentInEuro() {
		pageConf.accessEnvWithoutToggle();
		readData("data/booking/guestuser/CustomerCurrency.json");
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
		waitAndClick(filterCurrency);
		waitAndClick(switchCurrency);
		readData("data/booking/guestuser/CustomerCurrencyEuro.json");
		sendText(searchButton, dataJson.getJSONObject("en").getString("currency"));
		waitAndClick(usDinar);
		waitAndClick(confirmButton);
		String devise =getText(deviseDollar);
		String expectedevise=dataJson.getJSONObject("en").getString("devise");
		assertEquals(devise, expectedevise);
		waitAndClick(closeFilter);
		waitAndClick(firstHotel);
		homepage.SeeRoom();
		waitAndClick(seeRate);
		waitAndClick(selectRate);
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		String dollar =getText(deviseD).substring(0,3);
		System.out.println("the price of reservation is " + dollar );
		String expectedstatus=dataJson.getJSONObject("en").getString("devise");
		assertEqualsContains(dollar, expectedstatus);
	}
	public void saveCardBank() {
		pageConf.accessEnvWithToggle();
		readData("data/payment/MaCarteCb.json");
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
		payement.PayementToggle();
	}
	public void controlSurfacePayment() {
		//pageConf.setEnv(getPropertryFromPom("envName"));
		pageConf.accessEnvWithToggle();
		readData("data/payment/MaCarteCb.json");
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
		payement.controlSurface();
	}
	public void reservationDsp() {
		pageConf.accessEnvWithToggle();
		readData("data/payment/reservationDSP2.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(dateButton);
		waitAndClick(datein);
		waitAndClick(dateOut);
		homepage.chooseHotel();
		scrollToElementAndClick(acceptConditions);
		scrollToElementAndClick(submit);
		payement.controlSurface();
	}
}

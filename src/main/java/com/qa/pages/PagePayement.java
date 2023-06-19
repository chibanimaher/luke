package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.internal.Utils;

import com.aventstack.extentreports.Status;
import com.qa.BasePage;
import com.qa.Global;
import com.qa.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PagePayement extends BasePage {
	int x=135;
	int y=1597;
	public PagePayement(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static final By visaCard=By.id("com.accor.appli.hybrid.inhouse:id/cgvRoomText");
	public static final By acceptLegalTerm=By.id("com.accor.appli.hybrid.inhouse:id/legalTermsSwitch");
	public static final By finaliseYourBooking=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
	public static final By saveCard=By.id("com.accor.appli.hybrid.inhouse:id/addCardSwitch");
	public static final By messageConfirmation=By.id("com.accor.appli.hybrid.inhouse:id/statusTextView");
	public static final String legalNotice="Legal notices";
	public static final String finaliseBooking="Sum payable to the hotel";
	public static final String textSaveCard="Save this card for the next time I book OFF";
	public static final String CSC="CSC";
	public static final String cvc="12/22";
	public static final String nameCard="Card name";
	public static final String cardnumber="Card number";
	public static final String cardname="Visa";
	public static final String codenumber="5017679200900505";
	public static final String cardholder="Cardholder";
	public static final String expirationdate="Expiry date";
	public static final By devise=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final String checkbox="I accept the terms and conditions of service and the booking rate terms and conditions";
	public static final By choosecard=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	public static final By book=By.id("com.accor.appli.hybrid.inhouse:id/bookingButton");
	public static final By paymentBooking=By.id("com.accor.appli.hybrid.inhouse:id/paymentButton");
	public static final By visacard=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");




	/**
	 * set coordinates card bank 
	 */
	public void Payement() {
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(choosecard);
		waitAndClick(visacard);
		scrollToElementAndSendkeys(cardnumber, dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElementAndClick(checkbox);
		waitAndClick(book);
		verifyReservation();
	}
	public void PayementSpecialSamsung() {
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(choosecard);
		sleep(Global.timeOut);
		tapByCordinates(x,y);
		scrollToElementAndSendkeys(cardnumber, dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElementAndClick(checkbox);
		waitAndClick(book);
		verifyReservation();
	}
	public void PayementToggle() {
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(choosecard);
		int x=135;
		int y=1308;
		sleep(Global.timeOut);
		tapByCordinates(x,y);
		scrollToElementAndSendkeys(cardnumber, dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElement(textSaveCard);
		isElementPresent(saveCard);
		scrollToElementAndClick(textSaveCard);
	}
	/**
	 * to amliorate it not better 
	 */
	public void PayementSpecialSamsungS10() {
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(choosecard);
		int x=415;
		int y=1738;
		sleep(Global.timeOut);
		tapByCordinates(x,y);
		scrollToElementAndSendkeys(cardnumber, dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElementAndSendkeys(CSC, dataJson.getJSONObject("en").getString("cardCVC"));
		scrollToElementAndClick(checkbox);
		waitAndClick(book);
		verifyReservation();
	}
	/**
	 * verification devise 
	 */
	public void verifyDevise() {
		String dollar =getText(devise).substring(0,3);
		System.out.println("the price of reservation is " + dollar );
		String expectedstatus=dataJson.getJSONObject("en").getString("currencyBooking");
		assertEqualsContains(dollar, expectedstatus);
	}
	/**
	 * to amliorate it not better 
	 */
	public void verifyReservation() {
		if(isElementPresent(messageConfirmation)) {
			System.out.println("your booking is confirmed");
		}
	}
	public void controlSurface() {
		isElementPresent(finaliseYourBooking);
		scrollToElement(legalNotice);
		verifyElementNotEnabled(paymentBooking);
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(choosecard);
		waitAndClick(visaCard);
		scrollToElement(legalNotice);
		verifyElementNotEnabled(paymentBooking);
		scrollToElementAndSendkeys(cardnumber, dataJson.getJSONObject("en").getString("cardNumber"));
		scrollToElementAndSendkeys(cardholder, generateRandomString());
		scrollToElementAndSendkeys(expirationdate, dataJson.getJSONObject("en").getString("cardExpiration"));
		scrollToElement(legalNotice);
		isElementPresent(saveCard);
		verifyElementNotEnabled(paymentBooking);
		waitAndClick(saveCard);
		scrollToElementAndSendkeys(CSC, dataJson.getJSONObject("en").getString("cardCVC"));
		scrollToElement(legalNotice);
		waitAndClick(acceptLegalTerm);
		scrollToElement(legalNotice);
		verifyElementEnabled(paymentBooking);
		scrollToElementAndSendkeys(nameCard, dataJson.getJSONObject("en").getString("accorNameCard"));
		waitAndClick(paymentBooking);
		verifyReservation();





	}
}

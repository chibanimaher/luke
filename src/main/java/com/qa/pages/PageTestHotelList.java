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

public class PageTestHotelList extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	public PageTestHotelList(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	int w=440;
	int x=2111;
	int y=449;
	int z=477;
	int a=551;
	int b=1680;
	int c=548;
	int d=1120;
	//Mobile Elements
	public static final By deviseDollar=By.id("com.accor.appli.hybrid.inhouse:id/currencyLabelTextView");
	public static final By priceBasketDinar=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By closeFilter=By.xpath("//android.widget.ImageButton[@content-desc=\"Close\"]");
	public static final By mapAdresseHotel=By.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View");
	public static final By mapNameHotel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	public static final String nameHotel="GDP Hotel Royal Saint Honore Paris Louvre";
	public static final By mapImage=By.id("com.accor.appli.hybrid.inhouse:id/staticMapImageView");
	public static final By blocMap=By.id("com.accor.appli.hybrid.inhouse:id/staticMapImageView");
	public static final By numberperson=By.id("com.accor.appli.hybrid.inhouse:id/paxTextField");
	public static final By dateSearch=By.id("com.accor.appli.hybrid.inhouse:id/datesTextField");
	public static final By destinationSerach=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final By menuListHotel=By.id("com.accor.appli.hybrid.inhouse:id/toolbar_view");
	public static final By backButton=By.xpath("//android.widget.ImageButton[@content-desc=\"go up a level\" or @content-desc=\"Navigate up\"]");
	public static final By coffee=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.ListView/android.view.View[8]");
	public static final By seeService=By.id("com.accor.appli.hybrid.inhouse:id/amenitiesSeeAllButton");
	public static final By seeRoom=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By accorPartener=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By firstTripAdvisor=By.id("com.accor.appli.hybrid.inhouse:id/tripAdvisorRatingImageView");
	public static final By sortedByTripAdvisor=By.id("com.accor.appli.hybrid.inhouse:id/availableDescriptionText");
	public static final By tripAdvisor=By.id("com.accor.appli.hybrid.inhouse:id/radioTripadvisorRatingHighToLow");
	public static final By LowToHigh=By.id("com.accor.appli.hybrid.inhouse:id/radioPriceLowToHigh");
	public static final By firstPriceHotel=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By secondPriceHotel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]");
	public static final By highToLow=By.id("com.accor.appli.hybrid.inhouse:id/radioPriceHighToLow");
	public static final By sortButton=By.id("com.accor.appli.hybrid.inhouse:id/sortTextView");
	public static final String appelButton="GIVE US A CALL";
	public static final By statusBusiness=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By labelStay=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By stayPlusswitch=By.id("com.accor.appli.hybrid.inhouse:id/stayPlusSwitch");
	public static final By searchDestinationButton=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final By breakfast=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
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
	public static final By switchCurrency=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.Button");
	public static final By usDinar=By.id("com.accor.appli.hybrid.inhouse:id/currencySelectorItemTextView");
	public static final By searchButton =By.id("com.accor.appli.hybrid.inhouse:id/currencySelectorSearchEditText");
	public static final By deviseDinar=By.id("com.accor.appli.hybrid.inhouse:id/currencyLabelTextView");
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By callButton=By.id("com.accor.appli.hybrid.inhouse:id/contactCallButton");
	public static final By emailButton=By.id("com.accor.appli.hybrid.inhouse:id/contactEmailButton");
	/**
	 * connexion to account and wi verify if connexion is established
	 * @param get data from JSON File and put in the text
	 */

	public void integrationEncart() {
		readData("data/booking/guestuser/LibelleCurrency.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(filterCurrency);
		waitAndClick(switchCurrency);
		sendText(searchButton, dataJson.getJSONObject("en").getString("currency"));
		waitAndClick(usDinar);
		waitAndClick(confirmButton);
		String devise =getText(deviseDinar);
		String expectedevise=dataJson.getJSONObject("en").getString("devise");
		assertEquals(devise, expectedevise);
		waitAndClick(closeFilter);
		if(isElementPresent(priceBasketDinar)){
		String dinar=getText(priceBasketDinar).substring(5);
		String dinardevise=dinar.substring(0, 4).trim();
		String devisedinar="TND";
		assertEquals(dinardevise, devisedinar);
		System.out.println("the devise is displyed" +dinar);
		}
	}

	public void appelHotel() {
		int w=397;
		int x=1895;
		int y=431;
		int z=286;
		readData("data/hotellist/AppelHotel.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(firstHotel);
		for(int i=0;i<3;i++) {
			swipByCordinates(w, x, y, z);
		}
		if(isElementPresent(callButton)) {
			waitAndClick(callButton);
			System.out.println("the button call is present");
		}

	}
	/**
	 * verify label breakfast in the page of hiotel
	 */
	public void integrationEncartPriceAccorPlus() {
		readData("data/hotelcard/HotelCardIntegrationInsertPrice_labelPartnerPrivilege.json");
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
		if(isElementPresent(breakfast)) {
			System.out.println("the status break fast is displayed");
		}
		else {
			System.err.println("the status breakfast is not displyed in this hotel");
		}
	}
	/**
	 *  verfify stay plus label 
	 */
	public void labelInsertUserPrice() {
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
		scrollToElement(dataJson.getJSONObject("en").getString("hotelName"));
		isElementPresent(labelStay);


	}
	/**
	 *  verfify status Business plus 
	 */
	public void statusBusinessPlus() {
		readData("data/hotellist/HotelListInsertPrice_labelBusinessPlus.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);	
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		try {
			String Status =getText(statusBusiness);
			String expectedstatus=dataJson.getJSONObject("en").getString("statusBusinessPlus");
			assertEquals(Status, expectedstatus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
	public void sortByPriceHioghTolow() {
		readData("data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
		waitAndClick(sortButton);
		waitAndClick(highToLow);
		waitAndClick(confirmButton);
		try {
			String firstPrice=getText(firstPriceHotel).substring(7);
			int premierPrix=Integer.parseInt(firstPrice);
			System.out.println("the price of first hotel is " +firstPrice);
			String namehot="RSA ibis Styles KL Cheras";
			scrollToElement(namehot);
			int secondPrice=29;
			System.out.println("the price of second hotel is " +secondPrice);
			if(premierPrix>secondPrice) {
				System.out.println("verification is Ok because : "+premierPrix +" supérieur à "+secondPrice);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void sortByPriceLowToHigh() {
		readData("data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
		waitAndClick(sortButton);
		waitAndClick(LowToHigh);
		waitAndClick(confirmButton);
		try {
			String firstPrice=getText(firstPriceHotel).substring(7);
			int premierPrix=Integer.parseInt(firstPrice);
			System.out.println("the price of first hotel is " +firstPrice);
			String namehot="RSA Pullman Putrajaya Lakeside";
			scrollToElement(namehot);
			int secondPrice=41;
			System.out.println("the price of second hotel is " +secondPrice);
			if(premierPrix>secondPrice) {
				System.out.println("verification is Ok because : "+premierPrix +" inférieur à "+secondPrice);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void sortByPricetripAdvisor() {
		readData("data/roomselection/RoomSelectionLabelInserUserPriceStayPlus.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
		waitAndClick(sortButton);
		waitAndClick(tripAdvisor);
		waitAndClick(confirmButton);
		try {
			String tri=getText(sortedByTripAdvisor);
			System.out.println("the tri of list hotel is " +tri);
			isElementPresent(sortedByTripAdvisor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void integrationEncartAccorPlusPartener() {
		readData("data/hotellist/EncartPrixAccorPriviliged.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		try {
			isElementPresent(accorPartener);
			System.out.println("the priviliged accor partener is display");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
	public void integrationEncartAccorPrixBar() {
		readData("data/hotellist/EncartPrixBar.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.addNumberAdulte();
		waitAndClick(search);
		waitAndClick(firstHotel);
		waitAndClick(seeService);
		try {
			isElementPresent(coffee);
			System.out.println("the bar option is displayed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void backDepuisFH() {
		readData("data/hotellist/BackHotelMap.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(firstHotel);
		try {
			waitAndClick(backButton);
			isElementPresent(sortButton);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
	public void expandSearch() {
		readData("data/hotellist/BackHotelMap.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(menuListHotel);
		isElementPresent(destinationSerach);
		isElementPresent(dateSearch);
		isElementPresent(numberperson);
		waitAndClick(search);
	}
	public void blocHotel() {
		int w=462;
		int x=1523;
		int y=474;
		int z=689;
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(firstHotel);
		swipByCordinates(w, x, y, z);
		waitAndClick(mapImage);
		String namehotel=getText(mapNameHotel);
		System.out.println("thye name of hotel is "+namehotel);
		waitAndClick(mapAdresseHotel);
	}
	public void emailHotel() {
		int w=397;
		int x=1895;
		int y=431;
		int z=286;
		readData("data/hotellist/AppelHotel.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		waitAndClick(search);
		waitAndClick(firstHotel);
		for(int i=0;i<3;i++) {
			swipByCordinates(w, x, y, z);
		}
		if(isElementPresent(callButton)) {
			System.out.println("the button call is present");
		}

		if(isElementPresent(emailButton)) {
			waitAndClick(emailButton);
			System.out.println("the button email is present");
		}


	}
	public void changeCurrency() {
		readData("data/booking/guestuser/CustomerCurrency.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
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
		String verifdevise =getText(priceBasketDinar).substring(5);
		String deviseTunisian=verifdevise.substring(0, 4).trim();
		assertEquals(deviseTunisian, expectedevise);
	}
}

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

public class PageTestHotelCard extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	public PageTestHotelCard(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	int w=462;
	int x=1523;
	int y=474;
	int z=689;
	public static final By breakfast=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By seeRoom=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By mapAdresseHotel=By.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View");
	public static final By mapNameHotel=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	public static final String nameHotel="GDP Hotel Royal Saint Honore Paris Louvre";
	public static final By mapImage=By.id("com.accor.appli.hybrid.inhouse:id/staticMapImageView");
	public static final By numberChildrenRoom=By.id("com.accor.appli.hybrid.inhouse:id/hotelOccupancyChild");
	public static final By numberAdultesRoom=By.id("com.accor.appli.hybrid.inhouse:id/hotelOccupancyAdult");
	public static final By descriptionRoom=By.id("com.accor.appli.hybrid.inhouse:id/stayDescriptionTextView");
	public static final By roomDescription=By.id("com.accor.appli.hybrid.inhouse:id/roomDescriptionTextView");

	public static final By maxPersonInRoom=By.id("com.accor.appli.hybrid.inhouse:id/hotelOccupancyPax");
	public static final By nameHotelDescription=By.id("com.accor.appli.hybrid.inhouse:id/nameTextView");
	public static final By nameRoom=By.id("com.accor.appli.hybrid.inhouse:id/roomTitleTextView");
	
	public static final By priceRoom=By.id("com.accor.appli.hybrid.inhouse:id/basketPriceTextView");
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By labelStay=By.id("com.accor.appli.hybrid.inhouse:id/labelTextView");
	public static final By stayPlusswitch=By.id("com.accor.appli.hybrid.inhouse:id/stayPlusSwitch");
	public static final By expirationDate=By.id("com.accor.appli.hybrid.inhouse:id/cardExpirationDateTextView");
	public static final By close=By.id("com.accor.appli.hybrid.inhouse:id/closeFrameLayout");
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
	public static final By blocEtoile=By.id("com.accor.appli.hybrid.inhouse:id/ratingFlow");
	public static final By distanceKm=By.id("com.accor.appli.hybrid.inhouse:id/hotelDistanceTextView");
	public static final By menbreRates=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.widget.TextView");
	public static final By breakFast=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.widget.TextView");
	public static final By pricereservation=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[1]");
	public static final By referencePrice=By.id("com.accor.appli.hybrid.inhouse:id/referencePriceTextView");
	public static final By reservationInformations=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[3]");
	/**
	 * verify aal information of same hotel
	 * @param get data from JSON File and put in the text
	 */
		public void allSafeGlobalHotel() {
			readData("data/hotelcard/HotelCardAllSafeGlobalHotel.json");
			waitAndClick(logon);
			waitAndClick(loginButton);
			sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
			sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
			waitAndClick(loginToAccount);	
			waitAndClick(destination);
			sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
			waitAndClick(confirmDestination);
			waitAndClick(search);
			scrollToElement(nameHotel);
			isElementPresent(blocEtoile);
			isElementPresent(distanceKm);
			isElementPresent(referencePrice);
			
			}
		/**
		 * verify the label price of hotel
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
		 * booking until suumury page
		 */
		public void integrationEncartPrice() {
			readData("data/roomselection/ScreenPriceMember.json");
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
			}
		/**
		 * verify all information of room in the hotel 
		 */
		public void affichageCompositionRoom() {
			readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
			waitAndClick(destination);
			sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
			waitAndClick(confirmDestination);
			waitAndClick(search);
			waitAndClick(firstHotel);
			homepage.SeeRoom();
			String nameROfRoom=getText(nameRoom);
			System.out.println("the name of your room is " +nameROfRoom);
			String dezcriptionOfRoom=getText(descriptionRoom);
			System.out.println("the description of your room is " +dezcriptionOfRoom);
			String priceROfRoom=getText(priceRoom);
			System.out.println("the price of your room is " +priceROfRoom);
			String numberAdultInRoom=getText(roomDescription);
			System.out.println("the number adultes person in your room is " +numberAdultInRoom);

			}
		/**
		 * verify affichage of map of hotel 
		 */
		public void affichageMap() {
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
		/**
		 * consulter la fiche d'hotel
		 */
		public void affichageDescriptifHotel() {
			readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
			waitAndClick(destination);
			sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
			waitAndClick(confirmDestination);
			waitAndClick(search);
			waitAndClick(firstHotel);
			String nameROfRoom=getText(nameHotelDescription);
			System.out.println("the name of your hotel is " +nameROfRoom);
			String priceROfRoom=getText(priceRoom);
			System.out.println("the price of your hotel is " +priceROfRoom);
			waitAndClick(seeRoom);
			}
		/**
		 *  verify breakfast is displyed in the hotel name into jsonfile
		 */
		public void integrationEncartPriceAccorPlus() {
			readData("data/hotelcard/HotelCardIntegrationInsertPrice_labelAccorPlus.json");
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
			scrollToElement(dataJson.getJSONObject("en").getString("hotelName"));
			try {
				if(isElementPresent(breakfast)) {
					System.out.println("the status break fast is displayed");
				}
				else {
					System.err.println("the status breakfast is not displyed in this hotel");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			}
		
}

package com.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.internal.Utils;

import com.aventstack.extentreports.Status;
import com.qa.BasePage;
import com.qa.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PageHome extends BasePage {

	public PageHome(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static final String backPopup="BACK";
	public static final By numberAdulte=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add one adult per room\"]");
	public static final By roomOption=By.id("com.accor.appli.hybrid.inhouse:id/paxTextField");
	public static final By confirmDestination=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	public static final By villeDestination=By.id("com.accor.appli.hybrid.inhouse:id/locationEditText");
	public static final By destination=By.id("com.accor.appli.hybrid.inhouse:id/destinationTextField");
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/searchButton");
	public static final String sseroomrate="SEE ROOM RATES";
	public static final By seeRoom=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By firstHotel=By.id("com.accor.appli.hybrid.inhouse:id/itemCarouselImageView");
	public static final By seeRate=By.id("com.accor.appli.hybrid.inhouse:id/roomButtonToRate");
	public static final By selectRate=By.id("com.accor.appli.hybrid.inhouse:id/chooseButton");
	public static final By continueAsGuest=By.id("com.accor.appli.hybrid.inhouse:id/guestButton");
	public static final String legalNotice="LEGAL NOTICES";
	public static final By popup=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
	public static final By selectNewRate=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.Button[2]");
	public static final By confirmButton =By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final By backButton=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\" or @content-desc=\"go up a level\"]");
	public static final By numberNight=By.id("com.accor.appli.hybrid.inhouse:id/bookingNbNightsTextView");
	public static final By dateDepart=By.id("com.accor.appli.hybrid.inhouse:id/bookingDateInMonthTextView");
	public static final By dateDeSortie=By.id("com.accor.appli.hybrid.inhouse:id/bookingDateOutMonthTextView");
	public static final By nameRoom=By.id("com.accor.appli.hybrid.inhouse:id/bookingNameHotelTextView");
	public static final By numberroom=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add a room\"]");
	public static final By numberchildren=By.xpath("//android.widget.ImageButton[@content-desc=\"+ add one child per room\"]");
	public static final By childAge=By.id("com.accor.appli.hybrid.inhouse:id/autoCompleteTextView");
	/**
	 * choose hotel from app
	 * @throws FileNotFoundException 
	 */
	public void chooseHotel() {
		waitAndClick(search);
		waitAndClick(firstHotel);
		SeeRoom();
		waitAndClick(seeRate);
		waitAndClick(selectRate);
	}
	public void searchHotels() {
		readData("data/account/newmember/BookingWithGuestUserWithChildrens.json");
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
	}
	public void rommOptions() {
		waitAndClick(roomOption);
		waitAndClick(numberAdulte);
		waitAndClick(confirmButton);
		waitAndClick(search);
		waitAndClick(backButton);
	}
	public void detailsreservation() {
		String number =getText(numberNight).substring(0,1);
		System.out.println("the number of reservation night is " + number );
		String dateentree =getText(dateDepart);
		System.out.println("the date of check In is " + dateentree );
		String datesortie =getText(dateDeSortie);
		System.out.println("the date of checkOut is  " + datesortie );
		String roomname =getText(nameRoom);
		System.out.println("the name of room is  " + roomname );
	}
	public void addNumberAdulteAndRoom() {
		waitAndClick(roomOption);
		waitAndClick(numberroom);
		waitAndClick(numberAdulte);
		waitAndClick(confirmButton);
	}
	public void addNumberAdulte() {
		waitAndClick(roomOption);
		waitAndClick(numberAdulte);
		waitAndClick(confirmButton);
	}
	public void addNumberAdulteAndChildren() {
		int x=655;
		int y=1366;
		waitAndClick(roomOption);
		waitAndClick(numberAdulte);
		waitAndClick(numberchildren);
		waitAndClick(childAge);
		tapByCordinates(x,y);
		waitAndClick(confirmButton);
	}
	/**
	 * to delete after correction of timout waiting loading page and 
	 * remplaced by waitAndClick(seeRoom);
	 */
	public void SeeRoom() {
		try {
			waitAndClick(seeRoom);
		} catch (Exception e) {
			int x=477;
			int y=2031;
			sleep(5000);
			tapByCordinates(x, y);
		}
		
	}
}

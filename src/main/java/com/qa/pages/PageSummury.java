package com.qa.pages;

import java.io.InputStream;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.testng.internal.Utils;

import com.aventstack.extentreports.Status;
import com.qa.BasePage;
import com.qa.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PageSummury extends BasePage {
	public PageSummury(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static final String submit="SUBMIT";	
	public static final String emailAdress="Email address";
	public static final String nationality="Nationality";	
	public static final String codeTelephone="Telephone code";
	public static final String mobile="Mobile number";
	public static final String legalmention="LEGAL NOTICES";
	public static final By search=By.id("com.accor.appli.hybrid.inhouse:id/itemSelectorSearchEditText");
	public static final By validSearch=By.id("com.accor.appli.hybrid.inhouse:id/itemSelectorItemTextView");
	public static final By telephone=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final By checkboxvalidate=By.id("com.accor.appli.hybrid.inhouse:id/newsLetterOptInCheckBox");
	public static final By title=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.Spinner");
	public static final By firstname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	public static final By surname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	public static final By country=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
	public static final By pays=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
	public static final By mobilenumber=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By countryRegion=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
	public static final By emailsummury=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	/**
	 * remplir le formulaire
	 */
	public void RemplirFormulaire() {
		readData("data/booking/guestuser/BookingWithGuestUserWithChildrens.json");
		waitAndClick(title);	
		for(int i=3;i<6;i++) {
			MobileElement elem=(MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout["+i+"]/android.widget.FrameLayout/android.widget.EditText"));
			if(elem.isEnabled()) {
				waitAndClick(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout["+i+"]/android.widget.FrameLayout/android.widget.EditText"));
				break;
			}	
		}
		sendText(firstname,dataJson.getJSONObject("en").getString("guestFirstName"));
		sendText(surname, dataJson.getJSONObject("en").getString("guestLastName"));
		waitAndClick(country);
		sendText(search, dataJson.getJSONObject("en").getString("guestCountry"));
		sleep(1500);
		waitAndClick(validSearch);
		scrollToElementAndClick(nationality);
		sendText(search, dataJson.getJSONObject("en").getString("guestNationality"));
		sleep(1500);
		waitAndClick(validSearch);
		scrollToElementAndClick(codeTelephone);
		sendText(search, dataJson.getJSONObject("en").getString("guestMobileCountry"));
		sleep(1500);
		waitAndClick(validSearch);
		scrollToElementAndSendkeys(mobile, dataJson.getJSONObject("en").getString("phoneNumber"));
		scrollToElementAndSendkeys(emailAdress, generateRandomEmail());
		waitAndClick(checkboxvalidate);
		scrollToElementAndClick(submit);
	}
	
	public void setInformationAccountClassic() {
		readData("data/account/newmember/DashboardChangeCurrency.json");
		clearAndSendText(email, generateRandomEmail());
		waitAndClick(telephone);
		sendText(search, dataJson.getJSONObject("en").getString("guestCountryRegion"));
		waitAndClick(validSearch);
		sendText(mobilenumber, dataJson.getJSONObject("en").getString("phoneNumber"));
		scrollToElementAndClick(submit);		
	}
	public void setInformationAccountTesta() {
		readData("data/confirmation/ConfirmationDisplayCancellationConditions.json");
		clearAndSendText(email, generateRandomEmail());
		waitAndClick(telephone);
		sendText(search, dataJson.getJSONObject("en").getString("guestCountryRegion"));
		waitAndClick(validSearch);
		sendText(mobilenumber, dataJson.getJSONObject("en").getString("phoneNumber"));
		scrollToElementAndClick(submit);		
	}
	public void setInformations() {
		readData("data/account/newmember/OnlineCheckinStay.json"); 
		waitAndClick(countryRegion);
		sendText(search, dataJson.getJSONObject("en").getString("guestCountryRegion"));
		waitAndClick(validSearch);
		scrollToElement(legalmention);
		waitAndClick(checkboxvalidate);
		scrollToElementAndClick(submit);	
	}
}

package com.qa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.BasePage;
import com.qa.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageTestAccount extends BasePage{
	PageHome homepage=new PageHome(driver);
	PageSummury summury=new PageSummury(driver);
	PagePayement payement= new PagePayement(driver);
	PageConfiguration pageConf= new PageConfiguration(driver);
	public PageTestAccount(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Mobile Elements
	public static final By passwordFailed=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
	public static final By okBut=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
	public static final By oldPassword=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By newPassword=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By searchHome=By.xpath("//android.widget.FrameLayout[@content-desc=\"Search\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By backButton=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	public static final String settings="Advanced settings";
	public static final By saveButton=By.id("com.accor.appli.hybrid.inhouse:id/validateButton");
	public static final String editPassword="Edit the password";
	public static final By selectCardfromList=By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout");
	public static final By messageErreur=By.id("com.accor.appli.hybrid.inhouse:id/mSnackBarMessage");
	public static final By staysHotel=By.id("com.accor.appli.hybrid.inhouse:id/bookingNameHotelTextView");
	public static final By verifyReservationStays=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ViewFlipper/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.LinearLayout");
	public static final By laterButton=By.id("com.accor.appli.hybrid.inhouse:id/rateLaterButton");
	public static final String backHomePage="BACK TO HOME PAGE";
	public static final String logOut="LOG OUT";
	public static final String logOn="LOG ON";
	public static final String bankCards="Bank cards";
	public static final String staysButton="Stays";
	public static final String OkButton="OK";
	public static final By confirmdeletecard=By.id("android:id/button1");
	public static final By deleteCard=By.id("com.accor.appli.hybrid.inhouse:id/card_delete");
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
	public static final By logon=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log in\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By account=By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]/android.view.ViewGroup/android.widget.TextView");
	public static final By okButton=By.id("com.accor.appli.hybrid.inhouse:id/logoutYesButton");
	public static final By email=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	public static final By password=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	public static final By logOnButton=By.xpath("//android.widget.FrameLayout[@content-desc=\"Log on\"]/android.view.ViewGroup/android.widget.TextView");
	/**
	 * connexion to account with the status silver
	 * @param get data from JSON File and put in the text
	 */
	public void loginWithSilverAccount() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/SilverUser.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		String Status =getText(typeAccount);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);

	}
	/**
	 * connexion to account with the status platinum
	 * @param get data from JSON File and put in the text
	 */
	public void loginWithPlatiniumAccount() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/PlatinumScreen.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		String Status =getText(typeAccount);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);

	}
	/**
	 * connexion to account with the status gold
	 * @param get data from JSON File and put in the text
	 */
	public void loginWithGoldAccount() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/GoldScreen.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		String Status =getText(typeAccount);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);

	}
	/**
	 * connexion to account with the status classic
	 * @param get data from JSON File and put in the text
	 */
	public void loginWithClassicAccount() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/AccountCreationWithClassicMember.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		String Status =getText(typeAccount);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);

	}
	/**
	 * connexion to account with the status partener
	 * @param get data from JSON File and put in the text
	 */
	public void loginWithPartnerAccount() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/Partnerscreen.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		String Status =getText(typeAccount);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);

	}
	/**
	 * connexion to account with the status classic
	 * @param get data from JSON File and put in the text
	 */
	public void redirectionStatus() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/StatusScreen.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		waitAndClick(blocCard);
		String Status =getText(statusCard);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);

	}
	/**
	 * connexion to account with the status platinum
	 * @param get data from JSON File and put in the text
	 */
	public void awardsNumber() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/AwardsNumber.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		try {
			String awardsnumber =getText(awards);
			String expectedstatus=dataJson.getJSONObject("en").getString("awards");
			assertEquals(awardsnumber, expectedstatus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	/**
	 * @param get data from JSON File and put in the text
	 */
	public void staysPlus() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/DisplayStayplusIndicator.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		scrollToElementAndClick(staysButton);
		waitAndClick(past);
		waitAndClick(cancelled);
	}
	public void changeCurrency() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/DashboardChangeCurrency.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(settings);
		scrollToElementAndClick(dataJson.getJSONObject("en").getString("changecurrency"));
		sendText(searchButton, dataJson.getJSONObject("en").getString("currency"));
		waitAndClick(usDollar);
		waitAndClick(confirmButton);
		waitAndClick(backButton);
		waitAndClick(searchHome);
		waitAndClick(destination);
		sendText(villeDestination, dataJson.getJSONObject("en").getString("destination"));
		waitAndClick(confirmDestination);
		homepage.chooseHotel();
		summury.setInformationAccountClassic();
		payement.verifyDevise();
	}
	/**
	 * verify informations about account carte , point
	 */
	public void verifyCarteClassicAndPoint() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/ConnecteConnectedUser.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		String Status =getText(typeAccount);
		String expectedstatus=dataJson.getJSONObject("en").getString("status");
		assertEquals(Status, expectedstatus);
		if(isElementPresent(pointReward)) {
			System.out.println("the champ rewards is present ");
		}
		waitAndClick(blocCard);
		assertEquals(Status, expectedstatus);   
	}
	/**
	 * authetification after search hotel 
	 */
	public void authentificationAfterSearch() {
		pageConf.accessEnvWithoutToggle();
		homepage.searchHotels();
		homepage.chooseHotel();
		readData("data/account/newmember/BookingWithGuestUserWithChildrens.json");
		scrollToElementAndClick(logOn);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		summury.setInformationAccountClassic();
	}
	/**
	 * this test does login , logout , verification logout
	 */
	public void Logout() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/BookingWithPoints.json"); 
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		homepage.searchHotels();
		homepage.rommOptions();
		waitAndClick(account);
		scrollToElementAndClick(logOut);
		waitAndClick(okButton);
		waitAndClick(close);
		if(isElementPresent(logOnButton)) {
			System.out.println("we are not connected");
		}
	}
	/**
	 * this test does login , shows stay and see more information 
	 */
	public void staysDetails() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/DisplayFutureBooking.json"); 
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		scrollToElementAndClick(staysButton);
		waitAndClick(seeMore);
		homepage.detailsreservation();
	}
	/**
	 * this test does login ,search hotels , add number adulte and room , choose hotels and set formulaire
	 */
	public void onlineCheckIn() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/OnlineCheckinStay.json"); 
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		homepage.searchHotels();
		homepage.addNumberAdulteAndRoom();
		homepage.chooseHotel();
		summury.setInformations();
		payement.Payement();
		scrollToElementAndClick(backHomePage);
		waitAndClick(laterButton);
		scrollToElementAndClick(staysButton);
		try {
			waitVisibility(verifyReservationStays);
			readData("data/booking/userlogged/OnlineCheckinStay.json");
			scrollToElementAndClick(dataJson.getJSONObject("en").getString("hotelname"));
			String nameHotel=dataJson.getJSONObject("en").getString("hotelname");
			String hotelnamereservation =getText(staysHotel);
			assertEquals(nameHotel, hotelnamereservation);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	/**
	 * this test does login , shows stay and navigation into three compoment future, past, cancelled
	 */
	public void screenMyStay() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/ScreenMyStay.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		scrollToElementAndClick(staysButton);
		waitAndClick(past);
		waitAndClick(cancelled);
		
	}
	/**
	 * this test does login and  add new card bank , this special samsung S10
	 */
	public void walletAddCard() {
		pageConf.accessEnvWithoutToggle();
		int x=129;
		int y=1317;
		readData("data/account/newmember/AccountWalletAddNewBankCard.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(bankCards);
		try {
			waitAndClick(deleteCard);
			waitAndClick(confirmdeletecard);
		} catch (Exception e) {
			// TODO: handle exception
		}
		waitAndClick(addBankCard);
		waitAndClick(selectBankCard);
		tapByCordinates(x, y);
		sendText(cardNumber, dataJson.getJSONObject("en").getString("cardNumber"));
		sendText(holderName, dataJson.getJSONObject("en").getString("cardHolderName"));
		sendText(expiryDate, dataJson.getJSONObject("en").getString("cardExpiration"));
		sendText(CSC, dataJson.getJSONObject("en").getString("cardCVC"));
		sendText(cardName, generateRandomString());
		String name =getText(cardName);
		waitAndClick(addThisCard);
		String expectedname=getText(nameOfCard);
		assertEquals(name, expectedname);
	
	}
	public void walletChoixCarteNonPassant() {
		pageConf.accessEnvWithoutToggle();
		int x=129;
		int y=1317;
		readData("data/account/newmember/AccountWalletAddNewBankCard.json");
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(bankCards);
		try {
			waitAndClick(deleteCard);
			waitAndClick(confirmdeletecard);
		} catch (Exception e) {
			e.getMessage();
		}
		waitAndClick(addBankCard);
		waitAndClick(selectBankCard);
		waitAndClick(selectBankCard);
		waitAndClick(addThisCard);
		isElementPresent(messageErreur);
		waitAndClick(selectBankCard);
		tapByCordinates(x, y);
		String title=getText(selectBankCard);
		if(title.isEmpty()) {
			System.out.println("Test KO > the champ carte is not set");
		}
		else {
			System.out.println("Test OK > the champ carte is selected");
		}
		
	
	}
	public void editPassword() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/AccountEditPassword.json"); 
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(settings);
		scrollToElementAndClick(editPassword);
		isElementPresent(saveButton);
		
	}
	public void renewPasswordSuccess() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/RenewPassword.json"); 
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(settings);
		scrollToElementAndClick(editPassword);
		sendText(oldPassword, dataJson.getJSONObject("en").getString("userPassword"));
		sendText(newPassword, dataJson.getJSONObject("en").getString("userPasswordNew"));
		waitAndClick(saveButton);
		waitAndClick(okBut);
		waitAndClick(backButton);
		scrollToElementAndClick(logOut);
		waitAndClick(okButton);
	//reconnexion
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPasswordNew"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(settings);
		scrollToElementAndClick(editPassword);
		sendText(oldPassword, dataJson.getJSONObject("en").getString("userPasswordNew"));
		sendText(newPassword, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(saveButton);
	}
	public void renewPasswordFailed() {
		pageConf.accessEnvWithoutToggle();
		readData("data/account/newmember/RenewPasswordFailed.json"); 
		waitAndClick(logon);
		waitAndClick(loginButton);
		sendText(email,dataJson.getJSONObject("en").getString("userEmail"));
		sendText(password, dataJson.getJSONObject("en").getString("userPassword"));
		waitAndClick(loginToAccount);
		waitAndClick(account);
		scrollToElementAndClick(settings);
		scrollToElementAndClick(editPassword);
		sendText(oldPassword, dataJson.getJSONObject("en").getString("userPasswordFailed"));
		sendText(newPassword, dataJson.getJSONObject("en").getString("userPasswordNew"));
		waitAndClick(saveButton);
		String actualMessage=getText(passwordFailed);
		String expectedMessage=dataJson.getJSONObject("en").getString("messageErreur");
		assertEquals(actualMessage, expectedMessage);
	
	}
}

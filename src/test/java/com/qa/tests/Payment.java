package com.qa.tests;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.listeners.RetryTest;
import com.qa.pages.PageHome;
import com.qa.pages.PageTestAccount;
import com.qa.pages.PageTestPayment;
import com.qa.pages.PagePayement;
import com.qa.pages.PageSummury;
import com.qa.utils.TestUtils;

import io.appium.java_client.android.AndroidDriver;

public class Payment extends BaseTest{
	public PageTestPayment paymentPage;
	public RetryTest retrytest =new RetryTest();
	
	
	/**
	 * [Payment][DAPP-13375]Payment at the Hotel_Guest_Booking OK_Optional Warranty_Switch ON
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test(retryAnalyzer = RetryTest.class)
	public void PaymentAtTheHotelGuestBookingOkOptionalWarrantlySwitchON() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.PaymentAtHotelAndVerifyInformation();

	}
	/**
	 * [Payment][DAPP-13377] Manual Online Payment_Connected User_Booking
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void ManualOnlinePaymentConnectedUserBooking() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.manualOnline();

	}
	
	/**
	 * Payment] [DAPP-13378] Payment screen - Presence and appearance of the basket and its elements - Payment in Rewards Points
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void PresenceAndAppearenceOfTheBasketAndElements() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.presenceAndAppearance();

	}
	/**
	 * [Payment][DAPP-13379]Manual_Online_Payment_Basket_Verif
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void ManualOnlineBasketVerif() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.manualOnlineVerifBasket();

	}
	/**
	 * [Payment] [DAPP-14006]Basket display Customer currency and hotelier currency are the same
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void BasketDispalyCustomerCurrencyAndHotelierCurrency() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.basketDisplayCustomerCurrency();
	}
	/**
	 * [Payment] [DAPP-14008] Basket display- Customer currency is in euro and hotelier currency is not in euro
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void BasketDispalyCustomerCurrencyAndHotelierCurrencyEnEuro() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.basketDisplayCustomerCurrencyEnEuro();
	}
	/**
	 * [Payment] [DAPP-4051] Basket display- Customer currency is different from euro and hotelier currency is in euro
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void BasketDispalyCustomerCurrencyDifferentInEuro() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.basketDisplayCustomerDifferentInEuro();
	}
	/**
	 * [Paiement][21916]- Enregistrer ma CB - Connecté
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void EnregistrerMaCbConnecte() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.saveCardBank();
	}
	/**
	 * [Paiement][21912]controle de surface du formulaire
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()
	public void ControlSurfaceFormulaire() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.controlSurfacePayment();
	}
	/**
	 * Paiement][21909] Réservation en DSP2
	 * @throws InterruptedException
	 */
	@SuppressWarnings("rawtypes")
	@Test()	
	public void ReservationDSP2() {
		paymentPage=new PageTestPayment((AndroidDriver) getDriver());
		paymentPage.reservationDsp();
	}
}

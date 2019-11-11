package Test.Scripts;

import Application.Pages.FlightConfirmationPage;
import Application.Pages.PurchaseFlightPage;
import Application.Pages.SearchFlightPage;
import Application.Pages.SelectFlightPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBookFlightFeature extends SearchFlightPage {


    /**
     *
     * @param airlines is used to set the Airline Name
     * @param departingAirport is used to set the departure port
     * @param departingDay is used to set the departure date
     * @param departingMonth is used to set the departure Month
     * @param arrivalPort is used to set the arrival port
     * @param returnDay is used to set the return date day
     * @param returnMonth is used to set the return date month
     * @param firstname is used to set the First Name of User
     * @param lastname is used to set the Last Name of User
     * @param address- Is used to set the Billing and Delivery Address
     * @param city-is Used to set the City of Billing and Delivery Address
     * @param cc_number- is used to set the credit card for Purchase of logged in User
     * @param state-is Used to set the State of Billing and Delivery Address
     * @param zipcode-is Used to set the Zipcode of Billing and Delivery Address
     *
     * @Description This Test Case covers the end to end flow required to complete the Flight Purchase and Confirm the Booking
     *  Confirmation
     */
    @Parameters({"airlines","departingAirport","departingDay","departingMonth","arrivalPort","returnDay","returnMonth",
                    "address","city","cc_number","state","zipcode","firstname","lastname"})
    @Test
    public void Verify_the_E2E_Book_Flight_Flow(String airlines,String departingAirport,String departingDay, String departingMonth,String arrivalPort,
                                                String returnDay, String returnMonth,String firstname, String lastname, String address, String city,
                                                String cc_number,String state,String zipcode){

        search_a_Flight(departingAirport,departingDay,departingMonth,arrivalPort,returnDay,returnMonth);
        SelectFlightPage selectflighPage = new SelectFlightPage();
        selectflighPage.verify_the_flight_information_is_displaying_as_selected(airlines,departingAirport,arrivalPort,departingDay,departingMonth,returnDay,returnMonth);
        PurchaseFlightPage purchaseFlightPage = new PurchaseFlightPage();

        purchaseFlightPage.verify_the_flight_information_in_purchase_page(departingAirport,arrivalPort,airlines);
        purchaseFlightPage.enter_the_personal_information(firstname,lastname);
        purchaseFlightPage.enter_the_credit_card_information(cc_number,firstname,lastname);
        String Billing_Address=purchaseFlightPage.enter_the_Billing_address_information(address,city,state,zipcode);
        String Delivery_Address=purchaseFlightPage.enter_the_Delivery_address_information(address,city,state,zipcode);

        purchaseFlightPage.getPurchaseButton().click();
        waitForVisibilityOfElement(FlightConfirmationPageLocators.Flight_Confirmation_Page_Title);
        FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage();
        flightConfirmationPage.verify_the_Flight_Confirmation_Page();
        flightConfirmationPage.getDeliveryAddress().getText().equals(Delivery_Address);
        flightConfirmationPage.getBillingAddress().getText().equals(Billing_Address);
        Assert.assertTrue(flightConfirmationPage.getLogoutButton().isDisplayed());
        Assert.assertTrue(flightConfirmationPage.getBacktoHomeButton().isDisplayed());
        Assert.assertTrue(flightConfirmationPage.getBookFlightsButton().isDisplayed());

    }



}

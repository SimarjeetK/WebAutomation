package Application.Pages;

import Application.Common.BaseTestPage;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;


public class FlightConfirmationPage extends BaseTestPage implements  Locators {




    public WebElement getFlightConfirmationtext(){

        return findElement(FlightConfirmationPageLocators.Flight_Confirmation_Page_Title);
    }

    public WebElement getDepartureJouneryinfirmation(){

        return findElement(FlightConfirmationPageLocators.Departing_Flight_information);
    }

    public WebElement getreturnJourneyInformation(){

        return findElement(FlightConfirmationPageLocators.ReturnFligh_Information);
    }

    public WebElement getBillingAddress(){

        return findElement(FlightConfirmationPageLocators.Billing_Address_information);
    }

    public WebElement getDeliveryAddress(){

        return findElement(FlightConfirmationPageLocators.Delivery_Address_Information);
    }

    public WebElement getLogoutButton(){

        return findElement(FlightConfirmationPageLocators.Logout_Button);
    }

    public WebElement getBacktoHomeButton(){

        return findElement(FlightConfirmationPageLocators.BacktoHome);
    }


    public WebElement getBookFlightsButton(){

        return findElement(FlightConfirmationPageLocators.Back_to_Flights);
    }


    /**
     * This is to verify that User is on Flight Confirmation Page after Purchase
     */
    public void verify_the_Flight_Confirmation_Page(){

        getFlightConfirmationtext().getText().contains("Flight Confirmation #");;

    }
}

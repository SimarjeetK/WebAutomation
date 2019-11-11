package Application.Pages;

import Application.Common.BaseTestPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class PurchaseFlightPage extends BaseTestPage implements Locators {


    public WebElement getPurchasePageTitle() {

        return findElement(PurchaseFlightTicketLocators.Purchase_Page_Title);
    }

    public WebElement getDepatureJourneyInformation() {

        return findElement(PurchaseFlightTicketLocators.Departure_Flight_Destination_Information);
    }

    public WebElement getDepartingFlightName() {

        return findElement(PurchaseFlightTicketLocators.Departure_Flight_name);
    }

    public WebElement getReturningJourneyInformation() {

        return findElement(PurchaseFlightTicketLocators.Return_Flight_information);
    }

    public WebElement getReturnFlightName() {

        return findElement(PurchaseFlightTicketLocators.Return_Flight_name);
    }

    public WebElement getFirstName() {

        return findElement(PurchaseFlightTicketLocators.First_Name_Input_Field);
    }

    public WebElement getLastName() {

        return findElement(PurchaseFlightTicketLocators.Last_Name_Input_Field);
    }


    public WebElement getCreditCardNumber() {

        return findElement(PurchaseFlightTicketLocators.Credit_Card_Number);
    }

    public WebElement getCreditCardFN() {

        return findElement(PurchaseFlightTicketLocators.CC_First_name);
    }


    public WebElement getCreditCardLN() {

        return findElement(PurchaseFlightTicketLocators.CC_Last_Name);
    }

    public WebElement getBillingAddressLine1() {

        return findElement(PurchaseFlightTicketLocators.Billing_Adress_Line1);
    }

    public WebElement getBillingCity() {

        return findElement(PurchaseFlightTicketLocators.Billing_City);
    }

    public WebElement getBillingStae() {

        return findElement(PurchaseFlightTicketLocators.Billing_State);
    }

    public WebElement getBillingCountry() {

        return findElement(PurchaseFlightTicketLocators.Billing_Country);
    }

    public WebElement getBillingZipCode() {

        return findElement(PurchaseFlightTicketLocators.Billing_Zip_Code);
    }

    public WebElement getDeliveryAddressLine1() {

        return findElement(PurchaseFlightTicketLocators.Delivery_Adress_Line1);
    }

    public WebElement getDeliveryCity() {

        return findElement(PurchaseFlightTicketLocators.Delivery_City);
    }

    public WebElement getDeliveryState() {

        return findElement(PurchaseFlightTicketLocators.Delivery_State);
    }

    public WebElement getDeliveryCountry() {

        return findElement(PurchaseFlightTicketLocators.Delivery_Country);
    }

    public WebElement getDeliveryZipCode() {

        return findElement(PurchaseFlightTicketLocators.Delivery_Zip_Code);
    }

    public WebElement getPurchaseButton() {

        return findElement(PurchaseFlightTicketLocators.Purchase_Button);
    }


    /**
     * This is to verify that Selected Flight information is displaying as expected in Purchase Page
     * @param DepartingPort is used to set the Departure Port
     * @param ArrivalPort is used to set the Arrival Port
     * @param AirlineName is used to set the Interest of Airlines
     */
    public void verify_the_flight_information_in_purchase_page(String DepartingPort, String ArrivalPort, String AirlineName) {

        Assert.assertTrue(getDepatureJourneyInformation().getText().equals(DepartingPort+" to "+ArrivalPort));
        Assert.assertTrue(getDepartingFlightName().getText().contains(AirlineName));
        Assert.assertTrue(getReturningJourneyInformation().getText().equals(ArrivalPort+" to "+DepartingPort));
        Assert.assertTrue(getReturnFlightName().getText().contains(AirlineName));

    }


    /**
     * This method is sending the personal information to the Personal information section in Purchase Page
     * @param FirstName- set the First Name in Personal Infromation section in Purchase Page
     * @param LastName-set the Last Name in Personal Infromation section in Purchase Page
     */
    public void enter_the_personal_information(String FirstName, String LastName) {

        getFirstName().sendKeys(FirstName);
        getLastName().sendKeys(LastName);
    }

    /**
     * This method is sending the credit card information to the Payment Method section in Purchase Page
     * @param CC_number- credit card Number of Amex(default selection)
     * @param First_Name- First Name written on Credit Card
     * @param Last_name- Last Name written on Credit Card
     */
    public  void enter_the_credit_card_information(String CC_number, String First_Name, String Last_name){

        getCreditCardNumber().sendKeys(CC_number);
        getCreditCardFN().sendKeys(First_Name);
        getCreditCardLN().sendKeys(Last_name);
    }

    /**
     * This function sends the billing information in the Billing Information Section in Purchase Page
     * @param Address- Street Address of User
     * @param City- City name of user
     * @param State- State name of user
     * @param Zipcode- zipcode of user
     * @return- the complete billing address
     */
    public  String enter_the_Billing_address_information(String Address, String City, String State, String Zipcode){

        getBillingAddressLine1().clear();
        getBillingAddressLine1().sendKeys(Address);
        getBillingCity().clear();
        getBillingCity().sendKeys(City);
        getBillingStae().clear();
        getBillingStae().sendKeys(State);
        getBillingZipCode().clear();
        getBillingZipCode().sendKeys(Zipcode);

        return (Address+"\n"+City+" "+State+" "+Zipcode);


    }

    /**
     * This function sends the Delivery information in the Delivery Information Section in Purchase Page
     * @param Address- Street Address of User
     * @param City- City name of user
     * @param State- State name of user
     * @param Zipcode- zipcode of user
     * @return- the complete Delivery address
     */
    public String enter_the_Delivery_address_information(String Address, String City, String State, String Zipcode){

        getDeliveryAddressLine1().clear();
        getDeliveryAddressLine1().sendKeys(Address);
        getDeliveryCity().clear();
        getDeliveryCity().sendKeys(City);
        getDeliveryState().clear();
        getDeliveryState().sendKeys(State);
        getDeliveryZipCode().clear();
        getDeliveryZipCode().sendKeys(Zipcode);

        return (Address+"\n"+City+" "+State+" "+Zipcode);

    }

}
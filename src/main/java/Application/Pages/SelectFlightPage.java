package Application.Pages;

import Application.Common.BaseTestPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class SelectFlightPage extends BaseTestPage implements Locators {


    public WebElement getDepartFlightSectionTitle(){

        return findElement(SelectFlightPageLocators.Depart_Section_Title);
    }

    public  WebElement getdeparturetoarrivalportinformation(){
        return findElement(SelectFlightPageLocators.Deaprture_and_Destination_information);
    }

    public  WebElement getdepartingflightDate(){
        return  findElement(SelectFlightPageLocators.Departure_Date);
    }

    public WebElement getdepartureflight(){

        return findElement(SelectFlightPageLocators.Departing_Flight_Selection);
    }

    public WebElement getReturnFlightSectionTitle(){

        return findElement(SelectFlightPageLocators.Return_Section_Title);
    }

    public  WebElement getreturnJourneyportinformation(){
        return findElement(SelectFlightPageLocators.Return_and_Destination_information);
    }

    public  WebElement getreturnflightDate(){
        return  findElement(SelectFlightPageLocators.ReturnDate);
    }

    public WebElement getreturnflight(){

        return findElement(SelectFlightPageLocators.Return_Flight_Selection);
    }

    public WebElement getContinueButton(){
        return findElement(SelectFlightPageLocators.Continue_Button);
    }


    /**
     * This function verifies that information displaying in Select flight is matching with the selction which passed while finding a Flight in
     * Search Flight Page
     * @param Airlines
     * @param DeparturePort
     * @param ArrivalPort
     * @param Departing_Day
     * @param Departing_Month
     * @param Return_Day
     * @param Return_Month
     */

    public void verify_the_flight_information_is_displaying_as_selected(String Airlines,String DeparturePort, String ArrivalPort, String Departing_Day, String Departing_Month, String Return_Day , String Return_Month){

        Assert.assertTrue(getdeparturetoarrivalportinformation().getText().equalsIgnoreCase(DeparturePort+" to "+ArrivalPort));
        String travel_year="2019";
        String DepartureDate = Departing_Month+"/"+Departing_Day+"/"+travel_year;
        Assert.assertTrue(getdepartingflightDate().getText().equals(DepartureDate));
        getdepartureflight().isSelected();
        getdepartureflight().getText().contains(Airlines);

        Assert.assertTrue(getreturnJourneyportinformation().getText().equalsIgnoreCase(ArrivalPort+" to "+DeparturePort));
        String Return_Date=Return_Month+"/"+Return_Day+"/"+travel_year;
        Assert.assertTrue(getreturnflightDate().getText().equalsIgnoreCase(Return_Date));
        getreturnflight().isSelected();
        getreturnflight().getText().contains(Airlines);
        getContinueButton().click();
        waitForVisibilityOfElement(PurchaseFlightTicketLocators.Purchase_Page_Title);


    }
}

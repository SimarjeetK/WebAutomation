package Application.Pages;

import Application.Common.BaseTestPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchFlightPage extends BaseTestPage implements Locators {



    public WebElement getFlightPage(){

        return findElement(SearchFlightPageLocators.Flight_Search_page);
    }

    public WebElement getFlightDetailsHeader(){
        return findElement(SearchFlightPageLocators.Flight_Details_Section_Header);
    }

    public WebElement getRoundTripRadioButton(){

        return findElement(SearchFlightPageLocators.Flight_Type_Round_Trip_RadioButton);
    }

    public WebElement getDepartingPortDropDwn(){

        return findElement(SearchFlightPageLocators.Departure_Airport_Selection_Dropdown);
    }

    public WebElement getdepartingDatePickerMonth(){

        return findElement(SearchFlightPageLocators.Departing_Date_Month);
    }
    public WebElement getdepartingDatePickerDay(){

        return findElement(SearchFlightPageLocators.Departing_Date_Day);
    }



    public WebElement getArrivalPortDropDwn(){

        return findElement(SearchFlightPageLocators.Arrival_Airport);
    }

    public WebElement getReturnDatePickerMonth(){

        return findElement(SearchFlightPageLocators.Return_Date_Picker_Month);
    }
    public WebElement getReturnDatePickerDay(){

        return findElement(SearchFlightPageLocators.Return_Date_Picker_Day);
    }


    public WebElement getContinueButton(){

        return findElement(SearchFlightPageLocators.Continue_Button);
    }




    /**
     * This function is used to select a Deaprture Port
     * @param Airportname
     */
    public  void select_Deature_Airport(String Airportname){

        Select fromdropdown = new Select(getDepartingPortDropDwn());
        fromdropdown.selectByValue(Airportname);
    }

    /**
     * This function is used to select a Arrival Port
     * @param Airportname
     */
    public  void select_Arrival_Airport(String Airportname){

        Select todropdown = new Select(getArrivalPortDropDwn());
        todropdown.selectByValue(Airportname);
    }

    /**
     * This function is used to select a Departing date
     * @param Day
     * @param Month
     */
    public  void select_Departing_Date(String Day, String Month){

        Select daydropdowm = new Select(getdepartingDatePickerDay());
        Select mothdropdowm = new Select(getdepartingDatePickerMonth());
        daydropdowm.selectByValue(Day);
        mothdropdowm.selectByValue(Month);

    }

    /**
     * This function is used to pass a return date
     * @param Day
     * @param Month
     */
    public  void select_return_Date(String Day, String Month){

        Select daydropdowm = new Select(getReturnDatePickerDay());
        Select mothdropdowm = new Select(getReturnDatePickerMonth());
        daydropdowm.selectByValue(Day);
        mothdropdowm.selectByValue(Month);

    }

    /**
     * This function is used to make a selction to select a flight in Search Flight Page
     * @param Departure_Airport
     * @param Departure_Day
     * @param Departure_Month
     * @param Arrival_Airport
     * @param return_Day
     * @param return_Month
     */
    public void search_a_Flight( String Departure_Airport, String Departure_Day, String Departure_Month, String Arrival_Airport,
                                 String return_Day, String return_Month) {

        RegistrationPage registrationPage= new RegistrationPage();
        waitForVisibilityOfElement(RegistrationPageLocator.Registration_Tab_Home_Screen_Link_Text);
        registrationPage.getRegistrationTab_InHomeScreen().click();
        registrationPage.getSubmitButton().click();
        getFlightPage().click();
        waitForVisibilityOfElement(SearchFlightPageLocators.Continue_Button);
        select_Deature_Airport(Departure_Airport);
        select_Departing_Date(Departure_Day,Departure_Month);
        select_Arrival_Airport(Arrival_Airport);
        select_return_Date(return_Day,return_Month);
        getContinueButton().click();
        waitForVisibilityOfElement(SelectFlightPageLocators.Depart_Section_Title);
    }


}

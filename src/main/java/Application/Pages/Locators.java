package Application.Pages;


import org.openqa.selenium.By;

/**
 * This interface is created to Store the application Loactors
 */
public interface Locators {


    /**
     * This is having Registration Page Locators which are being used through
     * out the application Test Scripts.
     */

    interface RegistrationPageLocator {


        By Registration_Tab_Home_Screen_Link_Text = By.xpath("//a[contains(@href,'mercuryregister.php')]");

        By Registration_Form_Title = By.xpath("//td/table/tbody/tr/td[2]/table/tbody/tr/td/img");
        By Registration_Form_information_Text = By.xpath("//tr[3]/td/p");

        By Registration_Form_Contact_Information_Header_Label = By.xpath("//form[@method='post']/table/tbody/tr[1]/td/font/font/b/font/font");
        By Registration_Form_First_Name_Label = By.xpath("//form[@method='post']/table/tbody/tr[2]/td[1]/font/b");
        By Registration_Form_First_Name_Text_Input_Field = By.name("firstName");
        By Registration_Form_Last_Name_Label = By.xpath("//form[@method='post']/table/tbody/tr[3]/td[1]/font/b");
        By Registration_Form_Last_Name_Text_Input_Field = By.name("lastName");
        By Registration_Form_Phone_Label = By.xpath("//form[@method='post']/table/tbody/tr[4]/td[1]/font/b");
        By Registration_Form_Phone_Text_Input_Field = By.name("phone");
        By Registration_Form_Email_Label = By.xpath("//form[@method='post']/table/tbody/tr[5]/td[1]/font/b");
        By Registration_Form_Email_Text_Input_Field = By.name("userName");


        By Registration_Form_Mailing_Information_Header_Label = By.xpath("//form[@method='post']/table/tbody/tr[6]/td/font/font/b/font/font");
        By Registration_Form_Address_Label = By.xpath("//form[@method='post']/table/tbody/tr[7]/td[1]/font/b");
        By Registration_Form_Address_Input_Text_Field1 = By.name("address1");
        By Registration_Form_Address_Input_Text_Field2 = By.name("address2");
        By Registration_Form_City_Label = By.xpath("//form[@method='post']/table/tbody/tr[9]/td[1]/font/b");
        By Registration_Form_City_Input_Text_Field = By.name("city");
        By Registration_Form_State_Province_Label = By.xpath("//form[@method='post']/table/tbody/tr[10]/td[1]/font/b");
        By Registration_Form_State_Province_Input_Text_Field = By.name("state");
        By Registration_Form_Postal_Code_Label = By.xpath("//form[@method='post']/table/tbody/tr[11]/td[1]/font/b");
        By Registration_Form_Postal_Code_Input_Text_Field = By.name("postalCode");
        By Registration_Form_Country_Label = By.xpath("//form[@method='post']/table/tbody/tr[12]/td[1]/font/b");
        By Registration_Form_Country_Drop_Down = By.name("country");


        By Registration_Form_User_Information_Header_Label = By.xpath("//form[@method='post']/table/tbody/tr[13]/td/font/font/b/font");
        By Registration_Form_User_Name_Label = By.xpath("//form[@method='post']/table/tbody/tr[14]/td[1]/font/b");
        By Registration_Form_User_Name_Input_Text_Field = By.name("email");
        By Registration_Form_Password_Label = By.xpath("//form[@method='post']/table/tbody/tr[15]/td[1]/font/b");
        By Registration_Form_Password_Input_Text_Field = By.name("password");
        By Registration_Form_Confirm_Password_Label = By.xpath("//form[@method='post']/table/tbody/tr[16]/td[1]/font/b");
        By Registration_Form_Confirm_Password_Input_Text_Field = By.name("confirmPassword");

        By Registration_Form_Submit_Button = By.name("register");


        By Successful_Registration_Page_User_Addressing_Text = By.xpath("//table/tbody/tr[3]/td/p[1]/font");
        By Successful_Registration_Page_Thank_Message = By.xpath("//table/tbody/tr[3]/td/p[2]/font");
        By Sign_In_Link = By.xpath("//a[contains(@href,'mercurysignon.php')]");
        By UserName_Information_Text_Message = By.xpath("//table/tbody/tr[3]/td/p[3]/a/font/b");


    }


    /**
     * This is having Login Page Locators which are being used through
     * out the application Test Scripts.
     */


    interface SignOnPageLocators {

        By SignOn_Tab = By.xpath("//a[contains(@href,'mercurysignon.php')]");
        By SignOn_Page_Text = By.xpath("//table/tbody/tr[3]/td/p/font");
        By UserName_Label = By.xpath("//form/table/tbody/tr[1]/td[1]/font/b");
        By UserName_InputTextField = By.name("userName");
        By Password_Label = By.xpath("//form/table/tbody/tr[2]/td[1]/font/b");
        By Password_Input_Field = By.name("password");
        By Submit_Button = By.name("login");

        By SignOff_Tab = By.xpath("//a[contains(@href,'mercurysignoff.php')]");
    }


    /**
     * This is having Search Flight Page Locators which are being used through
     * out the application Test Scripts.
     */

    interface SearchFlightPageLocators {


        By Flight_Search_page = By.xpath("//a[contains(@href,'mercuryreservation.php')]");
        By Flight_Details_Section_Header = By.xpath("//form/table/tbody/tr[1]/td/font/font/b/font/font");
        By Flight_Type_Round_Trip_RadioButton = By.xpath(")//input[@value,'roundtrip']");
        By Departure_Airport_Selection_Dropdown = By.name("fromPort");
        By Departing_Date_Day = By.name("fromDay");
        By Departing_Date_Month = By.name("fromMonth");
        By Arrival_Airport = By.name("toPort");
        By Return_Date_Picker_Month = By.name("toMonth");
        By Return_Date_Picker_Day = By.name("toDay");

        By Continue_Button = By.name("findFlights");


    }

    /**
     * This is having Select Flight Page Locators which are being used through
     * out the application Test Scripts.
     */

    interface SelectFlightPageLocators {

        By Depart_Section_Title = By.xpath("//form/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/font/b/font");
        By Deaprture_and_Destination_information = By.xpath("//form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font");
        By Departure_Date = By.xpath("//form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font");
        By Departing_Flight_Selection = By.xpath("//input[1][@name='outFlight']");

        By Return_Section_Title = By.xpath("//form/table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/font/b/font");
        By Return_and_Destination_information = By.xpath("//form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/b/font");
        By ReturnDate = By.xpath("//form/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font");
        By Return_Flight_Selection = By.xpath("//input[1][@name='inFlight']");
        By Continue_Button = By.name("reserveFlights");
    }


    /**
     * This is having Purchase Flight Page Locators which are being used through
     * out the application Test Scripts.
     */
    interface PurchaseFlightTicketLocators {

        By Purchase_Page_Title = By.xpath("//form/table/tbody/tr[1]/td/font/font/b/font/font");
        By Departure_Flight_Destination_Information= By.xpath("//form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/b/font");
        By Departure_Flight_name=By.xpath("//form/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/font/b");
        By Return_Flight_information=By.xpath("//form/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]/b/font");
        By Return_Flight_name=By.xpath("//form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]/font/font/font[1]/b");

        By First_Name_Input_Field= By.name("passFirst0");
        By Last_Name_Input_Field= By.name("passLast0");
        By Credit_Card_Number=By.name("creditnumber");
        By CC_First_name=By.name("cc_frst_name");
        By CC_Last_Name= By.name("cc_last_name");

        By Billing_Adress_Line1= By.name("billAddress1");
        By Billing_City= By.name("billCity");
        By Billing_State= By.name("billState");
        By Billing_Country= By.name("BillCountry");
        By Billing_Zip_Code= By.name("billZip");

        By Delivery_Adress_Line1= By.name("delAddress1");
        By Delivery_City= By.name("delCity");
        By Delivery_State= By.name("delState");
        By Delivery_Country= By.name("delCountry");
        By Delivery_Zip_Code= By.name("delZip");

        By Purchase_Button=By.name("buyFlights");




    }


    /**
     * This is having Booked Flight Confirmation Flight Page Locators which are being used through
     * out the application Test Scripts.
     */
    interface FlightConfirmationPageLocators{

        By Flight_Confirmation_Page_Title=By.xpath("//table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]");
        By Departing_Flight_information=By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[3]/td/font/b");
        By ReturnFligh_Information= By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[5]/td/font/b");
        By Billing_Address_information= By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[9]/td/p/font[1]");
        By Delivery_Address_Information=By.xpath("//table/tbody/tr[5]/td/table/tbody/tr[11]/td/p/font[1]");
        By Logout_Button= By.xpath("//a[contains(@href,'mercurysignoff.php')]");
        By BacktoHome= By.xpath("//a[contains(@href,'mercurywelcome.php')]");
        By Back_to_Flights=By.xpath("//a[contains(@href,'mercuryreservation.php')]");
    }




}

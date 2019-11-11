package Application.Pages;


import Application.Common.BaseTestPage;
import Application.Common.WebDriverBaseTest;
import Application.StringUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegistrationPage extends BaseTestPage implements Locators {

     public WebElement getRegistrationTab_InHomeScreen(){

        return findElement(RegistrationPageLocator.Registration_Tab_Home_Screen_Link_Text);
    }

    public WebElement getRegistrationTPageTitle(){

        return findElement(RegistrationPageLocator.Registration_Form_Title);
    }

    public WebElement getRegistrationFormInformationText(){
         return findElement(RegistrationPageLocator.Registration_Form_information_Text);
    }

    public WebElement getContactInformationHeader(){

        return findElement(RegistrationPageLocator.Registration_Form_Contact_Information_Header_Label);
    }

    public WebElement getFirstnameLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_First_Name_Label);
    }

    public WebElement getFirstNameTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_First_Name_Text_Input_Field);
    }

    public WebElement getLasttNameLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Last_Name_Label);
    }

    public WebElement getLasttNameTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_Last_Name_Text_Input_Field);
    }


    public WebElement getPhoneLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Phone_Label);
    }

    public WebElement getPhoneTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_Phone_Text_Input_Field);
    }

    public WebElement getEmailLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Email_Label);
    }

    public WebElement getEmailTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_Email_Text_Input_Field);
    }
    public WebElement getMailingInformationHeader(){

        return findElement(RegistrationPageLocator.Registration_Form_Mailing_Information_Header_Label);
    }


    public WebElement getAddressLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Address_Label);
    }

    public WebElement getAddresslTextInputFieldLine1(){

        return findElement(RegistrationPageLocator.Registration_Form_Address_Input_Text_Field1);
    }

    public WebElement getAddresslTextInputFieldLine2(){

        return findElement(RegistrationPageLocator.Registration_Form_Address_Input_Text_Field2);
    }


    public WebElement getCityLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_City_Label);
    }

    public WebElement getCityTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_City_Input_Text_Field);
    }



    public WebElement getStateLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_State_Province_Label);
    }

    public WebElement getStateTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_State_Province_Input_Text_Field);
    }


    public WebElement getpostalLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Postal_Code_Label);
    }

    public WebElement getPostalTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_Postal_Code_Input_Text_Field);
    }


    public WebElement getCountryLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Country_Label);
    }

    public WebElement getCountryDropDown(){

        return findElement(RegistrationPageLocator.Registration_Form_Country_Drop_Down);
    }

    public WebElement getUserInformationHeader() {

        return findElement(RegistrationPageLocator.Registration_Form_User_Information_Header_Label);

    }
    public WebElement getUsernameLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_User_Name_Label);
    }

    public WebElement getUsernameTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_User_Name_Input_Text_Field);
    }

    public WebElement getPasswordLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Password_Label);
    }

    public WebElement getPasswordTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_Password_Input_Text_Field);
    }
    public WebElement getConfirmPasswordLabel(){

        return findElement(RegistrationPageLocator.Registration_Form_Confirm_Password_Label);
    }

    public WebElement getConfirmPasswordTextInputField(){

        return findElement(RegistrationPageLocator.Registration_Form_Confirm_Password_Input_Text_Field);
    }


    public WebElement getSubmitButton(){

        return findElement(RegistrationPageLocator.Registration_Form_Submit_Button);
    }

    public WebElement getAddressingMessage(){

        return findElement(RegistrationPageLocator.Successful_Registration_Page_User_Addressing_Text);
    }
    public WebElement getThankYouMessageText(){

        return findElement(RegistrationPageLocator.Successful_Registration_Page_Thank_Message);
    }


    public WebElement getUsernameInformation(){

        return findElement(RegistrationPageLocator.UserName_Information_Text_Message);
    }

    public WebElement getSignInLink(){

        return findElement(RegistrationPageLocator.Sign_In_Link);
    }


    /**
     * This function is created to navigate the user to registration Page
     */
    public void Navigate_to_Registration_Page(){

         waitForVisibilityOfElement(RegistrationPageLocator.Registration_Tab_Home_Screen_Link_Text);
         Assert.assertTrue(getRegistrationTab_InHomeScreen().getText().equals(StringUtils.Registration_Tab_Text));
         getRegistrationTab_InHomeScreen().click();
         waitForVisibilityOfElement(RegistrationPageLocator.Registration_Form_Submit_Button);

        }




}

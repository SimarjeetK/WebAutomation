package Test.Scripts;

import Application.Pages.RegistrationPage;


import Application.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestRegistrationFeature extends RegistrationPage{

    /**
     * @Description This Test case is testing the UI for the Registration Page to verify
     * all the components are diaplying as expected.
     */
    @Test(testName = "Verify the UI of Registration Form")
    public void verify_The_UI_of_Registration_Page_form() {

        Navigate_to_Registration_Page();
        Assert.assertTrue(getRegistrationFormInformationText().getText().equalsIgnoreCase(StringUtils.Information_Text_on_Registration_form));
        Assert.assertTrue(getContactInformationHeader().getText().equals(StringUtils.Contact_Information_Header_Label));
        Assert.assertTrue(getFirstnameLabel().getText().equals(StringUtils.First_name_Label));
        Assert.assertTrue(getFirstNameTextInputField().isDisplayed());
        Assert.assertTrue(getLasttNameLabel().getText().equals(StringUtils.Last_name_Label));
        Assert.assertTrue(getLasttNameTextInputField().isDisplayed());
        Assert.assertTrue(getPhoneLabel().getText().equals(StringUtils.Phone_Number_Label));
        Assert.assertTrue(getPhoneTextInputField().isDisplayed());
        Assert.assertTrue(getEmailLabel().getText().equals(StringUtils.Email_label));
        Assert.assertTrue(getEmailTextInputField().isDisplayed());
        Assert.assertTrue(getMailingInformationHeader().getText().equals(StringUtils.Mailing_Information_Header_Label));
        Assert.assertTrue(getAddressLabel().getText().equals(StringUtils.Address_Label));
        Assert.assertTrue(getAddresslTextInputFieldLine1().isDisplayed());
        Assert.assertTrue(getAddresslTextInputFieldLine2().isDisplayed());
        Assert.assertTrue(getCityLabel().getText().equals(StringUtils.City_Label));
        Assert.assertTrue(getCityTextInputField().isDisplayed());
        Assert.assertTrue(getpostalLabel().getText().equals(StringUtils.Postal_Code_Label));
        Assert.assertTrue(getStateLabel().getText().equals(StringUtils.State_Label));
        Assert.assertTrue(getStateTextInputField().isDisplayed());
        Assert.assertTrue(getCountryLabel().getText().equals(StringUtils.Country_Label));
        Assert.assertTrue(getCountryDropDown().isDisplayed());
        Assert.assertTrue(getUserInformationHeader().getText().equals(StringUtils.UserInformation_Header_Label));
        Assert.assertTrue(getUsernameLabel().getText().equals(StringUtils.UserName_Label));
        Assert.assertTrue(getUsernameTextInputField().isDisplayed());
        Assert.assertTrue(getPasswordLabel().getText().equals(StringUtils.Password_Label));
        Assert.assertTrue(getPasswordTextInputField().isDisplayed());
        Assert.assertTrue(getConfirmPasswordLabel().getText().equals(StringUtils.ConfirmPassword_Label));
        Assert.assertTrue(getConfirmPasswordTextInputField().isDisplayed());
    }

    /**
     *
     * @param Username- is used to set the value required in the registration form
     * @param password- is used to set the value required in the registration form during registration process.
     * @param firstname- is used to set the value required in the registration form during registration Process.
     * @param lastname- is used to set the value required in the registration form during registration Process.
     * @throws InterruptedException
     *
     * @Description This method test the flow about whether after adding all the fields, User is successfully able to Register with the application or not.
     */
    @Parameters({"Username","password","firstname","lastname"})
    @Test(testName = "Verify User can Register Successfully")
    public void verify_that_User_Can_Successfully_Register_to_the_Application(String Username, String password, String firstname, String lastname) throws InterruptedException {

       getRegistrationTab_InHomeScreen().click();
       getFirstNameTextInputField().sendKeys(firstname);
       getLasttNameTextInputField().sendKeys(lastname);
       getPhoneTextInputField().sendKeys("1234567890");
       getEmailTextInputField().click();
       getEmailTextInputField().sendKeys("Test@gmail.com");
       getAddresslTextInputFieldLine1().sendKeys("99 Market Street");
       getAddresslTextInputFieldLine2().sendKeys("500 Suite");
       getCityTextInputField().sendKeys("San Francisco");
        getStateTextInputField().sendKeys("California");
       getUsernameTextInputField().sendKeys(Username);
        getPasswordTextInputField().sendKeys(password);
       getConfirmPasswordTextInputField().sendKeys(password);
        getSubmitButton().click();

        waitForVisibilityOfElement(RegistrationPageLocator.UserName_Information_Text_Message);


        Assert.assertTrue(getAddressingMessage().getText().equalsIgnoreCase(StringUtils.Successful_Registration_Greeting_Message.concat(firstname+" ").concat(lastname+",")));
        String ThankYou_Message= getThankYouMessageText().getText();
        System.out.println("****"+ThankYou_Message);
        Assert.assertTrue(ThankYou_Message.equals(StringUtils.Successful_Registration_Thank_You_message));

        System.out.println(getUsernameInformation().getText());
        System.out.println(StringUtils.Successful_Registration_Username_Information_Text.concat(Username+"."));
        Assert.assertTrue(getUsernameInformation().getText().equals(StringUtils.Successful_Registration_Username_Information_Text.concat(Username+".")));

        getSignInLink().click();
        waitForVisibilityOfElement(SignOnPageLocators.UserName_InputTextField);
    }
}

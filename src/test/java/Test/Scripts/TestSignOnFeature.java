package Test.Scripts;

import Application.Pages.RegistrationPage;
import Application.Pages.SignOnPage;
import Application.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSignOnFeature extends SignOnPage {


    /**
     * @Description This Test verifies the UI for the Login Page Form to make sure all required elements are displaying
     * as expected.
     */
    @Test(testName = "Navigate to Sign In page and Verify the UI of Sign In Page")
    public void verify_the_UI_of_Login_Screen(){
        navigate_to_SignOn_Page();
        Assert.assertTrue(getSignOnPage_UserName_Label().getText().equals(StringUtils.Login_Form_UserName_Label));
        Assert.assertTrue(getSignOnPage_UserName_InputField().isDisplayed());
        Assert.assertTrue(getSignOnPage_Password_InputField().isDisplayed());
        Assert.assertTrue(getSignOnPage_Password_Label().getText().equals(StringUtils.Login_Form_Password_Label));
        Assert.assertTrue(getSignOnPageWelcomeText().getText().equals(StringUtils.SignOnPage_Text));
    }

    /**
     *
     * @param Username- is registered users's Username to Login to the application
     * @param password-is registered users's Password to Login to the application
     *
     * @Description- This Test verifies whether a register user is able to Login to the app successfully or not.
     */
    @Parameters({"Username","password"})
    @Test(testName = "Verify Registered User can successfully able to Login to the App")
    public void verify_registered_user_can_Successfully_Login(String Username, String password){
        navigate_to_SignOn_Page();
        login_to_the_application(Username,password);
        Assert.assertTrue(getSignOffButton().isDisplayed());

    }
}

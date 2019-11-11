package Application.Pages;

import Application.Common.BaseTestPage;
import Application.StringUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class SignOnPage extends BaseTestPage implements Locators{

    /**
     @Description This will find the Sign on Tab in Home Screen
     */
    public WebElement getLoginTabinHomePage(){

        return findElement(SignOnPageLocators.SignOn_Tab);
    }

    /**
     @Description This will find the Username Label in Login Form
     */
    public WebElement getSignOnPage_UserName_Label(){

        return findElement( SignOnPageLocators.UserName_Label);
    }

    /**
     @Description This will find the Password Label in Login Form
     */
    public WebElement getSignOnPage_Password_Label(){

        return findElement( SignOnPageLocators.Password_Label);
    }

    /**
     @Description This will find the Username Input Field to enter the Username in Login Form
     */
    public WebElement getSignOnPage_UserName_InputField(){

        return findElement( SignOnPageLocators.UserName_InputTextField);
    }

    /**
     @Description This will find the Password Input Field to enter the Password in Login Form
     */
    public WebElement getSignOnPage_Password_InputField(){

        return findElement( SignOnPageLocators.Password_Input_Field);
    }

    /**
     @Description This will find the Sign On Button in Login Form
     */
    public WebElement getSignOnButton(){

        return findElement( SignOnPageLocators.Submit_Button);
    }

    /**
     @Description This will find the Sign off Feature Tab in Top Navigation Bar Menu --Left side of Register Tab
     */
    public WebElement getSignOffButton(){

        return findElement( SignOnPageLocators.SignOff_Tab);
    }

    /**
     @Description This will find the informative/welcome Text written on the Top in the Login Form
     */
    public WebElement getSignOnPageWelcomeText(){

            return findElement( SignOnPageLocators.SignOn_Page_Text);
        }


    /**
     @Description This method is being used to navigate the user to Login Form after User
     Launch the application.
     */
    public void navigate_to_SignOn_Page(){

        Assert.assertTrue(getLoginTabinHomePage().getText().equals(StringUtils.SignOn_Tab_Text));
        getLoginTabinHomePage().click();
        waitForVisibilityOfElement(SignOnPageLocators.UserName_InputTextField);

    }

    /**
     @Description This method is being used to perform the login operations by sending
     Username and Password as String Arguments
     */
    public void login_to_the_application(String Username, String Password){
        getSignOnPage_UserName_InputField().sendKeys(Username);
        getSignOnPage_Password_InputField().sendKeys(Password);
        getSignOnButton().click();



    }
}

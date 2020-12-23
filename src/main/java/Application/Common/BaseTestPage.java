

package Common;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.*;


import java.awt.*;


public class BaseTestPage {

    public static String authorizationSite_URL=WebDriverBaseTest.getInstance().getProps().getString("authorizationsiteURL");
    public WebDriver driver;


    /**
     *
     * @return therad safe driver
     */
    @BeforeSuite
    public WebDriver getDriver(){

         driver= WebDriverBaseTest.getInstance().getDriver();
         return driver;
     }

    /**
     * This function will run before every Test Method to get the Thread safe Driver and will launch the Website
     */
    @BeforeMethod
    public void  init() throws AWTException {

        driver =getDriver();
        System.out.println("Test Script has been started and Navigating to site::"+ authorizationSite_URL);
        driver.get(authorizationSite_URL);
        driver.navigate().to(getProps().getString("applicationURL"));
        waitForVisibilityOfElement(By.linkText("Home"));
    }


    /**
     * This will run after every Test Method
     */
    @AfterMethod()
    public void close(){
        System.out.println("I am in After Method");
    }


    /**
     * Once the Test Execution is complete, it will quite the driver.
     */
    @AfterSuite()
    public void tearDown(){
         System.out.println("Quit the driver");  driver.quit();}


    /**
     * Duynamic wait is introduced to validate the Visibility of elements on Screen
      * @param locator is being defined in Locator class
     */
    public void  waitForVisibilityOfElement(By locator) {

        System.out.println("Waiting for the presence of "+locator);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    /**
     * This will help the driver to perform  findElement API Call
     * @param Locator
     * @return the Locator value which is defined in Locator class
     */
    public WebElement findElement(By Locator){

       return getDriver().findElement(Locator);
    }

    public void waitforPagetoLoad(){
        try {
          Thread.sleep(10000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * add logs into testng reports.
     *
     * @param message
     */
    protected static void log(String message) {
        Reporter.log(message + "<br/>");


    }
    /**
     * Returns a instance of {@link org.apache.commons.configuration.PropertiesConfiguration}.
     *
     * @see org.apache.commons.configuration.PropertiesConfiguration
     * @return current PropertiesConfiguration
     */
    public PropertiesConfiguration getProps() {

        return WebDriverBaseTest.getInstance().getProps();
    }
}

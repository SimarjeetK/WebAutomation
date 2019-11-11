package Application.Common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTestPage {

    public static String Website_url="http://www.newtours.demoaut.com";
    public WebDriver driver;


    /**
     *
     * @return therad safe driver
     */
    public WebDriver getDriver(){

         driver= WebDriverBaseTest.getInstance().getDriver();
         return driver;
     }

    /**
     * This function will run before every Test Method to get the Therad safe Driver and will launch the Website
     */
    @BeforeMethod
    public void init() {

        driver =getDriver();
        System.out.println("I am in Before Method");
        driver.get(Website_url);
        driver.manage().window().fullscreen();

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


    /**
     * add logs into testng reports.
     *
     * @param message
     */
    protected static void log(String message) {
        Reporter.log(message + "<br/>");


    }
}

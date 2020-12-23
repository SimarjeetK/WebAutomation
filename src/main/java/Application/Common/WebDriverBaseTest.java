package Common;




import net.lightbody.bmp.BrowserMobProxy;
import org.apache.commons.configuration.AbstractConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;


/**
 * Singleton Design pattern is used to create a Thread safe driver and to avoid the loss the creation of multiple drivers during Test Execution.
 */
public class WebDriverBaseTest {

    private PropertiesConfiguration props;

    public static String browser = null;

    private static WebDriverBaseTest Instance;
    BrowserMobProxy proxy;

    static {
        try {
            Instance = new WebDriverBaseTest();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    private WebDriverBaseTest() throws ConfigurationException {
        loadSettingProperties();
    }

    public static WebDriverBaseTest getInstance() {
        return Instance;
    }


    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            WebDriver driver = null;

            browser = getProps().getString("Browser");
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }
            return driver;
        }
    };


    public WebDriver getDriver() {

        return driver.get();
    }

    /**
     * Returns a instance of {@link PropertiesConfiguration}.
     *
     * @see PropertiesConfiguration
     * @return current PropertiesConfiguration
     */
    public PropertiesConfiguration getProps() {
        return props;
    }

    /**
     * This method is used to load properties from file into instance of properties.
     *
     * @param filename
     */
    private void loadProperties(String filename) throws ConfigurationException {
        File file = new File(filename);
        System.out.println(file.getAbsolutePath());
        if (file.exists() && file.isFile()) {
            try {
                if (file.getName().endsWith(".properties")) {
                    PropertiesConfiguration properties = new PropertiesConfiguration();
                    properties.load(file);
                    props.copy(properties);
                    properties.clear();

                }
            } catch (ConfigurationException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * This method is used to load properties from file into instance of properties.
     * by default it loads properties from settings.properties file.to override
     * setting properties file, please set file name to system property with key
     * 'settings'
     */
    private void loadSettingProperties() throws ConfigurationException {
        AbstractConfiguration.setDefaultListDelimiter(';');
        props = new PropertiesConfiguration();
        String propFile = System.getProperty("settings", "settings.properties");
        System.out.println("propfile: " + propFile);
        loadProperties(propFile);
    }

}









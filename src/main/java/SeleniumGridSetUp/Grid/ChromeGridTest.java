package SeleniumGridSetUp.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Selenium Grid
 *
 */
public class ChromeGridTest 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        //Define capabilities
    	DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        
        //Chrome Options definition
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);
        
        String hubUrl = "http://192.168.60.110:4445/wd/hub";
        //Where your hub is running so creating obj of url as hubUrl , what options you are using so options
        RemoteWebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
        
        driver.get("http://www.freecrm.com");
        System.out.println(driver.getTitle());
    }
}

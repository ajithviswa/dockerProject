package launchBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

@Test
public class firstTest {
  public void f() throws MalformedURLException {
	  
	  ChromeOptions options = new ChromeOptions();
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	  URL url= new URL("http://localhost:4443/wd/hub"); 
	  RemoteWebDriver driver = new RemoteWebDriver(url,capabilities) ;
//	WebDriver driver = new FirefoxDriver(); 
//	  WebDriver driver = new ChromeDriver(); 
	  // ChromeOptions options = new ChromeOptions();
	  // options.addArguments("no-sandbox");
	  // options.addArguments("headless");
	  // options.addArguments("--disable-dev-shm-usage");
	  // driver = new ChromeDriver(options);
		driver.get("https://google.com/");
		System.out.println("Browser opened the url");
		System.out.println("Page title is : " + driver.getTitle());
		driver.close();
		driver.quit();
  }
}


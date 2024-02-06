package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class firstTest {
  @Test
  public void f() {
	 WebDriver driver = new ChromeDriver(); 
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("no-sandbox");
	  options.addArguments("headless");
	  options.addArguments("--disable-dev-shm-usage");
	  driver = new ChromeDriver(options);
		driver.get("https://google.com/");
		System.out.println("Browser opened the url");
		System.out.println("Page title is : " + driver.getTitle());
		driver.close();
		driver.quit();
  }
}

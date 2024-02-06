package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver(); 
		driver.get("https://google.com");
		System.out.println("Browser opened the url");
	  System.out.println("Page title is : " + driver.getTitle());
		driver.close();
		driver.quit();
  }
}
